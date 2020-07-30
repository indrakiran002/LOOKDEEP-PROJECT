package com.example.lookdeep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PlayActivity_6 extends AppCompatActivity {


    private ImageButton Level_6_Btn, Hint_6;
    private Button Next_Level_7;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_6);

        Level_6_Btn = (ImageButton) findViewById(R.id.level_6_btn);
        Hint_6 = (ImageButton) findViewById(R.id.hint6);
        Next_Level_7 = (Button) findViewById(R.id.next_level_7);



        Next_Level_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AllowUserToPlayLevel7();
            }
        });

        Hint_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHint6();
            }
        });





        Level_6_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                openDialog();



            }
        });



    }

    private void openHint6() {
        Hint6_Dialog new_dialog = new Hint6_Dialog();
        new_dialog.show(getSupportFragmentManager(),"dialog");
    }

    private void openDialog() {

        Dialog new_dialog = new Dialog();
        new_dialog.show(getSupportFragmentManager(), "dialog");
    }

    private void AllowUserToPlayLevel7() {



        SendUserToLevel7();

    }

    private void SendUserToLevel7() {


        Intent level7Intent = new Intent(PlayActivity_6.this, PlayActivity_7.class);

        startActivity(level7Intent);
    }



}