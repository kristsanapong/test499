package com.example.proj499;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Technician_News extends AppCompatActivity {
    int i;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technician__news);
        LinearLayout sv_TechnicianNews = (LinearLayout) findViewById(R.id.llTechnician_News);
        for (i = 0; i < count; i++) {
            TextView text = new TextView(this);
            text.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            text.setText("" + i);
            sv_TechnicianNews.addView(text);
        }
    }

    public void AddNews(View view)
    {
        Intent intent = new Intent(getBaseContext(), TechnicianAddNewsActivity.class);
        startActivity(intent);

    }
}
