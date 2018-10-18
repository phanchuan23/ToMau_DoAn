package com.example.sp23.tomau_doan;

import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

public class custom_dialog_language extends DialogFragment {

    public interface callbackInterface{
        void callback(String value);
    }

    public callbackInterface icallbackInterface;
    private Spinner spinner;
    private Button btnChon;
    private String value;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_languages,container,false);
        spinner = view.findViewById(R.id.spinnerNgonNgu);
        final ArrayList<String> langs = new ArrayList<>();
        langs.add("Tiếng Việt");
        langs.add("Tiếng Anh");
        custom_spinner custom_spinner = new custom_spinner(getActivity(),R.layout.dialog_languages,langs);
        spinner.setAdapter(custom_spinner);
        Toast.makeText(getActivity(), getArguments().getString("data"), Toast.LENGTH_SHORT).show();
        if(getArguments().getString("data")=="Tiếng Việt")
        {
            spinner.setSelection(0);
        }
        else
        {
            spinner.setSelection(1);
        }
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                value = langs.get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        btnChon = view.findViewById(R.id.btnNgonNgu);
        btnChon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                icallbackInterface.callback(value);
                getDialog().dismiss();
            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try
        {
            icallbackInterface = (callbackInterface) getActivity();
        }
        catch (ClassCastException e)
        {
            Log.e(TAG, "onAttach: "+e.getMessage() );
        }
    }
}
