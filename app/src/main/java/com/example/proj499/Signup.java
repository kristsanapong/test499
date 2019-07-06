package com.example.proj499;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Calendar;
import java.util.List;

public class Signup extends AppCompatActivity {

    private static final String TAG = "Signup";

    private EditText txt_email, txt_pw, txt_fistname, txt_lastname, txt_citizen;
    private RadioGroup sex,blood_group;
    private Button signupButt;
    private MySQLConnect mySQLConnect;
    private List<String> items;
    private TextView mDisplayDate;
    private DatePickerDialog.OnDateSetListener mDateSetListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        txt_fistname= (EditText) findViewById(R.id.txt_firstname);
        txt_lastname = (EditText) findViewById(R.id.txt_lastname);
        txt_email = (EditText) findViewById(R.id.txt_email);
        txt_citizen = (EditText) findViewById(R.id.txt_citizen);
        sex = (RadioGroup)findViewById(R.id.sex);
        blood_group = (RadioGroup)findViewById(R.id.blood_group);

        mDisplayDate = (TextView) findViewById(R.id.bdDate);
        mDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);
                switch (v.getId()){
                    case R.id.register_button:
                        String firstname = txt_fistname.getText().toString();
                        String lastname = txt_lastname.getText().toString();
                        String email = txt_email.getText().toString();
                        String password = txt_pw.getText().toString();

                        break;
                }

                DatePickerDialog dialog = new DatePickerDialog(Signup.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDateSetListener,
                        year, month, day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month += 1;
                Log.d(TAG, "วัน/เดือน/ปี: " + dayOfMonth + "/" + month + "/" + year);

                String date = dayOfMonth + "/" + month + "/" + year;
                mDisplayDate.setText(date);
            }
        };
}


}





