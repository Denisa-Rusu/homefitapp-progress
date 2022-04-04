package com.example.homefit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    Button getStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        TextView welcome = findViewById(R.id.welcome);
        welcome.setText("Welcome to HomeFit");

        getStarted = findViewById(R.id.get_started_button);
    }


    public void getStarted(View view) {
        startActivity(new Intent(WelcomeActivity.this, DetailsActivity.class));
    }
}