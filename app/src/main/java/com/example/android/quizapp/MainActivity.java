package com.example.android.quizapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CharSequence text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton rdMarried, rdSingle, rdDivorced;
        Button butNext;

        rdMarried = (RadioButton) findViewById(R.id.radioMarried);
        rdSingle = (RadioButton) findViewById(R.id.radioSingle);
        rdDivorced = (RadioButton) findViewById(R.id.radioDivorced);
        butNext = (Button) findViewById(R.id.button1);

//        Implementation for butNext
        butNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup grp = (RadioGroup) findViewById(R.id.radioGroup1);
                RadioButton answer = (RadioButton) findViewById(grp.getCheckedRadioButtonId());


                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                Bundle b = new Bundle();
                b.putString("rdBtnValueSelected", text.toString());//Your button value
                intent.putExtras(b); //Put your score to your next Intent
                startActivity(intent);
                finish();
            }
        });
    }


    public void onRadioButtonClicked2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();


        int duration = Toast.LENGTH_SHORT;
        Toast toast = null;

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radioMarried:

                if (checked) {
                    text = "Married!";
                    toast = Toast.makeText(getApplicationContext(), text, duration);
                    toast.show();
//                Log.d("your ans", currentQ.getANSWER()+" "+answer.getText());
                }
                break;
            case R.id.radioSingle:
                if (checked) {
                    text = "Single!";
                    toast = Toast.makeText(getApplicationContext(), text, duration);
                    toast.show();
                }
                break;

            case R.id.radioDivorced:
                if (checked) {
                    text = "Divorced!";
                    toast = Toast.makeText(getApplicationContext(), text, duration);
                    toast.show();
                }
                break;
        }
    }


}
