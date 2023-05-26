package com.example.mymadlibapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etFriend;

    private EditText etPronoun;

    private EditText etName;

    private EditText etPronoun2;

    private EditText etBirthdate;

    private EditText etBirthYear;

    private EditText etRandomNumber;

    private EditText etBoolean;

    private EditText etBoolean2;

    private EditText etColor;

    private Button btnCompile;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFriend = findViewById(R.id.et_friend);
        etPronoun = findViewById(R.id.et_pronoun);
        etName = findViewById(R.id.et_name);
        etPronoun2 = findViewById(R.id.et_pronoun2);
        etBirthdate = findViewById(R.id.et_birthdate);
        etBirthYear = findViewById(R.id.et_birthyear);
        etRandomNumber = findViewById(R.id.et_randomnumber);
        etBoolean = findViewById(R.id.et_boolean);
        etBoolean2 = findViewById(R.id.et_boolean2);
        etColor = findViewById(R.id.et_color);
        btnCompile = findViewById(R.id.btn_compile);

        Intent intentDisplay = new Intent(MainActivity.this, SecondActivity.class);

        btnCompile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String story = "";
                story += "Well for starters I go by, " + etName + "I enjoy playing athletic sports and my favorite one is, ";






























                intentDisplay.putExtra("story", story);
                startActivity(intentDisplay);







            }
        });














    }
}


