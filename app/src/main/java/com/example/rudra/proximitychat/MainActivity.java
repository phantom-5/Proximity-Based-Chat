package com.example.rudra.proximitychat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int splash_done=CheckCondition.get_Splash();
        if(splash_done==0){
            Intent i= new Intent(MainActivity.this,SpalshActivity.class);
            startActivity(i);
        }else{}
    }
}
