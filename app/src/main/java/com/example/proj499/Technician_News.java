package com.example.proj499;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Technician_News extends AppCompatActivity implements MySQLConnect.AsyncResponse{
    int i;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technician__news);

        MySQLConnect mySQLConnect = new MySQLConnect();
        mySQLConnect.delegate = this;
        mySQLConnect.GetNews();
//        LinearLayout sv_TechnicianNews = (LinearLayout) findViewById(R.id.llTechnician_News);
//        for (i = 0; i < count; i++) {
//            TextView text = new TextView(this);
//            text.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
//            text.setText("" + i);
//            sv_TechnicianNews.addView(text);
//        }
    }

    public void AddNews(View view)
    {
        Intent intent = new Intent(getBaseContext(), TechnicianAddNewsActivity.class);
        startActivity(intent);


    }

    @Override
    public void processFinish(String output) {
        output = output.replace("*","/");
        String[] news = output.split("#");

        LinearLayout sv_News = (LinearLayout) findViewById(R.id.llTechnician_News);
        int i = 0;
        if (!output.equals(""))
        {
            for (final String news1 : news) {
                i++;
                final String[] Details = news1.split("/");
                TextView text = new TextView(this);
                text.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                text.setTextSize(20);
                text.setTextColor(Color.BLACK);
                text.setTypeface(null, Typeface.BOLD);
                text.setText(Details[0]+"\n"+Details[1]+"\n");
                text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Technician_News.this);
                        builder.setTitle("การบริจาค");
                        builder.setMessage("คุณจะลบข่าวนี้ออกใช่ไหม");
//                    final EditText input_detail = new EditText(getBaseContext());
//                    input_detail.setInputType(InputType.TYPE_CLASS_TEXT);
//                    builder.setView(input_detail);
                        DialogInterface.OnClickListener dialog = new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                switch (which) {
                                    case DialogInterface.BUTTON_POSITIVE:

                                        MySQLConnect mySQLConnect = new MySQLConnect(Technician_News.this);
                                        mySQLConnect.DeleteNews(Details[0]);
                                        break;
                                    case DialogInterface.BUTTON_NEGATIVE:

                                        break;
                                }
                            }
                        };
                        builder.setPositiveButton("ใช่", dialog);
                        builder.setNegativeButton("ไม่ใช่", dialog);
                        AlertDialog dialog1 = builder.create();
                        dialog1.show();
                    }
                });
                sv_News.addView(text);
            }
        }

    }
}
