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

public class ModerateArmPlan extends AppCompatActivity {

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
        setContentView(R.layout.activity_moderate_arm_plan);

        Intent intent = getIntent();
        TextView moderateArmPlan = findViewById(R.id.moderate_arm_plan);
        moderateArmPlan.getText().toString();

        plans = new ArrayList<UserPlan>();
        mAuth = FirebaseAuth.getInstance();
        Uid = mAuth.getCurrentUser().getUid();

        TextView armPlan = findViewById(R.id.moderate_arm_plan);
        TextView armDay1  = findViewById(R.id.arm_day1);
        TextView armDay1Perf = findViewById(R.id.armday1performance);
        TextView armDay2  = findViewById(R.id.arm_day2);
        TextView armDay2Perf = findViewById(R.id.armday2performance);
        TextView armDay3  = findViewById(R.id.arm_day3);
        TextView armDay3Perf = findViewById(R.id.armday3performance);
        TextView armDay4  = findViewById(R.id.arm_day4);
        TextView armDay4Perf = findViewById(R.id.armday4performance);
        TextView armDay5  = findViewById(R.id.arm_day5);
        TextView armDay5Perf = findViewById(R.id.armday5performance);
        TextView armDay6  = findViewById(R.id.arm_day6);
        TextView armDay7  = findViewById(R.id.arm_day7);
        TextView armDay8  = findViewById(R.id.arm_day8);
        TextView armDay8Perf = findViewById(R.id.armday8performance);
        TextView armDay9  = findViewById(R.id.arm_day9);
        TextView armDay9Perf = findViewById(R.id.armday9performance);
        TextView armDay10  = findViewById(R.id.arm_day10);
        TextView armDay10Perf = findViewById(R.id.armday10performance);
        TextView armDay11  = findViewById(R.id.arm_day11);
        TextView armDay11Perf = findViewById(R.id.armday11performance);
        TextView armDay12  = findViewById(R.id.arm_day12);
        TextView armDay12Perf = findViewById(R.id.armday12performance);
        TextView armDay13  = findViewById(R.id.arm_day13);
        TextView armDay14  = findViewById(R.id.arm_day14);
        TextView armDay15  = findViewById(R.id.arm_day15);
        TextView armDay15Perf = findViewById(R.id.armday15performance);
        TextView armDay16  = findViewById(R.id.arm_day16);
        TextView armDay16Perf = findViewById(R.id.armday16performance);
        TextView armDay17  = findViewById(R.id.arm_day17);
        TextView armDay17Perf = findViewById(R.id.armday17performance);
        TextView armDay18  = findViewById(R.id.arm_day18);
        TextView armDay18Perf = findViewById(R.id.armday18performance);
        TextView armDay19  = findViewById(R.id.arm_day19);
        TextView armDay19Perf = findViewById(R.id.armday19performance);
        TextView armDay20  = findViewById(R.id.arm_day20);
        TextView armDay21  = findViewById(R.id.arm_day21);
        TextView armDay22  = findViewById(R.id.arm_day22);
        TextView armDay22Perf = findViewById(R.id.armday22performance);
        TextView armDay23  = findViewById(R.id.arm_day23);
        TextView armDay23Perf = findViewById(R.id.armday23performance);
        TextView armDay24  = findViewById(R.id.arm_day24);
        TextView armDay24Perf = findViewById(R.id.armday24performance);
        TextView armDay25  = findViewById(R.id.arm_day25);
        TextView armDay25Perf = findViewById(R.id.armday25performance);
        TextView armDay26  = findViewById(R.id.arm_day26);
        TextView armDay26Perf = findViewById(R.id.armday26performance);
        TextView armDay27  = findViewById(R.id.arm_day27);
        TextView armDay28  = findViewById(R.id.arm_day28);

        String chosenPlan = armPlan.getText().toString();
        day01 = armDay1.getText().toString();
        day01performance = armDay1Perf.getText().toString();
        day02 = armDay2.getText().toString();
        day02performance = armDay2Perf.getText().toString();
        day03 = armDay3.getText().toString();
        day03performance = armDay3Perf.getText().toString();
        day04 = armDay4.getText().toString();
        day04performance = armDay4Perf.getText().toString();
        day05 = armDay5.getText().toString();
        day05performance = armDay5Perf.getText().toString();
        day06 = armDay6.getText().toString();
        day07 = armDay7.getText().toString();
        day08 = armDay8.getText().toString();
        day08performance = armDay8Perf.getText().toString();
        day09 = armDay9.getText().toString();
        day09performance = armDay9Perf.getText().toString();
        day10 = armDay10.getText().toString();
        day10performance = armDay10Perf.getText().toString();
        day11 = armDay11.getText().toString();
        day11performance = armDay11Perf.getText().toString();
        day12 = armDay12.getText().toString();
        day12performance = armDay12Perf.getText().toString();
        day13 = armDay13.getText().toString();
        day14 = armDay14.getText().toString();
        day15 = armDay15.getText().toString();
        day15performance = armDay15Perf.getText().toString();
        day16 = armDay16.getText().toString();
        day16performance = armDay16Perf.getText().toString();
        day17 = armDay17.getText().toString();
        day17performance = armDay17Perf.getText().toString();
        day18 = armDay18.getText().toString();
        day18performance = armDay18Perf.getText().toString();
        day19 = armDay19.getText().toString();
        day19performance = armDay19Perf.getText().toString();
        day20 = armDay20.getText().toString();
        day21 = armDay21.getText().toString();
        day22 = armDay22.getText().toString();
        day22performance = armDay22Perf.getText().toString();
        day23 = armDay23.getText().toString();
        day23performance = armDay23Perf.getText().toString();
        day24 = armDay24.getText().toString();
        day24performance = armDay24Perf.getText().toString();
        day25 = armDay25.getText().toString();
        day25performance = armDay25Perf.getText().toString();
        day26 = armDay26.getText().toString();
        day26performance = armDay26Perf.getText().toString();
        day27 = armDay27.getText().toString();
        day28 = armDay28.getText().toString();


        UserPlan moderatePlan = new UserPlan(chosenPlan, day01, day01performance, day02, day02performance,
                day03, day03performance, day04, day04performance, day05, day05performance, day06, day07, day08, day08performance,
                day09, day09performance, day10, day10performance, day11, day11performance, day12, day12performance, day13, day14,
                day15, day15performance, day16, day16performance, day17, day17performance, day18, day18performance, day19, day19performance,
                day20, day21, day22, day22performance, day23, day23performance, day24, day24performance, day25, day25performance,
                day26, day26performance, day27, day28);

        DatabaseReference fireDB = FirebaseDatabase.getInstance().getReference("Users").child(Uid).child("Plan").push();

        fireDB.setValue(moderatePlan);

    }

    public void goToWorkout(View view) {
        Intent intent = new Intent(ModerateArmPlan.this, WorkoutActivity.class);
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