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

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button login,signup;
    EditText user,pass;
    Intent intent;
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
                intent = new Intent(this, News.class);
                startActivity(intent);
                break;
            case R.id.signup_button:
                intent = new Intent(this, Signup.class);
                startActivity(intent);
                break;
        }
    }
}
