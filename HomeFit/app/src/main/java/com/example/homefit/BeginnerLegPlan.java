package com.example.homefit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class BeginnerLegPlan extends AppCompatActivity {

    ArrayList<UserBeginnerPlan> plans;
    private FirebaseAuth mAuth;
    private String Uid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner_leg_plan);

        Intent intent = getIntent();
        TextView beginnerLegPlan = findViewById(R.id.beginner_leg_plan);
        beginnerLegPlan.getText().toString();



        plans = new ArrayList<UserBeginnerPlan>();
        mAuth = FirebaseAuth.getInstance();
        Uid = mAuth.getCurrentUser().getUid();


        TextView legPlan = findViewById(R.id.beginner_leg_plan);
        TextView legDay1  = findViewById(R.id.leg_day1);
        TextView legDay2  = findViewById(R.id.leg_day2);
        TextView legDay3  = findViewById(R.id.leg_day3);
        TextView legDay4  = findViewById(R.id.leg_day4);
        TextView legDay5  = findViewById(R.id.leg_day5);
        TextView legDay6  = findViewById(R.id.leg_day6);
        TextView legDay7  = findViewById(R.id.leg_day7);
        TextView legDay8  = findViewById(R.id.leg_day8);
        TextView legDay9  = findViewById(R.id.leg_day9);
        TextView legDay10  = findViewById(R.id.leg_day10);
        TextView legDay11  = findViewById(R.id.leg_day11);
        TextView legDay12  = findViewById(R.id.leg_day12);
        TextView legDay13  = findViewById(R.id.leg_day13);
        TextView legDay14  = findViewById(R.id.leg_day14);
        TextView legDay15  = findViewById(R.id.leg_day15);
        TextView legDay16  = findViewById(R.id.leg_day16);
        TextView legDay17  = findViewById(R.id.leg_day17);
        TextView legDay18  = findViewById(R.id.leg_day18);
        TextView legDay19  = findViewById(R.id.leg_day19);
        TextView legDay20  = findViewById(R.id.leg_day20);
        TextView legDay21  = findViewById(R.id.leg_day21);
        TextView legDay22  = findViewById(R.id.leg_day22);
        TextView legDay23  = findViewById(R.id.leg_day23);
        TextView legDay24  = findViewById(R.id.leg_day24);
        TextView legDay25  = findViewById(R.id.leg_day25);
        TextView legDay26  = findViewById(R.id.leg_day26);
        TextView legDay27  = findViewById(R.id.leg_day27);
        TextView legDay28  = findViewById(R.id.leg_day28);

        String chosenPlan = legPlan.getText().toString();
        String day01 = legDay1.getText().toString();
        String day02 = legDay2.getText().toString();
        String day03 = legDay3.getText().toString();
        String day04 = legDay4.getText().toString();
        String day05 = legDay5.getText().toString();
        String day06 = legDay6.getText().toString();
        String day07 = legDay7.getText().toString();
        String day08 = legDay8.getText().toString();
        String day09 = legDay9.getText().toString();
        String day10 = legDay10.getText().toString();
        String day11 = legDay11.getText().toString();
        String day12 = legDay12.getText().toString();
        String day13 = legDay13.getText().toString();
        String day14 = legDay14.getText().toString();
        String day15 = legDay15.getText().toString();
        String day16 = legDay16.getText().toString();
        String day17 = legDay17.getText().toString();
        String day18 = legDay18.getText().toString();
        String day19 = legDay19.getText().toString();
        String day20 = legDay20.getText().toString();
        String day21 = legDay21.getText().toString();
        String day22 = legDay22.getText().toString();
        String day23 = legDay23.getText().toString();
        String day24 = legDay24.getText().toString();
        String day25 = legDay25.getText().toString();
        String day26 = legDay26.getText().toString();
        String day27 = legDay27.getText().toString();
        String day28 = legDay28.getText().toString();


        UserBeginnerPlan beginnerplan = new UserBeginnerPlan(chosenPlan, day01, day02, day03, day04, day05, day06, day07,
                day08, day09, day10, day11, day12, day13, day14, day15, day16, day17, day18, day19, day20, day21,
                day22, day23, day24, day25, day26, day27, day28);

        DatabaseReference fireDB = FirebaseDatabase.getInstance().getReference("Users").child(Uid).child("Plan").push();

        fireDB.setValue(beginnerplan);
    }

    public void goToWorkout(View view) {
        Intent intent = new Intent(BeginnerLegPlan.this, WorkoutActivity.class);
        startActivity(intent);
    }

}