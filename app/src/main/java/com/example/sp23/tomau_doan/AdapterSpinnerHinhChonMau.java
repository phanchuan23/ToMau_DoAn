package com.example.sp23.tomau_doan;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterSpinnerHinhChonMau extends BaseAdapter {
    Context context;
    int mylayout;
    ArrayList<HinhChonMau> hinhChonMauList;

    public AdapterSpinnerHinhChonMau(Context context, int mylayout, ArrayList<HinhChonMau> hinhChonMauList) {
        this.context = context;
        this.mylayout = mylayout;
        this.hinhChonMauList = hinhChonMauList;
    }

    @Override
    public int getCount() {
        return hinhChonMauList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(mylayout, null);
//        TextView txt = (TextView) view.findViewById(R.id.txtNameCusSpinner);
        TextView img = (TextView) view.findViewById(R.id.txtImgCusSpinner);
        if(i==0){
//            txt.setText(hinhChonMauList.get(i).getTen());
            img.setText(hinhChonMauList.get(i).getHinh());
            img.setBackgroundColor(Color.rgb(255, 255, 255));
        }
        if(i==1){
//            txt.setText(hinhChonMauList.get(i).getTen());
            img.setText(hinhChonMauList.get(i).getHinh());
            img.setBackgroundColor(Color.rgb(255, 000, 255));
        }
        if(i==2){
//            txt.setText(hinhChonMauList.get(i).getTen());
            img.setText(hinhChonMauList.get(i).getHinh());
            img.setBackgroundColor(Color.rgb(000, 255, 255));
        }
        return view;
    }
}
