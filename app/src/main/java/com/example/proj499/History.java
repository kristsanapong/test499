package com.example.proj499;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class History extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Intent in;
            switch (item.getItemId()) {
                case R.id.navigation_Blood:
                    in = new Intent(getBaseContext(),blooddonation.class);
                    startActivity(in);
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.navigation_History:
                    in = new Intent(getBaseContext(),History.class);
                    startActivity(in);
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.navigation_Maps:
                    in = new Intent(getBaseContext(),Map.class);
                    startActivity(in);
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.navigation_News:
                    in = new Intent(getBaseContext(),News.class);
                    startActivity(in);
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.navigation_Profile:
                    in = new Intent(getBaseContext(),Profile.class);
                    startActivity(in);
                    overridePendingTransition(0, 0);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
