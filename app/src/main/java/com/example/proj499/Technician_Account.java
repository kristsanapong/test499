package com.example.proj499;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Technician_Account extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technician__account);
    }

    public void AddAccount(View view)
    {
        Intent intent = new Intent(getBaseContext(), TechnicianAddAccountActivity.class);
        startActivity(intent);

    }
    public void AddMedical(View view)
    {
        Intent intent = new Intent(getBaseContext(), Technician_News.class);
        startActivity(intent);

    }
}
