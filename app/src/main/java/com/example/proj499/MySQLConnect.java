package com.example.proj499;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Build;
import android.os.StrictMode;
import android.provider.Settings;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class MySQLConnect {

    private final Activity main;
    static InputStream is = null;
    private List<String> list;
    private String URL = "http://10.80.118.111:8081/", GET_URL = "android/signup2.php", SENT_URL="android/sent_post.php";
    private String LOGIN = "android/login.php";
    // 192.168.1.6
    // "http://10.0.2.2"
    public MySQLConnect(){
        main = null;
    }

    public MySQLConnect(Activity mainA){
        main = mainA;
        list = new ArrayList<String>();
    }
    public interface AsyncResponse {
        void processFinish(String output);
    }
    public AsyncResponse delegate = null;
    public List<String> getData(){
        String url = URL + GET_URL;

        StringRequest stringRequest = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                showJSON(response);
                Toast.makeText(main, list.get(0), Toast.LENGTH_LONG).show();
            }
        }, new Response.ErrorListener(){
                @Override
                public void onErrorResponse(VolleyError error){
                    Toast.makeText(main, error.getMessage().toString(), Toast.LENGTH_LONG).show();
            }
        });

        RequestQueue requestQueue = Volley.newRequestQueue(main.getApplicationContext());
        requestQueue.add(stringRequest);
        return list;
    }

    public void showJSON(String response){
        String comment = "";

        try {
            JSONObject jsonObject = new JSONObject(response);
            JSONArray result = jsonObject.getJSONArray("result");

            for (int i = 0; i < result.length(); i++) {
                JSONObject collectData = result.getJSONObject(i);
                comment = collectData.getString("comment");
                list.add(comment);
            }
        }catch (JSONException ex){ex.printStackTrace();}
    }

    public void sentData_signup(final String firstname, final String lastname, final String email,
                                final String citizen, final String sex, final String blood_group, final String password){
        //StrictMode.enableDefaults();

//        if (Build.VERSION.SDK_INT > 9){
//            StrictMode.ThreadPolicy policy =  new StrictMode.ThreadPolicy.Builder().permitAll().build();
//            StrictMode.setThreadPolicy(policy);
//        }
        class SendPost extends AsyncTask<String, Void, String> { //post
            @Override
            protected String doInBackground(String... strings) {

                try {
                    ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
                    nameValuePairs.add(new BasicNameValuePair("isAdd","true"));
                    nameValuePairs.add(new BasicNameValuePair("firstname",firstname));
                    nameValuePairs.add(new BasicNameValuePair("lastname",lastname));
                    nameValuePairs.add(new BasicNameValuePair("username",email));
                    nameValuePairs.add(new BasicNameValuePair("citizen_id",citizen));
                    nameValuePairs.add(new BasicNameValuePair("sex",sex));
                    nameValuePairs.add(new BasicNameValuePair("bloodgroup",blood_group));
                    nameValuePairs.add(new BasicNameValuePair("password",password));
                    HttpClient httpClient = new DefaultHttpClient();
                    HttpPost httpPost = new HttpPost(URL + SENT_URL);
                    httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs,"UTF-8"));
                    httpClient.execute(httpPost);


                }catch (UnsupportedEncodingException e){
                    e.printStackTrace();
                } catch (ClientProtocolException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return "Data Inserted Successfully";
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                Toast.makeText(main, "Register complete",Toast.LENGTH_LONG).show();
            }
        }
        SendPost post = new SendPost();
        post.execute(firstname, lastname, email, citizen, sex, blood_group, password);
    }
    public void Login(final String username, final String password)
    {

        class SendPost extends AsyncTask<String, Void, String> {

            @Override
            protected String doInBackground(String... strings) {

                try {
                    ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
                    nameValuePairs.add(new BasicNameValuePair("username",username));
                    nameValuePairs.add(new BasicNameValuePair("password",password));
                    HttpClient httpClient = new DefaultHttpClient();
                    HttpPost httpPost = new HttpPost(URL + LOGIN);
                    httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs,"UTF-8"));
                    HttpResponse httpResponse = httpClient.execute(httpPost);
                    HttpEntity httpEntity = httpResponse.getEntity();
                    is = httpEntity.getContent();

                } catch (UnsupportedEncodingException e){
                    e.printStackTrace();
                } catch (ClientProtocolException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                // read from php echo
                try {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.ISO_8859_1), 8);
                    StringBuilder sb = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        sb.append(line);
                    }
                    is.close();
                    return sb.toString();

                } catch (IOException e) {
                    e.printStackTrace();
                }
                return "false";
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                delegate.processFinish(s); //return value from php echo
            }
        }
        SendPost post = new SendPost();
        post.execute(username, password);

    }

}
