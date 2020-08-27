package com.example.lookdeep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;



public class LevelsActivity extends AppCompatActivity {


    public ImageButton Level_1, Level_2, Level_3, Level_4, Level_5, Level_6, Level_7, Level_8, Level_9;

    private Button Next_Levels;

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


                    AllowUserToPlayLevel2();

            }
        });


        Level_3 = (ImageButton) findViewById(R.id.level_3);


        Level_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AllowUserToPlayLevel3();
            }
        });


        Level_4 = (ImageButton) findViewById(R.id.level_4);


        Level_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AllowUserToPlayLevel4();
            }
        });


        Level_5 = (ImageButton) findViewById(R.id.level_5);


        Level_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AllowUserToPlayLevel5();
            }
        });



        Level_6 = (ImageButton) findViewById(R.id.level_6);


        Level_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AllowUserToPlayLevel6();
            }
        });



        Level_7 = (ImageButton) findViewById(R.id.level_7);


        Level_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AllowUserToPlayLevel7();
            }
        });



        Level_8 = (ImageButton) findViewById(R.id.level_8);


        Level_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AllowUserToPlayLevel8();
            }
        });



        Level_9 = (ImageButton) findViewById(R.id.level_9);


        Level_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AllowUserToPlayLevel9();
            }
        });




        Next_Levels = (Button) findViewById(R.id.next);

        Next_Levels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LevelsActivity.this, "Next Levels are Coming Soon...Stay tuned...", Toast.LENGTH_LONG).show();
            }
        });



    }

    private void AllowUserToPlayLevel1() {
        SendUserToLevel1();

    }
    private void AllowUserToPlayLevel2() {
        SendUserToLevel2();

    }

    private void AllowUserToPlayLevel3() {
        SendUserToLevel3();

    }
    private void AllowUserToPlayLevel4() {
        SendUserToLevel4();

    }
    private void AllowUserToPlayLevel5() {
        SendUserToLevel5();

    }
    private void AllowUserToPlayLevel6() {
        SendUserToLevel6();

    }
    private void AllowUserToPlayLevel7() {
        SendUserToLevel7();

    }
    private void AllowUserToPlayLevel8() {
        SendUserToLevel8();

    }
    private void AllowUserToPlayLevel9() {
        SendUserToLevel9();

    }

    private void SendUserToLevel1() {

        Intent level1Intent = new Intent(LevelsActivity.this, PlayActivity_1.class);

        startActivity(level1Intent);

    }

    private void SendUserToLevel2() {

        Intent level2Intent = new Intent(LevelsActivity.this, PlayActivity_2.class);

        startActivity(level2Intent);

    }


    private void SendUserToLevel3() {

        Intent level3Intent = new Intent(LevelsActivity.this, PlayActivity_3.class);

        startActivity(level3Intent);

    }
    private void SendUserToLevel4() {

        Intent level4Intent = new Intent(LevelsActivity.this, PlayActivity_4.class);

        startActivity(level4Intent);

    }
    private void SendUserToLevel5() {

        Intent level5Intent = new Intent(LevelsActivity.this, PlayActivity_5.class);

        startActivity(level5Intent);

    }
    private void SendUserToLevel6() {

        Intent level6Intent = new Intent(LevelsActivity.this, PlayActivity_6.class);

        startActivity(level6Intent);

    }
    private void SendUserToLevel7() {

        Intent level7Intent = new Intent(LevelsActivity.this, PlayActivity_7.class);

        startActivity(level7Intent);

    }
    private void SendUserToLevel8() {

        Intent level8Intent = new Intent(LevelsActivity.this, PlayActivity_8.class);

        startActivity(level8Intent);

    }
    private void SendUserToLevel9() {

        Intent level9Intent = new Intent(LevelsActivity.this, PlayActivity_9.class);

        startActivity(level9Intent);

    }






}