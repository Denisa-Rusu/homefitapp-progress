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

public class OneWeekGlutePlan extends AppCompatActivity {

    ArrayList<UserOneWeekPlan> plans;
    private FirebaseAuth mAuth;
    private String Uid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_week_glute_plan);

        Intent intent = getIntent();
        TextView oneWeekGlutePlan = findViewById(R.id.one_week_glute_plan);
        oneWeekGlutePlan.getText().toString();



        plans = new ArrayList<UserOneWeekPlan>();
        mAuth = FirebaseAuth.getInstance();
        Uid = mAuth.getCurrentUser().getUid();


        TextView glutePlan  = findViewById(R.id.one_week_glute_plan);
        TextView glutesDay1  = findViewById(R.id.glutes_day1);
        TextView glutesDay2  = findViewById(R.id.glutes_day2);
        TextView glutesDay3  = findViewById(R.id.glutes_day3);
        TextView glutesDay4  = findViewById(R.id.glutes_day4);
        TextView glutesDay5  = findViewById(R.id.glutes_day5);
        TextView glutesDay6  = findViewById(R.id.glutes_day6);
        TextView glutesDay7  = findViewById(R.id.glutes_day7);

        String chosenPlan = glutePlan.getText().toString();
        String day01 = glutesDay1.getText().toString();
        String day02 = glutesDay2.getText().toString();
        String day03 = glutesDay3.getText().toString();
        String day04 = glutesDay4.getText().toString();
        String day05 = glutesDay5.getText().toString();
        String day06 = glutesDay6.getText().toString();
        String day07 = glutesDay7.getText().toString();


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
                Intent intent = new Intent(OneWeekGlutePlan.this, ProfileActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_progress:
                Intent intent1 = new Intent(OneWeekGlutePlan.this, OneWeekProgress.class);
                startActivity(intent1);
            case R.id.action_guide:
                Intent intent2 = new Intent(OneWeekGlutePlan.this, GluteWorkoutGuide.class);
                startActivity(intent2);
                return true;
            case R.id.action_back:
                this.finish();


            default:

                return super.onOptionsItemSelected(item);
        }



    }
}