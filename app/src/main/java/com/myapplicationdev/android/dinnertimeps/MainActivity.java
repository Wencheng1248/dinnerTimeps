package com.myapplicationdev.android.dinnertimeps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btnSubmit;
TimePicker tp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = findViewById(R.id.button);
        tp = findViewById(R.id.timePicker);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tp.getCurrentHour() >= 6 && tp.getCurrentHour() <= 7){
                    Toast.makeText(MainActivity.this,"Great you have a Ideal eating habit!",Toast.LENGTH_LONG).show();

                }else{
                    Toast.makeText(MainActivity.this,"Not so ideal to eat at this hour",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
