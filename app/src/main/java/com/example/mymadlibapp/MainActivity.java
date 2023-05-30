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

    private EditText etSport;

    private EditText etNoun;

    private EditText etVerb;

    private EditText etAdjective;

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
        etSport = findViewById(R.id.et_sport);
        etNoun = findViewById(R.id.et_noun);
        etVerb = findViewById(R.id.et_verb);
        etAdjective = findViewById(R.id.et_adjective);
        btnCompile = findViewById(R.id.btn_compile);

        Intent intentDisplay = new Intent(MainActivity.this, SecondActivity.class);

        btnCompile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String story = "";
                story += "Well for starters I go by, " + etName.getText() + ". I enjoy playing athletic sports and my favorite one is, " + etSport.getText() + ". " ;
                story += "I have a best friend who also plays sports too their name is, " + etFriend.getText() + ". ";
                story += "We've been friends since way back and we resonate really well. ";
                story += "My friend " + etFriend.getText() + "'s birthday is on " + etBirthdate.getText() + ", " + etBirthYear.getText() + ". ";
                story += "I plan to introduce " + etFriend.getText() + " to, " + etNoun.getText() + ".  ";
                story += etFriend.getText() + " seemed very excited about it when I told them. ";
                story += "Anyways back to the topic of athletics while " + etFriend.getText() + "'s " + "attitude is " + etAdjective.getText() + " during games when we play together. I still could say they're a good friend.";
                story += " Usually after games I know " + etFriend.getText() + " is done with her stretches when " + etPronoun.getText() + " goes, HEY HEY MEAL TIME, " + etName.getText() + " and so I dash to them to where we then have trouble deciding our after practice meals.";





























                intentDisplay.putExtra("story", story);
                startActivity(intentDisplay);







            }
        });














    }
}


