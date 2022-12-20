package com.example.blackoak;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;


public class HomeFragment extends Fragment {
    CardView cardView1,cardView2,cardView3, cardView4,cardView5,cardView6;
    ImageView imgHome ,img01,img02,img03,img04,img05;
    ImageButton sbtn;
    Button btn01, btn02;

    RecyclerView rc;
    public HomeFragment() {
        CardView card1;  // not needed
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        cardView1 = view.findViewById(R.id.cd1);
        cardView2 = view.findViewById(R.id.cd2);
        cardView3 = view.findViewById(R.id.cd3);
        cardView4 = view.findViewById(R.id.cd4);
        cardView5 = view.findViewById(R.id.cd5);
        cardView6 = view.findViewById(R.id.cd6);

        imgHome = view.findViewById(R.id.imgHome);

        sbtn =view.findViewById(R.id.SearchBtn);
        img01 = view.findViewById(R.id.img01);
        img02 = view.findViewById(R.id.img02);
        img03 = view.findViewById(R.id.img03);
        btn01 = view.findViewById(R.id.signupbtn);
        btn02 = view.findViewById(R.id.loginBtn);
        //
       //btn03 = view.findViewById(R.id.loginBtn2022);


        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),H_Card_01_Home.class);
                startActivity(i);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),H_Card_02_Home.class);
                startActivity(i);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),H_Card_03_Home.class);
                startActivity(i);
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),H_Card_04_Home.class);
                startActivity(i);
            }
        });

        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),H_Card_05_Home.class);
                startActivity(i);
            }
        });

        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),H_Card_06_Home.class);
                startActivity(i);
            }
        });

        //for photo
        imgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),ImageActivity01.class);
                startActivity(i);
            }
        });
        sbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),Search_bar.class);
                startActivity(i);
            }
        });

        img01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),MSP_image_01.class);
                startActivity(i);
            }
        });
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),Sign_up_Activity.class);
                startActivity(i);
            }
        });

        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),Log_in_Activity.class);
                startActivity(i);
            }
        });
        img02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),Msp_image_02.class);
                startActivity(i);
            }
        });
        img03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),Msp_image_03.class);
                startActivity(i);
            }
        });

        /*SharedPreferences pref = getActivity().getSharedPreferences("Login", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        SharedPreferences.Editor check = editor.putBoolean("flaf",false);

        getActivity().finishAffinity();*/




        return view;

    }
}