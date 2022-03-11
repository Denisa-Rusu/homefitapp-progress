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

public class OneWeekChestPlan extends AppCompatActivity {

    ArrayList<UserOneWeekPlan> plans;
    private FirebaseAuth mAuth;
    private String Uid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_week_chest_plan);

        Intent intent = getIntent();
        TextView oneWeekChestPlan = findViewById(R.id.one_week_chest_plan);
        oneWeekChestPlan.getText().toString();


        plans = new ArrayList<UserOneWeekPlan>();
        mAuth = FirebaseAuth.getInstance();
        Uid = mAuth.getCurrentUser().getUid();


        TextView chestPlan  = findViewById(R.id.one_week_chest_plan);
        TextView chestDay1  = findViewById(R.id.chest_day1);
        TextView chestDay2  = findViewById(R.id.chest_day2);
        TextView chestDay3  = findViewById(R.id.chest_day3);
        TextView chestDay4  = findViewById(R.id.chest_day4);
        TextView chestDay5  = findViewById(R.id.chest_day5);
        TextView chestDay6  = findViewById(R.id.chest_day6);
        TextView chestDay7  = findViewById(R.id.chest_day7);

        String chosenPlan = chestPlan.getText().toString();
        String day01 = chestDay1.getText().toString();
        String day02 = chestDay2.getText().toString();
        String day03 = chestDay3.getText().toString();
        String day04 = chestDay4.getText().toString();
        String day05 = chestDay5.getText().toString();
        String day06 = chestDay6.getText().toString();
        String day07 = chestDay7.getText().toString();


        UserOneWeekPlan useroneweekplan = new UserOneWeekPlan(chosenPlan, day01, day02, day03, day04, day05, day06, day07);

        DatabaseReference fireDB = FirebaseDatabase.getInstance().getReference("Users").child(Uid).child("Plan").push();

        fireDB.setValue(useroneweekplan);
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
                Intent intent = new Intent(OneWeekChestPlan.this, ProfileActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_progress:
                Intent intent1 = new Intent(OneWeekChestPlan.this, OneWeekProgress.class);
                startActivity(intent1);
                return true;
            case R.id.action_guide:
                Intent intent2 = new Intent(OneWeekChestPlan.this, ChestWorkoutGuide.class);
                startActivity(intent2);
                return true;
            case R.id.action_back:
                this.finish();


            default:

                return super.onOptionsItemSelected(item);
        }



    }
}