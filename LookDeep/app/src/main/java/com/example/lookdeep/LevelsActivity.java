package com.example.lookdeep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;



public class LevelsActivity extends AppCompatActivity {


    public ImageButton Level_1, Level_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);

        Level_1 = (ImageButton) findViewById(R.id.level_1);


        Level_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AllowUserToPlayLevel1();
            }
        });

        Level_2 = (ImageButton) findViewById(R.id.level_2_button);

        Level_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LevelsActivity.this, "First Pass Level 1", Toast.LENGTH_LONG).show();


                    AllowUserToPlayLevel2();

            }
        });


    }

    private void AllowUserToPlayLevel1() {
        SendUserToLevel1();

    }
    private void AllowUserToPlayLevel2() {
        SendUserToLevel3();

    }

    private void SendUserToLevel1() {

        Intent level1Intent = new Intent(LevelsActivity.this, PlayActivity_1.class);

        startActivity(level1Intent);

    }

    private void SendUserToLevel3() {

        Intent level1Intent = new Intent(LevelsActivity.this, PlayActivity_3.class);

        startActivity(level1Intent);

    }
}