package com.example.sp23.tomau_doan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        getSupportActionBar().hide();
    }

    public void qua(View view) {
        Intent intent = new Intent(HelloActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
