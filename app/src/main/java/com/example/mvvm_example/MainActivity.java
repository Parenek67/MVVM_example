package com.example.mvvm_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mvvm_example.Presentation.Repository.Repository;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Repository.init(getApplication());
    }
}