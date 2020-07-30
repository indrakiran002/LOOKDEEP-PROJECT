package com.example.lookdeep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PlayActivity_7 extends AppCompatActivity {

    private ImageButton Level_7_Btn, Hint_7;
    private Button Next_Level_8;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_7);

        Level_7_Btn = (ImageButton) findViewById(R.id.level_7_btn);
        Hint_7 = (ImageButton) findViewById(R.id.hint7);
        Next_Level_8 = (Button) findViewById(R.id.next_level_8);



        Next_Level_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AllowUserToPlayLevel8();
            }
        });

        Hint_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHint7();
            }
        });





        Level_7_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                openDialog();



            }
        });



    }

    private void openHint7() {
        Hint7_Dialog new_dialog = new Hint7_Dialog();
        new_dialog.show(getSupportFragmentManager(),"dialog");
    }

    private void openDialog() {

        Dialog new_dialog = new Dialog();
        new_dialog.show(getSupportFragmentManager(), "dialog");
    }

    private void AllowUserToPlayLevel8() {



        SendUserToLevel8();

    }

    private void SendUserToLevel8() {


        Intent level8Intent = new Intent(PlayActivity_7.this, PlayActivity_8.class);

        startActivity(level8Intent);
    }


}