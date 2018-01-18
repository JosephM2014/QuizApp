package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    CharSequence text = "";
    String rdButtonValue="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        CheckBox checkBoxGreen, checkBoxBlue, checkBoxRed;
        Button butNext;

        checkBoxGreen = (CheckBox) findViewById(R.id.checkBoxGreen);
        checkBoxBlue = (CheckBox) findViewById(R.id.checkBoxBlue);
        checkBoxRed = (CheckBox) findViewById(R.id.checkBoxRed);
        butNext = (Button) findViewById(R.id.button1);


        //Get value of rdBtnValueSelected from MainActivity
        Bundle bundle = getIntent().getExtras();
        CharSequence rdBtnValueSelected2= bundle.getString("rdBtnValueSelected");
        rdButtonValue=bundle.getString("rdBtnValueSelected");

//        Display rdBtnValueSelected value
        TextView txtRButtonValue = (TextView)findViewById(R.id.textView12);
        txtRButtonValue.setText(rdBtnValueSelected2);



        //        Implementation for butNext
        butNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                RadioGroup grp = (RadioGroup) findViewById(R.id.radioGroup1);
//                RadioButton answer = (RadioButton) findViewById(grp.getCheckedRadioButtonId());


//                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
//                Bundle b = new Bundle();
//                b.putString("rdBtnValueSelected", text.toString());//Your button value
//                intent.putExtras(b); //Put your score to your next Intent
//                startActivity(intent);
//                finish();
                Toast toast;
                toast = Toast.makeText(getApplicationContext(), "Marital status: "+rdButtonValue+
                        " favorite color: " + text,
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }




    public void onCheckBoxClicked(View view) {
        // Is the CheckBox now checked?
        boolean checked = ((CheckBox) view).isChecked();


        int duration = Toast.LENGTH_SHORT;
        Toast toast = null;

        // Check which CheckBox was clicked
        switch (view.getId()) {
            case R.id.checkBoxGreen:

                if (checked) {
                    text = "Green!";
                    toast = Toast.makeText(getApplicationContext(), text, duration);
                    toast.show();
//                Log.d("your ans", currentQ.getANSWER()+" "+answer.getText());
                }
                break;
            case R.id.checkBoxBlue:
                if (checked) {
                    text = "Blue!";
                    toast = Toast.makeText(getApplicationContext(), text, duration);
                    toast.show();
                }
                break;

            case R.id.checkBoxRed:
                if (checked) {
                    text = "Red!";
                    toast = Toast.makeText(getApplicationContext(), text, duration);
                    toast.show();
                }
                break;
        }
    }
}
