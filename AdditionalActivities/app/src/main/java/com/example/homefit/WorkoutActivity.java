package com.example.homefit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class WorkoutActivity extends AppCompatActivity {

    public static final String key1 = "DAY01";
    public static final String key1performance = "DAY01PERFORMANCE";
    public static final String key2 = "DAY02";
    public static final String key2performance = "DAY02PERFORMANCE";
    public static final String key3 = "DAY03";
    public static final String key3performance = "DAY03PERFORMANCE";
    public static final String key4 = "DAY04";
    public static final String key4performance = "DAY04PERFORMANCE";
    public static final String key5 = "DAY05";
    public static final String key5performance = "DAY05PERFORMANCE";
    public static final String key6 = "DAY06";
    public static final String key7 = "DAY07";
    public static final String key8 = "DAY08";
    public static final String key8performance = "DAY08PERFORMANCE";
    public static final String key9 = "DAY09";
    public static final String key9performance = "DAY09PERFORMANCE";
    public static final String key10 = "DAY10";
    public static final String key10performance = "DAY10PERFORMANCE";
    public static final String key11 = "DAY11";
    public static final String key11performance = "DAY11PERFORMANCE";
    public static final String key12 = "DAY12";
    public static final String key12performance = "DAY12PERFORMANCE";
    public static final String key13 = "DAY13";
    public static final String key14 = "DAY14";
    public static final String key15 = "DAY15";
    public static final String key15performance = "DAY15PERFORMANCE";
    public static final String key16 = "DAY16";
    public static final String key16performance = "DAY16PERFORMANCE";
    public static final String key17 = "DAY17";
    public static final String key17performance = "DAY17PERFORMANCE";
    public static final String key18 = "DAY18";
    public static final String key18performance = "DAY18PERFORMANCE";
    public static final String key19 = "DAY19";
    public static final String key19performance = "DAY19PERFORMANCE";
    public static final String key20 = "DAY20";
    public static final String key21 = "DAY21";
    public static final String key22 = "DAY22";
    public static final String key22performance = "DAY22PERFORMANCE";
    public static final String key23 = "DAY23";
    public static final String key23performance = "DAY23PERFORMANCE";
    public static final String key24 = "DAY24";
    public static final String key24performance = "DAY24PERFORMANCE";
    public static final String key25 = "DAY25";
    public static final String key25performance = "DAY25PERFORMANCE";
    public static final String key26 = "DAY26";
    public static final String key26performance = "DAY26PERFORMANCE";
    public static final String key27 = "DAY27";
    public static final String key28 = "DAY28";

    private FirebaseAuth mAuth;
    private String Uid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        Intent intent = getIntent();

        mAuth = FirebaseAuth.getInstance();
        Uid = mAuth.getCurrentUser().getUid();
    }

    public void week1Workout(View view) {

        FirebaseDatabase.getInstance().getReference("Users").child(Uid).child("Plan")
                .addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                            String day01 = snapshot.child("day01").getValue().toString();
                            String day01performance = snapshot.child("day01performance").getValue().toString();
                            String day02 = snapshot.child("day02").getValue().toString();
                            String day02performance = snapshot.child("day02performance").getValue().toString();
                            String day03 = snapshot.child("day03").getValue().toString();
                            String day03performance = snapshot.child("day03performance").getValue().toString();
                            String day04 = snapshot.child("day04").getValue().toString();
                            String day04performance = snapshot.child("day04performance").getValue().toString();
                            String day05 = snapshot.child("day05").getValue().toString();
                            String day05performance = snapshot.child("day05performance").getValue().toString();
                            String day06 = snapshot.child("day06").getValue().toString();
                            String day07 = snapshot.child("day07").getValue().toString();

                            Intent intent = new Intent(WorkoutActivity.this, WeekOneWorkout.class);
                            intent.putExtra(key1, day01);
                            intent.putExtra(key1performance, day01performance);
                            intent.putExtra(key2, day02);
                            intent.putExtra(key2performance, day02performance);
                            intent.putExtra(key3, day03);
                            intent.putExtra(key3performance, day03performance);
                            intent.putExtra(key4, day04);
                            intent.putExtra(key4performance, day04performance);
                            intent.putExtra(key5, day05);
                            intent.putExtra(key5performance, day05performance);
                            intent.putExtra(key6, day06);
                            intent.putExtra(key7, day07);
                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
    }

    public void week2Workout(View view) {
        FirebaseDatabase.getInstance().getReference("Users").child(Uid).child("Plan")
                .addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                            String day08 = snapshot.child("day08").getValue().toString();
                            String day08performance = snapshot.child("day08performance").getValue().toString();
                            String day09 = snapshot.child("day09").getValue().toString();
                            String day09performance = snapshot.child("day09performance").getValue().toString();
                            String day10 = snapshot.child("day10").getValue().toString();
                            String day10performance = snapshot.child("day10performance").getValue().toString();
                            String day11 = snapshot.child("day11").getValue().toString();
                            String day11performance = snapshot.child("day11performance").getValue().toString();
                            String day12 = snapshot.child("day12").getValue().toString();
                            String day12performance = snapshot.child("day12performance").getValue().toString();
                            String day13 = snapshot.child("day13").getValue().toString();
                            String day14 = snapshot.child("day14").getValue().toString();

                            Intent intent = new Intent(WorkoutActivity.this, WeekTwoWorkout.class);
                            intent.putExtra(key8, day08);
                            intent.putExtra(key8performance, day08performance);
                            intent.putExtra(key9, day09);
                            intent.putExtra(key9performance, day09performance);
                            intent.putExtra(key10, day10);
                            intent.putExtra(key10performance, day10performance);
                            intent.putExtra(key11, day11);
                            intent.putExtra(key11performance, day11performance);
                            intent.putExtra(key12, day12);
                            intent.putExtra(key12performance, day12performance);
                            intent.putExtra(key13, day13);
                            intent.putExtra(key14, day14);
                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
    }

    public void week3Workout(View view) {

        FirebaseDatabase.getInstance().getReference("Users").child(Uid).child("Plan")
                .addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                            String day15 = snapshot.child("day15").getValue().toString();
                            String day15performance = snapshot.child("day15performance").getValue().toString();
                            String day16 = snapshot.child("day16").getValue().toString();
                            String day16performance = snapshot.child("day16performance").getValue().toString();
                            String day17 = snapshot.child("day17").getValue().toString();
                            String day17performance = snapshot.child("day17performance").getValue().toString();
                            String day18 = snapshot.child("day18").getValue().toString();
                            String day18performance = snapshot.child("day18performance").getValue().toString();
                            String day19 = snapshot.child("day19").getValue().toString();
                            String day19performance = snapshot.child("day19performance").getValue().toString();
                            String day20 = snapshot.child("day20").getValue().toString();
                            String day21 = snapshot.child("day21").getValue().toString();

                            Intent intent = new Intent(WorkoutActivity.this, WeekThreeWorkout.class);
                            intent.putExtra(key15, day15);
                            intent.putExtra(key15performance, day15performance);
                            intent.putExtra(key16, day16);
                            intent.putExtra(key16performance, day16performance);
                            intent.putExtra(key17, day17);
                            intent.putExtra(key17performance, day17performance);
                            intent.putExtra(key18, day18);
                            intent.putExtra(key18performance, day18performance);
                            intent.putExtra(key19, day19);
                            intent.putExtra(key19performance, day19performance);
                            intent.putExtra(key20, day20);
                            intent.putExtra(key21, day21);
                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
    }

    public void week4Workout(View view) {

        FirebaseDatabase.getInstance().getReference("Users").child(Uid).child("Plan")
                .addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                            String day22 = snapshot.child("day22").getValue().toString();
                            String day22performance = snapshot.child("day22performance").getValue().toString();
                            String day23 = snapshot.child("day23").getValue().toString();
                            String day23performance = snapshot.child("day23performance").getValue().toString();
                            String day24 = snapshot.child("day24").getValue().toString();
                            String day24performance = snapshot.child("day24performance").getValue().toString();
                            String day25 = snapshot.child("day25").getValue().toString();
                            String day25performance = snapshot.child("day25performance").getValue().toString();
                            String day26 = snapshot.child("day26").getValue().toString();
                            String day26performance = snapshot.child("day26performance").getValue().toString();
                            String day27 = snapshot.child("day27").getValue().toString();
                            String day28 = snapshot.child("day28").getValue().toString();

                            Intent intent = new Intent(WorkoutActivity.this, WeekFourWorkout.class);
                            intent.putExtra(key22, day22);
                            intent.putExtra(key22performance, day22performance);
                            intent.putExtra(key23, day23);
                            intent.putExtra(key23performance, day23performance);
                            intent.putExtra(key24, day24);
                            intent.putExtra(key24performance, day24performance);
                            intent.putExtra(key25, day25);
                            intent.putExtra(key25performance, day25performance);
                            intent.putExtra(key26, day26);
                            intent.putExtra(key26performance, day26performance);
                            intent.putExtra(key27, day27);
                            intent.putExtra(key28, day28);
                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_progress:
                Intent intent1 = new Intent(WorkoutActivity.this, RecordActivity.class);
                startActivity(intent1);
                return true;
            case R.id.action_logout:
                Intent intent2 = new Intent(WorkoutActivity.this, MainActivity.class);
                startActivity(intent2);
                return true;
            case R.id.action_plan:
                this.finish();
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}