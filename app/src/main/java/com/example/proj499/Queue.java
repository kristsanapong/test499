package com.example.proj499;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;


public class Queue extends AppCompatActivity {

    int i;
    int count=10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue);

        LinearLayout sv_Queue = (LinearLayout) findViewById(R.id.llQueue);
        for (i=0;i<count;i++){
            TextView text = new TextView(this);
            text.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            text.setText(""+i);
            sv_Queue.addView(text);
        }
    }
}
