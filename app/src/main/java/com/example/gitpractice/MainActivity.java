package com.example.gitpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("This is contented my second commit");
        System.out.println();
        System.out.println("CHANGE 2");
        System.out.println("Hello from your friends");

    }
}