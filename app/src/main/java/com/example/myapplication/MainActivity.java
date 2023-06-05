package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.os.Bundle;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startNewActivity(View v){
        Intent intent = new Intent(this, info.class);
        startActivity(intent);
    }

    public void openSiz(View v){
        Intent intent = new Intent(this, siz.class);
        startActivity(intent);
    }

    public void openTools(View v){
        Intent intent = new Intent(this, tools.class);
        startActivity(intent);
    }

    public void openpoisk(View v){
        Intent intent = new Intent(this, pOISk.class);
        startActivity(intent);
    }

    public void opensort(View v){
        Intent intent = new Intent(this, SORTIROVKA.class);
        startActivity(intent);
    }
    public void openfiltr(View v){
        Intent intent = new Intent(this, filtr.class);
        startActivity(intent);
    }

    public void kontrkat(View v){
        Intent intent = new Intent(this, kontrkat.class);
        startActivity(intent);
    }

    public void sbor(View v){
        Intent intent = new Intent(this, sbor.class);
        startActivity(intent);
    }
}