package com.example.proj499;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
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
    public void processFinish(String output) {
        String[] news = output.split("#");
        LinearLayout sv_News = (LinearLayout) findViewById(R.id.llNews);
        int i = 0;
        for (String news1 : news) {
            i++;
            TextView text = new TextView(this);
            text.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            text.setTextSize(20);
            text.setText(i+". "+news1+"\n");
            sv_News.addView(text);
        }
    }
}
