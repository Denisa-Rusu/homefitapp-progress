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

import org.w3c.dom.Text;

import java.util.ArrayList;

public class BeginnerGlutePlan extends AppCompatActivity {

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
        setContentView(R.layout.activity_beginner_glute_plan);

        Intent intent = getIntent();
        TextView beginnerGlutePlan = findViewById(R.id.beginner_glute_plan);
        beginnerGlutePlan.getText().toString();

        plans = new ArrayList<UserPlan>();
        mAuth = FirebaseAuth.getInstance();
        Uid = mAuth.getCurrentUser().getUid();

        TextView glutePlan = findViewById(R.id.beginner_glute_plan);
        TextView calories = findViewById(R.id.begcalories);
        TextView glutesDay1 = findViewById(R.id.glutes_day1);
        TextView glutesDay1Perf = findViewById(R.id.glutesday1performance);
        TextView glutesDay2 = findViewById(R.id.glutes_day2);
        TextView glutesDay2Perf = findViewById(R.id.glutesday2performance);
        TextView glutesDay3 = findViewById(R.id.glutes_day3);
        TextView glutesDay3Perf = findViewById(R.id.glutesday3performance);
        TextView glutesDay4 = findViewById(R.id.glutes_day4);
        TextView glutesDay4Perf = findViewById(R.id.glutesday4performance);
        TextView glutesDay5 = findViewById(R.id.glutes_day5);
        TextView glutesDay5Perf = findViewById(R.id.glutesday5performance);
        TextView glutesDay6 = findViewById(R.id.glutes_day6);
        TextView glutesDay7 = findViewById(R.id.glutes_day7);
        TextView glutesDay8 = findViewById(R.id.glutes_day8);
        TextView glutesDay8Perf = findViewById(R.id.glutesday8performance);
        TextView glutesDay9 = findViewById(R.id.glutes_day9);
        TextView glutesDay9Perf = findViewById(R.id.glutesday9performance);
        TextView glutesDay10 = findViewById(R.id.glutes_day10);
        TextView glutesDay10Perf = findViewById(R.id.glutesday10performance);
        TextView glutesDay11 = findViewById(R.id.glutes_day11);
        TextView glutesDay11Perf = findViewById(R.id.glutesday11performance);
        TextView glutesDay12 = findViewById(R.id.glutes_day12);
        TextView glutesDay12Perf = findViewById(R.id.glutesday12performance);
        TextView glutesDay13 = findViewById(R.id.glutes_day13);
        TextView glutesDay14 = findViewById(R.id.glutes_day14);
        TextView glutesDay15 = findViewById(R.id.glutes_day15);
        TextView glutesDay15Perf = findViewById(R.id.glutesday15performance);
        TextView glutesDay16 = findViewById(R.id.glutes_day16);
        TextView glutesDay16Perf = findViewById(R.id.glutesday16performance);
        TextView glutesDay17 = findViewById(R.id.glutes_day17);
        TextView glutesDay17Perf = findViewById(R.id.glutesday17performance);
        TextView glutesDay18 = findViewById(R.id.glutes_day18);
        TextView glutesDay18Perf = findViewById(R.id.glutesday18performance);
        TextView glutesDay19 = findViewById(R.id.glutes_day19);
        TextView glutesDay19Perf = findViewById(R.id.glutesday19performance);
        TextView glutesDay20 = findViewById(R.id.glutes_day20);
        TextView glutesDay21 = findViewById(R.id.glutes_day21);
        TextView glutesDay22 = findViewById(R.id.glutes_day22);
        TextView glutesDay22Perf = findViewById(R.id.glutesday22performance);
        TextView glutesDay23 = findViewById(R.id.glutes_day23);
        TextView glutesDay23Perf = findViewById(R.id.glutesday23performance);
        TextView glutesDay24 = findViewById(R.id.glutes_day24);
        TextView glutesDay24Perf = findViewById(R.id.glutesday24performance);
        TextView glutesDay25 = findViewById(R.id.glutes_day25);
        TextView glutesDay25Perf = findViewById(R.id.glutesday25performance);
        TextView glutesDay26 = findViewById(R.id.glutes_day26);
        TextView glutesDay26Perf = findViewById(R.id.glutesday26performance);
        TextView glutesDay27 = findViewById(R.id.glutes_day27);
        TextView glutesDay28 = findViewById(R.id.glutes_day28);

        String chosenPlan = glutePlan.getText().toString();
        String caloriesToBurn = calories.getText().toString();
        day01 = glutesDay1.getText().toString();
        day01performance = glutesDay1Perf.getText().toString();
        day02 = glutesDay2.getText().toString();
        day02performance = glutesDay2Perf.getText().toString();
        day03 = glutesDay3.getText().toString();
        day03performance = glutesDay3Perf.getText().toString();
        day04 = glutesDay4.getText().toString();
        day04performance = glutesDay4Perf.getText().toString();
        day05 = glutesDay5.getText().toString();
        day05performance = glutesDay5Perf.getText().toString();
        day06 = glutesDay6.getText().toString();
        day07 = glutesDay7.getText().toString();
        day08 = glutesDay8.getText().toString();
        day08performance = glutesDay8Perf.getText().toString();
        day09 = glutesDay9.getText().toString();
        day09performance = glutesDay9Perf.getText().toString();
        day10 = glutesDay10.getText().toString();
        day10performance = glutesDay10Perf.getText().toString();
        day11 = glutesDay11.getText().toString();
        day11performance = glutesDay11Perf.getText().toString();
        day12 = glutesDay12.getText().toString();
        day12performance = glutesDay12Perf.getText().toString();
        day13 = glutesDay13.getText().toString();
        day14 = glutesDay14.getText().toString();
        day15 = glutesDay15.getText().toString();
        day15performance = glutesDay15Perf.getText().toString();
        day16 = glutesDay16.getText().toString();
        day16performance = glutesDay16Perf.getText().toString();
        day17 = glutesDay17.getText().toString();
        day17performance = glutesDay17Perf.getText().toString();
        day18 = glutesDay18.getText().toString();
        day18performance = glutesDay18Perf.getText().toString();
        day19 = glutesDay19.getText().toString();
        day19performance = glutesDay19Perf.getText().toString();
        day20 = glutesDay20.getText().toString();
        day21 = glutesDay21.getText().toString();
        day22 = glutesDay22.getText().toString();
        day22performance = glutesDay22Perf.getText().toString();
        day23 = glutesDay23.getText().toString();
        day23performance = glutesDay23Perf.getText().toString();
        day24 = glutesDay24.getText().toString();
        day24performance = glutesDay24Perf.getText().toString();
        day25 = glutesDay25.getText().toString();
        day25performance = glutesDay25Perf.getText().toString();
        day26 = glutesDay26.getText().toString();
        day26performance = glutesDay26Perf.getText().toString();
        day27 = glutesDay27.getText().toString();
        day28 = glutesDay28.getText().toString();

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
        Intent intent = new Intent(BeginnerGlutePlan.this, WorkoutActivity.class);
        startActivity(intent);
    }

}