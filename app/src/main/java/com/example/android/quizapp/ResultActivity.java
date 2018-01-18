package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        //Get value of rdBtnValueSelected from MainActivity
        Bundle bundle = getIntent().getExtras();
        CharSequence rdBtnValueSelected2= bundle.getString("rdBtnValueSelected");

//        Display rdBtnValueSelected value
        TextView txtRButtonValue = (TextView)findViewById(R.id.textResult);
        txtRButtonValue.setText(rdBtnValueSelected2);

    }



}
