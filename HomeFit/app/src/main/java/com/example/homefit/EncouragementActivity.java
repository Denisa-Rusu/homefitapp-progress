package com.example.homefit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EncouragementActivity extends AppCompatActivity {


    TextView fitness_Goal;
    private String fitGoal;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encouragement);



        TextView encouragement = findViewById(R.id.encouragement);
        encouragement.setText("We encourage you to aim in burning more than 1000 calories since you are very active");


        Intent intent = getIntent();


        String cals = intent.getStringExtra(DetailsActivity.key1);

        String fitGoal = intent.getStringExtra(DetailsActivity.key2);

        String actLevel = intent.getStringExtra(DetailsActivity.key3);

        TextView caloriesToBurn = findViewById(R.id.caloriesToBurn);
        caloriesToBurn.setText(cals);

        TextView fitness_Goal = findViewById(R.id.fitnessGoal);


        fitness_Goal.setText(fitGoal);

        TextView activityLevel = findViewById(R.id.activityLevel);
        activityLevel.setText(actLevel);
    }



    public void goBack(View view) {

        Intent intent = new Intent(EncouragementActivity.this, DetailsActivity.class);
        startActivity(intent);
    }


    public void continueToPlan(View view) {


        String f = fitness_Goal.getText().toString();

        if (f.equalsIgnoreCase("Arms")) {
            Intent intent = new Intent(EncouragementActivity.this, OneWeekArmPlan.class);
            startActivity(intent);
            return;
        }

        /*if (f.equalsIgnoreCase("Legs")) {
            Intent intent = new Intent(EncouragementActivity.this, OneWeekLegPlan.class);
            startActivity(intent);
            return;
        }

        if (f.equalsIgnoreCase("Chest")) {
            Intent intent = new Intent(EncouragementActivity.this, OneWeekChestPlan.class);
            startActivity(intent);
            return;
        }

        if (f.equalsIgnoreCase("Glutes")) {
            Intent intent = new Intent(EncouragementActivity.this, OneWeekGlutePlan.class);
            startActivity(intent);
            return;
        }

        if (f.equalsIgnoreCase("Abs")) {
            Intent intent = new Intent(EncouragementActivity.this, OneWeekAbPlan.class);
            startActivity(intent);
            return;
        }*/
    }


}