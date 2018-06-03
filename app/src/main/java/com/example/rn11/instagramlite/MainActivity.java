package com.example.rn11.instagramlite;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.nav_timeline:

                    // Navigation for Timeline
                    Intent intentTimeline = new Intent(MainActivity.this, TimelineActivity.class);
                    startActivity(intentTimeline);
                    return true;

                case R.id.nav_settings:
                    // Navigation for settings
                    Intent intentSettings = new Intent(MainActivity.this, SettingsActivity.class);
                    startActivity(intentSettings);
                    return true;

                case R.id.nav_notifications:
                    // Navigation for notifications
                    // TODO: Insert logic to start notifications activity
                    return true;

                case R.id.nav_camera:
                    // Navigation for camera
                   // TODO: Insert logic to start camera activity

                case R.id.nav_profile:
                    // Navigation for profile
                    // TODO: Insert logic to start profile activity
            }

            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
