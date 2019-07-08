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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.List;

public class TechnicianAddAccountActivity extends AppCompatActivity {
    private static final String TAG = "TechnicianAddAccount";
    private EditText txt_email, txt_pw, txt_fistname, txt_lastname, txt_citizen;
    private RadioGroup sex, blood_group;
    private Button signupButt;
    private MySQLConnect mySQLConnect;
    private List<String> items;
    private TextView mDisplayDate;
    private DatePickerDialog.OnDateSetListener mDateSetListener;
    private RadioButton r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        txt_pw = (EditText) findViewById(R.id.account_password);
        txt_fistname = (EditText) findViewById(R.id.account_firstname);
        txt_lastname = (EditText) findViewById(R.id.account_lastname);
        txt_email = (EditText) findViewById(R.id.account_username);
        txt_citizen = (EditText) findViewById(R.id.account_citizen);
        sex = (RadioGroup) findViewById(R.id.account_sex);
        blood_group = (RadioGroup) findViewById(R.id.account_bloodgroup);
        signupButt = (Button)findViewById(R.id.add_account_button);
        mDisplayDate = (TextView) findViewById(R.id.account_bdDate);
        signupButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.account_button_add:
                        String firstname = txt_fistname.getText().toString();
                        String lastname = txt_lastname.getText().toString();
                        String email = txt_email.getText().toString();
                        int selected_sex = sex.getCheckedRadioButtonId();
                        r = findViewById(selected_sex);
                        String sex = r.getText().toString();
                        int selected_blood_group = blood_group.getCheckedRadioButtonId();
                        r = findViewById(selected_blood_group);
                        String blood_group = r.getText().toString();
                        String password = txt_pw.getText().toString();
                        String citizen_id = txt_citizen.getText().toString();

                        boolean check = accountCheckCitizen(citizen_id);

                        if (!check){
                            Toast.makeText(getApplicationContext(),"เลขบัตรประจำตัวไม่ถูกต้อง",Toast.LENGTH_LONG).show();

                        } else {
                            mySQLConnect.sentData_signup(firstname, lastname, email, citizen_id, sex, blood_group, password);
                        }
                        break;
                }
            }
        });
        mDisplayDate.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);


                DatePickerDialog dialog = new DatePickerDialog(TechnicianAddAccountActivity.this,
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

    public boolean accountCheckCitizen(String id) {
        int len = String.valueOf(id).length();
        int sum = 0;
        String digitArray[] = id.split("");
        int digit = 0;
        int ans;
        int check_digit;
        if (len != 13){return false;}
        for (int i = 0;i<12;i++){
            digit = Integer.parseInt(digitArray[i+1]);
            sum = sum + (digit)*(13-i);
        }
        int x = sum %11;
        if(x <= 1){
            ans = 1-x;
        }else {
            ans = 11-x;
        }
        int last_digit = Integer.parseInt(digitArray[len]);
        if (ans == last_digit){
            return true;
        }
        else {
            return false;
        }
    }
}
