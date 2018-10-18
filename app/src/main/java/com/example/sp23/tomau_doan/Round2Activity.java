package com.example.sp23.tomau_doan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;

public class Round2Activity extends AppCompatActivity {

    Spinner sp1;
    Spinner sp2;
    ArrayList<HinhChonMau> hcmList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_round2);
        sp1 = (Spinner) findViewById(R.id.spinner1_round2_main1);
        sp2 = (Spinner) findViewById(R.id.spinner2_round2_main1);
        hcmList = new ArrayList<>();
        hcmList.add(new HinhChonMau("Xanh", ""));
        hcmList.add(new HinhChonMau("Xanh", ""));
        hcmList.add(new HinhChonMau("Xanh", ""));
        AdapterSpinnerHinhChonMau adt = new AdapterSpinnerHinhChonMau(Round2Activity.this, R.layout.cus_spinner_color, hcmList);
        sp1.setAdapter(adt);
        sp2.setAdapter(adt);

    }
}
