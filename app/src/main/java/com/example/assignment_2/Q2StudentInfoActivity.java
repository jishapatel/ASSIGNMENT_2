package com.example.assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Q2StudentInfoActivity extends AppCompatActivity {

    EditText sid, sname, sbranch, sphno, sdob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2_student_info);

        sid = findViewById(R.id.q2_id);
        sname = findViewById(R.id.q2_name);
        sbranch = findViewById(R.id.q2_branch);
        sphno = findViewById(R.id.q2_phno);
        sdob = findViewById(R.id.q2_dob);
    }
    public void gotoActivity2(View v) {
        Intent i = new Intent(getApplicationContext(), Q2SecondActivity.class);
        i.putExtra("id", sid.getText().toString());
        i.putExtra("name", sname.getText().toString());
        i.putExtra("branch", sbranch.getText().toString());
        i.putExtra("phno", sphno.getText().toString());
        i.putExtra("dob", sdob.getText().toString());
        startActivity(i);
    }
}