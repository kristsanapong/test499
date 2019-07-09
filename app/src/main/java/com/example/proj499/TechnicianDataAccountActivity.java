package com.example.proj499;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;

public class TechnicianDataAccountActivity extends AppCompatActivity implements MySQLConnect.AsyncResponse{

    private TextView fname, lname, c_id, email, sex, bloodgroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technician_data_account);
        Bundle extras = getIntent().getExtras();
        String data = "";
        fname = findViewById(R.id.firstName);
        lname = findViewById(R.id.lastname);
        c_id = findViewById(R.id.citizen_id);
        email = findViewById(R.id.user_email);
        sex = findViewById(R.id.sex);
        bloodgroup = findViewById(R.id.blood_group);
        if (extras != null)
        {
            data = extras.getString("account");
            String[] name = data.split(" ");
            MySQLConnect mySQLConnect = new MySQLConnect();
            mySQLConnect.delegate = this;
            mySQLConnect.GetUserData(data);
        }

    }

    @Override
    public void processFinish(String output) {
        String[] person = output.split("#");

        for (String person1 : person)
        {
            person1 = person1.replace("*", " ");
            String[] split = person1.split(" ");
            try {
                fname.setText(split[0]);
                lname.setText(split[1]);
                c_id.setText(split[2]);
                email.setText(split[3]);
                sex.setText(split[4]);
                bloodgroup.setText(split[5]);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
