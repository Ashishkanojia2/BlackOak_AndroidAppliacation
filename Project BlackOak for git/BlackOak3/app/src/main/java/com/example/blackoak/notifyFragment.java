package com.example.blackoak;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class notifyFragment extends Fragment {
    CardView card01,card02,card03,card04;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notify, container, false);

         card01 = view.findViewById(R.id.card01);
         card02 = view.findViewById(R.id.card02);
         card03 = view.findViewById(R.id.card03);
         card04 = view.findViewById(R.id.card04);


         card01.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent i = new Intent(getActivity(),SaleActivity.class);
                 startActivity(i);
             }
         });
        card02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),activity_sale02.class);
                startActivity(i);
            }
        });
        card03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),activity_sale_03.class);
                startActivity(i);
            }
        });
        card04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),activity_sale_04.class);
                startActivity(i);
            }
        });


        return view;
    }
}