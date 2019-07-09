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
    private static final int RB1_ID = 1000;//first radio button id
    private static final int RB2_ID = 1001;//second radio button id
    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blooddonation);

    }


    public void checkQuiz() {

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
        switch (btn1) {
            case RB2_ID:
                score++;
                break;
            case -1:
                break;
        }
        switch (btn2) {
            case RB2_ID:
                score++;
                break;
            case -1:
                break;
        }
        switch (btn3) {
            case RB2_ID:
                score++;
                break;
            case -1:
                break;
        }
        switch (btn4) {
            case RB2_ID:
                score++;
                break;
            case -1:
                break;
        }
        switch (btn5) {
            case RB2_ID:
                score++;
                break;
            case -1:
                break;
        }
        switch (btn6) {
            case RB2_ID:
                score++;
                break;
            case -1:
                break;
        }
        switch (btn7) {
            case RB2_ID:
                score++;
                break;
            case -1:
                break;
        }
        switch (btn8) {
            case RB2_ID:
                score++;
                break;
            case -1:
                break;
        }
        switch (btn9) {
            case RB2_ID:
                score++;
                break;
            case -1:
                break;
        }
        switch (btn10) {
            case RB2_ID:
                score++;
                break;
            case -1:
                break;
        }
        switch (btn11) {
            case RB2_ID:
                score++;
                break;
            case -1:
                break;
        }
        switch (btn12) {
            case RB2_ID:
                score++;
                break;
            case -1:
                break;
        }
        switch (btn13) {
            case RB2_ID:
                score++;
                break;
            case -1:
                break;
        }
        switch (btn14) {
            case RB2_ID:
                score++;
                break;
            case -1:
                break;
        }
        switch (btn15) {
            case RB1_ID:
                score++;
                break;
            case -1:
                break;
        }
        switch (btn16) {
            case RB2_ID:
                score++;
                break;
            case -1:
                break;
        }
        switch (btn17) {
            case RB2_ID:
                score++;
                break;
            case -1:
                break;
        }
        switch (btn18) {
            case RB2_ID:
                score++;
                break;
            case RB1_ID:
                score++;
                break;
            case -1:
                break;
        }
        switch (btn19) {
            case RB2_ID:
                score++;
                break;
            case -1:
                break;
        }
        switch (btn20) {
            case RB2_ID:
                score++;
                break;
            case -1:
                break;
        }
        switch (btn21) {
            case RB2_ID:
                score++;
                break;
            case -1:
                break;
        }
        switch (btn22) {
            case RB2_ID:
                score++;
                break;
            case -1:
                break;
        }
        switch (btn23) {
            case RB1_ID:
                score++;
                break;
            case RB2_ID:
                score++;
                break;
            case -1:
                break;
        }
        switch (btn24) {
            case RB2_ID:
                score++;
                break;
            case -1:
                break;
        }
        switch (btn25) {
            case RB2_ID:
                score++;
                break;
            case -1:
                break;
        }


        if (score == 25) {
            //insert into queue
            //show alertbox ยืนยันการจองคิว
            //ใช่ ไม่

        } else {
            //alertbox ท่านไม่สามารถบริจาคโลหิตได้
            //ok

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
