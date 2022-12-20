package com.example.blackoak;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    Button btn;

    BottomNavigationView btnView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnView = findViewById(R.id.bnView);

        btnView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.nav_Home) {
                    loadFrag(new HomeFragment(), false);
                } else if (id == R.id.nav_Notify) {
                    loadFrag(new notifyFragment(), false);
                } else if (id == R.id.nav_cat) {
                    loadFrag(new CategoryFragment(), false);
                } else if (id == R.id.nav_profile) {
                    loadFrag(new Cart_Product(), false);
                } else {
                    //cart
                    loadFrag(new ProfileFragment(), false);                                   // check it
                }

                return true;
            }
        });
        btnView.setSelectedItemId(R.id.nav_Home);
    }

    // to create a method for fragments for don't repeat same lines
    public void loadFrag(Fragment fragment, boolean flag) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if (flag)
            ft.add(R.id.container, fragment);
        else
            ft.replace(R.id.container, fragment);
        ft.commit();

        //***********************************************************

    }


    @Override
    public void onBackPressed() {
     /*   int backpress1 =0;
       int  backpress = (backpress1 - 1);
        Toast.makeText(getApplicationContext(), " Press Back again to Exit ", Toast.LENGTH_SHORT).show();

        if (backpress<1) {
            this.finish();
        }*/
//        int backPress =0 ;
//        if(backPress==0){
//            this.finish();
//            Intent i = new Intent(finish());
//        }

     /*   Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);
        finishAffinity();*/

        super.onBackPressed();
    }
}