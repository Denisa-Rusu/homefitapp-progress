package com.example.homefit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OneWeekProgress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_week_progress);

        TextView progress = findViewById(R.id.progress);
        progress.setText("My Progress");
    }
}