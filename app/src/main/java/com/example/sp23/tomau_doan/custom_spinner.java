package com.example.sp23.tomau_doan;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class custom_spinner extends BaseAdapter {

    Context context;
    int myLayout;
    ArrayList<String> arrayList;

    public custom_spinner(Context context, int myLayout, ArrayList<String> arrayList) {
        this.context = context;
        this.myLayout = myLayout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView ==null)
        {
            convertView = LayoutInflater.from(context).inflate(R.layout.spinner_layout,parent,false);
            viewHolder = new ViewHolder((ImageView) convertView.findViewById(R.id.imgHinh),(TextView) convertView.findViewById(R.id.tvTieng));
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        if(arrayList.get(position) =="Tiếng Việt")
        {
            viewHolder.getImageView().setImageResource(android.R.drawable.ic_dialog_email);
            viewHolder.getTextView().setText(arrayList.get(position));
        }
        else
        {
            viewHolder.getImageView().setImageResource(android.R.drawable.ic_dialog_info);
            viewHolder.getTextView().setText(arrayList.get(position));
        }

        return convertView;
    }
}
class ViewHolder{
    private ImageView imageView;

    public ViewHolder(ImageView imageView, TextView textView) {
        this.imageView = imageView;
        this.textView = textView;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public TextView getTextView() {
        return textView;
    }

    public void setTextView(TextView textView) {
        this.textView = textView;
    }

    private TextView textView;
}
