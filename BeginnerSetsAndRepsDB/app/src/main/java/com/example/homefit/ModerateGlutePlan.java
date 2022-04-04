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

public class ModerateGlutePlan extends AppCompatActivity {

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


    ArrayList<UserModeratePlan> plans;
    private FirebaseAuth mAuth;
    private String Uid;

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
        setContentView(R.layout.activity_moderate_glute_plan);

        Intent intent = getIntent();
        TextView moderateGlutePlan = findViewById(R.id.moderate_glute_plan);
        moderateGlutePlan.getText().toString();


        plans = new ArrayList<UserModeratePlan>();
        mAuth = FirebaseAuth.getInstance();
        Uid = mAuth.getCurrentUser().getUid();


        TextView glutePlan = findViewById(R.id.moderate_glute_plan);
        TextView glutesDay1  = findViewById(R.id.glutes_day1);
        TextView glutesDay2  = findViewById(R.id.glutes_day2);
        TextView glutesDay3  = findViewById(R.id.glutes_day3);
        TextView glutesDay4  = findViewById(R.id.glutes_day4);
        TextView glutesDay5  = findViewById(R.id.glutes_day5);
        TextView glutesDay6  = findViewById(R.id.glutes_day6);
        TextView glutesDay7  = findViewById(R.id.glutes_day7);
        TextView glutesDay8  = findViewById(R.id.glutes_day8);
        TextView glutesDay9  = findViewById(R.id.glutes_day9);
        TextView glutesDay10  = findViewById(R.id.glutes_day10);
        TextView glutesDay11  = findViewById(R.id.glutes_day11);
        TextView glutesDay12  = findViewById(R.id.glutes_day12);
        TextView glutesDay13  = findViewById(R.id.glutes_day13);
        TextView glutesDay14  = findViewById(R.id.glutes_day14);
        TextView glutesDay15  = findViewById(R.id.glutes_day15);
        TextView glutesDay16  = findViewById(R.id.glutes_day16);
        TextView glutesDay17  = findViewById(R.id.glutes_day17);
        TextView glutesDay18  = findViewById(R.id.glutes_day18);
        TextView glutesDay19  = findViewById(R.id.glutes_day19);
        TextView glutesDay20  = findViewById(R.id.glutes_day20);
        TextView glutesDay21  = findViewById(R.id.glutes_day21);
        TextView glutesDay22  = findViewById(R.id.glutes_day22);
        TextView glutesDay23  = findViewById(R.id.glutes_day23);
        TextView glutesDay24  = findViewById(R.id.glutes_day24);
        TextView glutesDay25  = findViewById(R.id.glutes_day25);
        TextView glutesDay26  = findViewById(R.id.glutes_day26);
        TextView glutesDay27  = findViewById(R.id.glutes_day27);
        TextView glutesDay28  = findViewById(R.id.glutes_day28);

        String chosenPlan = glutePlan.getText().toString();
        day01 = glutesDay1.getText().toString();
        day02 = glutesDay2.getText().toString();
        day03 = glutesDay3.getText().toString();
        day04 = glutesDay4.getText().toString();
        day05 = glutesDay5.getText().toString();
        day06 = glutesDay6.getText().toString();
        day07 = glutesDay7.getText().toString();
        day08 = glutesDay8.getText().toString();
        day09 = glutesDay9.getText().toString();
        day10 = glutesDay10.getText().toString();
        day11 = glutesDay11.getText().toString();
        day12 = glutesDay12.getText().toString();
        day13 = glutesDay13.getText().toString();
        day14 = glutesDay14.getText().toString();
        day15 = glutesDay15.getText().toString();
        day16 = glutesDay16.getText().toString();
        day17 = glutesDay17.getText().toString();
        day18 = glutesDay18.getText().toString();
        day19 = glutesDay19.getText().toString();
        day20 = glutesDay20.getText().toString();
        day21 = glutesDay21.getText().toString();
        day22 = glutesDay22.getText().toString();
        day23 = glutesDay23.getText().toString();
        day24 = glutesDay24.getText().toString();
        day25 = glutesDay25.getText().toString();
        day26 = glutesDay26.getText().toString();
        day27 = glutesDay27.getText().toString();
        day28 = glutesDay28.getText().toString();


        UserModeratePlan moderatePlan = new UserModeratePlan(chosenPlan, day01, day02, day03, day04, day05, day06, day07,
                day08, day09, day10, day11, day12, day13, day14, day15, day16, day17, day18, day19, day20, day21,
                day22, day23, day24, day25, day26, day27, day28);

        DatabaseReference fireDB = FirebaseDatabase.getInstance().getReference("Users").child(Uid).child("Plan").push();

        fireDB.setValue(moderatePlan);
    }


    public void goToWorkout(View view) {
        Intent intent = new Intent(ModerateGlutePlan.this, WorkoutActivity.class);
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