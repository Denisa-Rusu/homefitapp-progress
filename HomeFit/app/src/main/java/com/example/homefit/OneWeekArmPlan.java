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

public class OneWeekArmPlan extends AppCompatActivity {

    ArrayList<UserOneWeekPlan> plans;
    private FirebaseAuth mAuth;
    private String Uid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_week_arm_plan);

        Intent intent = getIntent();

        TextView oneWeekArmPlan = findViewById(R.id.one_week_arm_plan);
        oneWeekArmPlan.getText().toString();


        plans = new ArrayList<UserOneWeekPlan>();
        mAuth = FirebaseAuth.getInstance();
        Uid = mAuth.getCurrentUser().getUid();


        TextView armPlan = findViewById(R.id.one_week_arm_plan);
        TextView armDay1  = findViewById(R.id.arm_day1);
        TextView armDay2  = findViewById(R.id.arm_day2);
        TextView armDay3  = findViewById(R.id.arm_day3);
        TextView armDay4  = findViewById(R.id.arm_day4);
        TextView armDay5  = findViewById(R.id.arm_day5);
        TextView armDay6  = findViewById(R.id.arm_day6);
        TextView armDay7  = findViewById(R.id.arm_day7);

        String chosenPlan = armPlan.getText().toString();
        String day01 = armDay1.getText().toString();
        String day02 = armDay2.getText().toString();
        String day03 = armDay3.getText().toString();
        String day04 = armDay4.getText().toString();
        String day05 = armDay5.getText().toString();
        String day06 = armDay6.getText().toString();
        String day07 = armDay7.getText().toString();


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
                Intent intent = new Intent(OneWeekArmPlan.this, ProfileActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_progress:
                Intent intent1 = new Intent(OneWeekArmPlan.this, OneWeekProgress.class);
                startActivity(intent1);
                return true;
            case R.id.action_guide:
                Intent intent2 = new Intent(OneWeekArmPlan.this, ArmWorkoutGuide.class);
                startActivity(intent2);
                return true;
            case R.id.action_back:
                this.finish();


            default:

                return super.onOptionsItemSelected(item);
        }



    }
}