package com.example.rn11.instagramlite;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Created by Rn11 on 03.06.2018.
 */

public class NotificationsActivity extends AppCompatActivity{

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.nav_timeline:

                    // Navigation for Timeline
                    Intent intentTimeline = new Intent(NotificationsActivity.this, TimelineActivity.class);
                    startActivity(intentTimeline);
                    return true;

                case R.id.nav_search:
                    // Navigation for settings
                    Intent intentSettings = new Intent(NotificationsActivity.this, SearchActivity.class);
                    startActivity(intentSettings);
                    return true;

                case R.id.nav_notifications:
                    // Navigation for notifications
                    Intent intentNotifications = new Intent(NotificationsActivity.this, NotificationsActivity.class);
                    startActivity(intentNotifications);
                    return true;

                case R.id.nav_camera:
                    // Navigation for camera
                    Intent intentCamera = new Intent("android.media.action.IMAGE_CAPTURE");
                    startActivityForResult(intentCamera, 0);
                    return true;

                case R.id.nav_profile:
                    // Navigation for profile
                    Intent intentProfile = new Intent(NotificationsActivity.this, ProfileActivity.class);
                    startActivity(intentProfile);
                    return true;
            }

            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
