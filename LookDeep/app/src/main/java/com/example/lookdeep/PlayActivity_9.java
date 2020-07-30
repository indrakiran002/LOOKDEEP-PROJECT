package com.example.lookdeep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PlayActivity_9 extends AppCompatActivity {


    private ImageButton Level_9_Btn, Hint_9;
    private Button Next_Level_10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_9);

        Level_9_Btn = (ImageButton) findViewById(R.id.level_9_btn);
        Hint_9 = (ImageButton) findViewById(R.id.hint9);
        Next_Level_10 = (Button) findViewById(R.id.next_level_10);



        Next_Level_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AllowUserToPlayLevel10();
            }
        });

        Hint_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHint9();
            }
        });





        Level_9_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                openDialog();



            }
        });



    }

    private void openHint9() {
        Hint9_Dialog new_dialog = new Hint9_Dialog();
        new_dialog.show(getSupportFragmentManager(),"dialog");
    }

    private void openDialog() {

        Dialog new_dialog = new Dialog();
        new_dialog.show(getSupportFragmentManager(), "dialog");
    }

    private void AllowUserToPlayLevel10() {



        SendUserToLevel10();

    }

    private void SendUserToLevel10() {


        Intent level10Intent = new Intent(PlayActivity_9.this, PlayActivity_10.class);

        startActivity(level10Intent);
    }







}