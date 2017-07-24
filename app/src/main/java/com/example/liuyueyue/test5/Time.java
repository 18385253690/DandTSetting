package com.example.liuyueyue.test5;

import android.app.Activity;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;

/**
 * Created by liuyueyue on 2017/7/23.
 */

public class Time extends Activity{
    private TimePicker timePicker;
    private int hour;
    private int minute;
    private Calendar cal;

    private Button btn4;
    private Button btn5;
    @RequiresApi(api = Build.VERSION_CODES.N)
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time);

        btn4= (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Time.this,Date.class);
                Time.this.startActivity(intent);
            }
        });

        btn5= (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Time.this,MainActivity.class);
                Time.this.startActivity(intent);
            }
        });


    }

}
