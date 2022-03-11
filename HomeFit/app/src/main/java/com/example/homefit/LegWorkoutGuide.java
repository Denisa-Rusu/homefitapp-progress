package com.example.homefit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LegWorkoutGuide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg_workout_guide);

        TextView guide = findViewById(R.id.guide);
        guide.setText("Leg Workout Guide");



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
                goToUrl("https://www.youtube.com/watch?v=z2p-qoY6rCc");
            }
        });

        ex2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.youtube.com/watch?v=UcZVX7Sc9YI");
            }
        });

        ex3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.youtube.com/watch?v=1D_tsUSW3ZY");
            }
        });

        ex4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.youtube.com/watch?v=JKkNw3jO9S8");
            }
        });

        ex5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.youtube.com/watch?v=CYWmz3Zxr8s");
            }
        });

        ex6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.youtube.com/watch?v=cNDt-5H8tnc");
            }
        });

        ex7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.youtube.com/watch?v=VHtUId9pBB0");
            }
        });

        ex8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.youtube.com/watch?v=-cdph8hv0O0");
            }
        });

        ex9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.youtube.com/watch?v=H-8t44E0UxA");
            }
        });


        ex10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.youtube.com/watch?v=Azl5tkCzDcc");
            }
        });




    }

    private void goToUrl(String s) {

        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}