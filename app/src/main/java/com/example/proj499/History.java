package com.example.proj499;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class History extends AppCompatActivity implements MySQLConnect.AsyncResponse{

    private TextView mTextMessage;
    String Data, detail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Data = extras.getString("history"); //Data
            detail = extras.getString("detail");
//            if (detail != null)
//            {
//                detail = "detail: " + detail;
//            }
            MySQLConnect mySQLConnect = new MySQLConnect();
            mySQLConnect.delegate = this;
            String[] email = Data.split(" ");
            mySQLConnect.AddHistory(Data + " " + detail);
            MySQLConnect mySQLConnect1 = new MySQLConnect(History.this);
            mySQLConnect1.DeleteQueue(email[0]);
            finish();
        }
    }

    @Override
    public void processFinish(String output) {
        if (output.equals("history success"))
        {
            Toast.makeText(this,"Add history success", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this,"Add history fail", Toast.LENGTH_LONG).show();
        }
    }
}
