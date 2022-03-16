package com.example.homefit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ChestWorkoutAdvice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_workout_advice);

        TextView encouragement = findViewById(R.id.encouragement);
        encouragement.setText("We encourage you to aim in burning more than 1000 calories since you are very active");

    }


    public void goBack(View view) {

        Intent intent = new Intent(ChestWorkoutAdvice.this, DetailsActivity.class);
        startActivity(intent);
    }


    public void continueToPlan(View view) {

        startActivity(new Intent(ChestWorkoutAdvice.this, BeginnerChestPlan.class));
    }
}