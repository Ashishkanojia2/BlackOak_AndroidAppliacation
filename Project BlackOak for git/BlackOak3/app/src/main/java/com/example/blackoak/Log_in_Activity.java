package com.example.blackoak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Log_in_Activity extends AppCompatActivity {
    Button btn1,btn2;
    EditText email02 ,password02;
    dbHelper obj= new dbHelper(this);
    String a,b,c1,d1,e,f;
    String emailPatten = "[a-zA-z0-9._-]+@+.+[a-z]";
    String temp1, temp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        btn1 = findViewById(R.id.signUpBtn);
        btn2 = findViewById(R.id.finish);
        email02 = findViewById(R.id.email02);
        password02 = findViewById(R.id.password02);
        // object of Calling class
        Calling c = new Calling();

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String a1 = email02.getText().toString();
                String b1 = password02.getText().toString();

                Cursor result = obj.SqlData(email02.getText().toString(), password02.getText().toString());
                while (result.moveToNext()) {
                    String a = result.getString(1);//name
                    String b = result.getString(2);//lastname
                    String c1 = result.getString(3);//Email
                    String d1 = result.getString(4);//password
                    String e = result.getString(5);//mobile
                    String f = result.getString(6);//address
                   //temp1 and temp2 is globally declared
                    temp1 = c1;
                    temp2 =d1;

                }
                if(!a1.equals("") && !b1.equals("")){
                    if(a1.matches(emailPatten)&& a1.length()>0){
                        if(a1.equals(temp1) && b1.equals(temp2)){
                            Intent intent = new Intent(Log_in_Activity.this, MainActivity.class);
                            startActivity(intent);
                        }else{
                            Toast.makeText(Log_in_Activity.this, "You Entered wrong Id and Password.", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(Log_in_Activity.this, "Email is not Valid.", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(Log_in_Activity.this, "Enter Email Id and Password.", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }


    class Calling{
        //calling is constructor
        public Calling(){
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Log_in_Activity.this,Sign_up_Activity.class);
                    startActivity(intent);
                }
            });
        }

    }

}