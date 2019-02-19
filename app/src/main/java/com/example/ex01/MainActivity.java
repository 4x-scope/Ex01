package com.example.ex01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 화면 레이아웃 파일 정의
        // R : 현재 앱의 Resource
        setContentView(R.layout.activity_main);
    }

// 버튼을 클릭할 때 호출
   public  void mOnClick(View view){
       Intent intent = null;
       switch (view.getId()){
           case R.id.button1:
               intent = new Intent(this, ImageViewDemo.class);
               break;
           case R.id.button2:
               intent = new Intent(this, Exchange.class);
               break;
           case R.id.button3:
               intent = new Intent(this, BmiActivity.class);
               break;
           case R.id.button4:
               intent = new Intent(this, CheckboxDemo.class);
               break;
           case R.id.button5:
               intent = new Intent(this, RadioDemo.class);
               break;
           case R.id.button6:
               intent = new Intent(this, YutActivity.class);
               break;

       }
       startActivity(intent);
   }
}
