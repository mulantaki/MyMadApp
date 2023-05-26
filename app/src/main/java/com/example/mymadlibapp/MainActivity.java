package com.example.mymadlibapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etFriend;

    private EditText etFriendPronoun;

    private EditText etName;

    private EditText etYourPronoun;

    private EditText etBirthdate;

    private EditText etBirthYear;

    private EditText etRandoNumber;

    private EditText etBoolean;

    private EditText etBoolean2;

    private EditText etColor;

    private Button btnCompile;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFriend = findViewById(R.id.et_friend);
        etFriendPronoun = findViewById(R.id.et_friendpronoun);
        etName = findViewById(R.id.et_name);
        etYourPronoun = findViewById(R.id.et_yourpronoun);
        etBirthdate = findViewById(R.id.et_birthdate);
        etBirthYear = findViewById(R.id.et_birthyear);
        etRandoNumber = findViewById(R.id.et_randonumber);
        etBoolean = findViewById(R.id.et_boolean);
        etBoolean2 = findViewById(R.id.et_boolean2);
        etColor = findViewById(R.id.et_color);
        btnCompile = findViewById(R.id.btn_compile);

        Intent intentDisplay = new Intent(MainActivity.this, SecondActivity.class);

        btnCompile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String story = "";
                story += "...";
                story += "\nOn a "
                story += "\n "

                intentDisplay.putExtra("story", story);
                startActivity(intentDisplay);







            }
        });














    }
}


