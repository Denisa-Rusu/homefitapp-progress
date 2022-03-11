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

public class OneMonthArmPlan extends AppCompatActivity {

    ArrayList<UserOneMonthPlan> plans;
    private FirebaseAuth mAuth;
    private String Uid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_month_arm_plan);

        Intent intent = getIntent();
        TextView oneMonthArmPlan = findViewById(R.id.one_month_arm_plan);
        oneMonthArmPlan.getText().toString();



        plans = new ArrayList<UserOneMonthPlan>();
        mAuth = FirebaseAuth.getInstance();
        Uid = mAuth.getCurrentUser().getUid();


        TextView armPlan = findViewById(R.id.one_month_arm_plan);
        TextView armDay1  = findViewById(R.id.arm_day1);
        TextView armDay2  = findViewById(R.id.arm_day2);
        TextView armDay3  = findViewById(R.id.arm_day3);
        TextView armDay4  = findViewById(R.id.arm_day4);
        TextView armDay5  = findViewById(R.id.arm_day5);
        TextView armDay6  = findViewById(R.id.arm_day6);
        TextView armDay7  = findViewById(R.id.arm_day7);
        TextView armDay8  = findViewById(R.id.arm_day8);
        TextView armDay9  = findViewById(R.id.arm_day9);
        TextView armDay10  = findViewById(R.id.arm_day10);
        TextView armDay11  = findViewById(R.id.arm_day11);
        TextView armDay12  = findViewById(R.id.arm_day12);
        TextView armDay13  = findViewById(R.id.arm_day13);
        TextView armDay14  = findViewById(R.id.arm_day14);
        TextView armDay15  = findViewById(R.id.arm_day15);
        TextView armDay16  = findViewById(R.id.arm_day16);
        TextView armDay17  = findViewById(R.id.arm_day17);
        TextView armDay18  = findViewById(R.id.arm_day18);
        TextView armDay19  = findViewById(R.id.arm_day19);
        TextView armDay20  = findViewById(R.id.arm_day20);
        TextView armDay21  = findViewById(R.id.arm_day21);
        TextView armDay22  = findViewById(R.id.arm_day22);
        TextView armDay23  = findViewById(R.id.arm_day23);
        TextView armDay24  = findViewById(R.id.arm_day24);
        TextView armDay25  = findViewById(R.id.arm_day25);
        TextView armDay26  = findViewById(R.id.arm_day26);
        TextView armDay27  = findViewById(R.id.arm_day27);
        TextView armDay28  = findViewById(R.id.arm_day28);

        String chosenPlan = armPlan.getText().toString();
        String day01 = armDay1.getText().toString();
        String day02 = armDay2.getText().toString();
        String day03 = armDay3.getText().toString();
        String day04 = armDay4.getText().toString();
        String day05 = armDay5.getText().toString();
        String day06 = armDay6.getText().toString();
        String day07 = armDay7.getText().toString();
        String day08 = armDay8.getText().toString();
        String day09 = armDay9.getText().toString();
        String day10 = armDay10.getText().toString();
        String day11 = armDay11.getText().toString();
        String day12 = armDay12.getText().toString();
        String day13 = armDay13.getText().toString();
        String day14 = armDay14.getText().toString();
        String day15 = armDay15.getText().toString();
        String day16 = armDay16.getText().toString();
        String day17 = armDay17.getText().toString();
        String day18 = armDay18.getText().toString();
        String day19 = armDay19.getText().toString();
        String day20 = armDay20.getText().toString();
        String day21 = armDay21.getText().toString();
        String day22 = armDay22.getText().toString();
        String day23 = armDay23.getText().toString();
        String day24 = armDay24.getText().toString();
        String day25 = armDay25.getText().toString();
        String day26 = armDay26.getText().toString();
        String day27 = armDay27.getText().toString();
        String day28 = armDay28.getText().toString();


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
                Intent intent = new Intent(OneMonthArmPlan.this, ProfileActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_progress:
                Intent intent1 = new Intent(OneMonthArmPlan.this, OneMonthProgress.class);
                startActivity(intent1);
                return true;
            case R.id.action_guide:
                Intent intent2 = new Intent(OneMonthArmPlan.this, ArmWorkoutGuide.class);
                startActivity(intent2);
                return true;
            case R.id.action_back:
                this.finish();


            default:

                return super.onOptionsItemSelected(item);
        }



    }
}