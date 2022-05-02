package com.example.homefit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity {

    public static final String key1 = "CALORIES_TO_BURN";
    public static final String key2 = "FITNESS_GOAL";
    public static final String key3 = "ACTIVITY_LEVEL";

    private Spinner fitnessGoalSpinner;
    private Spinner fitnessActivitySpinner;
    private Spinner caloriesToBurnSpinner;
    private EditText gender;
    private EditText height;
    private EditText weight;
    private EditText goalWeight;
    ArrayList<UserDetails> details;
    private FirebaseAuth mAuth;
    private String Uid;
    private String fitnessGoal;
    private String fitnessActivity;
    private String caloriesToBurn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView detail = findViewById(R.id.details);
        detail.setText("Enter Your Details:");
        details = new ArrayList<UserDetails>();
        mAuth = FirebaseAuth.getInstance();
        Uid = mAuth.getCurrentUser().getUid();

        fitnessGoalSpinner = findViewById(R.id.fitness_goal_spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.FitnessGoal,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fitnessGoalSpinner.setPrompt("Fitness Goal");
        fitnessGoalSpinner.setAdapter(adapter);
        fitnessGoalSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                fitnessGoal = fitnessGoalSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
               // Toast.makeText(DetailsActivity.this, "Nothing Selected", Toast.LENGTH_LONG).show();
            }
        });

        fitnessActivitySpinner = findViewById(R.id.fitness_activity_spinner);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.FitnessActivity,
                android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fitnessActivitySpinner.setAdapter(adapter2);
        fitnessActivitySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                fitnessActivity = fitnessActivitySpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
             //   Toast.makeText(DetailsActivity.this, "Nothing Selected", Toast.LENGTH_LONG).show();
            }
        });

        caloriesToBurnSpinner = findViewById(R.id.calories_to_burn_spinner);

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.CaloriesToBurn,
                android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        caloriesToBurnSpinner.setAdapter(adapter3);
        caloriesToBurnSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                caloriesToBurn = caloriesToBurnSpinner.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
              //  Toast.makeText(DetailsActivity.this, "Nothing Selected", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void submitDetails(View view) {

        gender = findViewById(R.id.gender);
        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        goalWeight = findViewById(R.id.goal_weight);

        String g = gender.getText().toString();
        String h = height.getText().toString();
        String w = weight.getText().toString();
        String gw = goalWeight.getText().toString();
        String ctb = caloriesToBurn;
        String fg = fitnessGoal;
        String fa = fitnessActivity;

        if (g.isEmpty()) {
            gender.setError("Field is required");
            return;
        }

        if (h.isEmpty()) {
            height.setError("Field is required");
            return;
        }

        if (w.isEmpty()) {
            weight.setError("Field is required");
            return;
        }

        if (gw.isEmpty()) {
            goalWeight.setError("Field is required");
            return;
        }


        if (ctb.equalsIgnoreCase("-- Calories to Burn --")){
            Toast.makeText(DetailsActivity.this, "Please select the amount of calories you want to burn", Toast.LENGTH_SHORT).show();
            return;
        }

        if (fg.equalsIgnoreCase("-- Fitness Goal --")){
            Toast.makeText(DetailsActivity.this, "Please select the area you want to work on", Toast.LENGTH_SHORT).show();
            return;
        }

        if (fa.equalsIgnoreCase("-- Fitness Activity --")){
            Toast.makeText(DetailsActivity.this, "Please select your activity level", Toast.LENGTH_SHORT).show();
            return;
        }

        UserDetails userDetail = new UserDetails(g, h, w, gw, fg, fa, ctb);

        DatabaseReference fireDB = FirebaseDatabase.getInstance().getReference("Users").child(Uid).child("Details").push();

        fireDB.setValue(userDetail);

        if (ctb.equalsIgnoreCase("Less than 1,000 Cals") && fg.equalsIgnoreCase("Arms") && fa.equalsIgnoreCase("Inactive")) {

            Intent intent = new Intent(DetailsActivity.this, BeginnerArmPlan.class);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            startActivity(intent);

        }else if (ctb.equalsIgnoreCase("Between 1,000 and 2,500 Cals") && fg.equalsIgnoreCase("Arms") && fa.equalsIgnoreCase("Inactive")) {

            Intent intent = new Intent(this, ModerateArmPlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;

        }else if (ctb.equalsIgnoreCase("More Than 2,500 Cals") && fg.equalsIgnoreCase("Arms") && fa.equalsIgnoreCase("Inactive")) {

            Intent intent = new Intent(this, PlanAdviceActivity.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "Try again!", Toast.LENGTH_LONG).show();
            return;



        }else if (ctb.equalsIgnoreCase("Between 1,000 and 2,500 Cals") && fg.equalsIgnoreCase("Arms") && fa.equalsIgnoreCase("Active")) {

            Intent intent = new Intent(this, ModerateArmPlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;

        }else if (ctb.equalsIgnoreCase("Less than 1,000 Cals") && fg.equalsIgnoreCase("Arms") && fa.equalsIgnoreCase("Active")) {

            Intent intent = new Intent(this, BeginnerArmPlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;

        }else if (ctb.equalsIgnoreCase("More than 2,500 Cals") && fg.equalsIgnoreCase("Arms") && fa.equalsIgnoreCase("Active")) {

            Intent intent = new Intent(this, IntenseArmPlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;




        }else if (ctb.equalsIgnoreCase("More than 2,500 Cals") && fg.equalsIgnoreCase("Arms") && fa.equalsIgnoreCase("Very Active")) {
            Intent intent = new Intent(this, IntenseArmPlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;

        } else if (ctb.equalsIgnoreCase("Between 1,000 and 2,500 Cals") && fg.equalsIgnoreCase("Arms") && fa.equalsIgnoreCase("Very Active")) {
            Intent intent = new Intent(this, ModerateArmPlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;

        } else if (ctb.equalsIgnoreCase("Less than 1,000 Cals") && fg.equalsIgnoreCase("Arms") && fa.equalsIgnoreCase("Very Active")) {
            Intent intent = new Intent(this, ArmWorkoutRecommendation.class);
            startActivity(intent);
            return;






        }else if (ctb.equalsIgnoreCase("Less than 1,000 Cals") && fg.equalsIgnoreCase("Legs") && fa.equalsIgnoreCase("Inactive")) {
            Intent intent = new Intent(this, BeginnerLegPlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;

        }else if (ctb.equalsIgnoreCase("Between 1,000 and 2,500 Cals") && fg.equalsIgnoreCase("Legs") && fa.equalsIgnoreCase("Inactive")) {
            Intent intent = new Intent(this, ModerateLegPlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;
        }else if (ctb.equalsIgnoreCase("More Than 2,500 Cals") && fg.equalsIgnoreCase("Legs") && fa.equalsIgnoreCase("Inactive")) {
            Intent intent = new Intent(this, PlanAdviceActivity.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "Try again!", Toast.LENGTH_LONG).show();
            return;

        }else if (ctb.equalsIgnoreCase("Between 1,000 and 2,500 Cals") && fg.equalsIgnoreCase("Legs") && fa.equalsIgnoreCase("Active")) {
            Intent intent = new Intent(this, ModerateLegPlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;

        }else if (ctb.equalsIgnoreCase("Less than 1,000 Cals") && fg.equalsIgnoreCase("Legs") && fa.equalsIgnoreCase("Active")) {
            Intent intent = new Intent(this, BeginnerLegPlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;

        }else if (ctb.equalsIgnoreCase("More than 2,500 Cals") && fg.equalsIgnoreCase("Legs") && fa.equalsIgnoreCase("Active")) {
            Intent intent = new Intent(this, IntenseLegPlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;

        }else if (ctb.equalsIgnoreCase("More than 2,500 Cals") && fg.equalsIgnoreCase("Legs") && fa.equalsIgnoreCase("Very Active")) {
            Intent intent = new Intent(this, IntenseLegPlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;

        }else if (ctb.equalsIgnoreCase("Between 1,000 and 2,500 Cals") && fg.equalsIgnoreCase("Legs") && fa.equalsIgnoreCase("Very Active")) {
            Intent intent = new Intent(this, ModerateLegPlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;

        }else if (ctb.equalsIgnoreCase("Less than 1,000 Cals") && fg.equalsIgnoreCase("Legs") && fa.equalsIgnoreCase("Very Active")) {
            Intent intent = new Intent(this, LegWorkoutRecommendation.class);
            startActivity(intent);
            return;





        }else if (ctb.equalsIgnoreCase("Less than 1,000 Cals") && fg.equalsIgnoreCase("Chest") && fa.equalsIgnoreCase("Inactive")) {
            Intent intent = new Intent(this, BeginnerChestPlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;

        }else if (ctb.equalsIgnoreCase("Between 1,000 and 2,500 Cals") && fg.equalsIgnoreCase("Chest") && fa.equalsIgnoreCase("Inactive")) {
            Intent intent = new Intent(this, ModerateChestPlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;

        }else if (ctb.equalsIgnoreCase("More Than 2,500 Cals") && fg.equalsIgnoreCase("Chest") && fa.equalsIgnoreCase("Inactive")) {
            Intent intent = new Intent(this, PlanAdviceActivity.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "Try again!", Toast.LENGTH_LONG).show();
            return;


        }else if (ctb.equalsIgnoreCase("Between 1,000 and 2,500 Cals") && fg.equalsIgnoreCase("Chest") && fa.equalsIgnoreCase("Active")) {
            Intent intent = new Intent(this, ModerateChestPlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;

        }else if (ctb.equalsIgnoreCase("Less than 1,000 Cals") && fg.equalsIgnoreCase("Chest") && fa.equalsIgnoreCase("Active")) {
            Intent intent = new Intent(this, BeginnerChestPlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;

        }else if (ctb.equalsIgnoreCase("More than 2,500 Cals") && fg.equalsIgnoreCase("Chest") && fa.equalsIgnoreCase("Active")) {
            Intent intent = new Intent(this, IntenseChestPlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;


        }else if (ctb.equalsIgnoreCase("More than 2,500 Cals") && fg.equalsIgnoreCase("Chest") && fa.equalsIgnoreCase("Very Active")) {
            Intent intent = new Intent(this, IntenseChestPlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;

        }else if (ctb.equalsIgnoreCase("Between 1,000 and 2,500 Cals") && fg.equalsIgnoreCase("Chest") && fa.equalsIgnoreCase("Very Active")) {
            Intent intent = new Intent(this, ModerateChestPlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;

        }else if (ctb.equalsIgnoreCase("Less than 1,000 Cals") && fg.equalsIgnoreCase("Chest") && fa.equalsIgnoreCase("Very Active")) {
            Intent intent = new Intent(this, ChestWorkoutRecommendation.class);
            startActivity(intent);
            return;






        }else if (ctb.equalsIgnoreCase("Less than 1,000 Cals") && fg.equalsIgnoreCase("Glutes") && fa.equalsIgnoreCase("Inactive")) {
            Intent intent = new Intent(this, BeginnerGlutePlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;

        }else if (ctb.equalsIgnoreCase("Between 1,000 and 2,500 Cals") && fg.equalsIgnoreCase("Glutes") && fa.equalsIgnoreCase("Inactive")) {
            Intent intent = new Intent(this, ModerateGlutePlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;

        }else if (ctb.equalsIgnoreCase("More Than 2,500 Cals") && fg.equalsIgnoreCase("Glutes") && fa.equalsIgnoreCase("Inactive")) {
            Intent intent = new Intent(this, PlanAdviceActivity.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "Try again!", Toast.LENGTH_LONG).show();
            return;

        }else if (ctb.equalsIgnoreCase("Between 1,000 and 2,500 Cals") && fg.equalsIgnoreCase("Glutes") && fa.equalsIgnoreCase("Active")) {
            Intent intent = new Intent(this, ModerateGlutePlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;

        }else if (ctb.equalsIgnoreCase("Less than 1,000 Cals") && fg.equalsIgnoreCase("Glutes") && fa.equalsIgnoreCase("Active")) {
            Intent intent = new Intent(this, BeginnerGlutePlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;

        }else if (ctb.equalsIgnoreCase("More than 2,500 Cals") && fg.equalsIgnoreCase("Glutes") && fa.equalsIgnoreCase("Active")) {
            Intent intent = new Intent(this, IntenseGlutePlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;

        }else if (ctb.equalsIgnoreCase("More than 2,500 Cals") && fg.equalsIgnoreCase("Glutes") && fa.equalsIgnoreCase("Very Active")) {
            Intent intent = new Intent(this, IntenseGlutePlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;

        }else if (ctb.equalsIgnoreCase("Between 1,000 and 2,500 Cals") && fg.equalsIgnoreCase("Glutes") && fa.equalsIgnoreCase("Very Active")) {
            Intent intent = new Intent(this, ModerateGlutePlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;

        }else if (ctb.equalsIgnoreCase("Less than 1,000 Cals") && fg.equalsIgnoreCase("Glutes") && fa.equalsIgnoreCase("Very Active")) {
            Intent intent = new Intent(this, GluteWorkoutRecommendation.class);
            startActivity(intent);
            return;







        }else if (ctb.equalsIgnoreCase("Less than 1,000 Cals") && fg.equalsIgnoreCase("Abs") && fa.equalsIgnoreCase("Inactive")) {
            Intent intent = new Intent(this, BeginnerAbPlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;

        } else if (ctb.equalsIgnoreCase("Between 1,000 and 2,500 Cals") && fg.equalsIgnoreCase("Abs") && fa.equalsIgnoreCase("Inactive")) {
            Intent intent = new Intent(this, ModerateAbPlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;

        } else if (ctb.equalsIgnoreCase("More Than 2,500 Cals") && fg.equalsIgnoreCase("Abs") && fa.equalsIgnoreCase("Inactive")) {
            Intent intent = new Intent(this, PlanAdviceActivity.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "Try again!", Toast.LENGTH_LONG).show();
            return;

        } else if (ctb.equalsIgnoreCase("Between 1,000 and 2,500 Cals") && fg.equalsIgnoreCase("Abs") && fa.equalsIgnoreCase("Active")) {
            Intent intent = new Intent(this, ModerateAbPlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;

        } else if (ctb.equalsIgnoreCase("Less than 1,000 Cals") && fg.equalsIgnoreCase("Abs") && fa.equalsIgnoreCase("Active")) {
            Intent intent = new Intent(this, BeginnerAbPlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;

        } else if (ctb.equalsIgnoreCase("More than 2,500 Cals") && fg.equalsIgnoreCase("Abs") && fa.equalsIgnoreCase("Active")) {
            Intent intent = new Intent(this, IntenseAbPlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;

        } else if (ctb.equalsIgnoreCase("More than 2,500 Cals") && fg.equalsIgnoreCase("Abs") && fa.equalsIgnoreCase("Very Active")) {
            Intent intent = new Intent(this, IntenseAbPlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;

        } else if (ctb.equalsIgnoreCase("Between 1,000 and 2,500 Cals") && fg.equalsIgnoreCase("Abs") && fa.equalsIgnoreCase("Very Active")) {
            Intent intent = new Intent(this, ModerateAbPlan.class);
            startActivity(intent);
            Toast.makeText(DetailsActivity.this, "User Details saved", Toast.LENGTH_LONG).show();
            return;

        } else if (ctb.equalsIgnoreCase("Less than 1,000 Cals") && fg.equalsIgnoreCase("Abs") && fa.equalsIgnoreCase("Very Active")) {
            Intent intent = new Intent(this, AbWorkoutRecommendation.class);
            startActivity(intent);
            return;
        }

    }


}