package com.example.proj499;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class blooddonation extends AppCompatActivity implements MySQLConnect.AsyncResponse {
    private static final int RB1_ID = 1000;//first radio button id
    private static final int RB2_ID = 1001;//second radio button id
    String data;
    int score = 0;
    //private AlertDialog dialog1, dialog2;
    private Button button;
    private RadioButton r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blooddonation);
        button = (Button)findViewById(R.id.button_bloodDonation);

//        MySQLConnect mySQLConnect = new MySQLConnect();
//        mySQLConnect.delegate = this;
//        mySQLConnect.getData();
        Bundle extras = getIntent().getExtras();
        if (extras != null)
        {
            data = extras.getString("data");
        }
    }


    public void checkQuiz(View view) {

        RadioGroup G_q1 = findViewById(R.id.q1);
        RadioGroup G_q2 = findViewById(R.id.q2);
        RadioGroup G_q3 = findViewById(R.id.q3);
        RadioGroup G_q4 = findViewById(R.id.q4);
        RadioGroup G_q5 = findViewById(R.id.q5);
        RadioGroup G_q6 = findViewById(R.id.q6);
        RadioGroup G_q7 = findViewById(R.id.q7);
        RadioGroup G_q8 = findViewById(R.id.q8);
        RadioGroup G_q9 = findViewById(R.id.q9);
        RadioGroup G_q10 = findViewById(R.id.q10);
        RadioGroup G_q11 = findViewById(R.id.q11);
        RadioGroup G_q12 = findViewById(R.id.q12);
        RadioGroup G_q13 = findViewById(R.id.q13);
        RadioGroup G_q14 = findViewById(R.id.q14);
        RadioGroup G_q15 = findViewById(R.id.q15);
        RadioGroup G_q16 = findViewById(R.id.q16);
        RadioGroup G_q17 = findViewById(R.id.q17);
        RadioGroup G_q18 = findViewById(R.id.q18);
        RadioGroup G_q19 = findViewById(R.id.q19);
        RadioGroup G_q20 = findViewById(R.id.q20);
        RadioGroup G_q21 = findViewById(R.id.q21);
        RadioGroup G_q22 = findViewById(R.id.q22);
        RadioGroup G_q23 = findViewById(R.id.q23);
        RadioGroup G_q24 = findViewById(R.id.q24);
        RadioGroup G_q25 = findViewById(R.id.q25);
        int btn1 = G_q1.getCheckedRadioButtonId();
        int btn2 = G_q2.getCheckedRadioButtonId();
        int btn3 = G_q3.getCheckedRadioButtonId();
        int btn4 = G_q4.getCheckedRadioButtonId();
        int btn5 = G_q5.getCheckedRadioButtonId();
        int btn6 = G_q6.getCheckedRadioButtonId();
        int btn7 = G_q7.getCheckedRadioButtonId();
        int btn8 = G_q8.getCheckedRadioButtonId();
        int btn9 = G_q9.getCheckedRadioButtonId();
        int btn10 = G_q10.getCheckedRadioButtonId();
        int btn11 = G_q11.getCheckedRadioButtonId();
        int btn12 = G_q12.getCheckedRadioButtonId();
        int btn13 = G_q13.getCheckedRadioButtonId();
        int btn14 = G_q14.getCheckedRadioButtonId();
        int btn15 = G_q15.getCheckedRadioButtonId();
        int btn16 = G_q16.getCheckedRadioButtonId();
        int btn17 = G_q17.getCheckedRadioButtonId();
        int btn18 = G_q18.getCheckedRadioButtonId();
        int btn19 = G_q19.getCheckedRadioButtonId();
        int btn20 = G_q20.getCheckedRadioButtonId();
        int btn21 = G_q21.getCheckedRadioButtonId();
        int btn22 = G_q22.getCheckedRadioButtonId();
        int btn23 = G_q23.getCheckedRadioButtonId();
        int btn24 = G_q24.getCheckedRadioButtonId();
        int btn25 = G_q25.getCheckedRadioButtonId();
        try {
            r = findViewById(btn1);
            String choice = r.getText().toString();
            switch (choice) {
                case "ไม่":
                    score++;
                    break;
                case "ใช่":
                    break;
            }
            r = findViewById(btn2);
            choice = r.getText().toString();
            switch (choice) {
                case "ไม่":
                    score++;
                    break;
                case "ใช่":
                    break;
            }
            r = findViewById(btn3);
            choice = r.getText().toString();
            switch (choice) {
                case "ไม่":
                    score++;
                    break;
                case "ใช่":
                    break;
            }
            r = findViewById(btn4);
            choice = r.getText().toString();
            switch (choice) {
                case "ไม่":
                    score++;
                    break;
                case "ใช่":
                    break;
            }
            r = findViewById(btn5);
            choice = r.getText().toString();
            switch (choice) {
                case "ไม่":
                    score++;
                    break;
                case "ใช่":
                    break;
            }
            r = findViewById(btn6);
            choice = r.getText().toString();
            switch (choice) {
                case "ไม่":
                    score++;
                    break;
                case "ใช่":
                    break;
            }
            r = findViewById(btn7);
            choice = r.getText().toString();
            switch (choice) {
                case "ไม่":
                    score++;
                    break;
                case "ใช่":
                    break;
            }
            r = findViewById(btn8);
            choice = r.getText().toString();
            switch (choice) {
                case "ไม่":
                    score++;
                    break;
                case "ใช่":
                    break;
            }
            r = findViewById(btn9);
            choice = r.getText().toString();
            switch (choice) {
                case "ไม่":
                    score++;
                    break;
                case "ใช่":
                    break;
            }
            r = findViewById(btn10);
            choice = r.getText().toString();
            switch (choice) {
                case "ไม่":
                    score++;
                    break;
                case "ใช่":
                    break;
            }
            r = findViewById(btn11);
            choice = r.getText().toString();
            switch (choice) {
                case "ไม่":
                    score++;
                    break;
                case "ใช่":
                    break;
            }
            r = findViewById(btn12);
            choice = r.getText().toString();
            switch (choice) {
                case "ไม่":
                    score++;
                    break;
                case "ใช่":
                    break;
            }
            r = findViewById(btn13);
            choice = r.getText().toString();
            switch (choice) {
                case "ไม่":
                    score++;
                    break;
                case "ใช่":
                    break;
            }
            r = findViewById(btn14);
            choice = r.getText().toString();
            switch (choice) {
                case "ไม่":
                    score++;
                    break;
                case "ใช่":
                    break;
            }
            r = findViewById(btn15);
            choice = r.getText().toString(); //yes
            switch (choice) {
                case "ใช่":
                    score++;
                    break;
                case "ไม่":
                    break;
            }
            r = findViewById(btn16);
            choice = r.getText().toString();
            switch (choice) {
                case "ไม่":
                    score++;
                    break;
                case "ใช่":
                    break;
            }
            r = findViewById(btn17);
            choice = r.getText().toString();
            switch (choice) {
                case "ไม่":
                    score++;
                    break;
                case "ใช่":
                    break;
            }
            r = findViewById(btn18);
            choice = r.getText().toString();
            switch (choice) {
                case "ไม่":
                    score++;
                    break;
                case "ใช่":
                    score++;
                    break;
            }
            r = findViewById(btn19);
            choice = r.getText().toString();
            switch (choice) {
                case "ไม่":
                    score++;
                    break;
                case "ใช่":
                    break;
            }
            r = findViewById(btn20);
            choice = r.getText().toString();
            switch (choice) {
                case "ไม่":
                    score++;
                    break;
                case "ใช่":
                    break;
            }
            r = findViewById(btn21);
            choice = r.getText().toString();
            switch (choice) {
                case "ไม่":
                    score++;
                    break;
                case "ใช่":
                    break;
            }
            r = findViewById(btn22);
            choice = r.getText().toString();
            switch (choice) {
                case "ไม่":
                    score++;
                    break;
                case "ใช่":
                    break;
            }
            r = findViewById(btn23);
            choice = r.getText().toString();
            switch (choice) {
                case "ไม่":
                    score++;
                    break;
                case "ใช่":
                    score++;
                    break;
            }
            r = findViewById(btn24);
            choice = r.getText().toString();
            switch (choice) {
                case "ไม่":
                    score++;
                    break;
                case "ใช่":
                    break;
            }
            r = findViewById(btn25);
            choice = r.getText().toString();
            switch (choice) {
                case "ไม่":
                    score++;
                    break;
                case "ใช่":
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(getApplicationContext(),"กรุณากรอกข้อมูลให้ครบถ้วน",Toast.LENGTH_LONG).show();
        }


//        final AlertDialog dialog1;
//        final AlertDialog dialog2;

        if (score == 25) {
            //insert into queue
            //show alertbox ยืนยันการจองคิว
            //ใช่ ไม่
//            button.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(blooddonation.this);
                    builder.setTitle("การบริจาค");
                    builder.setMessage("ท่านยืนยันการจองคิวหรือไม่");

                    DialogInterface.OnClickListener dialog = new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            switch (which) {
                                case DialogInterface.BUTTON_POSITIVE:
                                    AddQueue();
                                    break;
                                case DialogInterface.BUTTON_NEGATIVE:

                                    break;
                            }

                        }


                    };
                    builder.setPositiveButton("ใช่", dialog);
                    builder.setNegativeButton("ไม่", dialog);
                    AlertDialog dialog1 = builder.create();
                    dialog1.show();
                //}
            //});


        } else {
            //alertbox ท่านไม่สามารถบริจาคโลหิตได้
            //ok

//            button.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(blooddonation.this);
                    builder.setTitle("การบริจาค");
                    builder.setMessage("ท่านไม่สามารถบริจาคได้");

                    DialogInterface.OnClickListener dialog = new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            switch (which) {
                                case DialogInterface.BUTTON_POSITIVE:


                                    break;
                                case DialogInterface.BUTTON_NEGATIVE:


                                    break;
                            }

                        }

                    };
                    builder.setPositiveButton("OK", dialog);
//                    builder.show();
                    AlertDialog dialog2 = builder.create();
                    dialog2.show();
//                }
//            });

        }
        score = 0;
    }
    public void AddQueue()
    {
        MySQLConnect mySQLConnect = new MySQLConnect();
        mySQLConnect.delegate = this;
        data = data.replace("*", " ");
        mySQLConnect.AddQueue(data);
    }


    @Override
    public void processFinish(String output) {
        if (output.equals("success"))
        {
            Toast.makeText(this, "Add queue success", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Add queue fail", Toast.LENGTH_LONG).show();
        }
    }

}


//    public void checkDonation(){
//
//        if (G_q1.getCheckedRadioButtonId()== findViewById(R.id.q1_n).getId()){
//            score++;
//        }
//        if (G_q2.getCheckedRadioButtonId()== findViewById(R.id.q2_n).getId()){
//            score++;
//        }
//        if (G_q3.getCheckedRadioButtonId()== findViewById(R.id.q3_n).getId()){
//            score++;
//        }
//        if (G_q4.getCheckedRadioButtonId()== findViewById(R.id.q4_n).getId()){
//            score++;
//        }
//        if (G_q5.getCheckedRadioButtonId()== findViewById(R.id.q5_n).getId()){
//            score++;
//        }
//        if (G_q6.getCheckedRadioButtonId()== findViewById(R.id.q6_n).getId()){
//            score++;
//        }
//        if (G_q7.getCheckedRadioButtonId()== findViewById(R.id.q7_n).getId()){
//            score++;
//        }
//        if (G_q8.getCheckedRadioButtonId()== findViewById(R.id.q8_n).getId()){
//            score++;
//        }
//        if (G_q9.getCheckedRadioButtonId()== findViewById(R.id.q9_n).getId()){
//            score++;
//        }
//        if (G_q10.getCheckedRadioButtonId()== findViewById(R.id.q10_n).getId()){
//            score++;
//        }
//        if (G_q11.getCheckedRadioButtonId()== findViewById(R.id.q11_n).getId()){
//            score++;
//        }
//        if (G_q12.getCheckedRadioButtonId()== findViewById(R.id.q12_n).getId()){
//            score++;
//        }
//        if (G_q13.getCheckedRadioButtonId()== findViewById(R.id.q13_n).getId()){
//            score++;
//        }
//        if (G_q14.getCheckedRadioButtonId()== findViewById(R.id.q14_n).getId()){
//            score++;
//        }
//        if (G_q15.getCheckedRadioButtonId()== findViewById(R.id.q15_y).getId()){
//            score++;
//        }
//        if (G_q16.getCheckedRadioButtonId()== findViewById(R.id.q16_n).getId()){
//            score++;
//        }
//        if (G_q17.getCheckedRadioButtonId()== findViewById(R.id.q17_n).getId() || G_q17.getCheckedRadioButtonId()== findViewById(R.id.q17_y).getId()){
//            score++;
//        }
//        if (G_q18.getCheckedRadioButtonId()== findViewById(R.id.q18_n).getId()){
//            score++;
//        }
//        if (G_q19.getCheckedRadioButtonId()== findViewById(R.id.q19_n).getId()){
//            score++;
//        }
//        if (G_q20.getCheckedRadioButtonId()== findViewById(R.id.q20_n).getId()){
//            score++;
//        }
//        if (G_q21.getCheckedRadioButtonId()== findViewById(R.id.q21_n).getId()){
//            score++;
//        }
//        if (G_q22.getCheckedRadioButtonId()== findViewById(R.id.q22_n).getId()){
//            score++;
//        }
//        if (G_q23.getCheckedRadioButtonId()== findViewById(R.id.q23_n).getId() || G_q23.getCheckedRadioButtonId()== findViewById(R.id.q23_y).getId()){
//            score++;
//        }
//        if (G_q24.getCheckedRadioButtonId()== findViewById(R.id.q24_n).getId()){
//            score++;
//        }
//        if (G_q25.getCheckedRadioButtonId()== findViewById(R.id.q25_n).getId()){
//            score++;
//        }
//
//
//    }
