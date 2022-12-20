package com.example.blackoak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;



public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //CODE FOR REMOVE TOP ACTION BAR
        getSupportActionBar().hide();
       // this .getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLscreen);
        //
        View decorView = getWindow().getDecorView();
// Hide both the navigation bar and the status bar.
// SYSTEM_UI_FLAG_FULLSCREEN is only available on Android 4.1 and higher, but as
// a general rule, you should design your app to hide the status bar whenever you
// hide the navigation bar.
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                       | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);


        //
        setContentView(R.layout.activity_splash_screen);

        // Hold SplashScreen for few Sec and then move Another Activity (using Intent).
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               /* SharedPreferences pref =  getSharedPreferences("login",MODE_PRIVATE);
               Boolean check = pref.getBoolean("flag",false);
               if(check){//for true user Log In user don't have any account
                   Intent iHome = new Intent(SplashScreen.this,Log_in_Activity.class);
                   startActivity(iHome);
               }else{// if value is false it means user have already account
                   Intent iHome = new Intent(SplashScreen.this,MainActivity.class);
                   startActivity(iHome);
               }
*/
                Intent iHome = new Intent(SplashScreen.this,Sign_up_Activity.class);
                startActivity(iHome);

            }
        },2000);


    }
}