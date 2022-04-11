package com.example.homefit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RecommendationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommendation);


        Intent intent = getIntent();
        TextView recommendation = findViewById(R.id.recommendation);
        recommendation.setText("We recommend you change the amount of calories to burn since you're inactive");
    }


    public void goBack(View view) {

        Intent intent = new Intent(RecommendationActivity.this, DetailsActivity.class);
        startActivity(intent);
    }

}