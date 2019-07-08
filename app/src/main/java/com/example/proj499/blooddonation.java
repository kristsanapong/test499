package com.example.proj499;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.RadioGroup;
import android.widget.TextView;

public class blooddonation extends AppCompatActivity {

    int score=0;
    RadioGroup G_q1 = (RadioGroup)findViewById(R.id.q1);
    RadioGroup G_q2 = (RadioGroup)findViewById(R.id.q2);
    RadioGroup G_q3 = (RadioGroup)findViewById(R.id.q3);
    RadioGroup G_q4 = (RadioGroup)findViewById(R.id.q4);
    RadioGroup G_q5 = (RadioGroup)findViewById(R.id.q5);
    RadioGroup G_q6 = (RadioGroup)findViewById(R.id.q6);
    RadioGroup G_q7 = (RadioGroup)findViewById(R.id.q7);
    RadioGroup G_q8 = (RadioGroup)findViewById(R.id.q8);
    RadioGroup G_q9 = (RadioGroup)findViewById(R.id.q9);
    RadioGroup G_q10 = (RadioGroup)findViewById(R.id.q10);
    RadioGroup G_q11 = (RadioGroup)findViewById(R.id.q11);
    RadioGroup G_q12 = (RadioGroup)findViewById(R.id.q12);
    RadioGroup G_q13 = (RadioGroup)findViewById(R.id.q13);
    RadioGroup G_q14 = (RadioGroup)findViewById(R.id.q14);
    RadioGroup G_q15 = (RadioGroup)findViewById(R.id.q15);
    RadioGroup G_q16 = (RadioGroup)findViewById(R.id.q16);
    RadioGroup G_q17 = (RadioGroup)findViewById(R.id.q17);
    RadioGroup G_q18 = (RadioGroup)findViewById(R.id.q18);
    RadioGroup G_q19 = (RadioGroup)findViewById(R.id.q19);
    RadioGroup G_q20 = (RadioGroup)findViewById(R.id.q20);
    RadioGroup G_q21 = (RadioGroup)findViewById(R.id.q21);
    RadioGroup G_q22 = (RadioGroup)findViewById(R.id.q22);
    RadioGroup G_q23 = (RadioGroup)findViewById(R.id.q23);
    RadioGroup G_q24 = (RadioGroup)findViewById(R.id.q24);
    RadioGroup G_q25 = (RadioGroup)findViewById(R.id.q25);
//    RadioGroup G_q26 = (RadioGroup)findViewById(R.id.q26);
//    RadioGroup G_q27 = (RadioGroup)findViewById(R.id.q27);
//    RadioGroup G_q28 = (RadioGroup)findViewById(R.id.q28);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blooddonation);

    }



    public void checkDonation(){

        if (G_q1.getCheckedRadioButtonId()== findViewById(R.id.q1_n).getId()){
            score++;
        }
        if (G_q2.getCheckedRadioButtonId()== findViewById(R.id.q2_n).getId()){
            score++;
        }
        if (G_q3.getCheckedRadioButtonId()== findViewById(R.id.q3_n).getId()){
            score++;
        }
        if (G_q4.getCheckedRadioButtonId()== findViewById(R.id.q4_n).getId()){
            score++;
        }
        if (G_q5.getCheckedRadioButtonId()== findViewById(R.id.q5_n).getId()){
            score++;
        }
        if (G_q6.getCheckedRadioButtonId()== findViewById(R.id.q6_n).getId()){
            score++;
        }
        if (G_q7.getCheckedRadioButtonId()== findViewById(R.id.q7_n).getId()){
            score++;
        }
        if (G_q8.getCheckedRadioButtonId()== findViewById(R.id.q8_n).getId()){
            score++;
        }
        if (G_q9.getCheckedRadioButtonId()== findViewById(R.id.q9_n).getId()){
            score++;
        }
        if (G_q10.getCheckedRadioButtonId()== findViewById(R.id.q10_n).getId()){
            score++;
        }
        if (G_q11.getCheckedRadioButtonId()== findViewById(R.id.q11_n).getId()){
            score++;
        }
        if (G_q12.getCheckedRadioButtonId()== findViewById(R.id.q12_n).getId()){
            score++;
        }
        if (G_q13.getCheckedRadioButtonId()== findViewById(R.id.q13_n).getId()){
            score++;
        }
        if (G_q14.getCheckedRadioButtonId()== findViewById(R.id.q14_n).getId()){
            score++;
        }
        if (G_q15.getCheckedRadioButtonId()== findViewById(R.id.q15_y).getId()){
            score++;
        }
        if (G_q16.getCheckedRadioButtonId()== findViewById(R.id.q16_n).getId()){
            score++;
        }
        if (G_q17.getCheckedRadioButtonId()== findViewById(R.id.q17_n).getId() || G_q17.getCheckedRadioButtonId()== findViewById(R.id.q17_y).getId()){
            score++;
        }
        if (G_q18.getCheckedRadioButtonId()== findViewById(R.id.q18_n).getId()){
            score++;
        }
        if (G_q19.getCheckedRadioButtonId()== findViewById(R.id.q19_n).getId()){
            score++;
        }
        if (G_q20.getCheckedRadioButtonId()== findViewById(R.id.q20_n).getId()){
            score++;
        }
        if (G_q21.getCheckedRadioButtonId()== findViewById(R.id.q21_n).getId()){
            score++;
        }
        if (G_q22.getCheckedRadioButtonId()== findViewById(R.id.q22_n).getId()){
            score++;
        }
        if (G_q23.getCheckedRadioButtonId()== findViewById(R.id.q23_n).getId() || G_q23.getCheckedRadioButtonId()== findViewById(R.id.q23_y).getId()){
            score++;
        }
        if (G_q24.getCheckedRadioButtonId()== findViewById(R.id.q24_n).getId()){
            score++;
        }
        if (G_q25.getCheckedRadioButtonId()== findViewById(R.id.q25_n).getId()){
            score++;
        }


    }

}
