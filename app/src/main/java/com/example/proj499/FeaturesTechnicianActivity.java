package com.example.proj499;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FeaturesTechnicianActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_features_technician);
    }
    public void News(View view)
    {
        Intent intent = new Intent(getBaseContext(), News.class);
        startActivity(intent);

    }
    public void BloodDonate(View view)
    {
        Intent intent = new Intent(getBaseContext(), blooddonation.class);
        startActivity(intent);

    }
    public void Queue(View view)
    {
        Intent intent = new Intent(getBaseContext(), Queue.class);
        startActivity(intent);

    }
    public void Profile(View view)
    {
        Intent intent = new Intent(getBaseContext(), Profile.class);
        Bundle extras = getIntent().getExtras();
        if (extras != null)
        {
            intent.putExtra("admin", extras.getString("admin"));
        }

        startActivity(intent);

    }
    public void Location(View view)
    {
        Intent intent = new Intent(getBaseContext(), MapsActivity.class);
        startActivity(intent);

    }
    public void ForTechnician(View view){

        Intent intent = new Intent(getBaseContext(), ManageDataTechnician.class);
        startActivity(intent);
    }

}
