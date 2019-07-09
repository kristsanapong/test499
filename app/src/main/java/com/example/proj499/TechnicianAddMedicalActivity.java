package com.example.proj499;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TechnicianAddMedicalActivity extends AppCompatActivity implements View.OnClickListener, MySQLConnect.AsyncResponse{

    private EditText username, firstname, lastname, password;
    private Button addData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technician_add_medical);

        username = findViewById(R.id.add_email);
        firstname = findViewById(R.id.add_firstname);
        lastname = findViewById(R.id.add_lastname);
        password = findViewById(R.id.add_password);
        addData = findViewById(R.id.add_account_button);
        addData.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.add_account_button:

                try {
                    String uname = username.getText().toString();
                    String fname = firstname.getText().toString();
                    String lname = lastname.getText().toString();
                    String pass = password.getText().toString();
                    MySQLConnect mySQLConnect = new MySQLConnect();
                    mySQLConnect.delegate = this;
                    mySQLConnect.AddMedical(uname, fname, lname, pass);
                } catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(),"กรุณากรอกข้อมูลให้ครบถ้วน",Toast.LENGTH_LONG).show();
                }
                break;
        }
    }

    @Override
    public void processFinish(String output) {
        if (output.equals("Data Inserted Successfully")) {
            Toast.makeText(this, "Register complete",Toast.LENGTH_LONG).show();
            finish();
        } else {
            Toast.makeText(this, "Register fail",Toast.LENGTH_LONG).show();
        }
    }
}
