package com.example.lookdeep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PlayActivity_2 extends AppCompatActivity {

    private ImageButton Level_2_Btn, Hint_2;
    private Button Next_Level_3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_2);

        Level_2_Btn = (ImageButton) findViewById(R.id.level_2_btn);
        Hint_2 = (ImageButton) findViewById(R.id.hint2);
        Next_Level_3 = (Button) findViewById(R.id.next_level_3);



        Next_Level_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AllowUserToPlayLevel3();
            }
        });

        Hint_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHint2();
            }
        });





        Level_2_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();



            }
        });



    }

    private void openHint2() {
        Hint2_Dialog new_dialog = new Hint2_Dialog();
        new_dialog.show(getSupportFragmentManager(),"dialog");
    }

    private void openDialog() {

        Dialog new_dialog = new Dialog();
        new_dialog.show(getSupportFragmentManager(), "dialog");
    }

    private void AllowUserToPlayLevel3() {




        SendUserToLevel3();

    }

    private void SendUserToLevel3() {


        Intent level3Intent = new Intent(PlayActivity_2.this, PlayActivity_3.class);

        startActivity(level3Intent);
finish();
    }
}