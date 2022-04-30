package com.example.homefit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class TrackWeekThreeWorkout extends AppCompatActivity {

    public final static String key1 = "WEEK THREE TOTAL CALORIES";

    private Spinner exerciseOneRepsSpinner;
    private Spinner exerciseOneSetsSpinner;
    private Spinner exerciseTwoRepsSpinner;
    private Spinner exerciseTwoSetsSpinner;

    private String day1ex1reps;
    private String day1ex1sets;
    private String day1ex2reps;
    private String day1ex2sets;
    private String day2ex1reps;
    private String day2ex1sets;
    private String day2ex2reps;
    private String day2ex2sets;
    private String day3ex1reps;
    private String day3ex1sets;
    private String day3ex2reps;
    private String day3ex2sets;
    private String day4ex1reps;
    private String day4ex1sets;
    private String day4ex2reps;
    private String day4ex2sets;
    private String day5ex1reps;
    private String day5ex1sets;
    private String day5ex2reps;
    private String day5ex2sets;

    public String day1Exercise1Reps;
    public String day1Exercise1Sets;
    public String day2Exercise1Reps;
    public String day2Exercise1Sets;
    public String day3Exercise1Reps;
    public String day3Exercise1Sets;
    public String day4Exercise1Reps;
    public String day4Exercise1Sets;
    public String day5Exercise1Reps;
    public String day5Exercise1Sets;

    public String day1Exercise2Reps;
    public String day1Exercise2Sets;
    public String day2Exercise2Reps;
    public String day2Exercise2Sets;
    public String day3Exercise2Reps;
    public String day3Exercise2Sets;
    public String day4Exercise2Reps;
    public String day4Exercise2Sets;
    public String day5Exercise2Reps;
    public String day5Exercise2Sets;

    public int day1exercise1calories;
    public int day2exercise1calories;
    public int day3exercise1calories;
    public int day4exercise1calories;
    public int day5exercise1calories;
    public int day1exercise2calories;
    public int day2exercise2calories;
    public int day3exercise2calories;
    public int day4exercise2calories;
    public int day5exercise2calories;
    public int week3totalcalories;

    public String day1ex1cals;
    public String day2ex1cals;
    public String day3ex1cals;
    public String day4ex1cals;
    public String day5ex1cals;
    public String day1ex2cals;
    public String day2ex2cals;
    public String day3ex2cals;
    public String day4ex2cals;
    public String day5ex2cals;

    public String totalcalsweek3;

    public int zeroCal = 0;
    public int oneCal = 1;
    public int twoCal = 2;
    public int threeCal = 3;
    public int fourCal = 4;
    public int fiveCal = 5;
    public int sixCal = 6;
    public int sevenCal = 7;
    public int zeroSets = 0;
    public int oneSet = 1;
    public int twoSets = 2;
    public int threeSets = 3;
    public int fourSets = 4;
    public int fiveSets = 5;
    public int sixSets = 6;
    public int sevenSets = 7;
    public int eightSets = 8;
    public int nineSets = 9;
    public int tenSets = 10;
    public int elevenSets = 11;
    public int twelveSets = 12;

    TextView day1ex1calories;
    TextView day1ex2calories;
    TextView day2ex1calories;
    TextView day2ex2calories;
    TextView day3ex1calories;
    TextView day3ex2calories;
    TextView day4ex1calories;
    TextView day4ex2calories;
    TextView day5ex1calories;
    TextView day5ex2calories;
    TextView week3caloriesburned;

    ArrayList<UserWorkout> workouts;
    private FirebaseAuth mAuth;
    private String Uid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_week_three_workout);

        Intent intent = getIntent();
        workouts = new ArrayList<UserWorkout>();
        mAuth = FirebaseAuth.getInstance();
        Uid = mAuth.getCurrentUser().getUid();
        ////////////////////////////////////////////////DAY 1//////////////////////////////////////////////////////

        exerciseOneRepsSpinner = findViewById(R.id.day1_ex1_reps_spinner);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.ExerciseOneReps,
                android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exerciseOneRepsSpinner.setAdapter(adapter1);
        exerciseOneRepsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                day1ex1reps = exerciseOneRepsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        exerciseOneSetsSpinner = findViewById(R.id.day1_ex1_sets_spinner);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.ExerciseOneSets,
                android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exerciseOneSetsSpinner.setAdapter(adapter2);
        exerciseOneSetsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                day1ex1sets = exerciseOneSetsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        exerciseTwoRepsSpinner = findViewById(R.id.day1_ex2_reps_spinner);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.ExerciseTwoReps,
                android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exerciseTwoRepsSpinner.setAdapter(adapter3);
        exerciseTwoRepsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                day1ex2reps = exerciseTwoRepsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        exerciseTwoSetsSpinner = findViewById(R.id.day1_ex2_sets_spinner);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this, R.array.ExerciseTwoSets,
                android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exerciseTwoSetsSpinner.setAdapter(adapter4);
        exerciseTwoSetsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                day1ex2sets = exerciseTwoSetsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ////////////////////////////////////////////////DAY 2//////////////////////////////////////////////////////

        exerciseOneRepsSpinner = findViewById(R.id.day2_ex1_reps_spinner);
        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this, R.array.ExerciseOneReps,
                android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exerciseOneRepsSpinner.setAdapter(adapter5);
        exerciseOneRepsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                day2ex1reps = exerciseOneRepsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        exerciseOneSetsSpinner = findViewById(R.id.day2_ex1_sets_spinner);
        ArrayAdapter<CharSequence> adapter6 = ArrayAdapter.createFromResource(this, R.array.ExerciseOneSets,
                android.R.layout.simple_spinner_item);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exerciseOneSetsSpinner.setAdapter(adapter6);
        exerciseOneSetsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                day2ex1sets = exerciseOneSetsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        exerciseTwoRepsSpinner = findViewById(R.id.day2_ex2_reps_spinner);
        ArrayAdapter<CharSequence> adapter7 = ArrayAdapter.createFromResource(this, R.array.ExerciseTwoReps,
                android.R.layout.simple_spinner_item);
        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exerciseTwoRepsSpinner.setAdapter(adapter7);
        exerciseTwoRepsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                day2ex2reps = exerciseTwoRepsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        exerciseTwoSetsSpinner = findViewById(R.id.day2_ex2_sets_spinner);
        ArrayAdapter<CharSequence> adapter8 = ArrayAdapter.createFromResource(this, R.array.ExerciseTwoSets,
                android.R.layout.simple_spinner_item);
        adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exerciseTwoSetsSpinner.setAdapter(adapter8);
        exerciseTwoSetsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                day2ex2sets = exerciseTwoSetsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //////////////////////////////////////////DAY 3/////////////////////////////////////////////////////////////

        exerciseOneRepsSpinner = findViewById(R.id.day3_ex1_reps_spinner);
        ArrayAdapter<CharSequence> adapter9 = ArrayAdapter.createFromResource(this, R.array.ExerciseOneReps,
                android.R.layout.simple_spinner_item);
        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exerciseOneRepsSpinner.setAdapter(adapter9);
        exerciseOneRepsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                day3ex1reps = exerciseOneRepsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        exerciseOneSetsSpinner = findViewById(R.id.day3_ex1_sets_spinner);
        ArrayAdapter<CharSequence> adapter10 = ArrayAdapter.createFromResource(this, R.array.ExerciseOneSets,
                android.R.layout.simple_spinner_item);
        adapter10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exerciseOneSetsSpinner.setAdapter(adapter10);
        exerciseOneSetsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                day3ex1sets = exerciseOneSetsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        exerciseTwoRepsSpinner = findViewById(R.id.day3_ex2_reps_spinner);
        ArrayAdapter<CharSequence> adapter11 = ArrayAdapter.createFromResource(this, R.array.ExerciseTwoReps,
                android.R.layout.simple_spinner_item);
        adapter11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exerciseTwoRepsSpinner.setAdapter(adapter11);
        exerciseTwoRepsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                day3ex2reps = exerciseTwoRepsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        exerciseTwoSetsSpinner = findViewById(R.id.day3_ex2_sets_spinner);
        ArrayAdapter<CharSequence> adapter12 = ArrayAdapter.createFromResource(this, R.array.ExerciseTwoSets,
                android.R.layout.simple_spinner_item);
        adapter12.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exerciseTwoSetsSpinner.setAdapter(adapter12);
        exerciseTwoSetsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                day3ex2sets = exerciseTwoSetsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ////////////////////////////////////////////////DAY 4//////////////////////////////////////////////////////

        exerciseOneRepsSpinner = findViewById(R.id.day4_ex1_reps_spinner);
        ArrayAdapter<CharSequence> adapter13 = ArrayAdapter.createFromResource(this, R.array.ExerciseOneReps,
                android.R.layout.simple_spinner_item);
        adapter13.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exerciseOneRepsSpinner.setAdapter(adapter13);
        exerciseOneRepsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                day4ex1reps = exerciseOneRepsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        exerciseOneSetsSpinner = findViewById(R.id.day4_ex1_sets_spinner);
        ArrayAdapter<CharSequence> adapter14 = ArrayAdapter.createFromResource(this, R.array.ExerciseOneSets,
                android.R.layout.simple_spinner_item);
        adapter14.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exerciseOneSetsSpinner.setAdapter(adapter14);
        exerciseOneSetsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                day4ex1sets = exerciseOneSetsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        exerciseTwoRepsSpinner = findViewById(R.id.day4_ex2_reps_spinner);
        ArrayAdapter<CharSequence> adapter15 = ArrayAdapter.createFromResource(this, R.array.ExerciseTwoReps,
                android.R.layout.simple_spinner_item);
        adapter15.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exerciseTwoRepsSpinner.setAdapter(adapter15);
        exerciseTwoRepsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                day4ex2reps = exerciseTwoRepsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        exerciseTwoSetsSpinner = findViewById(R.id.day4_ex2_sets_spinner);
        ArrayAdapter<CharSequence> adapter16 = ArrayAdapter.createFromResource(this, R.array.ExerciseTwoSets,
                android.R.layout.simple_spinner_item);
        adapter16.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exerciseTwoSetsSpinner.setAdapter(adapter16);
        exerciseTwoSetsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                day4ex2sets = exerciseTwoSetsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ////////////////////////////////////////////////DAY 5//////////////////////////////////////////////////////

        exerciseOneRepsSpinner = findViewById(R.id.day5_ex1_reps_spinner);
        ArrayAdapter<CharSequence> adapter17 = ArrayAdapter.createFromResource(this, R.array.ExerciseOneReps,
                android.R.layout.simple_spinner_item);
        adapter17.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exerciseOneRepsSpinner.setAdapter(adapter17);
        exerciseOneRepsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                day5ex1reps = exerciseOneRepsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        exerciseOneSetsSpinner = findViewById(R.id.day5_ex1_sets_spinner);
        ArrayAdapter<CharSequence> adapter18 = ArrayAdapter.createFromResource(this, R.array.ExerciseOneSets,
                android.R.layout.simple_spinner_item);
        adapter18.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exerciseOneSetsSpinner.setAdapter(adapter18);
        exerciseOneSetsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                day5ex1sets = exerciseOneSetsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        exerciseTwoRepsSpinner = findViewById(R.id.day5_ex2_reps_spinner);
        ArrayAdapter<CharSequence> adapter19 = ArrayAdapter.createFromResource(this, R.array.ExerciseTwoReps,
                android.R.layout.simple_spinner_item);
        adapter19.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exerciseTwoRepsSpinner.setAdapter(adapter19);
        exerciseTwoRepsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                day5ex2reps = exerciseTwoRepsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        exerciseTwoSetsSpinner = findViewById(R.id.day5_ex2_sets_spinner);
        ArrayAdapter<CharSequence> adapter20 = ArrayAdapter.createFromResource(this, R.array.ExerciseTwoSets,
                android.R.layout.simple_spinner_item);
        adapter20.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exerciseTwoSetsSpinner.setAdapter(adapter20);
        exerciseTwoSetsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                day5ex2sets = exerciseTwoSetsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void day1ex1Calculate(View view) {
        day1Exercise1Reps = day1ex1reps;
        day1Exercise1Sets = day1ex1sets;

        day1ex1calories = findViewById(R.id.day1ex1calories);

        if (day1Exercise1Reps.equalsIgnoreCase("0") && day1Exercise1Sets.equalsIgnoreCase("0")) {
            day1exercise1calories = zeroCal * zeroSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Less than 5") && day1Exercise1Sets.equalsIgnoreCase("1")) {
            day1exercise1calories = oneCal * oneSet;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day1Exercise1Sets.equalsIgnoreCase("1")) {
            day1exercise1calories = twoCal * oneSet;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day1Exercise1Sets.equalsIgnoreCase("1")) {
            day1exercise1calories = threeCal * oneSet;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day1Exercise1Sets.equalsIgnoreCase("1")) {
            day1exercise1calories = fourCal * oneSet;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day1Exercise1Sets.equalsIgnoreCase("1")) {
            day1exercise1calories = fiveCal * oneSet;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day1Exercise1Sets.equalsIgnoreCase("1")) {
            day1exercise1calories = sixCal * oneSet;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day1Exercise1Sets.equalsIgnoreCase("1")) {
            day1exercise1calories = sevenCal * oneSet;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Less than 5") && day1Exercise1Sets.equalsIgnoreCase("2")) {
            day1exercise1calories = oneCal * twoSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day1Exercise1Sets.equalsIgnoreCase("2")) {
            day1exercise1calories = twoCal * twoSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day1Exercise1Sets.equalsIgnoreCase("2")) {
            day1exercise1calories = threeCal * twoSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day1Exercise1Sets.equalsIgnoreCase("2")) {
            day1exercise1calories = fourCal * twoSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day1Exercise1Sets.equalsIgnoreCase("2")) {
            day1exercise1calories = fiveCal * twoSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day1Exercise1Sets.equalsIgnoreCase("2")) {
            day1exercise1calories = sixCal * twoSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day1Exercise1Sets.equalsIgnoreCase("2")) {
            day1exercise1calories = sevenCal * twoSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Less than 5") && day1Exercise1Sets.equalsIgnoreCase("3")) {
            day1exercise1calories = oneCal * threeSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day1Exercise1Sets.equalsIgnoreCase("3")) {
            day1exercise1calories = twoCal * threeSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day1Exercise1Sets.equalsIgnoreCase("3")) {
            day1exercise1calories = threeCal * threeSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day1Exercise1Sets.equalsIgnoreCase("3")) {
            day1exercise1calories = fourCal * threeSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day1Exercise1Sets.equalsIgnoreCase("3")) {
            day1exercise1calories = fiveCal * threeSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day1Exercise1Sets.equalsIgnoreCase("3")) {
            day1exercise1calories = sixCal * threeSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day1Exercise1Sets.equalsIgnoreCase("3")) {
            day1exercise1calories = sevenCal * threeSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Less than 5") && day1Exercise1Sets.equalsIgnoreCase("4")) {
            day1exercise1calories = oneCal * fourSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day1Exercise1Sets.equalsIgnoreCase("4")) {
            day1exercise1calories = twoCal * fourSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day1Exercise1Sets.equalsIgnoreCase("4")) {
            day1exercise1calories = threeCal * fourSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day1Exercise1Sets.equalsIgnoreCase("4")) {
            day1exercise1calories = fourCal * fourSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day1Exercise1Sets.equalsIgnoreCase("4")) {
            day1exercise1calories = fiveCal * fourSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day1Exercise1Sets.equalsIgnoreCase("4")) {
            day1exercise1calories = sixCal * fourSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day1Exercise1Sets.equalsIgnoreCase("4")) {
            day1exercise1calories = sevenCal * fourSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Less than 5") && day1Exercise1Sets.equalsIgnoreCase("5")) {
            day1exercise1calories = oneCal * fiveSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day1Exercise1Sets.equalsIgnoreCase("5")) {
            day1exercise1calories = twoCal * fiveSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day1Exercise1Sets.equalsIgnoreCase("5")) {
            day1exercise1calories = threeCal * fiveSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day1Exercise1Sets.equalsIgnoreCase("5")) {
            day1exercise1calories = fourCal * fiveSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day1Exercise1Sets.equalsIgnoreCase("5")) {
            day1exercise1calories = fiveCal * fiveSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day1Exercise1Sets.equalsIgnoreCase("5")) {
            day1exercise1calories = sixCal * fiveSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day1Exercise1Sets.equalsIgnoreCase("5")) {
            day1exercise1calories = sevenCal * fiveSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Less than 5") && day1Exercise1Sets.equalsIgnoreCase("6")) {
            day1exercise1calories = oneCal * sixSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day1Exercise1Sets.equalsIgnoreCase("6")) {
            day1exercise1calories = twoCal * sixSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day1Exercise1Sets.equalsIgnoreCase("6")) {
            day1exercise1calories = threeCal * sixSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day1Exercise1Sets.equalsIgnoreCase("6")) {
            day1exercise1calories = fourCal * sixSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day1Exercise1Sets.equalsIgnoreCase("6")) {
            day1exercise1calories = fiveCal * sixSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day1Exercise1Sets.equalsIgnoreCase("6")) {
            day1exercise1calories = sixCal * sixSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day1Exercise1Sets.equalsIgnoreCase("6")) {
            day1exercise1calories = sevenCal * sixSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }
        if (day1Exercise1Reps.equalsIgnoreCase("Less than 5") && day1Exercise1Sets.equalsIgnoreCase("7")) {
            day1exercise1calories = oneCal * sevenSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day1Exercise1Sets.equalsIgnoreCase("7")) {
            day1exercise1calories = twoCal * sevenSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day1Exercise1Sets.equalsIgnoreCase("7")) {
            day1exercise1calories = threeCal * sevenSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day1Exercise1Sets.equalsIgnoreCase("7")) {
            day1exercise1calories = fourCal * sevenSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day1Exercise1Sets.equalsIgnoreCase("7")) {
            day1exercise1calories = fiveCal * sevenSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day1Exercise1Sets.equalsIgnoreCase("7")) {
            day1exercise1calories = sixCal * sevenSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day1Exercise1Sets.equalsIgnoreCase("7")) {
            day1exercise1calories = sevenCal * sevenSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Less than 5") && day1Exercise1Sets.equalsIgnoreCase("8")) {
            day1exercise1calories = oneCal * eightSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day1Exercise1Sets.equalsIgnoreCase("8")) {
            day1exercise1calories = twoCal * eightSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day1Exercise1Sets.equalsIgnoreCase("8")) {
            day1exercise1calories = threeCal * eightSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day1Exercise1Sets.equalsIgnoreCase("8")) {
            day1exercise1calories = fourCal * eightSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day1Exercise1Sets.equalsIgnoreCase("8")) {
            day1exercise1calories = fiveCal * eightSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day1Exercise1Sets.equalsIgnoreCase("8")) {
            day1exercise1calories = sixCal * eightSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day1Exercise1Sets.equalsIgnoreCase("8")) {
            day1exercise1calories = sevenCal * eightSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Less than 5") && day1Exercise1Sets.equalsIgnoreCase("9")) {
            day1exercise1calories = oneCal * nineSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day1Exercise1Sets.equalsIgnoreCase("9")) {
            day1exercise1calories = twoCal * nineSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day1Exercise1Sets.equalsIgnoreCase("9")) {
            day1exercise1calories = threeCal * nineSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day1Exercise1Sets.equalsIgnoreCase("9")) {
            day1exercise1calories = fourCal * nineSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day1Exercise1Sets.equalsIgnoreCase("9")) {
            day1exercise1calories = fiveCal * nineSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day1Exercise1Sets.equalsIgnoreCase("9")) {
            day1exercise1calories = sixCal * nineSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day1Exercise1Sets.equalsIgnoreCase("9")) {
            day1exercise1calories = sevenCal * nineSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Less than 5") && day1Exercise1Sets.equalsIgnoreCase("10")) {
            day1exercise1calories = oneCal * tenSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day1Exercise1Sets.equalsIgnoreCase("10")) {
            day1exercise1calories = twoCal * tenSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day1Exercise1Sets.equalsIgnoreCase("10")) {
            day1exercise1calories = threeCal * tenSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day1Exercise1Sets.equalsIgnoreCase("10")) {
            day1exercise1calories = fourCal * tenSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day1Exercise1Sets.equalsIgnoreCase("10")) {
            day1exercise1calories = fiveCal * tenSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day1Exercise1Sets.equalsIgnoreCase("10")) {
            day1exercise1calories = sixCal * tenSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day1Exercise1Sets.equalsIgnoreCase("10")) {
            day1exercise1calories = sevenCal * tenSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Less than 5") && day1Exercise1Sets.equalsIgnoreCase("11")) {
            day1exercise1calories = oneCal * elevenSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day1Exercise1Sets.equalsIgnoreCase("11")) {
            day1exercise1calories = twoCal * elevenSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day1Exercise1Sets.equalsIgnoreCase("11")) {
            day1exercise1calories = threeCal * elevenSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day1Exercise1Sets.equalsIgnoreCase("11")) {
            day1exercise1calories = fourCal * elevenSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day1Exercise1Sets.equalsIgnoreCase("11")) {
            day1exercise1calories = fiveCal * elevenSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day1Exercise1Sets.equalsIgnoreCase("11")) {
            day1exercise1calories = sixCal * elevenSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day1Exercise1Sets.equalsIgnoreCase("11")) {
            day1exercise1calories = sevenCal * elevenSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Less than 5") && day1Exercise1Sets.equalsIgnoreCase("12")) {
            day1exercise1calories = oneCal * twelveSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day1Exercise1Sets.equalsIgnoreCase("12")) {
            day1exercise1calories = twoCal * twelveSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day1Exercise1Sets.equalsIgnoreCase("12")) {
            day1exercise1calories = threeCal * twelveSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day1Exercise1Sets.equalsIgnoreCase("12")) {
            day1exercise1calories = fourCal * twelveSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day1Exercise1Sets.equalsIgnoreCase("12")) {
            day1exercise1calories = fiveCal * twelveSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day1Exercise1Sets.equalsIgnoreCase("12")) {
            day1exercise1calories = sixCal * twelveSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }

        if (day1Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day1Exercise1Sets.equalsIgnoreCase("12")) {
            day1exercise1calories = sevenCal * twelveSets;
            day1ex1cals = String.valueOf(day1exercise1calories);
            day1ex1calories.setText(day1ex1cals);
        }
    }

    public void day2ex1Calculate(View view) {

        day2Exercise1Reps = day2ex1reps;
        day2Exercise1Sets = day2ex1sets;

        day2ex1calories = findViewById(R.id.day2ex1calories);

        if (day2Exercise1Reps.equalsIgnoreCase("0") && day2Exercise1Sets.equalsIgnoreCase("0")) {
            day2exercise1calories = zeroCal * zeroSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Less than 5") && day2Exercise1Sets.equalsIgnoreCase("1")) {
            day2exercise1calories = oneCal * oneSet;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day2Exercise1Sets.equalsIgnoreCase("1")) {
            day2exercise1calories = twoCal * oneSet;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day2Exercise1Sets.equalsIgnoreCase("1")) {
            day2exercise1calories = threeCal * oneSet;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day2Exercise1Sets.equalsIgnoreCase("1")) {
            day2exercise1calories = fourCal * oneSet;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day2Exercise1Sets.equalsIgnoreCase("1")) {
            day2exercise1calories = fiveCal * oneSet;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day2Exercise1Sets.equalsIgnoreCase("1")) {
            day2exercise1calories = sixCal * oneSet;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day2Exercise1Sets.equalsIgnoreCase("1")) {
            day2exercise1calories = sevenCal * oneSet;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Less than 5") && day2Exercise1Sets.equalsIgnoreCase("2")) {
            day2exercise1calories = oneCal * twoSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day2Exercise1Sets.equalsIgnoreCase("2")) {
            day2exercise1calories = twoCal * twoSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day2Exercise1Sets.equalsIgnoreCase("2")) {
            day2exercise1calories = threeCal * twoSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day2Exercise1Sets.equalsIgnoreCase("2")) {
            day2exercise1calories = fourCal * twoSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day2Exercise1Sets.equalsIgnoreCase("2")) {
            day2exercise1calories = fiveCal * twoSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day2Exercise1Sets.equalsIgnoreCase("2")) {
            day2exercise1calories = sixCal * twoSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day2Exercise1Sets.equalsIgnoreCase("2")) {
            day2exercise1calories = sevenCal * twoSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Less than 5") && day2Exercise1Sets.equalsIgnoreCase("3")) {
            day2exercise1calories = oneCal * threeSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day2Exercise1Sets.equalsIgnoreCase("3")) {
            day2exercise1calories = twoCal * threeSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day2Exercise1Sets.equalsIgnoreCase("3")) {
            day2exercise1calories = threeCal * threeSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day2Exercise1Sets.equalsIgnoreCase("3")) {
            day2exercise1calories = fourCal * threeSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day2Exercise1Sets.equalsIgnoreCase("3")) {
            day2exercise1calories = fiveCal * threeSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day2Exercise1Sets.equalsIgnoreCase("3")) {
            day2exercise1calories = sixCal * threeSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day2Exercise1Sets.equalsIgnoreCase("3")) {
            day2exercise1calories = sevenCal * threeSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Less than 5") && day2Exercise1Sets.equalsIgnoreCase("4")) {
            day2exercise1calories = oneCal * fourSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day2Exercise1Sets.equalsIgnoreCase("4")) {
            day2exercise1calories = twoCal * fourSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day2Exercise1Sets.equalsIgnoreCase("4")) {
            day2exercise1calories = threeCal * fourSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day2Exercise1Sets.equalsIgnoreCase("4")) {
            day2exercise1calories = fourCal * fourSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day2Exercise1Sets.equalsIgnoreCase("4")) {
            day2exercise1calories = fiveCal * fourSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day2Exercise1Sets.equalsIgnoreCase("4")) {
            day2exercise1calories = sixCal * fourSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day2Exercise1Sets.equalsIgnoreCase("4")) {
            day2exercise1calories = sevenCal * fourSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Less than 5") && day2Exercise1Sets.equalsIgnoreCase("5")) {
            day2exercise1calories = oneCal * fiveSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day2Exercise1Sets.equalsIgnoreCase("5")) {
            day2exercise1calories = twoCal * fiveSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day2Exercise1Sets.equalsIgnoreCase("5")) {
            day2exercise1calories = threeCal * fiveSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day2Exercise1Sets.equalsIgnoreCase("5")) {
            day2exercise1calories = fourCal * fiveSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day2Exercise1Sets.equalsIgnoreCase("5")) {
            day2exercise1calories = fiveCal * fiveSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day2Exercise1Sets.equalsIgnoreCase("5")) {
            day2exercise1calories = sixCal * fiveSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day2Exercise1Sets.equalsIgnoreCase("5")) {
            day2exercise1calories = sevenCal * fiveSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Less than 5") && day2Exercise1Sets.equalsIgnoreCase("6")) {
            day2exercise1calories = oneCal * sixSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day2Exercise1Sets.equalsIgnoreCase("6")) {
            day2exercise1calories = twoCal * sixSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day2Exercise1Sets.equalsIgnoreCase("6")) {
            day2exercise1calories = threeCal * sixSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day2Exercise1Sets.equalsIgnoreCase("6")) {
            day2exercise1calories = fourCal * sixSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day2Exercise1Sets.equalsIgnoreCase("6")) {
            day2exercise1calories = fiveCal * sixSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day2Exercise1Sets.equalsIgnoreCase("6")) {
            day2exercise1calories = sixCal * sixSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day2Exercise1Sets.equalsIgnoreCase("6")) {
            day2exercise1calories = sevenCal * sixSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }
        if (day2Exercise1Reps.equalsIgnoreCase("Less than 5") && day2Exercise1Sets.equalsIgnoreCase("7")) {
            day2exercise1calories = oneCal * sevenSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day2Exercise1Sets.equalsIgnoreCase("7")) {
            day2exercise1calories = twoCal * sevenSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day2Exercise1Sets.equalsIgnoreCase("7")) {
            day2exercise1calories = threeCal * sevenSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day2Exercise1Sets.equalsIgnoreCase("7")) {
            day2exercise1calories = fourCal * sevenSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day2Exercise1Sets.equalsIgnoreCase("7")) {
            day2exercise1calories = fiveCal * sevenSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day2Exercise1Sets.equalsIgnoreCase("7")) {
            day2exercise1calories = sixCal * sevenSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day2Exercise1Sets.equalsIgnoreCase("7")) {
            day2exercise1calories = sevenCal * sevenSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Less than 5") && day2Exercise1Sets.equalsIgnoreCase("8")) {
            day2exercise1calories = oneCal * eightSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day2Exercise1Sets.equalsIgnoreCase("8")) {
            day2exercise1calories = twoCal * eightSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day2Exercise1Sets.equalsIgnoreCase("8")) {
            day2exercise1calories = threeCal * eightSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day2Exercise1Sets.equalsIgnoreCase("8")) {
            day2exercise1calories = fourCal * eightSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day2Exercise1Sets.equalsIgnoreCase("8")) {
            day2exercise1calories = fiveCal * eightSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day2Exercise1Sets.equalsIgnoreCase("8")) {
            day2exercise1calories = sixCal * eightSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day2Exercise1Sets.equalsIgnoreCase("8")) {
            day2exercise1calories = sevenCal * eightSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Less than 5") && day2Exercise1Sets.equalsIgnoreCase("9")) {
            day2exercise1calories = oneCal * nineSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day2Exercise1Sets.equalsIgnoreCase("9")) {
            day2exercise1calories = twoCal * nineSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day2Exercise1Sets.equalsIgnoreCase("9")) {
            day2exercise1calories = threeCal * nineSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day2Exercise1Sets.equalsIgnoreCase("9")) {
            day2exercise1calories = fourCal * nineSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day2Exercise1Sets.equalsIgnoreCase("9")) {
            day2exercise1calories = fiveCal * nineSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day2Exercise1Sets.equalsIgnoreCase("9")) {
            day2exercise1calories = sixCal * nineSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day2Exercise1Sets.equalsIgnoreCase("9")) {
            day2exercise1calories = sevenCal * nineSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Less than 5") && day2Exercise1Sets.equalsIgnoreCase("10")) {
            day2exercise1calories = oneCal * tenSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day2Exercise1Sets.equalsIgnoreCase("10")) {
            day2exercise1calories = twoCal * tenSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day2Exercise1Sets.equalsIgnoreCase("10")) {
            day2exercise1calories = threeCal * tenSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day2Exercise1Sets.equalsIgnoreCase("10")) {
            day2exercise1calories = fourCal * tenSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day2Exercise1Sets.equalsIgnoreCase("10")) {
            day2exercise1calories = fiveCal * tenSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day2Exercise1Sets.equalsIgnoreCase("10")) {
            day2exercise1calories = sixCal * tenSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day2Exercise1Sets.equalsIgnoreCase("10")) {
            day2exercise1calories = sevenCal * tenSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Less than 5") && day2Exercise1Sets.equalsIgnoreCase("11")) {
            day2exercise1calories = oneCal * elevenSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day2Exercise1Sets.equalsIgnoreCase("11")) {
            day2exercise1calories = twoCal * elevenSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day2Exercise1Sets.equalsIgnoreCase("11")) {
            day2exercise1calories = threeCal * elevenSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day2Exercise1Sets.equalsIgnoreCase("11")) {
            day2exercise1calories = fourCal * elevenSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day2Exercise1Sets.equalsIgnoreCase("11")) {
            day2exercise1calories = fiveCal * elevenSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day2Exercise1Sets.equalsIgnoreCase("11")) {
            day2exercise1calories = sixCal * elevenSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day2Exercise1Sets.equalsIgnoreCase("11")) {
            day2exercise1calories = sevenCal * elevenSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Less than 5") && day2Exercise1Sets.equalsIgnoreCase("12")) {
            day2exercise1calories = oneCal * twelveSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day2Exercise1Sets.equalsIgnoreCase("12")) {
            day2exercise1calories = twoCal * twelveSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day2Exercise1Sets.equalsIgnoreCase("12")) {
            day2exercise1calories = threeCal * twelveSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day2Exercise1Sets.equalsIgnoreCase("12")) {
            day2exercise1calories = fourCal * twelveSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day2Exercise1Sets.equalsIgnoreCase("12")) {
            day2exercise1calories = fiveCal * twelveSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day2Exercise1Sets.equalsIgnoreCase("12")) {
            day2exercise1calories = sixCal * twelveSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }

        if (day2Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day2Exercise1Sets.equalsIgnoreCase("12")) {
            day2exercise1calories = sevenCal * twelveSets;
            day2ex1cals = String.valueOf(day2exercise1calories);
            day2ex1calories.setText(day2ex1cals);
        }
    }


    public void day3ex1Calculate(View view) {
        day3Exercise1Reps = day3ex1reps;
        day3Exercise1Sets = day3ex1sets;

        day3ex1calories = findViewById(R.id.day3ex1calories);

        if (day3Exercise1Reps.equalsIgnoreCase("0") && day3Exercise1Sets.equalsIgnoreCase("0")) {
            day3exercise1calories = 0;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Less than 5") && day3Exercise1Sets.equalsIgnoreCase("1")) {
            day3exercise1calories = oneCal * oneSet;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day3Exercise1Sets.equalsIgnoreCase("1")) {
            day3exercise1calories = twoCal * oneSet;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day3Exercise1Sets.equalsIgnoreCase("1")) {
            day3exercise1calories = threeCal * oneSet;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day3Exercise1Sets.equalsIgnoreCase("1")) {
            day3exercise1calories = fourCal * oneSet;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day3Exercise1Sets.equalsIgnoreCase("1")) {
            day3exercise1calories = fiveCal * oneSet;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day3Exercise1Sets.equalsIgnoreCase("1")) {
            day3exercise1calories = sixCal * oneSet;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day3Exercise1Sets.equalsIgnoreCase("1")) {
            day3exercise1calories = sevenCal * oneSet;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Less than 5") && day3Exercise1Sets.equalsIgnoreCase("2")) {
            day3exercise1calories = oneCal * twoSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day3Exercise1Sets.equalsIgnoreCase("2")) {
            day3exercise1calories = twoCal * twoSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day3Exercise1Sets.equalsIgnoreCase("2")) {
            day3exercise1calories = threeCal * twoSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day3Exercise1Sets.equalsIgnoreCase("2")) {
            day3exercise1calories = fourCal * twoSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day3Exercise1Sets.equalsIgnoreCase("2")) {
            day3exercise1calories = fiveCal * twoSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day3Exercise1Sets.equalsIgnoreCase("2")) {
            day3exercise1calories = sixCal * twoSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day3Exercise1Sets.equalsIgnoreCase("2")) {
            day3exercise1calories = sevenCal * twoSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Less than 5") && day3Exercise1Sets.equalsIgnoreCase("3")) {
            day3exercise1calories = oneCal * threeSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day3Exercise1Sets.equalsIgnoreCase("3")) {
            day3exercise1calories = twoCal * threeSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day3Exercise1Sets.equalsIgnoreCase("3")) {
            day3exercise1calories = threeCal * threeSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day3Exercise1Sets.equalsIgnoreCase("3")) {
            day3exercise1calories = fourCal * threeSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day3Exercise1Sets.equalsIgnoreCase("3")) {
            day3exercise1calories = fiveCal * threeSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day3Exercise1Sets.equalsIgnoreCase("3")) {
            day3exercise1calories = sixCal * threeSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day3Exercise1Sets.equalsIgnoreCase("3")) {
            day3exercise1calories = sevenCal * threeSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Less than 5") && day3Exercise1Sets.equalsIgnoreCase("4")) {
            day3exercise1calories = oneCal * fourSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day3Exercise1Sets.equalsIgnoreCase("4")) {
            day3exercise1calories = twoCal * fourSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day3Exercise1Sets.equalsIgnoreCase("4")) {
            day3exercise1calories = threeCal * fourSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day3Exercise1Sets.equalsIgnoreCase("4")) {
            day3exercise1calories = fourCal * fourSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day3Exercise1Sets.equalsIgnoreCase("4")) {
            day3exercise1calories = fiveCal * fourSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day3Exercise1Sets.equalsIgnoreCase("4")) {
            day3exercise1calories = sixCal * fourSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day3Exercise1Sets.equalsIgnoreCase("4")) {
            day3exercise1calories = sevenCal * fourSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Less than 5") && day3Exercise1Sets.equalsIgnoreCase("5")) {
            day3exercise1calories = oneCal * fiveSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day3Exercise1Sets.equalsIgnoreCase("5")) {
            day3exercise1calories = twoCal * fiveSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day3Exercise1Sets.equalsIgnoreCase("5")) {
            day3exercise1calories = threeCal * fiveSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day3Exercise1Sets.equalsIgnoreCase("5")) {
            day3exercise1calories = fourCal * fiveSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day3Exercise1Sets.equalsIgnoreCase("5")) {
            day3exercise1calories = fiveCal * fiveSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day3Exercise1Sets.equalsIgnoreCase("5")) {
            day3exercise1calories = sixCal * fiveSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day3Exercise1Sets.equalsIgnoreCase("5")) {
            day3exercise1calories = sevenCal * fiveSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Less than 5") && day3Exercise1Sets.equalsIgnoreCase("6")) {
            day3exercise1calories = oneCal * sixSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day3Exercise1Sets.equalsIgnoreCase("6")) {
            day3exercise1calories = twoCal * sixSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day3Exercise1Sets.equalsIgnoreCase("6")) {
            day3exercise1calories = threeCal * sixSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day3Exercise1Sets.equalsIgnoreCase("6")) {
            day3exercise1calories = fourCal * sixSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day3Exercise1Sets.equalsIgnoreCase("6")) {
            day3exercise1calories = fiveCal * sixSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day3Exercise1Sets.equalsIgnoreCase("6")) {
            day3exercise1calories = sixCal * sixSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day3Exercise1Sets.equalsIgnoreCase("6")) {
            day3exercise1calories = sevenCal * sixSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }
        if (day3Exercise1Reps.equalsIgnoreCase("Less than 5") && day3Exercise1Sets.equalsIgnoreCase("7")) {
            day3exercise1calories = oneCal * sevenSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day3Exercise1Sets.equalsIgnoreCase("7")) {
            day3exercise1calories = twoCal * sevenSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day3Exercise1Sets.equalsIgnoreCase("7")) {
            day3exercise1calories = threeCal * sevenSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day3Exercise1Sets.equalsIgnoreCase("7")) {
            day3exercise1calories = fourCal * sevenSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day3Exercise1Sets.equalsIgnoreCase("7")) {
            day3exercise1calories = fiveCal * sevenSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day3Exercise1Sets.equalsIgnoreCase("7")) {
            day3exercise1calories = sixCal * sevenSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day3Exercise1Sets.equalsIgnoreCase("7")) {
            day3exercise1calories = sevenCal * sevenSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Less than 5") && day3Exercise1Sets.equalsIgnoreCase("8")) {
            day3exercise1calories = oneCal * eightSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day3Exercise1Sets.equalsIgnoreCase("8")) {
            day3exercise1calories = twoCal * eightSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day3Exercise1Sets.equalsIgnoreCase("8")) {
            day3exercise1calories = threeCal * eightSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day3Exercise1Sets.equalsIgnoreCase("8")) {
            day3exercise1calories = fourCal * eightSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day3Exercise1Sets.equalsIgnoreCase("8")) {
            day3exercise1calories = fiveCal * eightSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day3Exercise1Sets.equalsIgnoreCase("8")) {
            day3exercise1calories = sixCal * eightSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day3Exercise1Sets.equalsIgnoreCase("8")) {
            day3exercise1calories = sevenCal * eightSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Less than 5") && day3Exercise1Sets.equalsIgnoreCase("9")) {
            day3exercise1calories = oneCal * nineSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day3Exercise1Sets.equalsIgnoreCase("9")) {
            day3exercise1calories = twoCal * nineSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day3Exercise1Sets.equalsIgnoreCase("9")) {
            day3exercise1calories = threeCal * nineSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day3Exercise1Sets.equalsIgnoreCase("9")) {
            day3exercise1calories = fourCal * nineSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day3Exercise1Sets.equalsIgnoreCase("9")) {
            day3exercise1calories = fiveCal * nineSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day3Exercise1Sets.equalsIgnoreCase("9")) {
            day3exercise1calories = sixCal * nineSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day3Exercise1Sets.equalsIgnoreCase("9")) {
            day3exercise1calories = sevenCal * nineSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Less than 5") && day3Exercise1Sets.equalsIgnoreCase("10")) {
            day3exercise1calories = oneCal * tenSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day3Exercise1Sets.equalsIgnoreCase("10")) {
            day3exercise1calories = twoCal * tenSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day3Exercise1Sets.equalsIgnoreCase("10")) {
            day3exercise1calories = threeCal * tenSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day3Exercise1Sets.equalsIgnoreCase("10")) {
            day3exercise1calories = fourCal * tenSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day3Exercise1Sets.equalsIgnoreCase("10")) {
            day3exercise1calories = fiveCal * tenSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day3Exercise1Sets.equalsIgnoreCase("10")) {
            day3exercise1calories = sixCal * tenSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day3Exercise1Sets.equalsIgnoreCase("10")) {
            day3exercise1calories = sevenCal * tenSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Less than 5") && day3Exercise1Sets.equalsIgnoreCase("11")) {
            day3exercise1calories = oneCal * elevenSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day3Exercise1Sets.equalsIgnoreCase("11")) {
            day3exercise1calories = twoCal * elevenSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day3Exercise1Sets.equalsIgnoreCase("11")) {
            day3exercise1calories = threeCal * elevenSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day3Exercise1Sets.equalsIgnoreCase("11")) {
            day3exercise1calories = fourCal * elevenSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day3Exercise1Sets.equalsIgnoreCase("11")) {
            day3exercise1calories = fiveCal * elevenSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day3Exercise1Sets.equalsIgnoreCase("11")) {
            day3exercise1calories = sixCal * elevenSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day3Exercise1Sets.equalsIgnoreCase("11")) {
            day3exercise1calories = sevenCal * elevenSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Less than 5") && day3Exercise1Sets.equalsIgnoreCase("12")) {
            day3exercise1calories = oneCal * twelveSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day3Exercise1Sets.equalsIgnoreCase("12")) {
            day3exercise1calories = twoCal * twelveSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day3Exercise1Sets.equalsIgnoreCase("12")) {
            day3exercise1calories = threeCal * twelveSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day3Exercise1Sets.equalsIgnoreCase("12")) {
            day3exercise1calories = fourCal * twelveSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day3Exercise1Sets.equalsIgnoreCase("12")) {
            day3exercise1calories = fiveCal * twelveSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day3Exercise1Sets.equalsIgnoreCase("12")) {
            day3exercise1calories = sixCal * twelveSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }

        if (day3Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day3Exercise1Sets.equalsIgnoreCase("12")) {
            day3exercise1calories = sevenCal * twelveSets;
            day3ex1cals = String.valueOf(day3exercise1calories);
            day3ex1calories.setText(day3ex1cals);
        }
    }

    public void day4ex1Calculate(View view) {

        day4Exercise1Reps = day4ex1reps;
        day4Exercise1Sets = day4ex1sets;

        day4ex1calories = findViewById(R.id.day4ex1calories);

        if (day4Exercise1Reps.equalsIgnoreCase("0") && day4Exercise1Sets.equalsIgnoreCase("0")) {
            day4exercise1calories = 0;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Less than 5") && day4Exercise1Sets.equalsIgnoreCase("1")) {
            day4exercise1calories = oneCal * oneSet;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day4Exercise1Sets.equalsIgnoreCase("1")) {
            day4exercise1calories = twoCal * oneSet;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day4Exercise1Sets.equalsIgnoreCase("1")) {
            day4exercise1calories = threeCal * oneSet;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day4Exercise1Sets.equalsIgnoreCase("1")) {
            day4exercise1calories = fourCal * oneSet;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day4Exercise1Sets.equalsIgnoreCase("1")) {
            day4exercise1calories = fiveCal * oneSet;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day4Exercise1Sets.equalsIgnoreCase("1")) {
            day4exercise1calories = sixCal * oneSet;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day4Exercise1Sets.equalsIgnoreCase("1")) {
            day4exercise1calories = sevenCal * oneSet;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Less than 5") && day4Exercise1Sets.equalsIgnoreCase("2")) {
            day4exercise1calories = oneCal * twoSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day4Exercise1Sets.equalsIgnoreCase("2")) {
            day4exercise1calories = twoCal * twoSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day4Exercise1Sets.equalsIgnoreCase("2")) {
            day4exercise1calories = threeCal * twoSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day4Exercise1Sets.equalsIgnoreCase("2")) {
            day4exercise1calories = fourCal * twoSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day4Exercise1Sets.equalsIgnoreCase("2")) {
            day4exercise1calories = fiveCal * twoSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day4Exercise1Sets.equalsIgnoreCase("2")) {
            day4exercise1calories = sixCal * twoSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day4Exercise1Sets.equalsIgnoreCase("2")) {
            day4exercise1calories = sevenCal * twoSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Less than 5") && day4Exercise1Sets.equalsIgnoreCase("3")) {
            day4exercise1calories = oneCal * threeSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day4Exercise1Sets.equalsIgnoreCase("3")) {
            day4exercise1calories = twoCal * threeSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day4Exercise1Sets.equalsIgnoreCase("3")) {
            day4exercise1calories = threeCal * threeSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day4Exercise1Sets.equalsIgnoreCase("3")) {
            day4exercise1calories = fourCal * threeSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day4Exercise1Sets.equalsIgnoreCase("3")) {
            day4exercise1calories = fiveCal * threeSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day4Exercise1Sets.equalsIgnoreCase("3")) {
            day4exercise1calories = sixCal * threeSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day4Exercise1Sets.equalsIgnoreCase("3")) {
            day4exercise1calories = sevenCal * threeSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Less than 5") && day4Exercise1Sets.equalsIgnoreCase("4")) {
            day4exercise1calories = oneCal * fourSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day4Exercise1Sets.equalsIgnoreCase("4")) {
            day4exercise1calories = twoCal * fourSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day4Exercise1Sets.equalsIgnoreCase("4")) {
            day4exercise1calories = threeCal * fourSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day4Exercise1Sets.equalsIgnoreCase("4")) {
            day4exercise1calories = fourCal * fourSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day4Exercise1Sets.equalsIgnoreCase("4")) {
            day4exercise1calories = fiveCal * fourSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day4Exercise1Sets.equalsIgnoreCase("4")) {
            day4exercise1calories = sixCal * fourSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day4Exercise1Sets.equalsIgnoreCase("4")) {
            day4exercise1calories = sevenCal * fourSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Less than 5") && day4Exercise1Sets.equalsIgnoreCase("5")) {
            day4exercise1calories = oneCal * fiveSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day4Exercise1Sets.equalsIgnoreCase("5")) {
            day4exercise1calories = twoCal * fiveSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day4Exercise1Sets.equalsIgnoreCase("5")) {
            day4exercise1calories = threeCal * fiveSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day4Exercise1Sets.equalsIgnoreCase("5")) {
            day4exercise1calories = fourCal * fiveSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day4Exercise1Sets.equalsIgnoreCase("5")) {
            day4exercise1calories = fiveCal * fiveSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day4Exercise1Sets.equalsIgnoreCase("5")) {
            day4exercise1calories = sixCal * fiveSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day4Exercise1Sets.equalsIgnoreCase("5")) {
            day4exercise1calories = sevenCal * fiveSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Less than 5") && day4Exercise1Sets.equalsIgnoreCase("6")) {
            day4exercise1calories = oneCal * sixSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day4Exercise1Sets.equalsIgnoreCase("6")) {
            day4exercise1calories = twoCal * sixSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day4Exercise1Sets.equalsIgnoreCase("6")) {
            day4exercise1calories = threeCal * sixSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day4Exercise1Sets.equalsIgnoreCase("6")) {
            day4exercise1calories = fourCal * sixSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day4Exercise1Sets.equalsIgnoreCase("6")) {
            day4exercise1calories = fiveCal * sixSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day4Exercise1Sets.equalsIgnoreCase("6")) {
            day4exercise1calories = sixCal * sixSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day4Exercise1Sets.equalsIgnoreCase("6")) {
            day4exercise1calories = sevenCal * sixSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }
        if (day4Exercise1Reps.equalsIgnoreCase("Less than 5") && day4Exercise1Sets.equalsIgnoreCase("7")) {
            day4exercise1calories = oneCal * sevenSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day4Exercise1Sets.equalsIgnoreCase("7")) {
            day4exercise1calories = twoCal * sevenSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day4Exercise1Sets.equalsIgnoreCase("7")) {
            day4exercise1calories = threeCal * sevenSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day4Exercise1Sets.equalsIgnoreCase("7")) {
            day4exercise1calories = fourCal * sevenSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day4Exercise1Sets.equalsIgnoreCase("7")) {
            day4exercise1calories = fiveCal * sevenSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day4Exercise1Sets.equalsIgnoreCase("7")) {
            day4exercise1calories = sixCal * sevenSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day4Exercise1Sets.equalsIgnoreCase("7")) {
            day4exercise1calories = sevenCal * sevenSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Less than 5") && day4Exercise1Sets.equalsIgnoreCase("8")) {
            day4exercise1calories = oneCal * eightSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day4Exercise1Sets.equalsIgnoreCase("8")) {
            day4exercise1calories = twoCal * eightSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day4Exercise1Sets.equalsIgnoreCase("8")) {
            day4exercise1calories = threeCal * eightSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day4Exercise1Sets.equalsIgnoreCase("8")) {
            day4exercise1calories = fourCal * eightSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day4Exercise1Sets.equalsIgnoreCase("8")) {
            day4exercise1calories = fiveCal * eightSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day4Exercise1Sets.equalsIgnoreCase("8")) {
            day4exercise1calories = sixCal * eightSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day4Exercise1Sets.equalsIgnoreCase("8")) {
            day4exercise1calories = sevenCal * eightSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Less than 5") && day4Exercise1Sets.equalsIgnoreCase("9")) {
            day4exercise1calories = oneCal * nineSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day4Exercise1Sets.equalsIgnoreCase("9")) {
            day4exercise1calories = twoCal * nineSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day4Exercise1Sets.equalsIgnoreCase("9")) {
            day4exercise1calories = threeCal * nineSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day4Exercise1Sets.equalsIgnoreCase("9")) {
            day4exercise1calories = fourCal * nineSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day4Exercise1Sets.equalsIgnoreCase("9")) {
            day4exercise1calories = fiveCal * nineSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day4Exercise1Sets.equalsIgnoreCase("9")) {
            day4exercise1calories = sixCal * nineSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day4Exercise1Sets.equalsIgnoreCase("9")) {
            day4exercise1calories = sevenCal * nineSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Less than 5") && day4Exercise1Sets.equalsIgnoreCase("10")) {
            day4exercise1calories = oneCal * tenSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day4Exercise1Sets.equalsIgnoreCase("10")) {
            day4exercise1calories = twoCal * tenSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day4Exercise1Sets.equalsIgnoreCase("10")) {
            day4exercise1calories = threeCal * tenSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day4Exercise1Sets.equalsIgnoreCase("10")) {
            day4exercise1calories = fourCal * tenSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day4Exercise1Sets.equalsIgnoreCase("10")) {
            day4exercise1calories = fiveCal * tenSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day4Exercise1Sets.equalsIgnoreCase("10")) {
            day4exercise1calories = sixCal * tenSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day4Exercise1Sets.equalsIgnoreCase("10")) {
            day4exercise1calories = sevenCal * tenSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Less than 5") && day4Exercise1Sets.equalsIgnoreCase("11")) {
            day4exercise1calories = oneCal * elevenSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day4Exercise1Sets.equalsIgnoreCase("11")) {
            day4exercise1calories = twoCal * elevenSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day4Exercise1Sets.equalsIgnoreCase("11")) {
            day4exercise1calories = threeCal * elevenSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day4Exercise1Sets.equalsIgnoreCase("11")) {
            day4exercise1calories = fourCal * elevenSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day4Exercise1Sets.equalsIgnoreCase("11")) {
            day4exercise1calories = fiveCal * elevenSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day4Exercise1Sets.equalsIgnoreCase("11")) {
            day4exercise1calories = sixCal * elevenSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day4Exercise1Sets.equalsIgnoreCase("11")) {
            day4exercise1calories = sevenCal * elevenSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Less than 5") && day4Exercise1Sets.equalsIgnoreCase("12")) {
            day4exercise1calories = oneCal * twelveSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day4Exercise1Sets.equalsIgnoreCase("12")) {
            day4exercise1calories = twoCal * twelveSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day4Exercise1Sets.equalsIgnoreCase("12")) {
            day4exercise1calories = threeCal * twelveSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day4Exercise1Sets.equalsIgnoreCase("12")) {
            day4exercise1calories = fourCal * twelveSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day4Exercise1Sets.equalsIgnoreCase("12")) {
            day4exercise1calories = fiveCal * twelveSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day4Exercise1Sets.equalsIgnoreCase("12")) {
            day4exercise1calories = sixCal * twelveSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }

        if (day4Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day4Exercise1Sets.equalsIgnoreCase("12")) {
            day4exercise1calories = sevenCal * twelveSets;
            day4ex1cals = String.valueOf(day4exercise1calories);
            day4ex1calories.setText(day4ex1cals);
        }
    }



    public void day5ex1Calculate(View view) {

        day5Exercise1Reps = day5ex1reps;
        day5Exercise1Sets = day5ex1sets;

        day5ex1calories = findViewById(R.id.day5ex1calories);

        if (day5Exercise1Reps.equalsIgnoreCase("0") && day5Exercise1Sets.equalsIgnoreCase("0")) {
            day5exercise1calories = 0;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Less than 5") && day5Exercise1Sets.equalsIgnoreCase("1")) {
            day5exercise1calories = oneCal * oneSet;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day5Exercise1Sets.equalsIgnoreCase("1")) {
            day5exercise1calories = twoCal * oneSet;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day5Exercise1Sets.equalsIgnoreCase("1")) {
            day5exercise1calories = threeCal * oneSet;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day5Exercise1Sets.equalsIgnoreCase("1")) {
            day5exercise1calories = fourCal * oneSet;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day5Exercise1Sets.equalsIgnoreCase("1")) {
            day5exercise1calories = fiveCal * oneSet;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day5Exercise1Sets.equalsIgnoreCase("1")) {
            day5exercise1calories = sixCal * oneSet;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day5Exercise1Sets.equalsIgnoreCase("1")) {
            day5exercise1calories = sevenCal * oneSet;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Less than 5") && day5Exercise1Sets.equalsIgnoreCase("2")) {
            day5exercise1calories = oneCal * twoSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day5Exercise1Sets.equalsIgnoreCase("2")) {
            day5exercise1calories = twoCal * twoSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day5Exercise1Sets.equalsIgnoreCase("2")) {
            day5exercise1calories = threeCal * twoSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day5Exercise1Sets.equalsIgnoreCase("2")) {
            day5exercise1calories = fourCal * twoSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day5Exercise1Sets.equalsIgnoreCase("2")) {
            day5exercise1calories = fiveCal * twoSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day5Exercise1Sets.equalsIgnoreCase("2")) {
            day5exercise1calories = sixCal * twoSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day5Exercise1Sets.equalsIgnoreCase("2")) {
            day5exercise1calories = sevenCal * twoSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Less than 5") && day5Exercise1Sets.equalsIgnoreCase("3")) {
            day5exercise1calories = oneCal * threeSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day5Exercise1Sets.equalsIgnoreCase("3")) {
            day5exercise1calories = twoCal * threeSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day5Exercise1Sets.equalsIgnoreCase("3")) {
            day5exercise1calories = threeCal * threeSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day5Exercise1Sets.equalsIgnoreCase("3")) {
            day5exercise1calories = fourCal * threeSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day5Exercise1Sets.equalsIgnoreCase("3")) {
            day5exercise1calories = fiveCal * threeSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day5Exercise1Sets.equalsIgnoreCase("3")) {
            day5exercise1calories = sixCal * threeSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day5Exercise1Sets.equalsIgnoreCase("3")) {
            day5exercise1calories = sevenCal * threeSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Less than 5") && day5Exercise1Sets.equalsIgnoreCase("4")) {
            day5exercise1calories = oneCal * fourSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day5Exercise1Sets.equalsIgnoreCase("4")) {
            day5exercise1calories = twoCal * fourSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day5Exercise1Sets.equalsIgnoreCase("4")) {
            day5exercise1calories = threeCal * fourSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day5Exercise1Sets.equalsIgnoreCase("4")) {
            day5exercise1calories = fourCal * fourSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day5Exercise1Sets.equalsIgnoreCase("4")) {
            day5exercise1calories = fiveCal * fourSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day5Exercise1Sets.equalsIgnoreCase("4")) {
            day5exercise1calories = sixCal * fourSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day5Exercise1Sets.equalsIgnoreCase("4")) {
            day5exercise1calories = sevenCal * fourSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Less than 5") && day5Exercise1Sets.equalsIgnoreCase("5")) {
            day5exercise1calories = oneCal * fiveSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day5Exercise1Sets.equalsIgnoreCase("5")) {
            day5exercise1calories = twoCal * fiveSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day5Exercise1Sets.equalsIgnoreCase("5")) {
            day5exercise1calories = threeCal * fiveSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day5Exercise1Sets.equalsIgnoreCase("5")) {
            day5exercise1calories = fourCal * fiveSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day5Exercise1Sets.equalsIgnoreCase("5")) {
            day5exercise1calories = fiveCal * fiveSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day5Exercise1Sets.equalsIgnoreCase("5")) {
            day5exercise1calories = sixCal * fiveSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day5Exercise1Sets.equalsIgnoreCase("5")) {
            day5exercise1calories = sevenCal * fiveSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Less than 5") && day5Exercise1Sets.equalsIgnoreCase("6")) {
            day5exercise1calories = oneCal * sixSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day5Exercise1Sets.equalsIgnoreCase("6")) {
            day5exercise1calories = twoCal * sixSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day5Exercise1Sets.equalsIgnoreCase("6")) {
            day5exercise1calories = threeCal * sixSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day5Exercise1Sets.equalsIgnoreCase("6")) {
            day5exercise1calories = fourCal * sixSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day5Exercise1Sets.equalsIgnoreCase("6")) {
            day5exercise1calories = fiveCal * sixSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day5Exercise1Sets.equalsIgnoreCase("6")) {
            day5exercise1calories = sixCal * sixSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day5Exercise1Sets.equalsIgnoreCase("6")) {
            day5exercise1calories = sevenCal * sixSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }
        if (day5Exercise1Reps.equalsIgnoreCase("Less than 5") && day5Exercise1Sets.equalsIgnoreCase("7")) {
            day5exercise1calories = oneCal * sevenSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day5Exercise1Sets.equalsIgnoreCase("7")) {
            day5exercise1calories = twoCal * sevenSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day5Exercise1Sets.equalsIgnoreCase("7")) {
            day5exercise1calories = threeCal * sevenSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day5Exercise1Sets.equalsIgnoreCase("7")) {
            day5exercise1calories = fourCal * sevenSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day5Exercise1Sets.equalsIgnoreCase("7")) {
            day5exercise1calories = fiveCal * sevenSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day5Exercise1Sets.equalsIgnoreCase("7")) {
            day5exercise1calories = sixCal * sevenSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day5Exercise1Sets.equalsIgnoreCase("7")) {
            day5exercise1calories = sevenCal * sevenSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Less than 5") && day5Exercise1Sets.equalsIgnoreCase("8")) {
            day5exercise1calories = oneCal * eightSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day5Exercise1Sets.equalsIgnoreCase("8")) {
            day5exercise1calories = twoCal * eightSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day5Exercise1Sets.equalsIgnoreCase("8")) {
            day5exercise1calories = threeCal * eightSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day5Exercise1Sets.equalsIgnoreCase("8")) {
            day5exercise1calories = fourCal * eightSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day5Exercise1Sets.equalsIgnoreCase("8")) {
            day5exercise1calories = fiveCal * eightSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day5Exercise1Sets.equalsIgnoreCase("8")) {
            day5exercise1calories = sixCal * eightSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day5Exercise1Sets.equalsIgnoreCase("8")) {
            day5exercise1calories = sevenCal * eightSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Less than 5") && day5Exercise1Sets.equalsIgnoreCase("9")) {
            day5exercise1calories = oneCal * nineSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day5Exercise1Sets.equalsIgnoreCase("9")) {
            day5exercise1calories = twoCal * nineSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day5Exercise1Sets.equalsIgnoreCase("9")) {
            day5exercise1calories = threeCal * nineSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day5Exercise1Sets.equalsIgnoreCase("9")) {
            day5exercise1calories = fourCal * nineSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day5Exercise1Sets.equalsIgnoreCase("9")) {
            day5exercise1calories = fiveCal * nineSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day5Exercise1Sets.equalsIgnoreCase("9")) {
            day5exercise1calories = sixCal * nineSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day5Exercise1Sets.equalsIgnoreCase("9")) {
            day5exercise1calories = sevenCal * nineSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Less than 5") && day5Exercise1Sets.equalsIgnoreCase("10")) {
            day5exercise1calories = oneCal * tenSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day5Exercise1Sets.equalsIgnoreCase("10")) {
            day5exercise1calories = twoCal * tenSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day5Exercise1Sets.equalsIgnoreCase("10")) {
            day5exercise1calories = threeCal * tenSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day5Exercise1Sets.equalsIgnoreCase("10")) {
            day5exercise1calories = fourCal * tenSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day5Exercise1Sets.equalsIgnoreCase("10")) {
            day5exercise1calories = fiveCal * tenSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day5Exercise1Sets.equalsIgnoreCase("10")) {
            day5exercise1calories = sixCal * tenSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day5Exercise1Sets.equalsIgnoreCase("10")) {
            day5exercise1calories = sevenCal * tenSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Less than 5") && day5Exercise1Sets.equalsIgnoreCase("11")) {
            day5exercise1calories = oneCal * elevenSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day5Exercise1Sets.equalsIgnoreCase("11")) {
            day5exercise1calories = twoCal * elevenSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day5Exercise1Sets.equalsIgnoreCase("11")) {
            day5exercise1calories = threeCal * elevenSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day5Exercise1Sets.equalsIgnoreCase("11")) {
            day5exercise1calories = fourCal * elevenSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day5Exercise1Sets.equalsIgnoreCase("11")) {
            day5exercise1calories = fiveCal * elevenSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day5Exercise1Sets.equalsIgnoreCase("11")) {
            day5exercise1calories = sixCal * elevenSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day5Exercise1Sets.equalsIgnoreCase("11")) {
            day5exercise1calories = sevenCal * elevenSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Less than 5") && day5Exercise1Sets.equalsIgnoreCase("12")) {
            day5exercise1calories = oneCal * twelveSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 5 and 10") && day5Exercise1Sets.equalsIgnoreCase("12")) {
            day5exercise1calories = twoCal * twelveSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 10 and 15") && day5Exercise1Sets.equalsIgnoreCase("12")) {
            day5exercise1calories = threeCal * twelveSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 15 and 20") && day5Exercise1Sets.equalsIgnoreCase("12")) {
            day5exercise1calories = fourCal * twelveSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 20 and 25") && day5Exercise1Sets.equalsIgnoreCase("12")) {
            day5exercise1calories = fiveCal * twelveSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 25 and 30") && day5Exercise1Sets.equalsIgnoreCase("12")) {
            day5exercise1calories = sixCal * twelveSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }

        if (day5Exercise1Reps.equalsIgnoreCase("Between 30 and 35") && day5Exercise1Sets.equalsIgnoreCase("12")) {
            day5exercise1calories = sevenCal * twelveSets;
            day5ex1cals = String.valueOf(day5exercise1calories);
            day5ex1calories.setText(day5ex1cals);
        }
    }



    public void day1ex2Calculate(View view) {

        day1Exercise2Reps = day1ex2reps;
        day1Exercise2Sets = day1ex2sets;

        day1ex2calories = findViewById(R.id.day1ex2calories);

        if (day1Exercise2Reps.equalsIgnoreCase("0") && day1Exercise2Sets.equalsIgnoreCase("0")) {
            day1exercise2calories = 0;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Less than 5") && day1Exercise2Sets.equalsIgnoreCase("1")) {
            day1exercise2calories = oneCal * oneSet;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day1Exercise2Sets.equalsIgnoreCase("1")) {
            day1exercise2calories = twoCal * oneSet;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day1Exercise2Sets.equalsIgnoreCase("1")) {
            day1exercise2calories = threeCal * oneSet;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day1Exercise2Sets.equalsIgnoreCase("1")) {
            day1exercise2calories = fourCal * oneSet;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day1Exercise2Sets.equalsIgnoreCase("1")) {
            day1exercise2calories = fiveCal * oneSet;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day1Exercise2Sets.equalsIgnoreCase("1")) {
            day1exercise2calories = sixCal * oneSet;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day1Exercise2Sets.equalsIgnoreCase("1")) {
            day1exercise2calories = sevenCal * oneSet;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Less than 5") && day1Exercise2Sets.equalsIgnoreCase("2")) {
            day1exercise2calories = oneCal * twoSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day1Exercise2Sets.equalsIgnoreCase("2")) {
            day1exercise2calories = twoCal * twoSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day1Exercise2Sets.equalsIgnoreCase("2")) {
            day1exercise2calories = threeCal * twoSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day1Exercise2Sets.equalsIgnoreCase("2")) {
            day1exercise2calories = fourCal * twoSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day1Exercise2Sets.equalsIgnoreCase("2")) {
            day1exercise2calories = fiveCal * twoSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day1Exercise2Sets.equalsIgnoreCase("2")) {
            day1exercise2calories = sixCal * twoSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day1Exercise2Sets.equalsIgnoreCase("2")) {
            day1exercise2calories = sevenCal * twoSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Less than 5") && day1Exercise2Sets.equalsIgnoreCase("3")) {
            day1exercise2calories = oneCal * threeSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day1Exercise2Sets.equalsIgnoreCase("3")) {
            day1exercise2calories = twoCal * threeSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day1Exercise2Sets.equalsIgnoreCase("3")) {
            day1exercise2calories = threeCal * threeSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day1Exercise2Sets.equalsIgnoreCase("3")) {
            day1exercise2calories = fourCal * threeSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day1Exercise2Sets.equalsIgnoreCase("3")) {
            day1exercise2calories = fiveCal * threeSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day1Exercise2Sets.equalsIgnoreCase("3")) {
            day1exercise2calories = sixCal * threeSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day1Exercise2Sets.equalsIgnoreCase("3")) {
            day1exercise2calories = sevenCal * threeSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Less than 5") && day1Exercise2Sets.equalsIgnoreCase("4")) {
            day1exercise2calories = oneCal * fourSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day1Exercise2Sets.equalsIgnoreCase("4")) {
            day1exercise2calories = twoCal * fourSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day1Exercise2Sets.equalsIgnoreCase("4")) {
            day1exercise2calories = threeCal * fourSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day1Exercise2Sets.equalsIgnoreCase("4")) {
            day1exercise2calories = fourCal * fourSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day1Exercise2Sets.equalsIgnoreCase("4")) {
            day1exercise2calories = fiveCal * fourSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day1Exercise2Sets.equalsIgnoreCase("4")) {
            day1exercise2calories = sixCal * fourSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day1Exercise2Sets.equalsIgnoreCase("4")) {
            day1exercise2calories = sevenCal * fourSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Less than 5") && day1Exercise2Sets.equalsIgnoreCase("5")) {
            day1exercise2calories = oneCal * fiveSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day1Exercise2Sets.equalsIgnoreCase("5")) {
            day1exercise2calories = twoCal * fiveSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day1Exercise2Sets.equalsIgnoreCase("5")) {
            day1exercise2calories = threeCal * fiveSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day1Exercise2Sets.equalsIgnoreCase("5")) {
            day1exercise2calories = fourCal * fiveSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day1Exercise2Sets.equalsIgnoreCase("5")) {
            day1exercise2calories = fiveCal * fiveSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day1Exercise2Sets.equalsIgnoreCase("5")) {
            day1exercise2calories = sixCal * fiveSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day1Exercise2Sets.equalsIgnoreCase("5")) {
            day1exercise2calories = sevenCal * fiveSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Less than 5") && day1Exercise2Sets.equalsIgnoreCase("6")) {
            day1exercise2calories = oneCal * sixSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day1Exercise2Sets.equalsIgnoreCase("6")) {
            day1exercise2calories = twoCal * sixSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day1Exercise2Sets.equalsIgnoreCase("6")) {
            day1exercise2calories = threeCal * sixSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day1Exercise2Sets.equalsIgnoreCase("6")) {
            day1exercise2calories = fourCal * sixSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day1Exercise2Sets.equalsIgnoreCase("6")) {
            day1exercise2calories = fiveCal * sixSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day1Exercise2Sets.equalsIgnoreCase("6")) {
            day1exercise2calories = sixCal * sixSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day1Exercise2Sets.equalsIgnoreCase("6")) {
            day1exercise2calories = sevenCal * sixSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Less than 5") && day1Exercise2Sets.equalsIgnoreCase("7")) {
            day1exercise2calories = oneCal * sevenSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day1Exercise2Sets.equalsIgnoreCase("7")) {
            day1exercise2calories = twoCal * sevenSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day1Exercise2Sets.equalsIgnoreCase("7")) {
            day1exercise2calories = threeCal * sevenSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day1Exercise2Sets.equalsIgnoreCase("7")) {
            day1exercise2calories = fourCal * sevenSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day1Exercise2Sets.equalsIgnoreCase("7")) {
            day1exercise2calories = fiveCal * sevenSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day1Exercise2Sets.equalsIgnoreCase("7")) {
            day1exercise2calories = sixCal * sevenSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day1Exercise2Sets.equalsIgnoreCase("7")) {
            day1exercise2calories = sevenCal * sevenSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Less than 5") && day1Exercise2Sets.equalsIgnoreCase("8")) {
            day1exercise2calories = oneCal * eightSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day1Exercise2Sets.equalsIgnoreCase("8")) {
            day1exercise2calories = twoCal * eightSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day1Exercise2Sets.equalsIgnoreCase("8")) {
            day1exercise2calories = threeCal * eightSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day1Exercise2Sets.equalsIgnoreCase("8")) {
            day1exercise2calories = fourCal * eightSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day1Exercise2Sets.equalsIgnoreCase("8")) {
            day1exercise2calories = fiveCal * eightSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day1Exercise2Sets.equalsIgnoreCase("8")) {
            day1exercise2calories = sixCal * eightSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day1Exercise2Sets.equalsIgnoreCase("8")) {
            day1exercise2calories = sevenCal * eightSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Less than 5") && day1Exercise2Sets.equalsIgnoreCase("9")) {
            day1exercise2calories = oneCal * nineSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day1Exercise2Sets.equalsIgnoreCase("9")) {
            day1exercise2calories = twoCal * nineSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day1Exercise2Sets.equalsIgnoreCase("9")) {
            day1exercise2calories = threeCal * nineSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day1Exercise2Sets.equalsIgnoreCase("9")) {
            day1exercise2calories = fourCal * nineSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day1Exercise2Sets.equalsIgnoreCase("9")) {
            day1exercise2calories = fiveCal * nineSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day1Exercise2Sets.equalsIgnoreCase("9")) {
            day1exercise2calories = sixCal * nineSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day1Exercise2Sets.equalsIgnoreCase("9")) {
            day1exercise2calories = sevenCal * nineSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Less than 5") && day1Exercise2Sets.equalsIgnoreCase("10")) {
            day1exercise2calories = oneCal * tenSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day1Exercise2Sets.equalsIgnoreCase("10")) {
            day1exercise2calories = twoCal * tenSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day1Exercise2Sets.equalsIgnoreCase("10")) {
            day1exercise2calories = threeCal * tenSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day1Exercise2Sets.equalsIgnoreCase("10")) {
            day1exercise2calories = fourCal * tenSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day1Exercise2Sets.equalsIgnoreCase("10")) {
            day1exercise2calories = fiveCal * tenSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day1Exercise2Sets.equalsIgnoreCase("10")) {
            day1exercise2calories = sixCal * tenSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day1Exercise2Sets.equalsIgnoreCase("10")) {
            day1exercise2calories = sevenCal * tenSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Less than 5") && day1Exercise2Sets.equalsIgnoreCase("11")) {
            day1exercise2calories = oneCal * elevenSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day1Exercise2Sets.equalsIgnoreCase("11")) {
            day1exercise2calories = twoCal * elevenSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day1Exercise2Sets.equalsIgnoreCase("11")) {
            day1exercise2calories = threeCal * elevenSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day1Exercise2Sets.equalsIgnoreCase("11")) {
            day1exercise2calories = fourCal * elevenSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day1Exercise2Sets.equalsIgnoreCase("11")) {
            day1exercise2calories = fiveCal * elevenSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day1Exercise2Sets.equalsIgnoreCase("11")) {
            day1exercise2calories = sixCal * elevenSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day1Exercise2Sets.equalsIgnoreCase("11")) {
            day1exercise2calories = sevenCal * elevenSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Less than 5") && day1Exercise2Sets.equalsIgnoreCase("12")) {
            day1exercise2calories = oneCal * twelveSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day1Exercise2Sets.equalsIgnoreCase("12")) {
            day1exercise2calories = twoCal * twelveSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day1Exercise2Sets.equalsIgnoreCase("12")) {
            day1exercise2calories = threeCal * twelveSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day1Exercise2Sets.equalsIgnoreCase("12")) {
            day1exercise2calories = fourCal * twelveSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day1Exercise2Sets.equalsIgnoreCase("12")) {
            day1exercise2calories = fiveCal * twelveSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day1Exercise2Sets.equalsIgnoreCase("12")) {
            day1exercise2calories = sixCal * twelveSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }

        if (day1Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day1Exercise2Sets.equalsIgnoreCase("12")) {
            day1exercise2calories = sevenCal * twelveSets;
            day1ex2cals = String.valueOf(day1exercise2calories);
            day1ex2calories.setText(day1ex2cals);
        }
    }


    public void day2ex2Calculate(View view) {
        day2Exercise2Reps = day2ex2reps;
        day2Exercise2Sets = day2ex2sets;

        day2ex2calories = findViewById(R.id.day2ex2calories);

        if (day2Exercise2Reps.equalsIgnoreCase("0") && day2Exercise2Sets.equalsIgnoreCase("0")) {
            day2exercise2calories = 0;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Less than 5") && day2Exercise2Sets.equalsIgnoreCase("1")) {
            day2exercise2calories = oneCal * oneSet;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day2Exercise2Sets.equalsIgnoreCase("1")) {
            day2exercise2calories = twoCal * oneSet;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day2Exercise2Sets.equalsIgnoreCase("1")) {
            day2exercise2calories = threeCal * oneSet;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day2Exercise2Sets.equalsIgnoreCase("1")) {
            day2exercise2calories = fourCal * oneSet;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day2Exercise2Sets.equalsIgnoreCase("1")) {
            day2exercise2calories = fiveCal * oneSet;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day2Exercise2Sets.equalsIgnoreCase("1")) {
            day2exercise2calories = sixCal * oneSet;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day2Exercise2Sets.equalsIgnoreCase("1")) {
            day2exercise2calories = sevenCal * oneSet;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Less than 5") && day2Exercise2Sets.equalsIgnoreCase("2")) {
            day2exercise2calories = oneCal * twoSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day2Exercise2Sets.equalsIgnoreCase("2")) {
            day2exercise2calories = twoCal * twoSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day2Exercise2Sets.equalsIgnoreCase("2")) {
            day2exercise2calories = threeCal * twoSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day2Exercise2Sets.equalsIgnoreCase("2")) {
            day2exercise2calories = fourCal * twoSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day2Exercise2Sets.equalsIgnoreCase("2")) {
            day2exercise2calories = fiveCal * twoSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day2Exercise2Sets.equalsIgnoreCase("2")) {
            day2exercise2calories = sixCal * twoSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day2Exercise2Sets.equalsIgnoreCase("2")) {
            day2exercise2calories = sevenCal * twoSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Less than 5") && day2Exercise2Sets.equalsIgnoreCase("3")) {
            day2exercise2calories = oneCal * threeSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day2Exercise2Sets.equalsIgnoreCase("3")) {
            day2exercise2calories = twoCal * threeSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day2Exercise2Sets.equalsIgnoreCase("3")) {
            day2exercise2calories = threeCal * threeSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day2Exercise2Sets.equalsIgnoreCase("3")) {
            day2exercise2calories = fourCal * threeSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day2Exercise2Sets.equalsIgnoreCase("3")) {
            day2exercise2calories = fiveCal * threeSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day2Exercise2Sets.equalsIgnoreCase("3")) {
            day2exercise2calories = sixCal * threeSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day2Exercise2Sets.equalsIgnoreCase("3")) {
            day2exercise2calories = sevenCal * threeSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Less than 5") && day2Exercise2Sets.equalsIgnoreCase("4")) {
            day2exercise2calories = oneCal * fourSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day2Exercise2Sets.equalsIgnoreCase("4")) {
            day2exercise2calories = twoCal * fourSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day2Exercise2Sets.equalsIgnoreCase("4")) {
            day2exercise2calories = threeCal * fourSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day2Exercise2Sets.equalsIgnoreCase("4")) {
            day2exercise2calories = fourCal * fourSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day2Exercise2Sets.equalsIgnoreCase("4")) {
            day2exercise2calories = fiveCal * fourSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day2Exercise2Sets.equalsIgnoreCase("4")) {
            day2exercise2calories = sixCal * fourSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day2Exercise2Sets.equalsIgnoreCase("4")) {
            day2exercise2calories = sevenCal * fourSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Less than 5") && day2Exercise2Sets.equalsIgnoreCase("5")) {
            day2exercise2calories = oneCal * fiveSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day2Exercise2Sets.equalsIgnoreCase("5")) {
            day2exercise2calories = twoCal * fiveSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day2Exercise2Sets.equalsIgnoreCase("5")) {
            day2exercise2calories = threeCal * fiveSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day2Exercise2Sets.equalsIgnoreCase("5")) {
            day2exercise2calories = fourCal * fiveSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day2Exercise2Sets.equalsIgnoreCase("5")) {
            day2exercise2calories = fiveCal * fiveSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day2Exercise2Sets.equalsIgnoreCase("5")) {
            day2exercise2calories = sixCal * fiveSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day2Exercise2Sets.equalsIgnoreCase("5")) {
            day2exercise2calories = sevenCal * fiveSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Less than 5") && day2Exercise2Sets.equalsIgnoreCase("6")) {
            day2exercise2calories = oneCal * sixSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day2Exercise2Sets.equalsIgnoreCase("6")) {
            day2exercise2calories = twoCal * sixSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day2Exercise2Sets.equalsIgnoreCase("6")) {
            day2exercise2calories = threeCal * sixSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day2Exercise2Sets.equalsIgnoreCase("6")) {
            day2exercise2calories = fourCal * sixSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day2Exercise2Sets.equalsIgnoreCase("6")) {
            day2exercise2calories = fiveCal * sixSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day2Exercise2Sets.equalsIgnoreCase("6")) {
            day2exercise2calories = sixCal * sixSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day2Exercise2Sets.equalsIgnoreCase("6")) {
            day2exercise2calories = sevenCal * sixSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Less than 5") && day2Exercise2Sets.equalsIgnoreCase("7")) {
            day2exercise2calories = oneCal * sevenSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day2Exercise2Sets.equalsIgnoreCase("7")) {
            day2exercise2calories = twoCal * sevenSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day2Exercise2Sets.equalsIgnoreCase("7")) {
            day2exercise2calories = threeCal * sevenSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day2Exercise2Sets.equalsIgnoreCase("7")) {
            day2exercise2calories = fourCal * sevenSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day2Exercise2Sets.equalsIgnoreCase("7")) {
            day2exercise2calories = fiveCal * sevenSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day2Exercise2Sets.equalsIgnoreCase("7")) {
            day2exercise2calories = sixCal * sevenSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day2Exercise2Sets.equalsIgnoreCase("7")) {
            day2exercise2calories = sevenCal * sevenSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Less than 5") && day2Exercise2Sets.equalsIgnoreCase("8")) {
            day2exercise2calories = oneCal * eightSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day2Exercise2Sets.equalsIgnoreCase("8")) {
            day2exercise2calories = twoCal * eightSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day2Exercise2Sets.equalsIgnoreCase("8")) {
            day2exercise2calories = threeCal * eightSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day2Exercise2Sets.equalsIgnoreCase("8")) {
            day2exercise2calories = fourCal * eightSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day2Exercise2Sets.equalsIgnoreCase("8")) {
            day2exercise2calories = fiveCal * eightSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day2Exercise2Sets.equalsIgnoreCase("8")) {
            day2exercise2calories = sixCal * eightSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day2Exercise2Sets.equalsIgnoreCase("8")) {
            day2exercise2calories = sevenCal * eightSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Less than 5") && day2Exercise2Sets.equalsIgnoreCase("9")) {
            day2exercise2calories = oneCal * nineSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day2Exercise2Sets.equalsIgnoreCase("9")) {
            day2exercise2calories = twoCal * nineSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day2Exercise2Sets.equalsIgnoreCase("9")) {
            day2exercise2calories = threeCal * nineSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day2Exercise2Sets.equalsIgnoreCase("9")) {
            day2exercise2calories = fourCal * nineSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day2Exercise2Sets.equalsIgnoreCase("9")) {
            day2exercise2calories = fiveCal * nineSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day2Exercise2Sets.equalsIgnoreCase("9")) {
            day2exercise2calories = sixCal * nineSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day2Exercise2Sets.equalsIgnoreCase("9")) {
            day2exercise2calories = sevenCal * nineSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Less than 5") && day2Exercise2Sets.equalsIgnoreCase("10")) {
            day2exercise2calories = oneCal * tenSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day2Exercise2Sets.equalsIgnoreCase("10")) {
            day2exercise2calories = twoCal * tenSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day2Exercise2Sets.equalsIgnoreCase("10")) {
            day2exercise2calories = threeCal * tenSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day2Exercise2Sets.equalsIgnoreCase("10")) {
            day2exercise2calories = fourCal * tenSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day2Exercise2Sets.equalsIgnoreCase("10")) {
            day2exercise2calories = fiveCal * tenSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day2Exercise2Sets.equalsIgnoreCase("10")) {
            day2exercise2calories = sixCal * tenSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day2Exercise2Sets.equalsIgnoreCase("10")) {
            day2exercise2calories = sevenCal * tenSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Less than 5") && day2Exercise2Sets.equalsIgnoreCase("11")) {
            day2exercise2calories = oneCal * elevenSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day2Exercise2Sets.equalsIgnoreCase("11")) {
            day2exercise2calories = twoCal * elevenSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day2Exercise2Sets.equalsIgnoreCase("11")) {
            day2exercise2calories = threeCal * elevenSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day2Exercise2Sets.equalsIgnoreCase("11")) {
            day2exercise2calories = fourCal * elevenSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day2Exercise2Sets.equalsIgnoreCase("11")) {
            day2exercise2calories = fiveCal * elevenSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day2Exercise2Sets.equalsIgnoreCase("11")) {
            day2exercise2calories = sixCal * elevenSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day2Exercise2Sets.equalsIgnoreCase("11")) {
            day2exercise2calories = sevenCal * elevenSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Less than 5") && day2Exercise2Sets.equalsIgnoreCase("12")) {
            day2exercise2calories = oneCal * twelveSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day2Exercise2Sets.equalsIgnoreCase("12")) {
            day2exercise2calories = twoCal * twelveSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day2Exercise2Sets.equalsIgnoreCase("12")) {
            day2exercise2calories = threeCal * twelveSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day2Exercise2Sets.equalsIgnoreCase("12")) {
            day2exercise2calories = fourCal * twelveSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day2Exercise2Sets.equalsIgnoreCase("12")) {
            day2exercise2calories = fiveCal * twelveSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day2Exercise2Sets.equalsIgnoreCase("12")) {
            day2exercise2calories = sixCal * twelveSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

        if (day2Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day2Exercise2Sets.equalsIgnoreCase("12")) {
            day2exercise2calories = sevenCal * twelveSets;
            day2ex2cals = String.valueOf(day2exercise2calories);
            day2ex2calories.setText(day2ex2cals);
        }

    }


    public void day3ex2Calculate(View view) {
        day3Exercise2Reps = day3ex2reps;
        day3Exercise2Sets = day3ex2sets;

        day3ex2calories = findViewById(R.id.day3ex2calories);

        if (day3Exercise2Reps.equalsIgnoreCase("0") && day3Exercise2Sets.equalsIgnoreCase("0")) {
            day3exercise2calories = 0;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Less than 5") && day3Exercise2Sets.equalsIgnoreCase("1")) {
            day3exercise2calories = oneCal * oneSet;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day3Exercise2Sets.equalsIgnoreCase("1")) {
            day3exercise2calories = twoCal * oneSet;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day3Exercise2Sets.equalsIgnoreCase("1")) {
            day3exercise2calories = threeCal * oneSet;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day3Exercise2Sets.equalsIgnoreCase("1")) {
            day3exercise2calories = fourCal * oneSet;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day3Exercise2Sets.equalsIgnoreCase("1")) {
            day3exercise2calories = fiveCal * oneSet;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day3Exercise2Sets.equalsIgnoreCase("1")) {
            day3exercise2calories = sixCal * oneSet;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day3Exercise2Sets.equalsIgnoreCase("1")) {
            day3exercise2calories = sevenCal * oneSet;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Less than 5") && day3Exercise2Sets.equalsIgnoreCase("2")) {
            day3exercise2calories = oneCal * twoSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day3Exercise2Sets.equalsIgnoreCase("2")) {
            day3exercise2calories = twoCal * twoSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day3Exercise2Sets.equalsIgnoreCase("2")) {
            day3exercise2calories = threeCal * twoSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day3Exercise2Sets.equalsIgnoreCase("2")) {
            day3exercise2calories = fourCal * twoSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day3Exercise2Sets.equalsIgnoreCase("2")) {
            day3exercise2calories = fiveCal * twoSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day3Exercise2Sets.equalsIgnoreCase("2")) {
            day3exercise2calories = sixCal * twoSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day3Exercise2Sets.equalsIgnoreCase("2")) {
            day3exercise2calories = sevenCal * twoSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Less than 5") && day3Exercise2Sets.equalsIgnoreCase("3")) {
            day3exercise2calories = oneCal * threeSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day3Exercise2Sets.equalsIgnoreCase("3")) {
            day3exercise2calories = twoCal * threeSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day3Exercise2Sets.equalsIgnoreCase("3")) {
            day3exercise2calories = threeCal * threeSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day3Exercise2Sets.equalsIgnoreCase("3")) {
            day3exercise2calories = fourCal * threeSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day3Exercise2Sets.equalsIgnoreCase("3")) {
            day3exercise2calories = fiveCal * threeSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day3Exercise2Sets.equalsIgnoreCase("3")) {
            day3exercise2calories = sixCal * threeSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day3Exercise2Sets.equalsIgnoreCase("3")) {
            day3exercise2calories = sevenCal * threeSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Less than 5") && day3Exercise2Sets.equalsIgnoreCase("4")) {
            day3exercise2calories = oneCal * fourSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day3Exercise2Sets.equalsIgnoreCase("4")) {
            day3exercise2calories = twoCal * fourSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day3Exercise2Sets.equalsIgnoreCase("4")) {
            day3exercise2calories = threeCal * fourSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day3Exercise2Sets.equalsIgnoreCase("4")) {
            day3exercise2calories = fourCal * fourSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day3Exercise2Sets.equalsIgnoreCase("4")) {
            day3exercise2calories = fiveCal * fourSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day3Exercise2Sets.equalsIgnoreCase("4")) {
            day3exercise2calories = sixCal * fourSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day3Exercise2Sets.equalsIgnoreCase("4")) {
            day3exercise2calories = sevenCal * fourSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Less than 5") && day3Exercise2Sets.equalsIgnoreCase("5")) {
            day3exercise2calories = oneCal * fiveSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day3Exercise2Sets.equalsIgnoreCase("5")) {
            day3exercise2calories = twoCal * fiveSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day3Exercise2Sets.equalsIgnoreCase("5")) {
            day3exercise2calories = threeCal * fiveSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day3Exercise2Sets.equalsIgnoreCase("5")) {
            day3exercise2calories = fourCal * fiveSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day3Exercise2Sets.equalsIgnoreCase("5")) {
            day3exercise2calories = fiveCal * fiveSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day3Exercise2Sets.equalsIgnoreCase("5")) {
            day3exercise2calories = sixCal * fiveSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day3Exercise2Sets.equalsIgnoreCase("5")) {
            day3exercise2calories = sevenCal * fiveSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Less than 5") && day3Exercise2Sets.equalsIgnoreCase("6")) {
            day3exercise2calories = oneCal * sixSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day3Exercise2Sets.equalsIgnoreCase("6")) {
            day3exercise2calories = twoCal * sixSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day3Exercise2Sets.equalsIgnoreCase("6")) {
            day3exercise2calories = threeCal * sixSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day3Exercise2Sets.equalsIgnoreCase("6")) {
            day3exercise2calories = fourCal * sixSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day3Exercise2Sets.equalsIgnoreCase("6")) {
            day3exercise2calories = fiveCal * sixSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day3Exercise2Sets.equalsIgnoreCase("6")) {
            day3exercise2calories = sixCal * sixSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day3Exercise2Sets.equalsIgnoreCase("6")) {
            day3exercise2calories = sevenCal * sixSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Less than 5") && day3Exercise2Sets.equalsIgnoreCase("7")) {
            day3exercise2calories = oneCal * sevenSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day3Exercise2Sets.equalsIgnoreCase("7")) {
            day3exercise2calories = twoCal * sevenSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day3Exercise2Sets.equalsIgnoreCase("7")) {
            day3exercise2calories = threeCal * sevenSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day3Exercise2Sets.equalsIgnoreCase("7")) {
            day3exercise2calories = fourCal * sevenSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day3Exercise2Sets.equalsIgnoreCase("7")) {
            day3exercise2calories = fiveCal * sevenSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day3Exercise2Sets.equalsIgnoreCase("7")) {
            day3exercise2calories = sixCal * sevenSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day3Exercise2Sets.equalsIgnoreCase("7")) {
            day3exercise2calories = sevenCal * sevenSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Less than 5") && day3Exercise2Sets.equalsIgnoreCase("8")) {
            day3exercise2calories = oneCal * eightSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day3Exercise2Sets.equalsIgnoreCase("8")) {
            day3exercise2calories = twoCal * eightSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day3Exercise2Sets.equalsIgnoreCase("8")) {
            day3exercise2calories = threeCal * eightSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day3Exercise2Sets.equalsIgnoreCase("8")) {
            day3exercise2calories = fourCal * eightSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day3Exercise2Sets.equalsIgnoreCase("8")) {
            day3exercise2calories = fiveCal * eightSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day3Exercise2Sets.equalsIgnoreCase("8")) {
            day3exercise2calories = sixCal * eightSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day3Exercise2Sets.equalsIgnoreCase("8")) {
            day3exercise2calories = sevenCal * eightSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Less than 5") && day3Exercise2Sets.equalsIgnoreCase("9")) {
            day3exercise2calories = oneCal * nineSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day3Exercise2Sets.equalsIgnoreCase("9")) {
            day3exercise2calories = twoCal * nineSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day3Exercise2Sets.equalsIgnoreCase("9")) {
            day3exercise2calories = threeCal * nineSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day3Exercise2Sets.equalsIgnoreCase("9")) {
            day3exercise2calories = fourCal * nineSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day3Exercise2Sets.equalsIgnoreCase("9")) {
            day3exercise2calories = fiveCal * nineSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day3Exercise2Sets.equalsIgnoreCase("9")) {
            day3exercise2calories = sixCal * nineSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day3Exercise2Sets.equalsIgnoreCase("9")) {
            day3exercise2calories = sevenCal * nineSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Less than 5") && day3Exercise2Sets.equalsIgnoreCase("10")) {
            day3exercise2calories = oneCal * tenSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day3Exercise2Sets.equalsIgnoreCase("10")) {
            day3exercise2calories = twoCal * tenSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day3Exercise2Sets.equalsIgnoreCase("10")) {
            day3exercise2calories = threeCal * tenSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day3Exercise2Sets.equalsIgnoreCase("10")) {
            day3exercise2calories = fourCal * tenSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day3Exercise2Sets.equalsIgnoreCase("10")) {
            day3exercise2calories = fiveCal * tenSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day3Exercise2Sets.equalsIgnoreCase("10")) {
            day3exercise2calories = sixCal * tenSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day3Exercise2Sets.equalsIgnoreCase("10")) {
            day3exercise2calories = sevenCal * tenSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Less than 5") && day3Exercise2Sets.equalsIgnoreCase("11")) {
            day3exercise2calories = oneCal * elevenSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day3Exercise2Sets.equalsIgnoreCase("11")) {
            day3exercise2calories = twoCal * elevenSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day3Exercise2Sets.equalsIgnoreCase("11")) {
            day3exercise2calories = threeCal * elevenSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day3Exercise2Sets.equalsIgnoreCase("11")) {
            day3exercise2calories = fourCal * elevenSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day3Exercise2Sets.equalsIgnoreCase("11")) {
            day3exercise2calories = fiveCal * elevenSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day3Exercise2Sets.equalsIgnoreCase("11")) {
            day3exercise2calories = sixCal * elevenSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day3Exercise2Sets.equalsIgnoreCase("11")) {
            day3exercise2calories = sevenCal * elevenSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Less than 5") && day3Exercise2Sets.equalsIgnoreCase("12")) {
            day3exercise2calories = oneCal * twelveSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day3Exercise2Sets.equalsIgnoreCase("12")) {
            day3exercise2calories = twoCal * twelveSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day3Exercise2Sets.equalsIgnoreCase("12")) {
            day3exercise2calories = threeCal * twelveSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day3Exercise2Sets.equalsIgnoreCase("12")) {
            day3exercise2calories = fourCal * twelveSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day3Exercise2Sets.equalsIgnoreCase("12")) {
            day3exercise2calories = fiveCal * twelveSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day3Exercise2Sets.equalsIgnoreCase("12")) {
            day3exercise2calories = sixCal * twelveSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }

        if (day3Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day3Exercise2Sets.equalsIgnoreCase("12")) {
            day3exercise2calories = sevenCal * twelveSets;
            day3ex2cals = String.valueOf(day3exercise2calories);
            day3ex2calories.setText(day3ex2cals);
        }
    }

    public void day4ex2Calculate(View view) {

        day4Exercise2Reps = day4ex2reps;
        day4Exercise2Sets = day4ex2sets;

        day4ex2calories = findViewById(R.id.day4ex2calories);

        if (day4Exercise2Reps.equalsIgnoreCase("0") && day4Exercise2Sets.equalsIgnoreCase("0")) {
            day4exercise2calories = 0;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Less than 5") && day4Exercise2Sets.equalsIgnoreCase("1")) {
            day4exercise2calories = oneCal * oneSet;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day4Exercise2Sets.equalsIgnoreCase("1")) {
            day4exercise2calories = twoCal * oneSet;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day4Exercise2Sets.equalsIgnoreCase("1")) {
            day4exercise2calories = threeCal * oneSet;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day4Exercise2Sets.equalsIgnoreCase("1")) {
            day4exercise2calories = fourCal * oneSet;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day4Exercise2Sets.equalsIgnoreCase("1")) {
            day4exercise2calories = fiveCal * oneSet;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day4Exercise2Sets.equalsIgnoreCase("1")) {
            day4exercise2calories = sixCal * oneSet;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day4Exercise2Sets.equalsIgnoreCase("1")) {
            day4exercise2calories = sevenCal * oneSet;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Less than 5") && day4Exercise2Sets.equalsIgnoreCase("2")) {
            day4exercise2calories = oneCal * twoSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day4Exercise2Sets.equalsIgnoreCase("2")) {
            day4exercise2calories = twoCal * twoSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day4Exercise2Sets.equalsIgnoreCase("2")) {
            day4exercise2calories = threeCal * twoSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day4Exercise2Sets.equalsIgnoreCase("2")) {
            day4exercise2calories = fourCal * twoSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day4Exercise2Sets.equalsIgnoreCase("2")) {
            day4exercise2calories = fiveCal * twoSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day4Exercise2Sets.equalsIgnoreCase("2")) {
            day4exercise2calories = sixCal * twoSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day4Exercise2Sets.equalsIgnoreCase("2")) {
            day4exercise2calories = sevenCal * twoSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Less than 5") && day4Exercise2Sets.equalsIgnoreCase("3")) {
            day4exercise2calories = oneCal * threeSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day4Exercise2Sets.equalsIgnoreCase("3")) {
            day4exercise2calories = twoCal * threeSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day4Exercise2Sets.equalsIgnoreCase("3")) {
            day4exercise2calories = threeCal * threeSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day4Exercise2Sets.equalsIgnoreCase("3")) {
            day4exercise2calories = fourCal * threeSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day4Exercise2Sets.equalsIgnoreCase("3")) {
            day4exercise2calories = fiveCal * threeSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day4Exercise2Sets.equalsIgnoreCase("3")) {
            day4exercise2calories = sixCal * threeSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day4Exercise2Sets.equalsIgnoreCase("3")) {
            day4exercise2calories = sevenCal * threeSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Less than 5") && day4Exercise2Sets.equalsIgnoreCase("4")) {
            day4exercise2calories = oneCal * fourSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day4Exercise2Sets.equalsIgnoreCase("4")) {
            day4exercise2calories = twoCal * fourSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day4Exercise2Sets.equalsIgnoreCase("4")) {
            day4exercise2calories = threeCal * fourSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day4Exercise2Sets.equalsIgnoreCase("4")) {
            day4exercise2calories = fourCal * fourSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day4Exercise2Sets.equalsIgnoreCase("4")) {
            day4exercise2calories = fiveCal * fourSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day4Exercise2Sets.equalsIgnoreCase("4")) {
            day4exercise2calories = sixCal * fourSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day4Exercise2Sets.equalsIgnoreCase("4")) {
            day4exercise2calories = sevenCal * fourSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Less than 5") && day4Exercise2Sets.equalsIgnoreCase("5")) {
            day4exercise2calories = oneCal * fiveSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day4Exercise2Sets.equalsIgnoreCase("5")) {
            day4exercise2calories = twoCal * fiveSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day4Exercise2Sets.equalsIgnoreCase("5")) {
            day4exercise2calories = threeCal * fiveSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day4Exercise2Sets.equalsIgnoreCase("5")) {
            day4exercise2calories = fourCal * fiveSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day4Exercise2Sets.equalsIgnoreCase("5")) {
            day4exercise2calories = fiveCal * fiveSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day4Exercise2Sets.equalsIgnoreCase("5")) {
            day4exercise2calories = sixCal * fiveSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day4Exercise2Sets.equalsIgnoreCase("5")) {
            day4exercise2calories = sevenCal * fiveSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Less than 5") && day4Exercise2Sets.equalsIgnoreCase("6")) {
            day4exercise2calories = oneCal * sixSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day4Exercise2Sets.equalsIgnoreCase("6")) {
            day4exercise2calories = twoCal * sixSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day4Exercise2Sets.equalsIgnoreCase("6")) {
            day4exercise2calories = threeCal * sixSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day4Exercise2Sets.equalsIgnoreCase("6")) {
            day4exercise2calories = fourCal * sixSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day4Exercise2Sets.equalsIgnoreCase("6")) {
            day4exercise2calories = fiveCal * sixSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day4Exercise2Sets.equalsIgnoreCase("6")) {
            day4exercise2calories = sixCal * sixSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day4Exercise2Sets.equalsIgnoreCase("6")) {
            day4exercise2calories = sevenCal * sixSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Less than 5") && day4Exercise2Sets.equalsIgnoreCase("7")) {
            day4exercise2calories = oneCal * sevenSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day4Exercise2Sets.equalsIgnoreCase("7")) {
            day4exercise2calories = twoCal * sevenSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day4Exercise2Sets.equalsIgnoreCase("7")) {
            day4exercise2calories = threeCal * sevenSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day4Exercise2Sets.equalsIgnoreCase("7")) {
            day4exercise2calories = fourCal * sevenSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day4Exercise2Sets.equalsIgnoreCase("7")) {
            day4exercise2calories = fiveCal * sevenSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day4Exercise2Sets.equalsIgnoreCase("7")) {
            day4exercise2calories = sixCal * sevenSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day4Exercise2Sets.equalsIgnoreCase("7")) {
            day4exercise2calories = sevenCal * sevenSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Less than 5") && day4Exercise2Sets.equalsIgnoreCase("8")) {
            day4exercise2calories = oneCal * eightSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day4Exercise2Sets.equalsIgnoreCase("8")) {
            day4exercise2calories = twoCal * eightSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day4Exercise2Sets.equalsIgnoreCase("8")) {
            day4exercise2calories = threeCal * eightSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day4Exercise2Sets.equalsIgnoreCase("8")) {
            day4exercise2calories = fourCal * eightSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day4Exercise2Sets.equalsIgnoreCase("8")) {
            day4exercise2calories = fiveCal * eightSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day4Exercise2Sets.equalsIgnoreCase("8")) {
            day4exercise2calories = sixCal * eightSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day4Exercise2Sets.equalsIgnoreCase("8")) {
            day4exercise2calories = sevenCal * eightSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Less than 5") && day4Exercise2Sets.equalsIgnoreCase("9")) {
            day4exercise2calories = oneCal * nineSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day4Exercise2Sets.equalsIgnoreCase("9")) {
            day4exercise2calories = twoCal * nineSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day4Exercise2Sets.equalsIgnoreCase("9")) {
            day4exercise2calories = threeCal * nineSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day4Exercise2Sets.equalsIgnoreCase("9")) {
            day4exercise2calories = fourCal * nineSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day4Exercise2Sets.equalsIgnoreCase("9")) {
            day4exercise2calories = fiveCal * nineSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day4Exercise2Sets.equalsIgnoreCase("9")) {
            day4exercise2calories = sixCal * nineSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day4Exercise2Sets.equalsIgnoreCase("9")) {
            day4exercise2calories = sevenCal * nineSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Less than 5") && day4Exercise2Sets.equalsIgnoreCase("10")) {
            day4exercise2calories = oneCal * tenSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day4Exercise2Sets.equalsIgnoreCase("10")) {
            day4exercise2calories = twoCal * tenSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day4Exercise2Sets.equalsIgnoreCase("10")) {
            day4exercise2calories = threeCal * tenSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day4Exercise2Sets.equalsIgnoreCase("10")) {
            day4exercise2calories = fourCal * tenSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day4Exercise2Sets.equalsIgnoreCase("10")) {
            day4exercise2calories = fiveCal * tenSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day4Exercise2Sets.equalsIgnoreCase("10")) {
            day4exercise2calories = sixCal * tenSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day4Exercise2Sets.equalsIgnoreCase("10")) {
            day4exercise2calories = sevenCal * tenSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Less than 5") && day4Exercise2Sets.equalsIgnoreCase("11")) {
            day4exercise2calories = oneCal * elevenSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day4Exercise2Sets.equalsIgnoreCase("11")) {
            day4exercise2calories = twoCal * elevenSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day4Exercise2Sets.equalsIgnoreCase("11")) {
            day4exercise2calories = threeCal * elevenSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day4Exercise2Sets.equalsIgnoreCase("11")) {
            day4exercise2calories = fourCal * elevenSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day4Exercise2Sets.equalsIgnoreCase("11")) {
            day4exercise2calories = fiveCal * elevenSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day4Exercise2Sets.equalsIgnoreCase("11")) {
            day4exercise2calories = sixCal * elevenSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day4Exercise2Sets.equalsIgnoreCase("11")) {
            day4exercise2calories = sevenCal * elevenSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Less than 5") && day4Exercise2Sets.equalsIgnoreCase("12")) {
            day4exercise2calories = oneCal * twelveSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day4Exercise2Sets.equalsIgnoreCase("12")) {
            day4exercise2calories = twoCal * twelveSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day4Exercise2Sets.equalsIgnoreCase("12")) {
            day4exercise2calories = threeCal * twelveSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day4Exercise2Sets.equalsIgnoreCase("12")) {
            day4exercise2calories = fourCal * twelveSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day4Exercise2Sets.equalsIgnoreCase("12")) {
            day4exercise2calories = fiveCal * twelveSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day4Exercise2Sets.equalsIgnoreCase("12")) {
            day4exercise2calories = sixCal * twelveSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }

        if (day4Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day4Exercise2Sets.equalsIgnoreCase("12")) {
            day4exercise2calories = sevenCal * twelveSets;
            day4ex2cals = String.valueOf(day4exercise2calories);
            day4ex2calories.setText(day4ex2cals);
        }
    }

    public void day5ex2Calculate(View view) {
        day5Exercise2Reps = day5ex2reps;
        day5Exercise2Sets = day5ex2sets;

        day5ex2calories = findViewById(R.id.day5ex2calories);

        if (day5Exercise2Reps.equalsIgnoreCase("0") && day5Exercise2Sets.equalsIgnoreCase("0")) {
            day5exercise2calories = 0;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Less than 5") && day5Exercise2Sets.equalsIgnoreCase("1")) {
            day5exercise2calories = oneCal * oneSet;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day5Exercise2Sets.equalsIgnoreCase("1")) {
            day5exercise2calories = twoCal * oneSet;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day5Exercise2Sets.equalsIgnoreCase("1")) {
            day5exercise2calories = threeCal * oneSet;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day5Exercise2Sets.equalsIgnoreCase("1")) {
            day5exercise2calories = fourCal * oneSet;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day5Exercise2Sets.equalsIgnoreCase("1")) {
            day5exercise2calories = fiveCal * oneSet;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day5Exercise2Sets.equalsIgnoreCase("1")) {
            day5exercise2calories = sixCal * oneSet;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day5Exercise2Sets.equalsIgnoreCase("1")) {
            day5exercise2calories = sevenCal * oneSet;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Less than 5") && day5Exercise2Sets.equalsIgnoreCase("2")) {
            day5exercise2calories = oneCal * twoSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day5Exercise2Sets.equalsIgnoreCase("2")) {
            day5exercise2calories = twoCal * twoSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day5Exercise2Sets.equalsIgnoreCase("2")) {
            day5exercise2calories = threeCal * twoSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day5Exercise2Sets.equalsIgnoreCase("2")) {
            day5exercise2calories = fourCal * twoSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day5Exercise2Sets.equalsIgnoreCase("2")) {
            day5exercise2calories = fiveCal * twoSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day5Exercise2Sets.equalsIgnoreCase("2")) {
            day5exercise2calories = sixCal * twoSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day5Exercise2Sets.equalsIgnoreCase("2")) {
            day5exercise2calories = sevenCal * twoSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Less than 5") && day5Exercise2Sets.equalsIgnoreCase("3")) {
            day5exercise2calories = oneCal * threeSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day5Exercise2Sets.equalsIgnoreCase("3")) {
            day5exercise2calories = twoCal * threeSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day5Exercise2Sets.equalsIgnoreCase("3")) {
            day5exercise2calories = threeCal * threeSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day5Exercise2Sets.equalsIgnoreCase("3")) {
            day5exercise2calories = fourCal * threeSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day5Exercise2Sets.equalsIgnoreCase("3")) {
            day5exercise2calories = fiveCal * threeSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day5Exercise2Sets.equalsIgnoreCase("3")) {
            day5exercise2calories = sixCal * threeSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day5Exercise2Sets.equalsIgnoreCase("3")) {
            day5exercise2calories = sevenCal * threeSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Less than 5") && day5Exercise2Sets.equalsIgnoreCase("4")) {
            day5exercise2calories = oneCal * fourSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day5Exercise2Sets.equalsIgnoreCase("4")) {
            day5exercise2calories = twoCal * fourSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day5Exercise2Sets.equalsIgnoreCase("4")) {
            day5exercise2calories = threeCal * fourSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day5Exercise2Sets.equalsIgnoreCase("4")) {
            day5exercise2calories = fourCal * fourSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day5Exercise2Sets.equalsIgnoreCase("4")) {
            day5exercise2calories = fiveCal * fourSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day5Exercise2Sets.equalsIgnoreCase("4")) {
            day5exercise2calories = sixCal * fourSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day5Exercise2Sets.equalsIgnoreCase("4")) {
            day5exercise2calories = sevenCal * fourSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Less than 5") && day5Exercise2Sets.equalsIgnoreCase("5")) {
            day5exercise2calories = oneCal * fiveSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day5Exercise2Sets.equalsIgnoreCase("5")) {
            day5exercise2calories = twoCal * fiveSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day5Exercise2Sets.equalsIgnoreCase("5")) {
            day5exercise2calories = threeCal * fiveSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day5Exercise2Sets.equalsIgnoreCase("5")) {
            day5exercise2calories = fourCal * fiveSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day5Exercise2Sets.equalsIgnoreCase("5")) {
            day5exercise2calories = fiveCal * fiveSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day5Exercise2Sets.equalsIgnoreCase("5")) {
            day5exercise2calories = sixCal * fiveSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day5Exercise2Sets.equalsIgnoreCase("5")) {
            day5exercise2calories = sevenCal * fiveSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Less than 5") && day5Exercise2Sets.equalsIgnoreCase("6")) {
            day5exercise2calories = oneCal * sixSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day5Exercise2Sets.equalsIgnoreCase("6")) {
            day5exercise2calories = twoCal * sixSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day5Exercise2Sets.equalsIgnoreCase("6")) {
            day5exercise2calories = threeCal * sixSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day5Exercise2Sets.equalsIgnoreCase("6")) {
            day5exercise2calories = fourCal * sixSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day5Exercise2Sets.equalsIgnoreCase("6")) {
            day5exercise2calories = fiveCal * sixSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day5Exercise2Sets.equalsIgnoreCase("6")) {
            day5exercise2calories = sixCal * sixSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day5Exercise2Sets.equalsIgnoreCase("6")) {
            day5exercise2calories = sevenCal * sixSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Less than 5") && day5Exercise2Sets.equalsIgnoreCase("7")) {
            day5exercise2calories = oneCal * sevenSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day5Exercise2Sets.equalsIgnoreCase("7")) {
            day5exercise2calories = twoCal * sevenSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day5Exercise2Sets.equalsIgnoreCase("7")) {
            day5exercise2calories = threeCal * sevenSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day5Exercise2Sets.equalsIgnoreCase("7")) {
            day5exercise2calories = fourCal * sevenSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day5Exercise2Sets.equalsIgnoreCase("7")) {
            day5exercise2calories = fiveCal * sevenSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day5Exercise2Sets.equalsIgnoreCase("7")) {
            day5exercise2calories = sixCal * sevenSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day5Exercise2Sets.equalsIgnoreCase("7")) {
            day5exercise2calories = sevenCal * sevenSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Less than 5") && day5Exercise2Sets.equalsIgnoreCase("8")) {
            day5exercise2calories = oneCal * eightSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day5Exercise2Sets.equalsIgnoreCase("8")) {
            day5exercise2calories = twoCal * eightSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day5Exercise2Sets.equalsIgnoreCase("8")) {
            day5exercise2calories = threeCal * eightSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day5Exercise2Sets.equalsIgnoreCase("8")) {
            day5exercise2calories = fourCal * eightSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day5Exercise2Sets.equalsIgnoreCase("8")) {
            day5exercise2calories = fiveCal * eightSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day5Exercise2Sets.equalsIgnoreCase("8")) {
            day5exercise2calories = sixCal * eightSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day5Exercise2Sets.equalsIgnoreCase("8")) {
            day5exercise2calories = sevenCal * eightSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Less than 5") && day5Exercise2Sets.equalsIgnoreCase("9")) {
            day5exercise2calories = oneCal * nineSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day5Exercise2Sets.equalsIgnoreCase("9")) {
            day5exercise2calories = twoCal * nineSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day5Exercise2Sets.equalsIgnoreCase("9")) {
            day5exercise2calories = threeCal * nineSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day5Exercise2Sets.equalsIgnoreCase("9")) {
            day5exercise2calories = fourCal * nineSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day5Exercise2Sets.equalsIgnoreCase("9")) {
            day5exercise2calories = fiveCal * nineSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day5Exercise2Sets.equalsIgnoreCase("9")) {
            day5exercise2calories = sixCal * nineSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day5Exercise2Sets.equalsIgnoreCase("9")) {
            day5exercise2calories = sevenCal * nineSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Less than 5") && day5Exercise2Sets.equalsIgnoreCase("10")) {
            day5exercise2calories = oneCal * tenSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day5Exercise2Sets.equalsIgnoreCase("10")) {
            day5exercise2calories = twoCal * tenSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day5Exercise2Sets.equalsIgnoreCase("10")) {
            day5exercise2calories = threeCal * tenSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day5Exercise2Sets.equalsIgnoreCase("10")) {
            day5exercise2calories = fourCal * tenSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day5Exercise2Sets.equalsIgnoreCase("10")) {
            day5exercise2calories = fiveCal * tenSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day5Exercise2Sets.equalsIgnoreCase("10")) {
            day5exercise2calories = sixCal * tenSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day5Exercise2Sets.equalsIgnoreCase("10")) {
            day5exercise2calories = sevenCal * tenSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Less than 5") && day5Exercise2Sets.equalsIgnoreCase("11")) {
            day5exercise2calories = oneCal * elevenSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day5Exercise2Sets.equalsIgnoreCase("11")) {
            day5exercise2calories = twoCal * elevenSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day5Exercise2Sets.equalsIgnoreCase("11")) {
            day5exercise2calories = threeCal * elevenSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day5Exercise2Sets.equalsIgnoreCase("11")) {
            day5exercise2calories = fourCal * elevenSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day5Exercise2Sets.equalsIgnoreCase("11")) {
            day5exercise2calories = fiveCal * elevenSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day5Exercise2Sets.equalsIgnoreCase("11")) {
            day5exercise2calories = sixCal * elevenSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day5Exercise2Sets.equalsIgnoreCase("11")) {
            day5exercise2calories = sevenCal * elevenSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Less than 5") && day5Exercise2Sets.equalsIgnoreCase("12")) {
            day5exercise2calories = oneCal * twelveSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 5 and 10") && day5Exercise2Sets.equalsIgnoreCase("12")) {
            day5exercise2calories = twoCal * twelveSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 10 and 15") && day5Exercise2Sets.equalsIgnoreCase("12")) {
            day5exercise2calories = threeCal * twelveSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 15 and 20") && day5Exercise2Sets.equalsIgnoreCase("12")) {
            day5exercise2calories = fourCal * twelveSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 20 and 25") && day5Exercise2Sets.equalsIgnoreCase("12")) {
            day5exercise2calories = fiveCal * twelveSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 25 and 30") && day5Exercise2Sets.equalsIgnoreCase("12")) {
            day5exercise2calories = sixCal * twelveSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }

        if (day5Exercise2Reps.equalsIgnoreCase("Between 30 and 35") && day5Exercise2Sets.equalsIgnoreCase("12")) {
            day5exercise2calories = sevenCal * twelveSets;
            day5ex2cals = String.valueOf(day5exercise2calories);
            day5ex2calories.setText(day5ex2cals);
        }
    }

    public void calculateWeekThreeCalories(View view) {

        week3caloriesburned = findViewById(R.id.weekthreecalsburned);

        week3totalcalories = day1exercise1calories + day2exercise1calories + day3exercise1calories + day4exercise1calories + day5exercise1calories
                + day1exercise2calories + day2exercise2calories + day3exercise2calories + day4exercise2calories + day5exercise2calories;

        totalcalsweek3 = String.valueOf(week3totalcalories);

        week3caloriesburned.setText(totalcalsweek3);

    }


    public void finishPlan(View view) {

        day1ex1calories = findViewById(R.id.day1ex1calories);
        day2ex1calories = findViewById(R.id.day2ex1calories);
        day3ex1calories = findViewById(R.id.day3ex1calories);
        day4ex1calories = findViewById(R.id.day4ex1calories);
        day5ex1calories = findViewById(R.id.day5ex1calories);

        day1ex2calories = findViewById(R.id.day1ex2calories);
        day2ex2calories = findViewById(R.id.day2ex2calories);
        day3ex2calories = findViewById(R.id.day3ex2calories);
        day4ex2calories = findViewById(R.id.day4ex2calories);
        day5ex2calories = findViewById(R.id.day5ex2calories);

        week3caloriesburned = findViewById(R.id.weekthreecalsburned);

        String d1e1 = day1ex1calories.getText().toString();
        String d1e2 = day1ex2calories.getText().toString();
        String d2e1 = day2ex1calories.getText().toString();
        String d2e2 = day2ex2calories.getText().toString();
        String d3e1 = day3ex1calories.getText().toString();
        String d3e2 = day3ex2calories.getText().toString();
        String d4e1 = day4ex1calories.getText().toString();
        String d4e2 = day4ex2calories.getText().toString();
        String d5e1 = day5ex1calories.getText().toString();
        String d5e2 = day5ex2calories.getText().toString();
        String w3cb = week3caloriesburned.getText().toString();

        String day1Exercise1Reps = day1ex1reps;
        String day1Exercise1Sets = day1ex1sets;
        String day1Exercise2Reps = day1ex2reps;
        String day1Exercise2Sets = day1ex2sets;

        String day2Exercise1Reps = day2ex1reps;
        String day2Exercise1Sets = day2ex1sets;
        String day2Exercise2Reps = day2ex2reps;
        String day2Exercise2Sets = day2ex2sets;

        String day3Exercise1Reps = day3ex1reps;
        String day3Exercise1Sets = day3ex1sets;
        String day3Exercise2Reps = day3ex2reps;
        String day3Exercise2Sets = day3ex2sets;

        String day4Exercise1Reps = day4ex1reps;
        String day4Exercise1Sets = day4ex1sets;
        String day4Exercise2Reps = day4ex2reps;
        String day4Exercise2Sets = day4ex2sets;

        String day5Exercise1Reps = day5ex1reps;
        String day5Exercise1Sets = day5ex1sets;
        String day5Exercise2Reps = day5ex2reps;
        String day5Exercise2Sets = day5ex2sets;


        UserWorkout userWorkout= new UserWorkout(day1Exercise1Reps, day1Exercise1Sets, d1e1,
                day1Exercise2Reps, day1Exercise2Sets, d1e2, day2Exercise1Reps, day2Exercise1Sets, d2e1,
                day2Exercise2Reps, day2Exercise2Sets, d2e2, day3Exercise1Reps, day3Exercise1Sets, d3e1,
                day3Exercise2Reps, day3Exercise2Sets, d3e2, day4Exercise1Reps, day4Exercise1Sets, d4e1,
                day4Exercise2Reps, day4Exercise2Sets, d4e2, day5Exercise1Reps, day5Exercise1Sets, d5e1,
                day5Exercise2Reps, day5Exercise2Sets, d5e2, w3cb);

        DatabaseReference fireDB = FirebaseDatabase.getInstance().getReference("Users").child(Uid).child("WeekThreeWorkout").push();

        fireDB.setValue(userWorkout);

        Intent intent = new Intent(TrackWeekThreeWorkout.this, RecordActivity.class);
        intent.putExtra(key1, w3cb);
        Toast.makeText(TrackWeekThreeWorkout.this, "You have ended your plan", Toast.LENGTH_LONG).show();
        startActivity(intent);

    }
}