package com.example.blackoak;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class dbHelper extends SQLiteOpenHelper {
    // this is for create a database
    private  static  final String DBname ="Table01";
    public dbHelper(@Nullable Context context) {
        super(context, DBname,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    String tb ="Create table Table01 (id integer Primary Key autoincrement  , name text , lastName text, Email text , Password text , mobile interger, Address text)";
        db.execSQL(tb);
       // String tb2 ="Create table Table02 ( FirstName text , lastName text, Emailid text , PhoneNo integer, Location text, Gender text, Occupation text, DOB integer, Bio text)";
      //   db.execSQL(tb2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL("drop table if exists blackoak");
    }

    // create a new method for insert data

    public  boolean insert(String name, String lastname ,String email , String password, String mobile , String address){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name" , name );
        contentValues.put("lastname",lastname);
        contentValues.put("email",email);
        contentValues.put("password",password);
        contentValues.put("mobile",mobile);
        contentValues.put("address",address);
        long r = db.insert("Table01",null,contentValues);
        if(r== -1){
            return false;
        }else
            return true;
    }
//INSERT USER DATA IN DATABASE
  /*  public  boolean insert(String FirstName , String LastName , String EmailId , String PhoneNo , String Location ,String Gender , String Occupation , String DOb , String bio){
        SQLiteDatabase db2 = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("User_F_Name" , FirstName );
        contentValues.put("User_L_Name",LastName);
        contentValues.put("User_EmailId",EmailId);
        contentValues.put("User_PhoneNO",PhoneNo);
        contentValues.put("User_Location",Location);
        contentValues.put("User_Gender",Gender);
        contentValues.put("User_Occupation",Occupation);
        contentValues.put("User_DOB",DOb);
        contentValues.put("User_Bio",bio);
        long r = db2.insert("Table02",null,contentValues);
        if(r== -1){
            return false;
        }else
            return true;

    }*/

    // first we create a cursor which is used to show contain row
    public  Cursor SqlData(String email , String password){
        SQLiteDatabase db=this.getReadableDatabase();
        String query = "Select * from "+DBname+" where email= '"+email+"' and '"+password+"'";
        Cursor crs= db.rawQuery(query,null);
        return crs;
    }

}
