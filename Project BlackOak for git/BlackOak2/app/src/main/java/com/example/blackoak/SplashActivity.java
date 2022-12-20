package com.example.blackoak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        // Hold SplashScreen for few Sec and then move Another Activity (using Intent).
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent iHome = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(iHome);
            }
        },4000);



        //CODE FOR REMOVE TOP ACTION BAR
        getSupportActionBar().hide();



    }
}