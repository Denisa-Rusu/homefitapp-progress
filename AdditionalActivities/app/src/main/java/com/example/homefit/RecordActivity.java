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
        // String exerciseOne = intent.getStringExtra(WeekOneWorkout.key1);
        // TextView day1progress = findViewById(R.id.day1pro);
        // day1progress.setText(exerciseOne + " Calories Burned");
    }

    public void continueToFeedback(View view) {

        Intent intent = new Intent(RecordActivity.this, FeedbackActivity.class);
        startActivity(intent);

    }
}