package com.example.lookdeep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Welcome_Activity extends AppCompatActivity {

    private Button Home, Instructions;
    EditText Name_User;

    String userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_);

        Home = (Button) findViewById(R.id.main_home);
        Instructions = (Button) findViewById(R.id.instructions);
        Name_User = (EditText) findViewById(R.id.name_user);

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AllowUserToHomePage();
            }
        });

        Instructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInstructions();
            }
        });



    }

    private void openInstructions() {
        Instructions_Dialog new_dialog = new Instructions_Dialog();
        new_dialog.show(getSupportFragmentManager(),"dialog");
    }

    private void AllowUserToHomePage() {

        if(TextUtils.isEmpty(Name_User.getText().toString())){
            Toast.makeText(Welcome_Activity.this, "Please Enter Your Name!", Toast.LENGTH_SHORT).show();
        }
else {
            Intent homeIntent = new Intent(Welcome_Activity.this, MainActivity.class);

            userName = Name_User.getText().toString();
            homeIntent.putExtra("Value", userName);

            startActivity(homeIntent);
            finish();
        }

    }





}