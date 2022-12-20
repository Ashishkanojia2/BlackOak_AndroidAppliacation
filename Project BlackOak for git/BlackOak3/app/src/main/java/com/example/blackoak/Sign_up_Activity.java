package com.example.blackoak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Sign_up_Activity extends AppCompatActivity {

    Button finishBtn , btn2;
    EditText ed1,ed2,ed3,ed4,ed5,ed6;
    CheckBox checkBox;
    String name,lastN,email,pass,mob,add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        finishBtn = findViewById(R.id.finish);
        ed1 = findViewById(R.id.firstname);
        ed2 = findViewById(R.id.LastName);
        ed3 = findViewById(R.id.email);
        ed4 = findViewById(R.id.password);
        ed5 = findViewById(R.id.mobile);
        ed6 = findViewById(R.id.Address);
        finishBtn =findViewById(R.id.finish01);
        btn2 = findViewById(R.id.loginBtn);

        dbHelper g = new dbHelper(this);
        SQLiteDatabase db = g.getWritableDatabase();


        finishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String   name1 = ed1.getText().toString();
              String   lastN1 = ed2.getText().toString();
              String    email1 = ed3.getText().toString();
              String    pass1 = ed4.getText().toString();
              String    mob1 = ed5.getText().toString();
              String    add1 = ed6.getText().toString();
              if(name1.isEmpty()||lastN1.isEmpty()||email1.isEmpty()||pass1.isEmpty()||mob1.isEmpty()||add1.isEmpty()){
                  Toast.makeText(Sign_up_Activity.this, "Something is wrong. Please check it and Try Again", Toast.LENGTH_SHORT).show();
              }else{
                 Boolean i = g.insert(name1,lastN1,email1,pass1,mob1,add1);
                 if(i==true){
                     Toast.makeText(Sign_up_Activity.this, "Successful", Toast.LENGTH_SHORT).show();
                     Intent intent = new Intent(Sign_up_Activity.this,Log_in_Activity.class);
                     startActivity(intent);
                 }else{
                     Toast.makeText(Sign_up_Activity.this, "Error", Toast.LENGTH_SHORT).show();
                 }
              }

            }

        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sign_up_Activity.this,Log_in_Activity.class);
                startActivity(intent);
            }
        });


    }
}