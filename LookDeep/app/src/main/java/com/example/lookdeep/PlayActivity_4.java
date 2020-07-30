package com.example.lookdeep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PlayActivity_4 extends AppCompatActivity {
    private ImageButton Level_4_Btn, Hint_4;
    private Button Next_Level_5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_4);

        Level_4_Btn = (ImageButton) findViewById(R.id.level_4_btn);
        Hint_4 = (ImageButton) findViewById(R.id.hint4);
        Next_Level_5 = (Button) findViewById(R.id.next_level_5);



        Next_Level_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AllowUserToPlayLevel5();
            }
        });

        Hint_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHint4();
            }
        });





        Level_4_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                openDialog();



            }
        });



    }

    private void openHint4() {
        Hint4_Dialog new_dialog = new Hint4_Dialog();
        new_dialog.show(getSupportFragmentManager(),"dialog");
    }

    private void openDialog() {

        Dialog new_dialog = new Dialog();
        new_dialog.show(getSupportFragmentManager(), "dialog");
    }

    private void AllowUserToPlayLevel5() {



        SendUserToLevel5();

    }

    private void SendUserToLevel5() {


        Intent level5Intent = new Intent(PlayActivity_4.this, PlayActivity_5.class);

        startActivity(level5Intent);
    }



}