package com.example.proj499;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Profile extends AppCompatActivity implements MySQLConnect.AsyncResponse{

    private TextView mTextMessage, history;
    private Button logout;
    String username;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        logout = findViewById(R.id.button3);
        Bundle extras = getIntent().getExtras();
        if (extras != null)
        {
            username = extras.getString("username");
        }
        MySQLConnect mySQLConnect = new MySQLConnect();
        mySQLConnect.delegate = this;
        mySQLConnect.GetHistory(username);

        //history data from history
    }

    public void Logout(View view)
    {
        Intent intent = new Intent(getBaseContext(), MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    public void About(View view){
        Intent intent = new Intent(getBaseContext(), About.class);
        startActivity(intent);
    }

    @Override
    public void processFinish(String output) {
        String[] detail = output.split("#");
        StringBuilder All_details = new StringBuilder();
        TextView textView = findViewById(R.id.profile_history);
        int count = detail.length;
//        for (String detail1 : detail)
//        {
//            All_details.append(detail1).append("\n");
//        }
        textView.setText("ท่านได้บริจาคโลหิตมาแล้ว  "+count+" ครั้ง");
    }
}
