package com.example.homefit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GluteWorkoutGuide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glute_workout_guide);


        TextView guide = findViewById(R.id.guide);
        guide.setText("Glute Workout Guide");




        TextView ex1 = findViewById(R.id.exercise1);
        TextView ex2 = findViewById(R.id.exercise2);
        TextView ex3 = findViewById(R.id.exercise3);
        TextView ex4 = findViewById(R.id.exercise4);
        TextView ex5 = findViewById(R.id.exercise5);
        TextView ex6 = findViewById(R.id.exercise6);
        TextView ex7 = findViewById(R.id.exercise7);
        TextView ex8 = findViewById(R.id.exercise8);
        TextView ex9 = findViewById(R.id.exercise9);
        TextView ex10 = findViewById(R.id.exercise10);


        ex1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.youtube.com/watch?v=tpVhJNQURk4");
            }
        });

        ex2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.youtube.com/watch?v=Vkfc8I7PfFk");
            }
        });

        ex3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.youtube.com/watch?v=z2p-qoY6rCc");
            }
        });

        ex4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.youtube.com/watch?v=LUJZrULHD6s");
            }
        });

        ex5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.youtube.com/watch?v=Ro8Zyg38uSk");
            }
        });

        ex6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.youtube.com/watch?v=0O6v9iyHNec");
            }
        });

        ex7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.youtube.com/watch?v=vYHqQmurSUk");
            }
        });

        ex8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.youtube.com/watch?v=pm51PILr3qM");
            }
        });

        ex9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.youtube.com/watch?v=o6sXO66Sqj4");
            }
        });


        ex10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.youtube.com/watch?v=SJ1Xuz9D-ZQ");
            }
        });




    }

    private void goToUrl(String s) {

        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));

    }
}