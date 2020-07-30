package com.example.lookdeep;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class PlayActivity_1 extends AppCompatActivity {


    private ImageButton Level_1_Btn, Hint_1;
    private Button Next_Level_2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_1);

        Level_1_Btn = (ImageButton) findViewById(R.id.level_1_btn);
        Hint_1 = (ImageButton) findViewById(R.id.hint1);
        Next_Level_2 = (Button) findViewById(R.id.next_level_2);



        Next_Level_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AllowUserToPlayLevel2();
            }
        });

        Hint_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHint1();
            }
        });





        Level_1_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                openDialog();



            }
        });



    }

    private void openHint1() {
        Hint1_Dialog new_dialog = new Hint1_Dialog();
        new_dialog.show(getSupportFragmentManager(),"dialog");
    }

    private void openDialog() {

        Dialog new_dialog = new Dialog();
        new_dialog.show(getSupportFragmentManager(), "dialog");
    }

    private void AllowUserToPlayLevel2() {



            SendUserToLevel2();

    }

    private void SendUserToLevel2() {


        Intent level2Intent = new Intent(PlayActivity_1.this, PlayActivity_2.class);

        startActivity(level2Intent);
    }
}