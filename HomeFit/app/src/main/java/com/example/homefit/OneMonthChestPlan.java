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

public class OneMonthChestPlan extends AppCompatActivity {

    ArrayList<UserOneMonthPlan> plans;
    private FirebaseAuth mAuth;
    private String Uid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_month_chest_plan);

        Intent intent = getIntent();
        TextView oneMonthChestPlan = findViewById(R.id.one_month_chest_plan);
        oneMonthChestPlan.getText().toString();


        plans = new ArrayList<UserOneMonthPlan>();
        mAuth = FirebaseAuth.getInstance();
        Uid = mAuth.getCurrentUser().getUid();


        TextView chestPlan = findViewById(R.id.one_month_chest_plan);
        TextView chestDay1  = findViewById(R.id.chest_day1);
        TextView chestDay2  = findViewById(R.id.chest_day2);
        TextView chestDay3  = findViewById(R.id.chest_day3);
        TextView chestDay4  = findViewById(R.id.chest_day4);
        TextView chestDay5  = findViewById(R.id.chest_day5);
        TextView chestDay6  = findViewById(R.id.chest_day6);
        TextView chestDay7  = findViewById(R.id.chest_day7);
        TextView chestDay8  = findViewById(R.id.chest_day8);
        TextView chestDay9  = findViewById(R.id.chest_day9);
        TextView chestDay10  = findViewById(R.id.chest_day10);
        TextView chestDay11  = findViewById(R.id.chest_day11);
        TextView chestDay12  = findViewById(R.id.chest_day12);
        TextView chestDay13  = findViewById(R.id.chest_day13);
        TextView chestDay14  = findViewById(R.id.chest_day14);
        TextView chestDay15  = findViewById(R.id.chest_day15);
        TextView chestDay16  = findViewById(R.id.chest_day16);
        TextView chestDay17  = findViewById(R.id.chest_day17);
        TextView chestDay18  = findViewById(R.id.chest_day18);
        TextView chestDay19  = findViewById(R.id.chest_day19);
        TextView chestDay20  = findViewById(R.id.chest_day20);
        TextView chestDay21  = findViewById(R.id.chest_day21);
        TextView chestDay22  = findViewById(R.id.chest_day22);
        TextView chestDay23  = findViewById(R.id.chest_day23);
        TextView chestDay24  = findViewById(R.id.chest_day24);
        TextView chestDay25  = findViewById(R.id.chest_day25);
        TextView chestDay26  = findViewById(R.id.chest_day26);
        TextView chestDay27  = findViewById(R.id.chest_day27);
        TextView chestDay28  = findViewById(R.id.chest_day28);

        String chosenPlan = chestPlan.getText().toString();
        String day01 = chestDay1.getText().toString();
        String day02 = chestDay2.getText().toString();
        String day03 = chestDay3.getText().toString();
        String day04 = chestDay4.getText().toString();
        String day05 = chestDay5.getText().toString();
        String day06 = chestDay6.getText().toString();
        String day07 = chestDay7.getText().toString();
        String day08 = chestDay8.getText().toString();
        String day09 = chestDay9.getText().toString();
        String day10 = chestDay10.getText().toString();
        String day11 = chestDay11.getText().toString();
        String day12 = chestDay12.getText().toString();
        String day13 = chestDay13.getText().toString();
        String day14 = chestDay14.getText().toString();
        String day15 = chestDay15.getText().toString();
        String day16 = chestDay16.getText().toString();
        String day17 = chestDay17.getText().toString();
        String day18 = chestDay18.getText().toString();
        String day19 = chestDay19.getText().toString();
        String day20 = chestDay20.getText().toString();
        String day21 = chestDay21.getText().toString();
        String day22 = chestDay22.getText().toString();
        String day23 = chestDay23.getText().toString();
        String day24 = chestDay24.getText().toString();
        String day25 = chestDay25.getText().toString();
        String day26 = chestDay26.getText().toString();
        String day27 = chestDay27.getText().toString();
        String day28 = chestDay28.getText().toString();


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
                Intent intent = new Intent(OneMonthChestPlan.this, ProfileActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_progress:
                Intent intent1 = new Intent(OneMonthChestPlan.this, OneMonthProgress.class);
                startActivity(intent1);
                return true;
            case R.id.action_guide:
                Intent intent2 = new Intent(OneMonthChestPlan.this, ChestWorkoutGuide.class);
                startActivity(intent2);
                return true;
            case R.id.action_back:
                this.finish();


            default:

                return super.onOptionsItemSelected(item);
        }



    }
}