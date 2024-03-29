package com.example.proj499;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

public class News extends AppCompatActivity implements MySQLConnect.AsyncResponse{
    private TextView mTextMessage;
    int i;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        MySQLConnect mySQLConnect = new MySQLConnect();
        mySQLConnect.delegate = this;
        mySQLConnect.GetNews();

    }

    @Override
    public void processFinish(String output) {//timestamp
        output = output.replace("*","/");
        String[] news = output.split("#");
        LinearLayout sv_News = (LinearLayout) findViewById(R.id.llNews);
        int i = 0;
        if (!output.equals(""))
        {
            for (String news1 : news) {
                i++;
                String[] Details = news1.split("/");
                TextView text = new TextView(this);
                TextView text2 = new TextView(this);
                text.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                text.setTextSize(20);
                text.setTextColor(Color.BLACK);
                text.setTypeface(null, Typeface.BOLD);
                text.setText(Details[0]);
                text2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                text2.setTextSize(15);
                text2.setGravity(Gravity.RIGHT);
                text2.setText(Details[1]+"\n");
                text2.setTextColor(Color.GRAY);
                sv_News.addView(text);
                sv_News.addView(text2);
            }
        }

    }
}
