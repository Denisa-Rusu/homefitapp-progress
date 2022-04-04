package com.example.homefit;

import static com.example.homefit.WorkoutActivity.key1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ProgressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        TextView progress = findViewById(R.id.progress);
        progress.setText("My Progress");

        // Intent intent = getIntent();
        // String day1cals = intent.getStringExtra(WorkoutActivity.key1);
        // TextView day1progress = findViewById(R.id.day1pro);
        // day1progress.setText(day1cals + " Calories Burned");
    }
}