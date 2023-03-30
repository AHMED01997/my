package com.example.islamicquize;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.*;
import android.graphics.*;

import android.view.*;
import android.widget.*;




public class MainActivity extends AppCompatActivity {

    private QuistionBank mQuistionBank;
    private Button addQuestionButton;
    private String selectedTopicName ="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final LinearLayout java = findViewById(R.id.lay1);
        final LinearLayout java2 = findViewById(R.id.lay2);
        final LinearLayout java3 = findViewById(R.id.lay3);
        final LinearLayout java4 = findViewById(R.id.lay4);
        final Button startButton = findViewById(R.id.startbutton);

        java.setOnClickListener(p1 -> {

            selectedTopicName = "java";
            java.setBackgroundColor(Color.GREEN);
            java2.setBackgroundColor(Color.GRAY);
            java3.setBackgroundColor(Color.GRAY);
            java4.setBackgroundColor(Color.GRAY);

            // TODO: Implement this method
        });
        java2.setOnClickListener(p1 -> {

            selectedTopicName = "java2";
            java2.setBackgroundColor(Color.GREEN);
            java.setBackgroundColor(Color.GRAY);
            java3.setBackgroundColor(Color.GRAY);
            java4.setBackgroundColor(Color.GRAY);

            // TODO: Implement this method
        });
        java3.setOnClickListener(p1 -> {

            selectedTopicName = "java3";
            java3.setBackgroundColor(Color.GREEN);
            java2.setBackgroundColor(Color.GRAY);
            java.setBackgroundColor(Color.GRAY);
            java4.setBackgroundColor(Color.GRAY);

            // TODO: Implement this method
        });
        java4.setOnClickListener(p1 -> {

            selectedTopicName = "java4";
            java4.setBackgroundColor(Color.GREEN);
            java2.setBackgroundColor(Color.GRAY);
            java3.setBackgroundColor(Color.GRAY);
            java.setBackgroundColor(Color.GRAY);

            // TODO: Implement this method
        });

        addQuestionButton = findViewById(R.id.addQuestionButton);

        addQuestionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddQuestionActivity.class);
                startActivity(intent);
            }
        });

        startButton.setOnClickListener(p1 -> {
            if (selectedTopicName.isEmpty()) {
                Toast.makeText(MainActivity.this, "please complete", Toast.LENGTH_SHORT).show();

            } else {
                Intent intent = new Intent(getApplicationContext(), Second.class);
                intent.putExtra("selectedTobic", selectedTopicName);
                startActivity(intent);
            }
            // TODO: Implement this method
        });


    } }