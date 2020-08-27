package com.example.lookdeep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class PlayActivity_7 extends AppCompatActivity {

    private ImageButton  Hint_7;
    private Button Next_Level_8, level7;
    private EditText Level_7_Btn;
int str;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_7);

        Level_7_Btn = (EditText) findViewById(R.id.level_7_btn);
        Hint_7 = (ImageButton) findViewById(R.id.hint7);
        Next_Level_8 = (Button) findViewById(R.id.next_level_8);

level7 = (Button) findViewById(R.id.l7);

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





        level7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
 str = Integer.parseInt(Level_7_Btn.getText().toString());
                if (str == 39){
                    openDialog();
                }

                else {
                    Toast.makeText(PlayActivity_7.this, "Wrong Answer!!", Toast.LENGTH_SHORT).show();
                }



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
        finish();
    }


}