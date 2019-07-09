package com.example.proj499;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

public class TechnicianDataAccountActivity extends AppCompatActivity implements MySQLConnect.AsyncResponse{

    private TextView fname, lname, c_id, email, sex, bloodgroup;
    private Button delete;
    private String Data;
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
        delete = findViewById(R.id.Delete_Data);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(TechnicianDataAccountActivity.this);
                builder.setTitle("บัญชีผู้ใช้งาน");
                builder.setMessage("คุณจะลบบัญชีหรือไม่");
                DialogInterface.OnClickListener dialog = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which) {
                            case DialogInterface.BUTTON_POSITIVE:
                                MySQLConnect mySQLConnect = new MySQLConnect(TechnicianDataAccountActivity.this);
//                                    String[] name = text.getText().toString().split(" ");
                                mySQLConnect.DeleteAccount(Data);
                                finish();
                                break;
                            case DialogInterface.BUTTON_NEGATIVE:
                                //ไม่ผ่าน ลบ

                                break;
                        }
                    }
                };
                builder.setPositiveButton("ใช่", dialog);
                builder.setNegativeButton("ไม่ใช่", dialog);
                AlertDialog dialog1 = builder.create();
                dialog1.show();
            }
        });
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
                Data = split[0] + " " + split[1];
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
