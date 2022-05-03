package com.example.homefit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PlanAdviceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_advice);


        Intent intent = getIntent();
        TextView advice = findViewById(R.id.advice);
        advice.setText("We advice you to go back and change the amount of calories to burn since you're inactive");
    }


}