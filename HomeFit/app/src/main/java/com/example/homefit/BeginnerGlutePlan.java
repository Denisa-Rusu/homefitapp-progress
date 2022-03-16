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

public class BeginnerGlutePlan extends AppCompatActivity {

    ArrayList<UserBeginnerPlan> plans;
    private FirebaseAuth mAuth;
    private String Uid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner_glute_plan);

        Intent intent = getIntent();
        TextView beginnerGlutePlan = findViewById(R.id.beginner_glute_plan);
        beginnerGlutePlan.getText().toString();


        plans = new ArrayList<UserBeginnerPlan>();
        mAuth = FirebaseAuth.getInstance();
        Uid = mAuth.getCurrentUser().getUid();


        TextView glutePlan = findViewById(R.id.beginner_glute_plan);
        TextView glutesDay1 = findViewById(R.id.glutes_day1);
        TextView glutesDay2 = findViewById(R.id.glutes_day2);
        TextView glutesDay3 = findViewById(R.id.glutes_day3);
        TextView glutesDay4 = findViewById(R.id.glutes_day4);
        TextView glutesDay5 = findViewById(R.id.glutes_day5);
        TextView glutesDay6 = findViewById(R.id.glutes_day6);
        TextView glutesDay7 = findViewById(R.id.glutes_day7);
        TextView glutesDay8 = findViewById(R.id.glutes_day8);
        TextView glutesDay9 = findViewById(R.id.glutes_day9);
        TextView glutesDay10 = findViewById(R.id.glutes_day10);
        TextView glutesDay11 = findViewById(R.id.glutes_day11);
        TextView glutesDay12 = findViewById(R.id.glutes_day12);
        TextView glutesDay13 = findViewById(R.id.glutes_day13);
        TextView glutesDay14 = findViewById(R.id.glutes_day14);
        TextView glutesDay15 = findViewById(R.id.glutes_day15);
        TextView glutesDay16 = findViewById(R.id.glutes_day16);
        TextView glutesDay17 = findViewById(R.id.glutes_day17);
        TextView glutesDay18 = findViewById(R.id.glutes_day18);
        TextView glutesDay19 = findViewById(R.id.glutes_day19);
        TextView glutesDay20 = findViewById(R.id.glutes_day20);
        TextView glutesDay21 = findViewById(R.id.glutes_day21);
        TextView glutesDay22 = findViewById(R.id.glutes_day22);
        TextView glutesDay23 = findViewById(R.id.glutes_day23);
        TextView glutesDay24 = findViewById(R.id.glutes_day24);
        TextView glutesDay25 = findViewById(R.id.glutes_day25);
        TextView glutesDay26 = findViewById(R.id.glutes_day26);
        TextView glutesDay27 = findViewById(R.id.glutes_day27);
        TextView glutesDay28 = findViewById(R.id.glutes_day28);

        String chosenPlan = glutePlan.getText().toString();
        String day01 = glutesDay1.getText().toString();
        String day02 = glutesDay2.getText().toString();
        String day03 = glutesDay3.getText().toString();
        String day04 = glutesDay4.getText().toString();
        String day05 = glutesDay5.getText().toString();
        String day06 = glutesDay6.getText().toString();
        String day07 = glutesDay7.getText().toString();
        String day08 = glutesDay8.getText().toString();
        String day09 = glutesDay9.getText().toString();
        String day10 = glutesDay10.getText().toString();
        String day11 = glutesDay11.getText().toString();
        String day12 = glutesDay12.getText().toString();
        String day13 = glutesDay13.getText().toString();
        String day14 = glutesDay14.getText().toString();
        String day15 = glutesDay15.getText().toString();
        String day16 = glutesDay16.getText().toString();
        String day17 = glutesDay17.getText().toString();
        String day18 = glutesDay18.getText().toString();
        String day19 = glutesDay19.getText().toString();
        String day20 = glutesDay20.getText().toString();
        String day21 = glutesDay21.getText().toString();
        String day22 = glutesDay22.getText().toString();
        String day23 = glutesDay23.getText().toString();
        String day24 = glutesDay24.getText().toString();
        String day25 = glutesDay25.getText().toString();
        String day26 = glutesDay26.getText().toString();
        String day27 = glutesDay27.getText().toString();
        String day28 = glutesDay28.getText().toString();


        UserBeginnerPlan beginnerPlan = new UserBeginnerPlan(chosenPlan, day01, day02, day03, day04, day05, day06, day07,
                day08, day09, day10, day11, day12, day13, day14, day15, day16, day17, day18, day19, day20, day21,
                day22, day23, day24, day25, day26, day27, day28);

        DatabaseReference fireDB = FirebaseDatabase.getInstance().getReference("Users").child(Uid).child("Plan").push();

        fireDB.setValue(beginnerPlan);
    }

    public void goToWorkout(View view) {
        Intent intent = new Intent(BeginnerGlutePlan.this, WorkoutActivity.class);
        startActivity(intent);
    }

}