package com.example.homefit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class TrackWeekOneWorkout extends AppCompatActivity {

    private Spinner exerciseoneRepsSpinner;
    private Spinner exerciseoneSetsSpinner;
    private Spinner exercisetwoRepsSpinner;
    private Spinner exercisetwoSetsSpinner;

    private String ex1reps;
    private String ex1sets;
    private String ex2reps;
    private String ex2sets;

    //int zeroRep = 0;
    //int zeroSet = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_week_one_workout);

        Intent intent = getIntent();

        ////////////////////////////////////////////////DAY 1//////////////////////////////////////////////////////

        exerciseoneRepsSpinner = findViewById(R.id.day1_ex1_reps_spinner);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.ExerciseOneReps,
                android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exerciseoneRepsSpinner.setAdapter(adapter1);
        exerciseoneRepsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ex1reps = exerciseoneRepsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        exerciseoneSetsSpinner = findViewById(R.id.day1_ex1_sets_spinner);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.ExerciseOneSets,
                android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exerciseoneSetsSpinner.setAdapter(adapter2);
        exerciseoneSetsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ex1sets = exerciseoneSetsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        exercisetwoRepsSpinner = findViewById(R.id.day1_ex2_reps_spinner);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.ExerciseTwoReps,
                android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exercisetwoRepsSpinner.setAdapter(adapter3);
        exercisetwoRepsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ex2reps = exercisetwoRepsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        exercisetwoSetsSpinner = findViewById(R.id.day1_ex2_sets_spinner);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this, R.array.ExerciseTwoSets,
                android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exercisetwoSetsSpinner.setAdapter(adapter4);
        exercisetwoSetsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ex2sets = exercisetwoSetsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ////////////////////////////////////////////////DAY 2//////////////////////////////////////////////////////

        exerciseoneRepsSpinner = findViewById(R.id.day2_ex1_reps_spinner);
        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this, R.array.ExerciseOneReps,
                android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exerciseoneRepsSpinner.setAdapter(adapter5);
        exerciseoneRepsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ex1reps = exerciseoneRepsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        exerciseoneSetsSpinner = findViewById(R.id.day2_ex1_sets_spinner);
        ArrayAdapter<CharSequence> adapter6 = ArrayAdapter.createFromResource(this, R.array.ExerciseOneSets,
                android.R.layout.simple_spinner_item);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exerciseoneSetsSpinner.setAdapter(adapter6);
        exerciseoneSetsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ex1sets = exerciseoneSetsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        exercisetwoRepsSpinner = findViewById(R.id.day2_ex2_reps_spinner);
        ArrayAdapter<CharSequence> adapter7 = ArrayAdapter.createFromResource(this, R.array.ExerciseTwoReps,
                android.R.layout.simple_spinner_item);
        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exercisetwoRepsSpinner.setAdapter(adapter7);
        exercisetwoRepsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ex2reps = exercisetwoRepsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        exercisetwoSetsSpinner = findViewById(R.id.day2_ex2_sets_spinner);
        ArrayAdapter<CharSequence> adapter8 = ArrayAdapter.createFromResource(this, R.array.ExerciseTwoSets,
                android.R.layout.simple_spinner_item);
        adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exercisetwoSetsSpinner.setAdapter(adapter8);
        exercisetwoSetsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ex2sets = exercisetwoSetsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

       //////////////////////////////////////////DAY 3/////////////////////////////////////////////////////////////

        exerciseoneRepsSpinner = findViewById(R.id.day3_ex1_reps_spinner);
        ArrayAdapter<CharSequence> adapter9 = ArrayAdapter.createFromResource(this, R.array.ExerciseOneReps,
                android.R.layout.simple_spinner_item);
        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exerciseoneRepsSpinner.setAdapter(adapter9);
        exerciseoneRepsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ex1reps = exerciseoneRepsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        exerciseoneSetsSpinner = findViewById(R.id.day3_ex1_sets_spinner);
        ArrayAdapter<CharSequence> adapter10 = ArrayAdapter.createFromResource(this, R.array.ExerciseOneSets,
                android.R.layout.simple_spinner_item);
        adapter10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exerciseoneSetsSpinner.setAdapter(adapter10);
        exerciseoneSetsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ex1sets = exerciseoneSetsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        exercisetwoRepsSpinner = findViewById(R.id.day3_ex2_reps_spinner);
        ArrayAdapter<CharSequence> adapter11 = ArrayAdapter.createFromResource(this, R.array.ExerciseTwoReps,
                android.R.layout.simple_spinner_item);
        adapter11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exercisetwoRepsSpinner.setAdapter(adapter11);
        exercisetwoRepsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ex2reps = exercisetwoRepsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        exercisetwoSetsSpinner = findViewById(R.id.day3_ex2_sets_spinner);
        ArrayAdapter<CharSequence> adapter12 = ArrayAdapter.createFromResource(this, R.array.ExerciseTwoSets,
                android.R.layout.simple_spinner_item);
        adapter12.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exercisetwoSetsSpinner.setAdapter(adapter12);
        exercisetwoSetsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ex2sets = exercisetwoSetsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ////////////////////////////////////////////////DAY 4//////////////////////////////////////////////////////

        exerciseoneRepsSpinner = findViewById(R.id.day4_ex1_reps_spinner);
        ArrayAdapter<CharSequence> adapter13 = ArrayAdapter.createFromResource(this, R.array.ExerciseOneReps,
                android.R.layout.simple_spinner_item);
        adapter13.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exerciseoneRepsSpinner.setAdapter(adapter13);
        exerciseoneRepsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ex1reps = exerciseoneRepsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        exerciseoneSetsSpinner = findViewById(R.id.day4_ex1_sets_spinner);
        ArrayAdapter<CharSequence> adapter14 = ArrayAdapter.createFromResource(this, R.array.ExerciseOneSets,
                android.R.layout.simple_spinner_item);
        adapter14.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exerciseoneSetsSpinner.setAdapter(adapter14);
        exerciseoneSetsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ex1sets = exerciseoneSetsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        exercisetwoRepsSpinner = findViewById(R.id.day4_ex2_reps_spinner);
        ArrayAdapter<CharSequence> adapter15 = ArrayAdapter.createFromResource(this, R.array.ExerciseTwoReps,
                android.R.layout.simple_spinner_item);
        adapter15.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exercisetwoRepsSpinner.setAdapter(adapter15);
        exercisetwoRepsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ex2reps = exercisetwoRepsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        exercisetwoSetsSpinner = findViewById(R.id.day4_ex2_sets_spinner);
        ArrayAdapter<CharSequence> adapter16 = ArrayAdapter.createFromResource(this, R.array.ExerciseTwoSets,
                android.R.layout.simple_spinner_item);
        adapter16.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exercisetwoSetsSpinner.setAdapter(adapter16);
        exercisetwoSetsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ex2sets = exercisetwoSetsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        ////////////////////////////////////////////////DAY 5//////////////////////////////////////////////////////

        exerciseoneRepsSpinner = findViewById(R.id.day5_ex1_reps_spinner);
        ArrayAdapter<CharSequence> adapter17 = ArrayAdapter.createFromResource(this, R.array.ExerciseOneReps,
                android.R.layout.simple_spinner_item);
        adapter17.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exerciseoneRepsSpinner.setAdapter(adapter17);
        exerciseoneRepsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ex1reps = exerciseoneRepsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        exerciseoneSetsSpinner = findViewById(R.id.day5_ex1_sets_spinner);
        ArrayAdapter<CharSequence> adapter18 = ArrayAdapter.createFromResource(this, R.array.ExerciseOneSets,
                android.R.layout.simple_spinner_item);
        adapter18.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exerciseoneSetsSpinner.setAdapter(adapter18);
        exerciseoneSetsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ex1sets = exerciseoneSetsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        exercisetwoRepsSpinner = findViewById(R.id.day5_ex2_reps_spinner);
        ArrayAdapter<CharSequence> adapter19 = ArrayAdapter.createFromResource(this, R.array.ExerciseTwoReps,
                android.R.layout.simple_spinner_item);
        adapter19.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exercisetwoRepsSpinner.setAdapter(adapter19);
        exercisetwoRepsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ex2reps = exercisetwoRepsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        exercisetwoSetsSpinner = findViewById(R.id.day5_ex2_sets_spinner);
        ArrayAdapter<CharSequence> adapter20 = ArrayAdapter.createFromResource(this, R.array.ExerciseTwoSets,
                android.R.layout.simple_spinner_item);
        adapter20.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        exercisetwoSetsSpinner.setAdapter(adapter20);
        exercisetwoSetsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ex2sets = exercisetwoSetsSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void day1ex1Calculate(View view) {

        String exerciseOneReps = ex1reps;
        String exerciseOneSets = ex1sets;
        String ex1cals;
        int oneCal = 1;
        int twoCal = 2;
        int threeCal = 3;
        int fourCal = 4;
        int fiveCal = 5;
        int sixCal = 6;
        int sevenCal = 7;
        int oneSet = 1;
        int twoSets = 2;
        int threeSets = 3;
        int fourSets = 4;
        int fiveSets = 5;
        int sixSets = 6;
        int sevenSets = 7;
        int eightSets = 8;
        int nineSets = 9;
        int tenSets = 10;
        int elevenSets = 11;
        int twelveSets = 12;
        int exercise1calories;

        TextView ex1calories = findViewById(R.id.day1ex1calories);

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = oneCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = twoCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = threeCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = fourCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = fiveCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = sixCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = sevenCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = oneCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = twoCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = threeCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = fourCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = fiveCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = sixCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = sevenCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = oneCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = twoCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = threeCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = fourCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = fiveCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = sixCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = sevenCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = oneCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = twoCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = threeCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = fourCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = fiveCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = sixCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = sevenCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = oneCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = twoCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = threeCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = fourCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = fiveCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = sixCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = sevenCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = oneCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = twoCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = threeCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = fourCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = fiveCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = sixCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = sevenCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }
        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = oneCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = twoCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = threeCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = fourCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = fiveCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = sixCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = sevenCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = oneCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = twoCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = threeCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = fourCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = fiveCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = sixCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = sevenCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = oneCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = twoCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = threeCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = fourCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = fiveCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = sixCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = sevenCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = oneCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = twoCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = threeCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = fourCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = fiveCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = sixCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = sevenCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = oneCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = twoCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = threeCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = fourCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = fiveCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = sixCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = sevenCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = oneCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = twoCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = threeCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = fourCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = fiveCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = sixCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = sevenCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }
    }

    public void day2ex1Calculate(View view) {

        String exerciseOneReps = ex1reps;
        String exerciseOneSets = ex1sets;
        String ex1cals;
        int oneCal = 1;
        int twoCal = 2;
        int threeCal = 3;
        int fourCal = 4;
        int fiveCal = 5;
        int sixCal = 6;
        int sevenCal = 7;
        int oneSet = 1;
        int twoSets = 2;
        int threeSets = 3;
        int fourSets = 4;
        int fiveSets = 5;
        int sixSets = 6;
        int sevenSets = 7;
        int eightSets = 8;
        int nineSets = 9;
        int tenSets = 10;
        int elevenSets = 11;
        int twelveSets = 12;
        int exercise1calories;

        TextView ex1calories = findViewById(R.id.day2ex1calories);

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = oneCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = twoCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = threeCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = fourCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = fiveCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = sixCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = sevenCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = oneCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = twoCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = threeCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = fourCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = fiveCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = sixCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = sevenCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = oneCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = twoCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = threeCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = fourCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = fiveCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = sixCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = sevenCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = oneCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = twoCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = threeCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = fourCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = fiveCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = sixCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = sevenCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = oneCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = twoCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = threeCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = fourCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = fiveCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = sixCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = sevenCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = oneCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = twoCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = threeCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = fourCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = fiveCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = sixCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = sevenCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }
        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = oneCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = twoCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = threeCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = fourCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = fiveCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = sixCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = sevenCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = oneCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = twoCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = threeCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = fourCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = fiveCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = sixCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = sevenCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = oneCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = twoCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = threeCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = fourCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = fiveCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = sixCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = sevenCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = oneCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = twoCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = threeCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = fourCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = fiveCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = sixCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = sevenCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = oneCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = twoCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = threeCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = fourCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = fiveCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = sixCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = sevenCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = oneCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = twoCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = threeCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = fourCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = fiveCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = sixCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = sevenCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }
    }


    public void day3ex1Calculate(View view) {
        String exerciseOneReps = ex1reps;
        String exerciseOneSets = ex1sets;
        String ex1cals;
        int oneCal = 1;
        int twoCal = 2;
        int threeCal = 3;
        int fourCal = 4;
        int fiveCal = 5;
        int sixCal = 6;
        int sevenCal = 7;
        int oneSet = 1;
        int twoSets = 2;
        int threeSets = 3;
        int fourSets = 4;
        int fiveSets = 5;
        int sixSets = 6;
        int sevenSets = 7;
        int eightSets = 8;
        int nineSets = 9;
        int tenSets = 10;
        int elevenSets = 11;
        int twelveSets = 12;
        int exercise1calories;

        TextView ex1calories = findViewById(R.id.day3ex1calories);

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = oneCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = twoCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = threeCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = fourCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = fiveCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = sixCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = sevenCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = oneCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = twoCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = threeCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = fourCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = fiveCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = sixCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = sevenCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = oneCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = twoCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = threeCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = fourCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = fiveCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = sixCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = sevenCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = oneCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = twoCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = threeCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = fourCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = fiveCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = sixCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = sevenCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = oneCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = twoCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = threeCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = fourCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = fiveCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = sixCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = sevenCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = oneCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = twoCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = threeCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = fourCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = fiveCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = sixCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = sevenCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }
        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = oneCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = twoCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = threeCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = fourCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = fiveCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = sixCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = sevenCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = oneCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = twoCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = threeCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = fourCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = fiveCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = sixCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = sevenCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = oneCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = twoCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = threeCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = fourCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = fiveCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = sixCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = sevenCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = oneCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = twoCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = threeCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = fourCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = fiveCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = sixCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = sevenCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = oneCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = twoCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = threeCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = fourCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = fiveCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = sixCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = sevenCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = oneCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = twoCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = threeCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = fourCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = fiveCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = sixCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = sevenCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }
    }

    public void day4ex1Calculate(View view) {

        String exerciseOneReps = ex1reps;
        String exerciseOneSets = ex1sets;
        String ex1cals;
        int oneCal = 1;
        int twoCal = 2;
        int threeCal = 3;
        int fourCal = 4;
        int fiveCal = 5;
        int sixCal = 6;
        int sevenCal = 7;
        int oneSet = 1;
        int twoSets = 2;
        int threeSets = 3;
        int fourSets = 4;
        int fiveSets = 5;
        int sixSets = 6;
        int sevenSets = 7;
        int eightSets = 8;
        int nineSets = 9;
        int tenSets = 10;
        int elevenSets = 11;
        int twelveSets = 12;
        int exercise1calories;

        TextView ex1calories = findViewById(R.id.day4ex1calories);

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = oneCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = twoCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = threeCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = fourCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = fiveCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = sixCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = sevenCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = oneCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = twoCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = threeCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = fourCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = fiveCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = sixCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = sevenCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = oneCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = twoCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = threeCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = fourCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = fiveCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = sixCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = sevenCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = oneCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = twoCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = threeCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = fourCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = fiveCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = sixCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = sevenCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = oneCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = twoCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = threeCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = fourCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = fiveCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = sixCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = sevenCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = oneCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = twoCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = threeCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = fourCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = fiveCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = sixCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = sevenCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }
        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = oneCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = twoCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = threeCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = fourCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = fiveCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = sixCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = sevenCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = oneCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = twoCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = threeCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = fourCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = fiveCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = sixCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = sevenCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = oneCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = twoCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = threeCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = fourCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = fiveCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = sixCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = sevenCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = oneCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = twoCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = threeCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = fourCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = fiveCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = sixCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = sevenCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = oneCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = twoCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = threeCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = fourCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = fiveCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = sixCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = sevenCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = oneCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = twoCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = threeCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = fourCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = fiveCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = sixCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = sevenCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }
    }



    public void day5ex1Calculate(View view) {

        String exerciseOneReps = ex1reps;
        String exerciseOneSets = ex1sets;
        String ex1cals;
        int oneCal = 1;
        int twoCal = 2;
        int threeCal = 3;
        int fourCal = 4;
        int fiveCal = 5;
        int sixCal = 6;
        int sevenCal = 7;
        int oneSet = 1;
        int twoSets = 2;
        int threeSets = 3;
        int fourSets = 4;
        int fiveSets = 5;
        int sixSets = 6;
        int sevenSets = 7;
        int eightSets = 8;
        int nineSets = 9;
        int tenSets = 10;
        int elevenSets = 11;
        int twelveSets = 12;
        int exercise1calories;

        TextView ex1calories = findViewById(R.id.day5ex1calories);

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = oneCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = twoCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = threeCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = fourCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = fiveCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = sixCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("1")) {
            exercise1calories = sevenCal * oneSet;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = oneCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = twoCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = threeCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = fourCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = fiveCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = sixCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("2")) {
            exercise1calories = sevenCal * twoSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = oneCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = twoCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = threeCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = fourCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = fiveCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = sixCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("3")) {
            exercise1calories = sevenCal * threeSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = oneCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = twoCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = threeCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = fourCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = fiveCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = sixCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("4")) {
            exercise1calories = sevenCal * fourSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = oneCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = twoCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = threeCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = fourCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = fiveCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = sixCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("5")) {
            exercise1calories = sevenCal * fiveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = oneCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = twoCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = threeCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = fourCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = fiveCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = sixCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("6")) {
            exercise1calories = sevenCal * sixSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }
        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = oneCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = twoCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = threeCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = fourCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = fiveCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = sixCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("7")) {
            exercise1calories = sevenCal * sevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = oneCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = twoCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = threeCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = fourCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = fiveCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = sixCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("8")) {
            exercise1calories = sevenCal * eightSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = oneCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = twoCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = threeCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = fourCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = fiveCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = sixCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("9")) {
            exercise1calories = sevenCal * nineSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = oneCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = twoCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = threeCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = fourCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = fiveCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = sixCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("10")) {
            exercise1calories = sevenCal * tenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = oneCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = twoCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = threeCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = fourCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = fiveCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = sixCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("11")) {
            exercise1calories = sevenCal * elevenSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Less than 5") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = oneCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 5 and 10") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = twoCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 10 and 15") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = threeCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 15 and 20") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = fourCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 20 and 25") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = fiveCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 25 and 30") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = sixCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }

        if (exerciseOneReps.equalsIgnoreCase("Between 30 and 35") && exerciseOneSets.equalsIgnoreCase("12")) {
            exercise1calories = sevenCal * twelveSets;
            ex1cals = String.valueOf(exercise1calories);
            ex1calories.setText(ex1cals);
        }
    }



    public void day1ex2Calculate(View view) {

        String exerciseTwoReps = ex2reps;
        String exerciseTwoSets = ex2sets;
        String ex2cals;
        int oneCal = 1;
        int twoCal = 2;
        int threeCal = 3;
        int fourCal = 4;
        int fiveCal = 5;
        int sixCal = 6;
        int sevenCal = 7;
        int oneSet = 1;
        int twoSets = 2;
        int threeSets = 3;
        int fourSets = 4;
        int fiveSets = 5;
        int sixSets = 6;
        int sevenSets = 7;
        int eightSets = 8;
        int nineSets = 9;
        int tenSets = 10;
        int elevenSets = 11;
        int twelveSets = 12;
        int exercise2calories;

        TextView ex2calories = findViewById(R.id.day1ex2calories);

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = oneCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = twoCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = threeCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = fourCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = fiveCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = sixCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = sevenCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = oneCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = twoCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = threeCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = fourCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = fiveCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = sixCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = sevenCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = oneCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = twoCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = threeCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = fourCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = fiveCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = sixCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = sevenCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = oneCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = twoCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = threeCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = fourCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = fiveCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = sixCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = sevenCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = oneCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = twoCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = threeCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = fourCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = fiveCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = sixCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = sevenCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = oneCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = twoCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = threeCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = fourCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = fiveCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = sixCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = sevenCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = oneCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = twoCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = threeCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = fourCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = fiveCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = sixCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = sevenCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = oneCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = twoCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = threeCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = fourCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = fiveCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = sixCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = sevenCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = oneCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = twoCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = threeCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = fourCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = fiveCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = sixCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = sevenCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = oneCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = twoCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = threeCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = fourCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = fiveCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = sixCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = sevenCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = oneCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = twoCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = threeCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = fourCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = fiveCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = sixCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = sevenCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = oneCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = twoCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = threeCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = fourCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = fiveCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = sixCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = sevenCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }
    }


    public void day2ex2Calculate(View view) {
        String exerciseTwoReps = ex2reps;
        String exerciseTwoSets = ex2sets;
        String ex2cals;
        int oneCal = 1;
        int twoCal = 2;
        int threeCal = 3;
        int fourCal = 4;
        int fiveCal = 5;
        int sixCal = 6;
        int sevenCal = 7;
        int oneSet = 1;
        int twoSets = 2;
        int threeSets = 3;
        int fourSets = 4;
        int fiveSets = 5;
        int sixSets = 6;
        int sevenSets = 7;
        int eightSets = 8;
        int nineSets = 9;
        int tenSets = 10;
        int elevenSets = 11;
        int twelveSets = 12;
        int exercise2calories;

        TextView ex2calories = findViewById(R.id.day2ex2calories);

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = oneCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = twoCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = threeCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = fourCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = fiveCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = sixCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = sevenCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = oneCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = twoCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = threeCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = fourCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = fiveCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = sixCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = sevenCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = oneCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = twoCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = threeCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = fourCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = fiveCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = sixCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = sevenCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = oneCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = twoCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = threeCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = fourCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = fiveCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = sixCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = sevenCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = oneCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = twoCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = threeCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = fourCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = fiveCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = sixCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = sevenCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = oneCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = twoCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = threeCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = fourCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = fiveCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = sixCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = sevenCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = oneCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = twoCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = threeCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = fourCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = fiveCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = sixCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = sevenCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = oneCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = twoCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = threeCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = fourCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = fiveCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = sixCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = sevenCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = oneCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = twoCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = threeCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = fourCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = fiveCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = sixCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = sevenCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = oneCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = twoCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = threeCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = fourCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = fiveCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = sixCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = sevenCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = oneCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = twoCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = threeCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = fourCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = fiveCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = sixCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = sevenCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = oneCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = twoCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = threeCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = fourCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = fiveCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = sixCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = sevenCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

    }


    public void day3ex2Calculate(View view) {
        String exerciseTwoReps = ex2reps;
        String exerciseTwoSets = ex2sets;
        String ex2cals;
        int oneCal = 1;
        int twoCal = 2;
        int threeCal = 3;
        int fourCal = 4;
        int fiveCal = 5;
        int sixCal = 6;
        int sevenCal = 7;
        int oneSet = 1;
        int twoSets = 2;
        int threeSets = 3;
        int fourSets = 4;
        int fiveSets = 5;
        int sixSets = 6;
        int sevenSets = 7;
        int eightSets = 8;
        int nineSets = 9;
        int tenSets = 10;
        int elevenSets = 11;
        int twelveSets = 12;
        int exercise2calories;

        TextView ex2calories = findViewById(R.id.day3ex2calories);

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = oneCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = twoCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = threeCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = fourCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = fiveCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = sixCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = sevenCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = oneCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = twoCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = threeCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = fourCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = fiveCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = sixCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = sevenCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = oneCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = twoCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = threeCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = fourCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = fiveCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = sixCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = sevenCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = oneCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = twoCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = threeCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = fourCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = fiveCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = sixCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = sevenCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = oneCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = twoCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = threeCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = fourCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = fiveCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = sixCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = sevenCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = oneCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = twoCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = threeCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = fourCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = fiveCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = sixCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = sevenCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = oneCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = twoCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = threeCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = fourCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = fiveCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = sixCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = sevenCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = oneCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = twoCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = threeCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = fourCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = fiveCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = sixCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = sevenCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = oneCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = twoCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = threeCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = fourCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = fiveCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = sixCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = sevenCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = oneCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = twoCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = threeCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = fourCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = fiveCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = sixCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = sevenCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = oneCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = twoCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = threeCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = fourCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = fiveCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = sixCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = sevenCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = oneCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = twoCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = threeCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = fourCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = fiveCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = sixCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = sevenCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }
    }

    public void day4ex2Calculate(View view) {

        String exerciseTwoReps = ex2reps;
        String exerciseTwoSets = ex2sets;
        String ex2cals;
        int oneCal = 1;
        int twoCal = 2;
        int threeCal = 3;
        int fourCal = 4;
        int fiveCal = 5;
        int sixCal = 6;
        int sevenCal = 7;
        int oneSet = 1;
        int twoSets = 2;
        int threeSets = 3;
        int fourSets = 4;
        int fiveSets = 5;
        int sixSets = 6;
        int sevenSets = 7;
        int eightSets = 8;
        int nineSets = 9;
        int tenSets = 10;
        int elevenSets = 11;
        int twelveSets = 12;
        int exercise2calories;

        TextView ex2calories = findViewById(R.id.day4ex2calories);

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = oneCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = twoCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = threeCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = fourCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = fiveCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = sixCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = sevenCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = oneCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = twoCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = threeCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = fourCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = fiveCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = sixCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = sevenCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = oneCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = twoCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = threeCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = fourCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = fiveCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = sixCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = sevenCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = oneCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = twoCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = threeCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = fourCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = fiveCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = sixCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = sevenCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = oneCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = twoCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = threeCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = fourCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = fiveCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = sixCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = sevenCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = oneCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = twoCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = threeCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = fourCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = fiveCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = sixCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = sevenCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = oneCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = twoCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = threeCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = fourCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = fiveCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = sixCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = sevenCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = oneCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = twoCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = threeCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = fourCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = fiveCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = sixCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = sevenCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = oneCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = twoCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = threeCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = fourCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = fiveCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = sixCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = sevenCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = oneCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = twoCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = threeCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = fourCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = fiveCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = sixCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = sevenCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = oneCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = twoCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = threeCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = fourCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = fiveCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = sixCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = sevenCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = oneCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = twoCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = threeCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = fourCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = fiveCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = sixCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = sevenCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }
    }

    public void day5ex2Calculate(View view) {
        String exerciseTwoReps = ex2reps;
        String exerciseTwoSets = ex2sets;
        String ex2cals;
        int oneCal = 1;
        int twoCal = 2;
        int threeCal = 3;
        int fourCal = 4;
        int fiveCal = 5;
        int sixCal = 6;
        int sevenCal = 7;
        int oneSet = 1;
        int twoSets = 2;
        int threeSets = 3;
        int fourSets = 4;
        int fiveSets = 5;
        int sixSets = 6;
        int sevenSets = 7;
        int eightSets = 8;
        int nineSets = 9;
        int tenSets = 10;
        int elevenSets = 11;
        int twelveSets = 12;
        int exercise2calories;

        TextView ex2calories = findViewById(R.id.day5ex2calories);

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = oneCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = twoCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = threeCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = fourCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = fiveCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = sixCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("1")) {
            exercise2calories = sevenCal * oneSet;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = oneCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = twoCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = threeCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = fourCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = fiveCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = sixCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("2")) {
            exercise2calories = sevenCal * twoSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = oneCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = twoCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = threeCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = fourCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = fiveCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = sixCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("3")) {
            exercise2calories = sevenCal * threeSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = oneCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = twoCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = threeCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = fourCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = fiveCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = sixCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("4")) {
            exercise2calories = sevenCal * fourSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = oneCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = twoCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = threeCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = fourCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = fiveCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = sixCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("5")) {
            exercise2calories = sevenCal * fiveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = oneCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = twoCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = threeCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = fourCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = fiveCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = sixCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("6")) {
            exercise2calories = sevenCal * sixSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = oneCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = twoCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = threeCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = fourCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = fiveCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = sixCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("7")) {
            exercise2calories = sevenCal * sevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = oneCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = twoCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = threeCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = fourCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = fiveCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = sixCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("8")) {
            exercise2calories = sevenCal * eightSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = oneCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = twoCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = threeCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = fourCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = fiveCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = sixCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("9")) {
            exercise2calories = sevenCal * nineSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = oneCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = twoCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = threeCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = fourCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = fiveCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = sixCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("10")) {
            exercise2calories = sevenCal * tenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = oneCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = twoCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = threeCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = fourCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = fiveCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = sixCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("11")) {
            exercise2calories = sevenCal * elevenSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Less than 5") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = oneCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 5 and 10") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = twoCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 10 and 15") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = threeCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 15 and 20") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = fourCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 20 and 25") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = fiveCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 25 and 30") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = sixCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }

        if (exerciseTwoReps.equalsIgnoreCase("Between 30 and 35") && exerciseTwoSets.equalsIgnoreCase("12")) {
            exercise2calories = sevenCal * twelveSets;
            ex2cals = String.valueOf(exercise2calories);
            ex2calories.setText(ex2cals);
        }
    }

}