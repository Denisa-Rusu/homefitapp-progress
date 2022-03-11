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

public class OneMonthAbPlan extends AppCompatActivity {

    ArrayList<UserOneMonthPlan> plans;
    private FirebaseAuth mAuth;
    private String Uid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_month_ab_plan);


        Intent intent = getIntent();
        TextView oneMonthAbPlan = findViewById(R.id.one_month_ab_plan);
        oneMonthAbPlan.getText().toString();


        plans = new ArrayList<UserOneMonthPlan>();
        mAuth = FirebaseAuth.getInstance();
        Uid = mAuth.getCurrentUser().getUid();


        TextView absPlan = findViewById(R.id.one_month_ab_plan);
        TextView absDay1  = findViewById(R.id.abs_day1);
        TextView absDay2  = findViewById(R.id.abs_day2);
        TextView absDay3  = findViewById(R.id.abs_day3);
        TextView absDay4  = findViewById(R.id.abs_day4);
        TextView absDay5  = findViewById(R.id.abs_day5);
        TextView absDay6  = findViewById(R.id.abs_day6);
        TextView absDay7  = findViewById(R.id.abs_day7);
        TextView absDay8  = findViewById(R.id.abs_day8);
        TextView absDay9  = findViewById(R.id.abs_day9);
        TextView absDay10  = findViewById(R.id.abs_day10);
        TextView absDay11  = findViewById(R.id.abs_day11);
        TextView absDay12  = findViewById(R.id.abs_day12);
        TextView absDay13  = findViewById(R.id.abs_day13);
        TextView absDay14  = findViewById(R.id.abs_day14);
        TextView absDay15  = findViewById(R.id.abs_day15);
        TextView absDay16  = findViewById(R.id.abs_day16);
        TextView absDay17  = findViewById(R.id.abs_day17);
        TextView absDay18  = findViewById(R.id.abs_day18);
        TextView absDay19  = findViewById(R.id.abs_day19);
        TextView absDay20  = findViewById(R.id.abs_day20);
        TextView absDay21  = findViewById(R.id.abs_day21);
        TextView absDay22  = findViewById(R.id.abs_day22);
        TextView absDay23  = findViewById(R.id.abs_day23);
        TextView absDay24  = findViewById(R.id.abs_day24);
        TextView absDay25  = findViewById(R.id.abs_day25);
        TextView absDay26  = findViewById(R.id.abs_day26);
        TextView absDay27  = findViewById(R.id.abs_day27);
        TextView absDay28  = findViewById(R.id.abs_day28);

        String chosenPlan = absPlan.getText().toString();
        String day01 = absDay1.getText().toString();
        String day02 = absDay2.getText().toString();
        String day03 = absDay3.getText().toString();
        String day04 = absDay4.getText().toString();
        String day05 = absDay5.getText().toString();
        String day06 = absDay6.getText().toString();
        String day07 = absDay7.getText().toString();
        String day08 = absDay8.getText().toString();
        String day09 = absDay9.getText().toString();
        String day10 = absDay10.getText().toString();
        String day11 = absDay11.getText().toString();
        String day12 = absDay12.getText().toString();
        String day13 = absDay13.getText().toString();
        String day14 = absDay14.getText().toString();
        String day15 = absDay15.getText().toString();
        String day16 = absDay16.getText().toString();
        String day17 = absDay17.getText().toString();
        String day18 = absDay18.getText().toString();
        String day19 = absDay19.getText().toString();
        String day20 = absDay20.getText().toString();
        String day21 = absDay21.getText().toString();
        String day22 = absDay22.getText().toString();
        String day23 = absDay23.getText().toString();
        String day24 = absDay24.getText().toString();
        String day25 = absDay25.getText().toString();
        String day26 = absDay26.getText().toString();
        String day27 = absDay27.getText().toString();
        String day28 = absDay28.getText().toString();


        UserOneMonthPlan useronemonthplan = new UserOneMonthPlan(chosenPlan, day01, day02, day03, day04, day05, day06, day07,
                day08, day09, day10, day11, day12, day13, day14, day15, day16, day17, day18, day19, day20, day21,
                day22, day23, day24, day25, day26, day27, day28);

        DatabaseReference fireDB = FirebaseDatabase.getInstance().getReference("Users").child(Uid).child("Plan").push();

        fireDB.setValue(useronemonthplan);
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
                Intent intent = new Intent(OneMonthAbPlan.this, ProfileActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_progress:
                Intent intent1 = new Intent(OneMonthAbPlan.this, OneMonthProgress.class);
                startActivity(intent1);
                return true;
            case R.id.action_guide:
                Intent intent2 = new Intent(OneMonthAbPlan.this, AbWorkoutGuide.class);
                startActivity(intent2);
                return true;
            case R.id.action_back:
                this.finish();


            default:

                return super.onOptionsItemSelected(item);
        }



    }
}