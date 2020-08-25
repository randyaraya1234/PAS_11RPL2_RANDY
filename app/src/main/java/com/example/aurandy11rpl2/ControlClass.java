package com.example.aurandy11rpl2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ControlClass extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        sharedPreferences=getSharedPreferences("login", Context.MODE_PRIVATE);

        if (sharedPreferences.getString("nama","").isEmpty()){
            startActivity(new Intent(ControlClass.this,MainActivity.class));
            finish();
        }else{
            startActivity(new Intent(ControlClass.this,MenuActivity.class));
            finish();
        }
    }
}

