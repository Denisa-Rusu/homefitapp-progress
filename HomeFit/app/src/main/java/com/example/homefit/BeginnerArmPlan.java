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

public class BeginnerArmPlan extends AppCompatActivity {


    public static final String key0 = "CHOSEN_PLAN";
    public static final String key1 = "DAY01";
    public static final String key2 = "DAY02";
    public static final String key3 = "DAY03";
    public static final String key4 = "DAY04";
    public static final String key5 = "DAY05";
    public static final String key6 = "DAY06";
    public static final String key7 = "DAY07";
    public static final String key8 = "DAY08";
    public static final String key9 = "DAY09";
    public static final String key10 = "DAY10";
    public static final String key11 = "DAY11";
    public static final String key12 = "DAY12";
    public static final String key13 = "DAY13";
    public static final String key14 = "DAY14";
    public static final String key15 = "DAY15";
    public static final String key16 = "DAY16";
    public static final String key17 = "DAY17";
    public static final String key18 = "DAY18";
    public static final String key19 = "DAY19";
    public static final String key20 = "DAY20";
    public static final String key21 = "DAY21";
    public static final String key22 = "DAY22";
    public static final String key23 = "DAY23";
    public static final String key24 = "DAY24";
    public static final String key25 = "DAY25";
    public static final String key26 = "DAY26";
    public static final String key27 = "DAY27";
    public static final String key28 = "DAY28";


    ArrayList<UserBeginnerPlan> plans;
    private FirebaseAuth mAuth;
    private String Uid;


    String chosenPlan;
    String day01;
    String day02;
    String day03;
    String day04;
    String day05;
    String day06;
    String day07;
    String day08;
    String day09;
    String day10;
    String day11;
    String day12;
    String day13;
    String day14;
    String day15;
    String day16;
    String day17;
    String day18;
    String day19;
    String day20;
    String day21;
    String day22;
    String day23;
    String day24;
    String day25;
    String day26;
    String day27;
    String day28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner_arm_plan);

        Intent intent = getIntent();

        TextView beginnerArmPlan = findViewById(R.id.beginner_arm_plan);
        beginnerArmPlan.getText().toString();


        plans = new ArrayList<UserBeginnerPlan>();
        mAuth = FirebaseAuth.getInstance();
        Uid = mAuth.getCurrentUser().getUid();


        TextView armPlan = findViewById(R.id.beginner_arm_plan);
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

        chosenPlan = armPlan.getText().toString();
        day01 = armDay1.getText().toString();
        day02 = armDay2.getText().toString();
        day03 = armDay3.getText().toString();
        day04 = armDay4.getText().toString();
        day05 = armDay5.getText().toString();
        day06 = armDay6.getText().toString();
        day07 = armDay7.getText().toString();
        day08 = armDay8.getText().toString();
        day09 = armDay9.getText().toString();
        day10 = armDay10.getText().toString();
        day11 = armDay11.getText().toString();
        day12 = armDay12.getText().toString();
        day13 = armDay13.getText().toString();
        day14 = armDay14.getText().toString();
        day15 = armDay15.getText().toString();
        day16 = armDay16.getText().toString();
        day17 = armDay17.getText().toString();
        day18 = armDay18.getText().toString();
        day19 = armDay19.getText().toString();
        day20 = armDay20.getText().toString();
        day21 = armDay21.getText().toString();
        day22 = armDay22.getText().toString();
        day23 = armDay23.getText().toString();
        day24 = armDay24.getText().toString();
        day25 = armDay25.getText().toString();
        day26 = armDay26.getText().toString();
        day27 = armDay27.getText().toString();
        day28 = armDay28.getText().toString();


        UserBeginnerPlan beginnerplan = new UserBeginnerPlan(chosenPlan, day01, day02, day03, day04, day05, day06, day07,
                day08, day09, day10, day11, day12, day13, day14, day15, day16, day17, day18, day19, day20, day21,
                day22, day23, day24, day25, day26, day27, day28);

        DatabaseReference fireDB = FirebaseDatabase.getInstance().getReference("Users").child(Uid).child("Plan").push();

        fireDB.setValue(beginnerplan);
    }

    public void goToWorkout(View view) {
        Intent intent = new Intent(BeginnerArmPlan.this, WorkoutActivity.class);
        intent.putExtra(key0, chosenPlan);
        intent.putExtra(key1, day01);
        intent.putExtra(key2, day02);
        intent.putExtra(key3, day03);
        intent.putExtra(key4, day04);
        intent.putExtra(key5, day05);
        intent.putExtra(key6, day06);
        intent.putExtra(key7, day07);
        intent.putExtra(key8, day08);
        intent.putExtra(key9, day09);
        intent.putExtra(key10, day10);
        intent.putExtra(key11, day11);
        intent.putExtra(key12, day12);
        intent.putExtra(key13, day13);
        intent.putExtra(key14, day14);
        intent.putExtra(key15, day15);
        intent.putExtra(key16, day16);
        intent.putExtra(key17, day17);
        intent.putExtra(key18, day18);
        intent.putExtra(key19, day19);
        intent.putExtra(key20, day20);
        intent.putExtra(key21, day21);
        intent.putExtra(key22, day22);
        intent.putExtra(key23, day23);
        intent.putExtra(key24, day24);
        intent.putExtra(key25, day25);
        intent.putExtra(key26, day26);
        intent.putExtra(key27, day27);
        intent.putExtra(key28, day28);
        startActivity(intent);
    }


}