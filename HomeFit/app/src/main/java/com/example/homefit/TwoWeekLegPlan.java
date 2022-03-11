package com.example.homefit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class TwoWeekLegPlan extends AppCompatActivity {

    ArrayList<UserTwoWeekPlan> plans;
    private FirebaseAuth mAuth;
    private String Uid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_week_leg_plan);

        Intent intent = getIntent();
        TextView twoWeekLegPlan = findViewById(R.id.two_week_leg_plan);
        twoWeekLegPlan.getText().toString();


        plans = new ArrayList<UserTwoWeekPlan>();
        mAuth = FirebaseAuth.getInstance();
        Uid = mAuth.getCurrentUser().getUid();


        TextView legPlan = findViewById(R.id.two_week_leg_plan);
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


        UserTwoWeekPlan usertwoweekplan = new UserTwoWeekPlan(chosenPlan, day01, day02, day03, day04, day05, day06, day07,
                day08, day09, day10, day11, day12, day13, day14);

        DatabaseReference fireDB = FirebaseDatabase.getInstance().getReference("Users").child(Uid).child("Plan").push();

        fireDB.setValue(usertwoweekplan);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.secondary_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {


            case R.id.action_profile:
                Intent intent = new Intent(TwoWeekLegPlan.this, ProfileActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_progress:
                Intent intent1 = new Intent(TwoWeekLegPlan.this, TwoWeekProgress.class);
                startActivity(intent1);
                return true;
            case R.id.action_guide:
                Intent intent2 = new Intent(TwoWeekLegPlan.this, LegWorkoutGuide.class);
                startActivity(intent2);
                return true;
            case R.id.action_back:
                this.finish();


            default:

                return super.onOptionsItemSelected(item);
        }



    }
}