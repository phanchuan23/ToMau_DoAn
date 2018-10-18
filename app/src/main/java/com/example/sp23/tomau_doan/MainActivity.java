package com.example.sp23.tomau_doan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickRound1(View view) {
        Intent intent = new Intent(MainActivity.this, Round1Activity.class);
        startActivity(intent);
    }

    public void clickRound2(View view) {
        Intent intent = new Intent(MainActivity.this, Round3Activity.class);
        startActivity(intent);
    }

    public void clickRound3(View view) {
        Intent intent = new Intent(MainActivity.this, Round2Activity.class);
        startActivity(intent);
    }
}
