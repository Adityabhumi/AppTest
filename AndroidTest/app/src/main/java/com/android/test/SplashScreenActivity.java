package com.android.test;

import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import java.util.Timer;
import java.util.TimerTask;

/*
Splash Screen Activity, Screen will be visible for 3 seconds on app launch
 */
public class SplashScreenActivity extends AppCompatActivity {

    // Set Duration of the Splash Screen
    long delay = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Remove the Title Bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_splash_screen);

        // Create a Timer
        Timer RunSplash = new Timer();

        // Task to do when the timer ends
        TimerTask ShowSplash = new TimerTask() {
            @Override
            public void run() {
                // Close SplashScreenActivity.class
                finish();

                // Start LoginActivity.class
                Intent myIntent = new Intent(SplashScreenActivity.this,
                        LoginActivity.class);
                ActivityCompat.finishAffinity(SplashScreenActivity.this);
                startActivity(myIntent);
            }
        };

        // Start the timer
        RunSplash.schedule(ShowSplash, delay);
    }
}
