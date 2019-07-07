package com.example.proj499;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ManageDataTechnician extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_data_technician);
    }

    public void ManageMedical(View view)
    {
        Intent intent = new Intent(getBaseContext(), MedicalActivity.class);
        startActivity(intent);

    }
    public void ManageAdmin(View view)
    {
        Intent intent = new Intent(getBaseContext(), TechnicianActivity.class);
        startActivity(intent);

    }
}
