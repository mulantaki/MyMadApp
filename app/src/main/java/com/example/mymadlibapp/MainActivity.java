package com.example.mymadlibapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

    private Button btnFriend;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}


