package com.example.assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Q6WebsiteInvokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q6_website_invoke);
    }
    public void gotoActivity6(View v) {
        switch (v.getId()) {
            case R.id.q6_btnvisitsite:
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://google.com")));
                break;

            case R.id.q6_btnmakecall:
                startActivity(new Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:1234567890")));
                break;

            case R.id.q6_btnshowmap:
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://maps.google.co.in/maps?q=")));
                break;

            case R.id.q6_btncontact:
                startActivity(new Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:")));
                break;

            default:
                break;
        }
    }
}