package com.example.proj499;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, MySQLConnect.AsyncResponse {
    Button login,signup;
    EditText user,pass;
    Intent intent;
    String uname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        user = (EditText)findViewById(R.id.username);
        pass = (EditText)findViewById(R.id.password);
        login = (Button)findViewById(R.id.login_button);
        signup = (Button)findViewById(R.id.signup_button);

        login.setOnClickListener(this);
        signup.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.login_button:
                String username = user.getText().toString();
                String password = pass.getText().toString();
                uname = username;

                MySQLConnect mySQLConnect = new MySQLConnect(); //main.this
                mySQLConnect.delegate = this;
                mySQLConnect.Login(username, password);
                break;
            case R.id.signup_button:
                intent = new Intent(this, Signup.class);
                startActivity(intent);
                break;
        }
    }
    @Override
    public void processFinish(String output) {
        if (output.contains("user success")) {
            Toast.makeText(MainActivity.this, "User login success",Toast.LENGTH_LONG).show();
            intent = new Intent(this, FeaturesActivity.class);
            intent.putExtra("username", uname);
            intent.putExtra("data", output);
            startActivity(intent);
        } else if (output.contains("admin success")) {
            Toast.makeText(MainActivity.this, "Admin login success",Toast.LENGTH_LONG).show();
            intent = new Intent(this, FeaturesTechnicianActivity.class);
            intent.putExtra("username", uname);
            intent.putExtra("data", output);
            intent.putExtra("admin", "admin");
            startActivity(intent);
        }
        else if (output.contains("Unable to connect")){
            Toast.makeText(MainActivity.this, "Unable to connect",Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(MainActivity.this, "Login fail",Toast.LENGTH_LONG).show();
        }
    }
}
