package com.example.assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Q3LoginActivity extends AppCompatActivity {

    EditText uname, pass;
    String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3_login);

        uname = findViewById(R.id.q3_username);
        pass = findViewById(R.id.q3_password);
    }

    public void gotoActivity3(View v) {
        if (TextUtils.isEmpty(uname.getText().toString())) {
            Toast.makeText(getApplicationContext(), "Username is empty.", Toast.LENGTH_SHORT).show();
        } else if (TextUtils.isEmpty(pass.getText().toString())) {
            Toast.makeText(getApplicationContext(), "Password is empty.", Toast.LENGTH_SHORT).show();
        } else {
            username = uname.getText().toString();
            password = pass.getText().toString();
            Log.d("uname", username);
            Log.d("pass", password);

            if ((username.equals("test")) && (password.equals("testuser"))) {
                Intent i = new Intent(getApplicationContext(), Q3WelcomeActivity.class);
                i.putExtra("uname", username);
                startActivity(i);
            } else {
                Toast.makeText(getApplicationContext(), "Invalid Username or Password.", Toast.LENGTH_SHORT).show();
            }
        }
    }
}