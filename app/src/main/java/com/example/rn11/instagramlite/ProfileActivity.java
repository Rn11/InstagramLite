package com.example.rn11.instagramlite;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
/**
 * Created by Rn11 on 03.06.2018.
 */

public class ProfileActivity extends AppCompatActivity{

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.nav_timeline:

                    // Navigation for TimelinexD
                    Intent intentTimeline = new Intent(ProfileActivity.this, TimelineActivity.class);
                    startActivity(intentTimeline);
                    return true;

                case R.id.nav_settings:
                    // Navigation for settings
                    Intent intentSettings = new Intent(ProfileActivity.this, SettingsActivity.class);
                    startActivity(intentSettings);
                    return true;

                case R.id.nav_notifications:
                    // Navigation for notifications
                    Intent intentNotifications = new Intent(ProfileActivity.this, NotificationsActivity.class);
                    startActivity(intentNotifications);
                    return true;

                case R.id.nav_camera:
                    // Navigation for camera
                    Intent intentCamera = new Intent(ProfileActivity.this, CameraActivity.class);
                    startActivity(intentCamera);

                case R.id.nav_profile:
                    // Navigation for profile
                    Intent intentProfile = new Intent(ProfileActivity.this, ProfileActivity.class);
                    startActivity(intentProfile);
            }

            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}
