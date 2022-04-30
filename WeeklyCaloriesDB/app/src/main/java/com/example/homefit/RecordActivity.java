package com.example.homefit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RecordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        TextView progress = findViewById(R.id.record);
        progress.setText("My Record");

         Intent intent = getIntent();
         String week1calories = intent.getStringExtra(TrackWeekOneWorkout.key1);
         TextView week1 = findViewById(R.id.week1);
         week1.setText(week1calories);

        String week2calories = intent.getStringExtra(TrackWeekTwoWorkout.key1);
        TextView week2 = findViewById(R.id.week2);
        week2.setText(week2calories);

        String week3calories = intent.getStringExtra(TrackWeekThreeWorkout.key1);
        TextView week3 = findViewById(R.id.week3);
        week3.setText(week3calories);

        String week4calories = intent.getStringExtra(TrackWeekFourWorkout.key1);
        TextView week4 = findViewById(R.id.week4);
        week4.setText(week4calories);
    }

    public void continueToFeedback(View view) {

        Intent intent = new Intent(RecordActivity.this, FeedbackActivity.class);
        startActivity(intent);

    }
}