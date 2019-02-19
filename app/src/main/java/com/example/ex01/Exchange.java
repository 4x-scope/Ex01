package com.example.ex01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Exchange extends AppCompatActivity {
    // 1. 위젯 전역변수 선언
    EditText dollar;
    Button button;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // R : 리소스 저장 클래스
        setContentView(R.layout.exchange);

        // 2. xml에 선언한 위젯과 연결시키는  코드
        dollar = (EditText)findViewById(R.id.dollar);
        button = (Button)findViewById(R.id.button);
        txtResult = (TextView)findViewById(R.id.txtResult);

        // 3. 이벤트 처리
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dollar.getText().toString().equals("")) {
                    Toast.makeText(
                            Exchange.this, "숫자를 입력하세요.",
                            Toast.LENGTH_LONG).show();
                    return;
                }

                // EditText에 입력된 내용을 읽어옴
                int intDollar = Integer.parseInt(dollar.getText().toString());
                int money = intDollar * 1100;
                // 텍스트뷰의 내용 수정
                txtResult.setText((intDollar+"달러="+money+"원 입니다."));
            }
        });
    }


}
