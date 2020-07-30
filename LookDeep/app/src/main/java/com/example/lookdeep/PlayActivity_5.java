package com.example.lookdeep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PlayActivity_5 extends AppCompatActivity {
    private ImageButton Level_5_Btn, Hint_5;
    private Button Next_Level_6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_5);

        Level_5_Btn = (ImageButton) findViewById(R.id.level_5_btn);
        Hint_5 = (ImageButton) findViewById(R.id.hint5);
        Next_Level_6 = (Button) findViewById(R.id.next_level_6);



        Next_Level_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AllowUserToPlayLevel6();
            }
        });

        Hint_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHint5();
            }
        });





        Level_5_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                openDialog();



            }
        });



    }

    private void openHint5() {
        Hint5_Dialog new_dialog = new Hint5_Dialog();
        new_dialog.show(getSupportFragmentManager(),"dialog");
    }

    private void openDialog() {

        Dialog new_dialog = new Dialog();
        new_dialog.show(getSupportFragmentManager(), "dialog");
    }

    private void AllowUserToPlayLevel6() {



        SendUserToLevel6();

    }

    private void SendUserToLevel6() {


        Intent level6Intent = new Intent(PlayActivity_5.this, PlayActivity_6.class);

        startActivity(level6Intent);
    }


}
