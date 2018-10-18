package com.example.sp23.tomau_doan;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Round1Activity extends AppCompatActivity {
 ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_round1);
        img= findViewById(R.id.imgRound1Main1);
    }

    public void chuyen(View view) {

        img.setBackgroundColor(Color.rgb(255, 255, 255));
    }
}
