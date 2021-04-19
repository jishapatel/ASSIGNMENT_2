package com.example.assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoMainActivity(View v) {
        switch (v.getId()) {
            case R.id.btnSC:
                startActivity(new Intent(getApplicationContext(), SplashScreenActivity.class));
                break;

            case R.id.btnQ1:
                startActivity(new Intent(getApplicationContext(), Q1CalcActivity.class));
                break;

            case R.id.btnQ2:
                startActivity(new Intent(getApplicationContext(), Q2StudentInfoActivity.class));
                break;

            case R.id.btnQ3:
                startActivity(new Intent(getApplicationContext(), Q3SplashScreenActivity.class));
                break;

            case R.id.btnQ4:
                startActivity(new Intent(getApplicationContext(), Q4LifecycleActivity.class));
                break;

            case R.id.btnQ5:
                startActivity(new Intent(getApplicationContext(), Q5StringConvertActivity.class));
                break;

            case R.id.btnQ6:
                startActivity(new Intent(getApplicationContext(), Q6WebsiteInvokeActivity.class));
                break;

            case R.id.btnQ7:
                startActivity(new Intent(getApplicationContext(), Q7CalculatorActivity.class));
                break;

            default:
                break;
        }
    }
}