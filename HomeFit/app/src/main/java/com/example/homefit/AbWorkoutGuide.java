package com.example.homefit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AbWorkoutGuide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ab_workout_guide);

        TextView guide = findViewById(R.id.guide);
        guide.setText("Ab Workout Guide");


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
                goToUrl("https://www.youtube.com/watch?v=-FW8DNKsAh8");
            }
        });

        ex2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.youtube.com/watch?v=tiPR05uvyWY");
            }
        });

        ex3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.youtube.com/watch?v=Wp4BlxcFTkE");
            }
        });

        ex4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.youtube.com/watch?v=63Q9ezNX5Pw");
            }
        });

        ex5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.youtube.com/watch?v=ZNAxdJ6Bt00");
            }
        });

        ex6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.youtube.com/watch?v=0Z7ds7Qivqs");
            }
        });

        ex7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.youtube.com/watch?v=fSaYfvSpAMI");
            }
        });

        ex8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.youtube.com/watch?v=LAPTW62nYrs");
            }
        });

        ex9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.youtube.com/watch?v=ZIAwC1w90VA");
            }
        });


        ex10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.youtube.com/watch?v=V_lHogFPocY");
            }
        });




    }

    private void goToUrl(String s) {

        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

}
