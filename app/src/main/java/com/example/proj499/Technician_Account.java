package com.example.proj499;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Technician_Account extends AppCompatActivity implements MySQLConnect.AsyncResponse{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technician__account);
        MySQLConnect mySQLConnect = new MySQLConnect();
        mySQLConnect.delegate = this;
        mySQLConnect.GetAccount();


    }

    public void AddAccount(View view)
    {
        Intent intent = new Intent(getBaseContext(), Signup.class);
        startActivity(intent);

    }
    public void AddMedical(View view)
    {
        Intent intent = new Intent(getBaseContext(), TechnicianAddMedicalActivity.class);
        startActivity(intent);

    }

    @Override
    public void processFinish(String output) {
        String[] Account = output.split("#");
        LinearLayout sv_Account = (LinearLayout) findViewById(R.id.show_account);
        int i = 0;
        for (String account1 : Account) {
            i++;
            account1 = account1.replace("*", " ");
            final String account_check = account1;
            TextView text = new TextView(this);
            text.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            text.setTextSize(20);
            text.setText(i+". "+account1+"\n");
            text.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getBaseContext(), TechnicianDataAccountActivity.class);
                    intent.putExtra("account", account_check);
                    startActivity(intent);
                    finish();
                }
            });
            sv_Account.addView(text);
        }
    }
}
