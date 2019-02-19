package com.example.ex01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class BmiResultActivity extends AppCompatActivity {

    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi_result);

        txtResult = (TextView)findViewById(R.id.txtResult);
// 앞 화면에서 넘어온 값을 읽어오기 위해 intent 객체를 받아옴
        Intent intent = getIntent();
        BmiDTO dto = (BmiDTO)intent.getSerializableExtra("dto");
        String result = dto.getResult();
        String name = dto.getName();
        int age = dto.getAge();
        double height = dto.getHeight();
        double weight = dto.getWeight();
//        String result = intent.getStringExtra("result");
//        String name = intent.getStringExtra("name");
//        int age = intent.getIntExtra("age", 0);
//        double height = intent.getDoubleExtra("height", 0);
//        double weight = intent.getDoubleExtra("weight", 0);
        txtResult.setText("이름:"+name+"\n"
                +"나이:"+age+"\n"
                +"신장:"+height+"\n"
                +"체중:"+weight+"\n"
                +"결과:"+result);
    }
}
