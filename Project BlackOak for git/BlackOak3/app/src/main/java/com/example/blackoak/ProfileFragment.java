package com.example.blackoak;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class ProfileFragment extends Fragment {
    TextView ed1,ed2,ed3,ed4,ed5,ed6;
    TextView ed7,ed8,ed9;
    Button SaveBtn;
public static  final String SHARED_PREFS ="sharedPref";
public static  final String TEXT1 ="text1";
public static  final String TEXT2 ="text1";
public static  final String TEXT3 ="text1";
public static  final String TEXT4 ="text1";
public static  final String TEXT5 ="text1";
public static  final String TEXT6 ="text1";
public static  final String TEXT7 ="text1";
public static  final String TEXT8 ="text1";
public static  final String TEXT9 ="text1";


public String   text1,text2,text3,text4,text5,text6,text7,text8,text9;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        ed1=view.findViewById(R.id.P_FirstName);
        ed2=view.findViewById(R.id.P_LastName);
        ed3=view.findViewById(R.id.P_EmailId);
        ed4=view.findViewById(R.id.P_PhoneNo);
        ed5=view.findViewById(R.id.P_Location);
        ed6=view.findViewById(R.id.Gender);
        ed7=view.findViewById(R.id.Occupation);
        ed8=view.findViewById(R.id.BirthDate);
        ed9=view.findViewById(R.id.Bio);
        SaveBtn=view.findViewById(R.id.SaveBtn);

            SaveBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed1.getText().toString();
                    ed2.getText().toString();
                    ed3.getText().toString();
                    ed4.getText().toString();
                    ed5.getText().toString();
                    ed6.getText().toString();
                    ed7.getText().toString();
                    ed8.getText().toString();
                    ed9.getText().toString();

                    savedata();

                }
            });

        LoadData();
        updateView();
        return view;
    }

    private void savedata() {
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(TEXT1,ed1.getText().toString());
        editor.putString(TEXT2,ed2.getText().toString());
        editor.putString(TEXT3,ed3.getText().toString());
        editor.putString(TEXT4,ed4.getText().toString());
        editor.putString(TEXT5,ed5.getText().toString());
        editor.putString(TEXT6,ed6.getText().toString());
        editor.putString(TEXT7,ed7.getText().toString());
        editor.putString(TEXT8,ed8.getText().toString());
        editor.putString(TEXT9,ed9.getText().toString());

        editor.apply();
        Toast.makeText(getActivity(), "successful", Toast.LENGTH_SHORT).show();
    }
    public void LoadData(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS,Context.MODE_PRIVATE);
        text1 = sharedPreferences.getString(TEXT1,"");
        text2 = sharedPreferences.getString(TEXT2,"");
        text3 = sharedPreferences.getString(TEXT3,"");
        text4 = sharedPreferences.getString(TEXT4,"");
        text5 = sharedPreferences.getString(TEXT5,"");
        text6 = sharedPreferences.getString(TEXT6,"");
        text7 = sharedPreferences.getString(TEXT7,"");
        text8 = sharedPreferences.getString(TEXT8,"");
        text9 = sharedPreferences.getString(TEXT9,"");
    }
    public void updateView(){
        ed1.setText(text1);
        ed2.setText(text2);
        ed3.setText(text3);
        ed4.setText(text4);
        ed5.setText(text5);
        ed6.setText(text6);
        ed7.setText(text7);
        ed8.setText(text8);
        ed9.setText(text9);
    }
}


