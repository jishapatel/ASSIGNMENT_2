package com.example.assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Q3WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3_welcome);

        TextView t=findViewById(R.id.q3_tw1);
        Intent i =getIntent();
        t.setText("Welcome "+ i.getStringExtra("uname"));
    }
}