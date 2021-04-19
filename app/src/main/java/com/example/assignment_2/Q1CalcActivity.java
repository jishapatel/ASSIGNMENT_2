package com.example.assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Q1CalcActivity extends AppCompatActivity {

    int num1, num2;
    EditText n1, n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1_calc);

        n1 = findViewById(R.id.num1);
        n2 = findViewById(R.id.num2);
    }
    public void gotoActivity1(View v) {
        if ((TextUtils.isEmpty(n1.getText().toString())) || (n1.equals(0))) {
            Toast.makeText(getApplicationContext(), "First number is either null or zero", Toast.LENGTH_SHORT).show();
        } else if ((TextUtils.isEmpty(n2.getText().toString())) || (n2.equals(0))) {
            Toast.makeText(getApplicationContext(), "Second number is either null or zero", Toast.LENGTH_SHORT).show();
        } else {
            num1 = Integer.parseInt(n1.getText().toString());
            num2 = Integer.parseInt(n2.getText().toString());

            switch (v.getId()) {
                case R.id.btnSum:
                    Toast.makeText(getApplicationContext(), "The Addition of two number is: " + (num1 + num2), Toast.LENGTH_SHORT).show();
                    break;

                case R.id.btnSub:
                    Toast.makeText(getApplicationContext(), "The Subtraction of two number is: " + (num1 - num2), Toast.LENGTH_SHORT).show();
                    break;

                case R.id.btnMulti:
                    Toast.makeText(getApplicationContext(), "The Multiplication of two number is: " + (num1 * num2), Toast.LENGTH_SHORT).show();
                    break;

                case R.id.btnDiv:
                    Toast.makeText(getApplicationContext(), "The Division of two number is: " + (num1 / num2), Toast.LENGTH_SHORT).show();
                    break;

                default:
                    break;
            }
        }
    }
}