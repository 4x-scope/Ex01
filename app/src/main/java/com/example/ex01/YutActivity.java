package com.example.ex01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class YutActivity extends AppCompatActivity {

    // 1. 변수 선언
    int[] imgYut = { R.drawable.yut_0, R.drawable.yut_1 };
    String[] strYut = {"윷","걸","개","도","모"};
    Button button1;
    ImageView img1, img2, img3, img4;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yut);

        // 2. 뷰와 위젯변수 연결 작업 ( 로컬 변수는 final 붙여야함 .. 왜 .. ? ? ? ? )
        button1 = (Button)findViewById(R.id.button1);
        img1 = (ImageView)findViewById(R.id.img1);
        img2 = (ImageView)findViewById(R.id.img2);
        img3 = (ImageView)findViewById(R.id.img3);
        img4 = (ImageView)findViewById(R.id.img4);
        txtResult = (TextView)findViewById(R.id.txtResult);

        // 3. 이벤트 처리
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 4. 랜덤으로 윷의 앞뒤 설정
                Random rand = new Random();
                int n1 = rand.nextInt(2); // 0~1
                int n2 = rand.nextInt(2);
                int n3 = rand.nextInt(2);
                int n4 = rand.nextInt(2);
                int sum = n1 + n2 + n3 + n4;
                // 5. 결과 출력
                img1.setImageResource(imgYut[n1]);
                img2.setImageResource(imgYut[n2]);
                img3.setImageResource(imgYut[n3]);
                img4.setImageResource(imgYut[n4]);
                txtResult.setText(strYut[sum]);
            }
        });

    }
}
