package com.example.blackoak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginUserAdmin extends AppCompatActivity {
   /* Button Btn;*/
    EditText ed1,ed2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user_admin);

        /*Btn.findViewById(R.id.loginBtn);
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (LoginUserAdmin.this,MainActivity.class);
                startActivity(i);
            }
        });*/


    }
}