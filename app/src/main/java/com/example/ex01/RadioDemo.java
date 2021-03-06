package com.example.ex01;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RadioDemo extends AppCompatActivity
        implements RadioGroup.OnCheckedChangeListener{

    // 1. 위젯변수 선언
    RadioGroup radio1;
    RadioButton rdoRed, rdoGreen, rdoBlue;
    View layout1;

    // Alt+Insert
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.rdoRed:
                layout1.setBackgroundColor(Color.RED);
                break;
            case R.id.rdoGreen:
                layout1.setBackgroundColor(Color.GREEN);
                break;
            case R.id.rdoBlue:
                layout1.setBackgroundColor(Color.BLUE);
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radio_demo);

        // 2. 레이아웃 xml 파일에 선언한 뷰와 위젯변수를 연결시키는 작업
        radio1 = (RadioGroup)findViewById(R.id.radio1);
        rdoRed = (RadioButton)findViewById(R.id.rdoRed);
        rdoGreen = (RadioButton)findViewById(R.id.rdoGreen);
        rdoBlue = (RadioButton)findViewById(R.id.rdoBlue);
        layout1 = findViewById(R.id.layout1);

        // 3. 이벤트 처리
        radio1.setOnCheckedChangeListener(this);

    }
}
