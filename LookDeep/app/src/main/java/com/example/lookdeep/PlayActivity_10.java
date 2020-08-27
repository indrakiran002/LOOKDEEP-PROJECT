package com.example.lookdeep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayActivity_10 extends AppCompatActivity {

    Button completed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_10);

        completed = (Button) findViewById(R.id.end);

        completed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent levelsIntent = new Intent(PlayActivity_10.this, LevelsActivity.class);

                startActivity(levelsIntent);
                finish();
            }
        });
    }
}