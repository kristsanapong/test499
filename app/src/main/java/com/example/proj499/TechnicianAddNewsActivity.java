package com.example.proj499;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TechnicianAddNewsActivity extends AppCompatActivity {

    TextView data;
    Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technician_add_news);
        add = findViewById(R.id.button_addNews);
        data = findViewById(R.id.txt_addNews);
    }
    public void AddNews(View view){
        MySQLConnect mySQLConnect = new MySQLConnect(TechnicianAddNewsActivity.this);
        try {
            mySQLConnect.AddNews(data.getText().toString());
            finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finish();

    }
}
