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

public class IntenseChestPlan extends AppCompatActivity {

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
        setContentView(R.layout.activity_intense_chest_plan);

        Intent intent = getIntent();
        TextView intenseChestPlan = findViewById(R.id.intense_chest_plan);
        intenseChestPlan.getText().toString();

        plans = new ArrayList<UserPlan>();
        mAuth = FirebaseAuth.getInstance();
        Uid = mAuth.getCurrentUser().getUid();

        TextView chestPlan = findViewById(R.id.intense_chest_plan);
        TextView calories = findViewById(R.id.intcalories);
        TextView chestDay1  = findViewById(R.id.chest_day1);
        TextView chestDay1Perf = findViewById(R.id.chestday1performance);
        TextView chestDay2  = findViewById(R.id.chest_day2);
        TextView chestDay2Perf = findViewById(R.id.chestday2performance);
        TextView chestDay3  = findViewById(R.id.chest_day3);
        TextView chestDay3Perf = findViewById(R.id.chestday3performance);
        TextView chestDay4  = findViewById(R.id.chest_day4);
        TextView chestDay4Perf = findViewById(R.id.chestday4performance);
        TextView chestDay5  = findViewById(R.id.chest_day5);
        TextView chestDay5Perf = findViewById(R.id.chestday5performance);
        TextView chestDay6  = findViewById(R.id.chest_day6);
        TextView chestDay7  = findViewById(R.id.chest_day7);
        TextView chestDay8  = findViewById(R.id.chest_day8);
        TextView chestDay8Perf = findViewById(R.id.chestday8performance);
        TextView chestDay9  = findViewById(R.id.chest_day9);
        TextView chestDay9Perf = findViewById(R.id.chestday9performance);
        TextView chestDay10  = findViewById(R.id.chest_day10);
        TextView chestDay10Perf = findViewById(R.id.chestday10performance);
        TextView chestDay11  = findViewById(R.id.chest_day11);
        TextView chestDay11Perf = findViewById(R.id.chestday11performance);
        TextView chestDay12  = findViewById(R.id.chest_day12);
        TextView chestDay12Perf = findViewById(R.id.chestday12performance);
        TextView chestDay13  = findViewById(R.id.chest_day13);
        TextView chestDay14  = findViewById(R.id.chest_day14);
        TextView chestDay15  = findViewById(R.id.chest_day15);
        TextView chestDay15Perf = findViewById(R.id.chestday15performance);
        TextView chestDay16  = findViewById(R.id.chest_day16);
        TextView chestDay16Perf = findViewById(R.id.chestday16performance);
        TextView chestDay17  = findViewById(R.id.chest_day17);
        TextView chestDay17Perf = findViewById(R.id.chestday17performance);
        TextView chestDay18  = findViewById(R.id.chest_day18);
        TextView chestDay18Perf = findViewById(R.id.chestday18performance);
        TextView chestDay19  = findViewById(R.id.chest_day19);
        TextView chestDay19Perf = findViewById(R.id.chestday19performance);
        TextView chestDay20  = findViewById(R.id.chest_day20);
        TextView chestDay21  = findViewById(R.id.chest_day21);
        TextView chestDay22  = findViewById(R.id.chest_day22);
        TextView chestDay22Perf = findViewById(R.id.chestday22performance);
        TextView chestDay23  = findViewById(R.id.chest_day23);
        TextView chestDay23Perf = findViewById(R.id.chestday23performance);
        TextView chestDay24  = findViewById(R.id.chest_day24);
        TextView chestDay24Perf = findViewById(R.id.chestday24performance);
        TextView chestDay25  = findViewById(R.id.chest_day25);
        TextView chestDay25Perf = findViewById(R.id.chestday25performance);
        TextView chestDay26  = findViewById(R.id.chest_day26);
        TextView chestDay26Perf = findViewById(R.id.chestday26performance);
        TextView chestDay27  = findViewById(R.id.chest_day27);
        TextView chestDay28  = findViewById(R.id.chest_day28);

        String chosenPlan = chestPlan.getText().toString();
        String caloriesToBurn = calories.getText().toString();
        day01 = chestDay1.getText().toString();
        day01performance = chestDay1Perf.getText().toString();
        day02 = chestDay2.getText().toString();
        day02performance = chestDay2Perf.getText().toString();
        day03 = chestDay3.getText().toString();
        day03performance = chestDay3Perf.getText().toString();
        day04 = chestDay4.getText().toString();
        day04performance = chestDay4Perf.getText().toString();
        day05 = chestDay5.getText().toString();
        day05performance = chestDay5Perf.getText().toString();
        day06 = chestDay6.getText().toString();
        day07 = chestDay7.getText().toString();
        day08 = chestDay8.getText().toString();
        day08performance = chestDay8Perf.getText().toString();
        day09 = chestDay9.getText().toString();
        day09performance = chestDay9Perf.getText().toString();
        day10 = chestDay10.getText().toString();
        day10performance = chestDay10Perf.getText().toString();
        day11 = chestDay11.getText().toString();
        day11performance = chestDay11Perf.getText().toString();
        day12 = chestDay12.getText().toString();
        day12performance = chestDay12Perf.getText().toString();
        day13 = chestDay13.getText().toString();
        day14 = chestDay14.getText().toString();
        day15 = chestDay15.getText().toString();
        day15performance = chestDay15Perf.getText().toString();
        day16 = chestDay16.getText().toString();
        day16performance = chestDay16Perf.getText().toString();
        day17 = chestDay17.getText().toString();
        day17performance = chestDay17Perf.getText().toString();
        day18 = chestDay18.getText().toString();
        day18performance = chestDay18Perf.getText().toString();
        day19 = chestDay19.getText().toString();
        day19performance = chestDay19Perf.getText().toString();
        day20 = chestDay20.getText().toString();
        day21 = chestDay21.getText().toString();
        day22 = chestDay22.getText().toString();
        day22performance = chestDay22Perf.getText().toString();
        day23 = chestDay23.getText().toString();
        day23performance = chestDay23Perf.getText().toString();
        day24 = chestDay24.getText().toString();
        day24performance = chestDay24Perf.getText().toString();
        day25 = chestDay25.getText().toString();
        day25performance = chestDay25Perf.getText().toString();
        day26 = chestDay26.getText().toString();
        day26performance = chestDay26Perf.getText().toString();
        day27 = chestDay27.getText().toString();
        day28 = chestDay28.getText().toString();


        UserPlan intensePlan = new UserPlan(caloriesToBurn, chosenPlan, day01, day01performance, day02, day02performance,
                day03, day03performance, day04, day04performance, day05, day05performance, day06, day07, day08, day08performance,
                day09, day09performance, day10, day10performance, day11, day11performance, day12, day12performance, day13, day14,
                day15, day15performance, day16, day16performance, day17, day17performance, day18, day18performance, day19, day19performance,
                day20, day21, day22, day22performance, day23, day23performance, day24, day24performance, day25, day25performance,
                day26, day26performance, day27, day28);

        DatabaseReference fireDB = FirebaseDatabase.getInstance().getReference("Users").child(Uid).child("Plan").push();

        fireDB.setValue(intensePlan);
    }


    public void goToWorkout(View view) {
        Intent intent = new Intent(IntenseChestPlan.this, WorkoutActivity.class);
        startActivity(intent);
    }

}