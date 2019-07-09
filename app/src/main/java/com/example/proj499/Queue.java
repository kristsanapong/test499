package com.example.proj499;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;


public class Queue extends AppCompatActivity implements MySQLConnect.AsyncResponse{

    int i;
    int count=10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue);

        //LinearLayout sv_Queue = (LinearLayout) findViewById(R.id.llQueue);
        MySQLConnect mySQLConnect = new MySQLConnect();
        mySQLConnect.delegate = this;
        mySQLConnect.getData();
//        for (i=0;i<count;i++){
//            TextView text = new TextView(this);
//            text.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
//            text.setText(""+i);
//
//
//            sv_Queue.addView(text);
//        }
    }

    @Override
    public void processFinish(String output) {
        String[] person = output.split("#");
        LinearLayout sv_Queue = (LinearLayout) findViewById(R.id.llQueue);
        int i = 0;
        for (String person1 : person) {
            i++;
            person1 = person1.replace("*"," ");
            String[] split = person1.split(" ");
            final String email = split[0]; // email
            person1 = person1.replace(email, "");
            TextView text = new TextView(this);
            text.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            text.setTextSize(20);
            text.setTextColor(000000);
            text.setText(i+". "+person1+"\n");
            sv_Queue.addView(text);
        }
    }



}
