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

public class MedicalActivity extends AppCompatActivity implements MySQLConnect.AsyncResponse{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical);

        MySQLConnect mySQLConnect = new MySQLConnect();
        mySQLConnect.delegate = this;
        mySQLConnect.getData();
    }

    @Override
    public void processFinish(String output) {
        String[] person = output.split("#");
        LinearLayout sv_Queue = (LinearLayout) findViewById(R.id.llQueue);
        int i = 0;
        if (!output.equals(""))
        {
            for (String person1 : person) {
                i++;
                person1 = person1.replace("*"," ");
                final String data = person1;
                final String[] split = person1.split(" ");
                final String email = split[0]; // email
                person1 = person1.replace(email, "");
                final TextView text = new TextView(this);
                text.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                text.setTextSize(20);
                text.setTextColor(Color.BLACK);

                text.setText("    "+i+". "+split[1]+" "+split[2]+" (หมู่โลหิต: "+split[3]+")"+"\n");
                text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(MedicalActivity.this);
                        builder.setTitle("การบริจาคโลหิต");
                        builder.setMessage("แสดงความคิดเห็นเกี่ยวกับผู้บริจาคโลหิต");
                        final EditText input_detail = new EditText(getBaseContext());
                        input_detail.setInputType(InputType.TYPE_CLASS_TEXT);
                        builder.setView(input_detail);
                        DialogInterface.OnClickListener dialog = new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                switch (which) {
                                    case DialogInterface.BUTTON_POSITIVE:
                                        //ผ่าน ใส่ history
                                        Intent intent = new Intent(getBaseContext(), History.class);
                                        intent.putExtra("history", data);

                                        intent.putExtra("detail", input_detail.getText().toString());
                                        startActivity(intent);
                                        finish();
                                        break;
                                    case DialogInterface.BUTTON_NEGATIVE:
                                        //ไม่ผ่าน ลบ
                                        MySQLConnect mySQLConnect = new MySQLConnect(MedicalActivity.this);
//                                    String[] name = text.getText().toString().split(" ");
                                        mySQLConnect.DeleteQueue(email);
                                        break;
                                }
                            }
                        };
                        builder.setPositiveButton("ผ่าน", dialog);
                        builder.setNegativeButton("ไม่ผ่าน", dialog);
                        AlertDialog dialog1 = builder.create();
                        dialog1.show();

                    }
                });
                sv_Queue.addView(text);
            }
        }

    }
}
