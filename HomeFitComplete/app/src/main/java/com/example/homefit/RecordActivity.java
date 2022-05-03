package com.example.homefit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class RecordActivity extends AppCompatActivity {

     private FirebaseAuth mAuth;
     private String Uid;

     public String caloriesToBurn;
     public String totalWeek1CaloriesBurned;
     public String totalWeek2CaloriesBurned;
     public String totalWeek3CaloriesBurned;
     public String totalWeek4CaloriesBurned;
     public int overallcaloriesburned;

     public String week1caloriesburned;
     public String week2caloriesburned;
     public String week3caloriesburned;
     public String week4caloriesburned;
     public String overallcalsburned;

    ArrayList<UserRecord> records;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        TextView progress = findViewById(R.id.record);
        progress.setText("My Record");

        Intent intent1 = getIntent();

        mAuth = FirebaseAuth.getInstance();
        Uid = mAuth.getCurrentUser().getUid();
        records = new ArrayList<UserRecord>();

        FirebaseDatabase.getInstance().getReference("Users").child(Uid).child("Plan")
                .addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                            caloriesToBurn =  snapshot.child("caloriesToBurn").getValue().toString();
                            TextView goal = findViewById(R.id.goal);
                            goal.setText(caloriesToBurn);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {


                    }
                });

        FirebaseDatabase.getInstance().getReference("Users").child(Uid).child("WeekOneWorkout")
                .addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                            totalWeek1CaloriesBurned =  snapshot.child("totalCaloriesBurned").getValue().toString();
                            TextView week1 = findViewById(R.id.week1);
                            week1.setText(totalWeek1CaloriesBurned);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {


                    }
                });

        FirebaseDatabase.getInstance().getReference("Users").child(Uid).child("WeekTwoWorkout")
                .addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                            totalWeek2CaloriesBurned =  snapshot.child("totalCaloriesBurned").getValue().toString();
                            TextView week2 = findViewById(R.id.week2);
                            week2.setText(totalWeek2CaloriesBurned);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

        FirebaseDatabase.getInstance().getReference("Users").child(Uid).child("WeekThreeWorkout")
                .addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                            totalWeek3CaloriesBurned  = snapshot.child("totalCaloriesBurned").getValue().toString();
                            TextView week3 = findViewById(R.id.week3);
                            week3.setText(totalWeek3CaloriesBurned);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

        FirebaseDatabase.getInstance().getReference("Users").child(Uid).child("WeekFourWorkout")
                .addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                            totalWeek4CaloriesBurned = snapshot.child("totalCaloriesBurned").getValue().toString();
                            TextView week4 = findViewById(R.id.week4);
                            week4.setText(totalWeek4CaloriesBurned);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });


        FirebaseDatabase.getInstance().getReference("Users").child(Uid).child("Record")
                .addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                            week1caloriesburned = snapshot.child("week1CaloriesBurned").getValue().toString();
                            week2caloriesburned = snapshot.child("week2CaloriesBurned").getValue().toString();
                            week3caloriesburned = snapshot.child("week3CaloriesBurned").getValue().toString();
                            week4caloriesburned = snapshot.child("week4CaloriesBurned").getValue().toString();
                            overallcalsburned = snapshot.child("overallCaloriesBurned").getValue().toString();

                            EditText week1 = findViewById(R.id.weekone);
                            week1.setText(week1caloriesburned);
                            EditText week2 = findViewById(R.id.weektwo);
                            week2.setText(week2caloriesburned);
                            EditText week3 = findViewById(R.id.weekthree);
                            week3.setText(week3caloriesburned);
                            EditText week4 = findViewById(R.id.weekfour);
                            week4.setText(week4caloriesburned);
                            TextView totalcals = findViewById(R.id.totalcalories);
                            totalcals.setText(overallcalsburned);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
    }


    public void calculateOverallCaloriesBurned(View view) {

       EditText weekone = findViewById(R.id.weekone);
       EditText weektwo = findViewById(R.id.weektwo);
       EditText weekthree = findViewById(R.id.weekthree);
       EditText weekfour = findViewById(R.id.weekfour);

        String weekOne = weekone.getText().toString();
        String weekTwo = weektwo.getText().toString();
        String weekThree = weekthree.getText().toString();
        String weekFour = weekfour.getText().toString();

        int w1 = Integer.parseInt(weekOne);
        int w2 = Integer.parseInt(weekTwo);
        int w3 = Integer.parseInt(weekThree);
        int w4 = Integer.parseInt(weekFour);

        overallcaloriesburned = w1 + w2 + w3 + w4;

        TextView totalcalories = findViewById(R.id.totalcalories);

        totalcalories.setText(String.valueOf(overallcaloriesburned));

        String totalCalories = totalcalories.getText().toString();

        UserRecord userRecord = new UserRecord(weekOne, weekTwo, weekThree, weekFour, totalCalories);

        DatabaseReference fireDB = FirebaseDatabase.getInstance().getReference("Users").child(Uid).child("Record").push();

        fireDB.setValue(userRecord);

    }

    public void continueToFeedback(View view) {

        Intent intent = new Intent(RecordActivity.this, FeedbackActivity.class);
        startActivity(intent);

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
            case R.id.action_logout:
                Intent intent = new Intent(RecordActivity.this, MainActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}