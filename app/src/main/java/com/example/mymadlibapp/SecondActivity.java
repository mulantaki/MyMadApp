package com.example.mymadlibapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

private TextView tvStory

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

            tvStory = findViewById(R.id.tv_story);

            Intent intent = getIntent();

            String story = intent.getStringExtra( "story");

            tvStory.setText(story);





    }
}