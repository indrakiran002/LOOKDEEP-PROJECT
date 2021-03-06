package com.example.lookdeep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class PlayActivity_8 extends AppCompatActivity {

    private ImageButton  Hint_8;
    private Button Next_Level_9;

private ImageView Level_8_Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_8);

        Level_8_Btn = (ImageView) findViewById(R.id.level_8_btn);
        Hint_8 = (ImageButton) findViewById(R.id.hint8);
        Next_Level_9 = (Button) findViewById(R.id.next_level_9);



        Next_Level_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AllowUserToPlayLevel9();
            }
        });

        Hint_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHint8();
            }
        });





        Level_8_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
                launchIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                launchIntent.putExtra("android.intent.extras.CAMERA_FACING", android.hardware.Camera.CameraInfo.CAMERA_FACING_FRONT);
                launchIntent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
                launchIntent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
                startActivity(launchIntent);

                openDialog();



            }
        });



    }

    private void openHint8() {
        Hint8_Dialog new_dialog = new Hint8_Dialog();
        new_dialog.show(getSupportFragmentManager(),"dialog");
    }

    private void openDialog() {

        Dialog new_dialog = new Dialog();
        new_dialog.show(getSupportFragmentManager(), "dialog");
    }

    private void AllowUserToPlayLevel9() {



        SendUserToLevel9();

    }

    private void SendUserToLevel9() {


        Intent level9Intent = new Intent(PlayActivity_8.this, PlayActivity_9.class);

        startActivity(level9Intent);
        finish();
    }



}