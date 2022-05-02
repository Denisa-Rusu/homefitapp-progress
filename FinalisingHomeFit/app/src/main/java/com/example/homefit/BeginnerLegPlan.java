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

    ArrayList<UserPlan> plans;
    private FirebaseAuth mAuth;
    private String Uid;

    String day01;
    String day01performance;
    String day02;
    String day02performance;
    String day03;
    String day03performance;
    String day04;
    String day04performance;
    String day05;
    String day05performance;
    String day06;
    String day07;
    String day08;
    String day08performance;
    String day09;
    String day09performance;
    String day10;
    String day10performance;
    String day11;
    String day11performance;
    String day12;
    String day12performance;
    String day13;
    String day14;
    String day15;
    String day15performance;
    String day16;
    String day16performance;
    String day17;
    String day17performance;
    String day18;
    String day18performance;
    String day19;
    String day19performance;
    String day20;
    String day21;
    String day22;
    String day22performance;
    String day23;
    String day23performance;
    String day24;
    String day24performance;
    String day25;
    String day25performance;
    String day26;
    String day26performance;
    String day27;
    String day28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner_leg_plan);

        Intent intent = getIntent();
        TextView beginnerLegPlan = findViewById(R.id.beginner_leg_plan);
        beginnerLegPlan.getText().toString();

        plans = new ArrayList<UserPlan>();
        mAuth = FirebaseAuth.getInstance();
        Uid = mAuth.getCurrentUser().getUid();

        TextView legPlan = findViewById(R.id.beginner_leg_plan);
        TextView calories = findViewById(R.id.begcalories);
        TextView legDay1  = findViewById(R.id.leg_day1);
        TextView legDay1Perf = findViewById(R.id.legday1performance);
        TextView legDay2  = findViewById(R.id.leg_day2);
        TextView legDay2Perf = findViewById(R.id.legday2performance);
        TextView legDay3  = findViewById(R.id.leg_day3);
        TextView legDay3Perf = findViewById(R.id.legday3performance);
        TextView legDay4  = findViewById(R.id.leg_day4);
        TextView legDay4Perf = findViewById(R.id.legday4performance);
        TextView legDay5  = findViewById(R.id.leg_day5);
        TextView legDay5Perf = findViewById(R.id.legday5performance);
        TextView legDay6  = findViewById(R.id.leg_day6);
        TextView legDay7  = findViewById(R.id.leg_day7);
        TextView legDay8  = findViewById(R.id.leg_day8);
        TextView legDay8Perf = findViewById(R.id.legday8performance);
        TextView legDay9  = findViewById(R.id.leg_day9);
        TextView legDay9Perf = findViewById(R.id.legday9performance);
        TextView legDay10  = findViewById(R.id.leg_day10);
        TextView legDay10Perf = findViewById(R.id.legday10performance);
        TextView legDay11  = findViewById(R.id.leg_day11);
        TextView legDay11Perf = findViewById(R.id.legday11performance);
        TextView legDay12  = findViewById(R.id.leg_day12);
        TextView legDay12Perf = findViewById(R.id.legday12performance);
        TextView legDay13  = findViewById(R.id.leg_day13);
        TextView legDay14  = findViewById(R.id.leg_day14);
        TextView legDay15  = findViewById(R.id.leg_day15);
        TextView legDay15Perf = findViewById(R.id.legday15performance);
        TextView legDay16  = findViewById(R.id.leg_day16);
        TextView legDay16Perf = findViewById(R.id.legday16performance);
        TextView legDay17  = findViewById(R.id.leg_day17);
        TextView legDay17Perf = findViewById(R.id.legday17performance);
        TextView legDay18  = findViewById(R.id.leg_day18);
        TextView legDay18Perf = findViewById(R.id.legday18performance);
        TextView legDay19  = findViewById(R.id.leg_day19);
        TextView legDay19Perf = findViewById(R.id.legday19performance);
        TextView legDay20  = findViewById(R.id.leg_day20);
        TextView legDay21  = findViewById(R.id.leg_day21);
        TextView legDay22  = findViewById(R.id.leg_day22);
        TextView legDay22Perf = findViewById(R.id.legday22performance);
        TextView legDay23  = findViewById(R.id.leg_day23);
        TextView legDay23Perf = findViewById(R.id.legday23performance);
        TextView legDay24  = findViewById(R.id.leg_day24);
        TextView legDay24Perf = findViewById(R.id.legday24performance);
        TextView legDay25  = findViewById(R.id.leg_day25);
        TextView legDay25Perf = findViewById(R.id.legday25performance);
        TextView legDay26  = findViewById(R.id.leg_day26);
        TextView legDay26Perf = findViewById(R.id.legday26performance);
        TextView legDay27  = findViewById(R.id.leg_day27);
        TextView legDay28  = findViewById(R.id.leg_day28);

        String chosenPlan = legPlan.getText().toString();
        String caloriesToBurn = calories.getText().toString();
        day01 = legDay1.getText().toString();
        day01performance = legDay1Perf.getText().toString();
        day02 = legDay2.getText().toString();
        day02performance = legDay2Perf.getText().toString();
        day03 = legDay3.getText().toString();
        day03performance = legDay3Perf.getText().toString();
        day04 = legDay4.getText().toString();
        day04performance = legDay4Perf.getText().toString();
        day05 = legDay5.getText().toString();
        day05performance = legDay5Perf.getText().toString();
        day06 = legDay6.getText().toString();
        day07 = legDay7.getText().toString();
        day08 = legDay8.getText().toString();
        day08performance = legDay8Perf.getText().toString();
        day09 = legDay9.getText().toString();
        day09performance = legDay9Perf.getText().toString();
        day10 = legDay10.getText().toString();
        day10performance = legDay10Perf.getText().toString();
        day11 = legDay11.getText().toString();
        day11performance = legDay11Perf.getText().toString();
        day12 = legDay12.getText().toString();
        day12performance = legDay12Perf.getText().toString();
        day13 = legDay13.getText().toString();
        day14 = legDay14.getText().toString();
        day15 = legDay15.getText().toString();
        day15performance = legDay15Perf.getText().toString();
        day16 = legDay16.getText().toString();
        day16performance = legDay16Perf.getText().toString();
        day17 = legDay17.getText().toString();
        day17performance = legDay17Perf.getText().toString();
        day18 = legDay18.getText().toString();
        day18performance = legDay18Perf.getText().toString();
        day19 = legDay19.getText().toString();
        day19performance = legDay19Perf.getText().toString();
        day20 = legDay20.getText().toString();
        day21 = legDay21.getText().toString();
        day22 = legDay22.getText().toString();
        day22performance = legDay22Perf.getText().toString();
        day23 = legDay23.getText().toString();
        day23performance = legDay23Perf.getText().toString();
        day24 = legDay24.getText().toString();
        day24performance = legDay24Perf.getText().toString();
        day25 = legDay25.getText().toString();
        day25performance = legDay25Perf.getText().toString();
        day26 = legDay26.getText().toString();
        day26performance = legDay26Perf.getText().toString();
        day27 = legDay27.getText().toString();
        day28 = legDay28.getText().toString();

        UserPlan beginnerPlan = new UserPlan(caloriesToBurn, chosenPlan, day01, day01performance, day02, day02performance,
                day03, day03performance, day04, day04performance, day05, day05performance, day06, day07, day08, day08performance,
                day09, day09performance, day10, day10performance, day11, day11performance, day12, day12performance, day13, day14,
                day15, day15performance, day16, day16performance, day17, day17performance, day18, day18performance, day19, day19performance,
                day20, day21, day22, day22performance, day23, day23performance, day24, day24performance, day25, day25performance,
                day26, day26performance, day27, day28);

        DatabaseReference fireDB = FirebaseDatabase.getInstance().getReference("Users").child(Uid).child("Plan").push();

        fireDB.setValue(beginnerPlan);
    }

    public void goToWorkout(View view) {
        Intent intent = new Intent(BeginnerLegPlan.this, WorkoutActivity.class);
        startActivity(intent);
    }

}