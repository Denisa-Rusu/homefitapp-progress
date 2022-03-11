package com.example.homefit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OneMonthProgress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_month_progress);

        TextView progress = findViewById(R.id.progress);
        progress.setText("My Progress");
    }
}