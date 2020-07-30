package com.example.lookdeep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PlayActivity_3 extends AppCompatActivity {


    private ImageButton Level_3_Btn, Hint_3;
    private Button Next_Level_4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_3);

        Level_3_Btn = (ImageButton) findViewById(R.id.level_3_btn);
        Hint_3 = (ImageButton) findViewById(R.id.hint3);
        Next_Level_4 = (Button) findViewById(R.id.next_level_4);



        Next_Level_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AllowUserToPlayLevel4();
            }
        });

        Hint_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHint3();
            }
        });





        Level_3_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();



            }
        });



    }

    private void openHint3() {
        Hint3_Dialog new_dialog = new Hint3_Dialog();
        new_dialog.show(getSupportFragmentManager(),"dialog");
    }

    private void openDialog() {

        Dialog new_dialog = new Dialog();
        new_dialog.show(getSupportFragmentManager(), "dialog");
    }

    private void AllowUserToPlayLevel4() {




        SendUserToLevel4();

    }

    private void SendUserToLevel4() {


        Intent level4Intent = new Intent(PlayActivity_3.this, PlayActivity_4.class);

        startActivity(level4Intent);

    }

}