package com.wcareteam.wcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView splash_animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }


        new Handler().postDelayed(() -> {
            //This method will be executed once the timer is over
            // Start your app main activity
            Intent i = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(i);
            // close this activity
            finish();
        }, 1600);
    }
}