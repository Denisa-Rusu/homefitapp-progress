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

public class IntenseGlutePlan extends AppCompatActivity {

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
    public static final String key1performance = "DAY01PERFORMANCE";
    public static final String key2performance = "DAY02PERFORMANCE";
    public static final String key3performance = "DAY03PERFORMANCE";
    public static final String key4performance = "DAY04PERFORMANCE";
    public static final String key5performance = "DAY05PERFORMANCE";
    public static final String key8performance = "DAY08PERFORMANCE";
    public static final String key9performance = "DAY09PERFORMANCE";
    public static final String key10performance = "DAY10PERFORMANCE";
    public static final String key11performance = "DAY11PERFORMANCE";
    public static final String key12performance = "DAY12PERFORMANCE";
    public static final String key15performance = "DAY15PERFORMANCE";
    public static final String key16performance = "DAY16PERFORMANCE";
    public static final String key17performance = "DAY17PERFORMANCE";
    public static final String key18performance = "DAY18PERFORMANCE";
    public static final String key19performance = "DAY19PERFORMANCE";
    public static final String key22performance = "DAY22PERFORMANCE";
    public static final String key23performance = "DAY23PERFORMANCE";
    public static final String key24performance = "DAY24PERFORMANCE";
    public static final String key25performance = "DAY25PERFORMANCE";
    public static final String key26performance = "DAY26PERFORMANCE";

    ArrayList<UserPlan> plans;
    private FirebaseAuth mAuth;
    private String Uid;

    String day01;
    String day01performance;
    String day02;
    String day02performance;
    String day03;
    String day03performance;
    String day04;
    String day04performance;
    String day05;
    String day05performance;
    String day06;
    String day07;
    String day08;
    String day08performance;
    String day09;
    String day09performance;
    String day10;
    String day10performance;
    String day11;
    String day11performance;
    String day12;
    String day12performance;
    String day13;
    String day14;
    String day15;
    String day15performance;
    String day16;
    String day16performance;
    String day17;
    String day17performance;
    String day18;
    String day18performance;
    String day19;
    String day19performance;
    String day20;
    String day21;
    String day22;
    String day22performance;
    String day23;
    String day23performance;
    String day24;
    String day24performance;
    String day25;
    String day25performance;
    String day26;
    String day26performance;
    String day27;
    String day28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intense_glute_plan);

        Intent intent = getIntent();
        TextView intenseGlutePlan = findViewById(R.id.intense_glute_plan);
        intenseGlutePlan.getText().toString();

        plans = new ArrayList<UserPlan>();
        mAuth = FirebaseAuth.getInstance();
        Uid = mAuth.getCurrentUser().getUid();

        TextView glutePlan = findViewById(R.id.intense_glute_plan);
        TextView glutesDay1 = findViewById(R.id.glutes_day1);
        TextView glutesDay1Perf = findViewById(R.id.glutesday1performance);
        TextView glutesDay2 = findViewById(R.id.glutes_day2);
        TextView glutesDay2Perf = findViewById(R.id.glutesday2performance);
        TextView glutesDay3 = findViewById(R.id.glutes_day3);
        TextView glutesDay3Perf = findViewById(R.id.glutesday3performance);
        TextView glutesDay4 = findViewById(R.id.glutes_day4);
        TextView glutesDay4Perf = findViewById(R.id.glutesday4performance);
        TextView glutesDay5 = findViewById(R.id.glutes_day5);
        TextView glutesDay5Perf = findViewById(R.id.glutesday5performance);
        TextView glutesDay6 = findViewById(R.id.glutes_day6);
        TextView glutesDay7 = findViewById(R.id.glutes_day7);
        TextView glutesDay8 = findViewById(R.id.glutes_day8);
        TextView glutesDay8Perf = findViewById(R.id.glutesday8performance);
        TextView glutesDay9 = findViewById(R.id.glutes_day9);
        TextView glutesDay9Perf = findViewById(R.id.glutesday9performance);
        TextView glutesDay10 = findViewById(R.id.glutes_day10);
        TextView glutesDay10Perf = findViewById(R.id.glutesday10performance);
        TextView glutesDay11 = findViewById(R.id.glutes_day11);
        TextView glutesDay11Perf = findViewById(R.id.glutesday11performance);
        TextView glutesDay12 = findViewById(R.id.glutes_day12);
        TextView glutesDay12Perf = findViewById(R.id.glutesday12performance);
        TextView glutesDay13 = findViewById(R.id.glutes_day13);
        TextView glutesDay14 = findViewById(R.id.glutes_day14);
        TextView glutesDay15 = findViewById(R.id.glutes_day15);
        TextView glutesDay15Perf = findViewById(R.id.glutesday15performance);
        TextView glutesDay16 = findViewById(R.id.glutes_day16);
        TextView glutesDay16Perf = findViewById(R.id.glutesday16performance);
        TextView glutesDay17 = findViewById(R.id.glutes_day17);
        TextView glutesDay17Perf = findViewById(R.id.glutesday17performance);
        TextView glutesDay18 = findViewById(R.id.glutes_day18);
        TextView glutesDay18Perf = findViewById(R.id.glutesday18performance);
        TextView glutesDay19 = findViewById(R.id.glutes_day19);
        TextView glutesDay19Perf = findViewById(R.id.glutesday19performance);
        TextView glutesDay20 = findViewById(R.id.glutes_day20);
        TextView glutesDay21 = findViewById(R.id.glutes_day21);
        TextView glutesDay22 = findViewById(R.id.glutes_day22);
        TextView glutesDay22Perf = findViewById(R.id.glutesday22performance);
        TextView glutesDay23 = findViewById(R.id.glutes_day23);
        TextView glutesDay23Perf = findViewById(R.id.glutesday23performance);
        TextView glutesDay24 = findViewById(R.id.glutes_day24);
        TextView glutesDay24Perf = findViewById(R.id.glutesday24performance);
        TextView glutesDay25 = findViewById(R.id.glutes_day25);
        TextView glutesDay25Perf = findViewById(R.id.glutesday25performance);
        TextView glutesDay26 = findViewById(R.id.glutes_day26);
        TextView glutesDay26Perf = findViewById(R.id.glutesday26performance);
        TextView glutesDay27 = findViewById(R.id.glutes_day27);
        TextView glutesDay28 = findViewById(R.id.glutes_day28);

        String chosenPlan = glutePlan.getText().toString();
        day01 = glutesDay1.getText().toString();
        day01performance = glutesDay1Perf.getText().toString();
        day02 = glutesDay2.getText().toString();
        day02performance = glutesDay2Perf.getText().toString();
        day03 = glutesDay3.getText().toString();
        day03performance = glutesDay3Perf.getText().toString();
        day04 = glutesDay4.getText().toString();
        day04performance = glutesDay4Perf.getText().toString();
        day05 = glutesDay5.getText().toString();
        day05performance = glutesDay5Perf.getText().toString();
        day06 = glutesDay6.getText().toString();
        day07 = glutesDay7.getText().toString();
        day08 = glutesDay8.getText().toString();
        day08performance = glutesDay8Perf.getText().toString();
        day09 = glutesDay9.getText().toString();
        day09performance = glutesDay9Perf.getText().toString();
        day10 = glutesDay10.getText().toString();
        day10performance = glutesDay10Perf.getText().toString();
        day11 = glutesDay11.getText().toString();
        day11performance = glutesDay11Perf.getText().toString();
        day12 = glutesDay12.getText().toString();
        day12performance = glutesDay12Perf.getText().toString();
        day13 = glutesDay13.getText().toString();
        day14 = glutesDay14.getText().toString();
        day15 = glutesDay15.getText().toString();
        day15performance = glutesDay15Perf.getText().toString();
        day16 = glutesDay16.getText().toString();
        day16performance = glutesDay16Perf.getText().toString();
        day17 = glutesDay17.getText().toString();
        day17performance = glutesDay17Perf.getText().toString();
        day18 = glutesDay18.getText().toString();
        day18performance = glutesDay18Perf.getText().toString();
        day19 = glutesDay19.getText().toString();
        day19performance = glutesDay19Perf.getText().toString();
        day20 = glutesDay20.getText().toString();
        day21 = glutesDay21.getText().toString();
        day22 = glutesDay22.getText().toString();
        day22performance = glutesDay22Perf.getText().toString();
        day23 = glutesDay23.getText().toString();
        day23performance = glutesDay23Perf.getText().toString();
        day24 = glutesDay24.getText().toString();
        day24performance = glutesDay24Perf.getText().toString();
        day25 = glutesDay25.getText().toString();
        day25performance = glutesDay25Perf.getText().toString();
        day26 = glutesDay26.getText().toString();
        day26performance = glutesDay26Perf.getText().toString();
        day27 = glutesDay27.getText().toString();
        day28 = glutesDay28.getText().toString();

        UserPlan intensePlan = new UserPlan(chosenPlan, day01, day01performance, day02, day02performance,
                day03, day03performance, day04, day04performance, day05, day05performance, day06, day07, day08, day08performance,
                day09, day09performance, day10, day10performance, day11, day11performance, day12, day12performance, day13, day14,
                day15, day15performance, day16, day16performance, day17, day17performance, day18, day18performance, day19, day19performance,
                day20, day21, day22, day22performance, day23, day23performance, day24, day24performance, day25, day25performance,
                day26, day26performance, day27, day28);

        DatabaseReference fireDB = FirebaseDatabase.getInstance().getReference("Users").child(Uid).child("Plan").push();

        fireDB.setValue(intensePlan);
    }


    public void goToWorkout(View view) {
        Intent intent = new Intent(IntenseGlutePlan.this, WorkoutActivity.class);
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
        intent.putExtra(key1performance, day01performance);
        intent.putExtra(key2performance, day02performance);
        intent.putExtra(key3performance, day03performance);
        intent.putExtra(key4performance, day04performance);
        intent.putExtra(key5performance, day05performance);
        intent.putExtra(key8performance, day08performance);
        intent.putExtra(key9performance, day09performance);
        intent.putExtra(key10performance, day10performance);
        intent.putExtra(key11performance, day11performance);
        intent.putExtra(key12performance, day12performance);
        intent.putExtra(key15performance, day15performance);
        intent.putExtra(key16performance, day16performance);
        intent.putExtra(key17performance, day17performance);
        intent.putExtra(key18performance, day18performance);
        intent.putExtra(key19performance, day19performance);
        intent.putExtra(key22performance, day22performance);
        intent.putExtra(key23performance, day23performance);
        intent.putExtra(key24performance, day24performance);
        intent.putExtra(key25performance, day25performance);
        intent.putExtra(key26performance, day26performance);
        startActivity(intent);
    }

}