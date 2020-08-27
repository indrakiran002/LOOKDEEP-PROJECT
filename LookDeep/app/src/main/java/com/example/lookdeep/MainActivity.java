package com.example.lookdeep;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private Button Play_Button, Level_Button;

    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    TextView User;
    String st;

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Play_Button = (Button) findViewById(R.id.play_btn);
        Level_Button = (Button) findViewById(R.id.level_btn);

        User = (TextView) findViewById(R.id.user);

        st = getIntent().getExtras().getString("Value");
        User.setText(st);

        navigationView = (NavigationView) findViewById(R.id.navigation_view);



        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                UserMenuSelector(menuItem);
                return false;
            }
        });


        Play_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AllowUserToPlay();
                
            }
        });

        Level_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AllowUserToLevels();
            }
        });


    }

    private void AllowUserToLevels() {
        SendUserToLevelsActivity();
    }

    private void SendUserToLevelsActivity() {
        Intent levelIntent = new Intent(MainActivity.this, LevelsActivity.class);

        startActivity(levelIntent);

    }

    private void AllowUserToPlay() {
        SendUserToPlayActivity_1();

    }


    private void SendUserToPlayActivity_1() {

        Intent mainIntent = new Intent(MainActivity.this, PlayActivity_1.class);

        startActivity(mainIntent);


    }


    private void UserMenuSelector(MenuItem menuItem) {
        switch (menuItem.getItemId()) {



            case R.id.home:
                Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
                break;

            case R.id.levels:
                Toast.makeText(this, "Levels", Toast.LENGTH_SHORT).show();
                AllowUserToLevels();
                break;



            case R.id.logout:

                Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show();


                break;

        }

    }





}