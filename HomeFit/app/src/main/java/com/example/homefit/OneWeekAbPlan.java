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

public class OneWeekAbPlan extends AppCompatActivity {

    ArrayList<UserOneWeekPlan> plans;
    private FirebaseAuth mAuth;
    private String Uid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_week_ab_plan);

        Intent intent = getIntent();
        TextView oneWeekAbPlan = findViewById(R.id.one_week_ab_plan);
        oneWeekAbPlan.getText().toString();


        plans = new ArrayList<UserOneWeekPlan>();
        mAuth = FirebaseAuth.getInstance();
        Uid = mAuth.getCurrentUser().getUid();


        TextView absPlan  = findViewById(R.id.one_week_ab_plan);
        TextView absDay1  = findViewById(R.id.abs_day1);
        TextView absDay2  = findViewById(R.id.abs_day2);
        TextView absDay3  = findViewById(R.id.abs_day3);
        TextView absDay4  = findViewById(R.id.abs_day4);
        TextView absDay5  = findViewById(R.id.abs_day5);
        TextView absDay6  = findViewById(R.id.abs_day6);
        TextView absDay7  = findViewById(R.id.abs_day7);

        String chosenPlan = absPlan.getText().toString();
        String day01 = absDay1.getText().toString();
        String day02 = absDay2.getText().toString();
        String day03 = absDay3.getText().toString();
        String day04 = absDay4.getText().toString();
        String day05 = absDay5.getText().toString();
        String day06 = absDay6.getText().toString();
        String day07 = absDay7.getText().toString();


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
                Intent intent = new Intent(OneWeekAbPlan.this, ProfileActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_progress:
                Intent intent1 = new Intent(OneWeekAbPlan.this, OneWeekProgress.class);
                startActivity(intent1);
                return true;
            case R.id.action_guide:
                Intent intent2 = new Intent(OneWeekAbPlan.this, AbWorkoutGuide.class);
                startActivity(intent2);
                return true;
            case R.id.action_back:
                this.finish();


            default:

                return super.onOptionsItemSelected(item);
        }



    }
}