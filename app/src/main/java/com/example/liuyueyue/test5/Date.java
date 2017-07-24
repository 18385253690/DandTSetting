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
 * Created by liuyueyue on 2017/7/21.
 */

public class Date extends Activity {
    private DatePicker datePicker;
    private int year;
    private int month;
    private int day;
    private Button btn2;
    private Button btn3;
    private Calendar cal;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.date);
        btn2= (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Date.this,Time.class);
                Date.this.startActivity(intent);
            }
        });

        btn3= (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Date.this,MainActivity.class);
                Date.this.startActivity(intent);
            }
        });

    }
}
