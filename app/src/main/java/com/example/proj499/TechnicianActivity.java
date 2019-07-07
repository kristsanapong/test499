package com.example.proj499;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TechnicianActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technician);
    }

    public void UserData(View view)
    {
        Intent intent = new Intent(getBaseContext(), Technician_Account.class);
        startActivity(intent);

    }
    public void NewsData(View view)
    {
        Intent intent = new Intent(getBaseContext(), Technician_News.class);
        startActivity(intent);

    }
}
