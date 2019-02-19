package com.example.ex01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BmiActivity extends AppCompatActivity {
    EditText editName, editAge, editHeight, editWeight;
    Button button1;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi);

        editName = (EditText)findViewById(R.id.editName);
        editAge = (EditText)findViewById(R.id.editAge);
        editHeight = (EditText)findViewById(R.id.editHeight);
        editWeight = (EditText)findViewById(R.id.editWeight);
        button1 = (Button)findViewById(R.id.button1);
        txtResult = (TextView)findViewById(R.id.txtResult);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double hg = Double.parseDouble(editHeight.getText().toString()) / 100;
                double kg = Double.parseDouble(editWeight.getText().toString());
                double bmi = kg / (hg*hg);
                String result = "";
                if(bmi < 18.5){
                    result = "저체중";
                }else if(bmi >= 18.5 && bmi < 23){
                    result = "정상";
                }else if(bmi >= 23 && bmi < 25){
                    result = "과체중";
                }else if(bmi >= 25 && bmi < 30){
                    result = "비만";
                }else if(bmi >= 30){
                    result = "고도비만";
                }
                result = editName.getText().toString() + "님의 체중은 "+ result + "입니다.";
                //txtResult.setText(result);
// new Intent(현재화면.this, 다음화면.class)
// intent.putExtra("변수명", 값)
                Intent intent
                = new Intent(BmiActivity.this, BmiResultActivity.class);
                BmiDTO dto = new BmiDTO();
                dto.setName(editName.getText().toString());
                dto.setAge(Integer.parseInt(editAge.getText().toString()));
                dto.setHeight(Double.parseDouble(editHeight.getText().toString()));
                dto.setWeight(Double.parseDouble(editWeight.getText().toString()));
                dto.setResult(result);
                intent.putExtra("dto", dto);

//                intent.putExtra("name", editName.getText().toString());
//                intent.putExtra("age",
//                        Integer.parseInt(editAge.getText().toString()));
//                intent.putExtra("height",
//                        Double.parseDouble(editHeight.getText().toString()));
//                intent.putExtra("weight",
//                        Double.parseDouble(editWeight.getText().toString()));
//                intent.putExtra("result", result);
                startActivity(intent); // 다음 화면으로 넘어감
            }
        });
    }
}
