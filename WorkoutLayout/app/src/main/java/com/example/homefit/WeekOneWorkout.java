package com.example.homefit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class WeekOneWorkout extends AppCompatActivity {

    TextView workout1, workout2, workout3, workout4, workout5, workout6, workout7;
    TextView workout1Performance, workout2Performance, workout3Performance, workout4Performance, workout5Performance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week_one_workout);

        Intent intent = getIntent();
        workout1 = findViewById(R.id.workout1);
        workout1Performance = findViewById(R.id.workout1performance);
        workout2 = findViewById(R.id.workout2);
        workout2Performance = findViewById(R.id.workout2performance);
        workout3 = findViewById(R.id.workout3);
        workout3Performance = findViewById(R.id.workout3performance);
        workout4 = findViewById(R.id.workout4);
        workout4Performance = findViewById(R.id.workout4performance);
        workout5 = findViewById(R.id.workout5);
        workout5Performance = findViewById(R.id.workout5performance);
        workout6 = findViewById(R.id.workout6);
        workout7 = findViewById(R.id.workout7);

        String day1 = intent.getStringExtra(WorkoutActivity.key1);
        workout1.setText(day1);
        String day1performance = intent.getStringExtra(WorkoutActivity.key1performance);
        workout1Performance.setText(day1performance);
        String day2 = intent.getStringExtra(WorkoutActivity.key2);
        workout2.setText(day2);
        String day2performance = intent.getStringExtra(WorkoutActivity.key2performance);
        workout2Performance.setText(day2performance);
        String day3 = intent.getStringExtra(WorkoutActivity.key3);
        workout3.setText(day3);
        String day3performance = intent.getStringExtra(WorkoutActivity.key3performance);
        workout3Performance.setText(day3performance);
        String day4 = intent.getStringExtra(WorkoutActivity.key4);
        workout4.setText(day4);
        String day4performance = intent.getStringExtra(WorkoutActivity.key4performance);
        workout4Performance.setText(day4performance);
        String day5 = intent.getStringExtra(WorkoutActivity.key5);
        workout5.setText(day5);
        String day5performance = intent.getStringExtra(WorkoutActivity.key5performance);
        workout5Performance.setText(day5performance);
        String day6 = intent.getStringExtra(WorkoutActivity.key6);
        workout6.setText(day6);
        String day7 = intent.getStringExtra(WorkoutActivity.key7);
        workout7.setText(day7);

        workout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (day1.equals("Low Plank Walkout + Starfish Crunch")) {

                    SpannableString ss1 = new SpannableString(day1);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=-FW8DNKsAh8");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=tiPR05uvyWY");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 20, 35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout1.setText(ss1);
                    workout1.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day1.equals("Dumbbell Curl + Diamond Pushup")) {

                    SpannableString ss1 = new SpannableString(day1);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=zdQOmPMGjOY");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=jaxbEHLC4qU");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 16, 30, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout1.setText(ss1);
                    workout1.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day1.equals("Hand Release Pushup + Spin Press")) {

                    SpannableString ss1 = new SpannableString(day1);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=K915sE0RIYU");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=m-CVSGAthfk");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 22, 32, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout1.setText(ss1);
                    workout1.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day1.equals("Reverse Lunge + Single Leg Bridge")) {

                    SpannableString ss1 = new SpannableString(day1);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=tpVhJNQURk4");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=Vkfc8I7PfFk");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 16, 33, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout1.setText(ss1);
                    workout1.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day1.equals("Stiff Leg Deadlift + Split Squat")) {

                    SpannableString ss1 = new SpannableString(day1);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=z2p-qoY6rCc");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=UcZVX7Sc9YI");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 21, 32, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout1.setText(ss1);
                    workout1.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });

        workout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (day2.equals("Lying Leg Raise + Hollow Body Hold")) {

                    SpannableString ss1 = new SpannableString(day2);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=Wp4BlxcFTkE");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=63Q9ezNX5Pw");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 18, 34, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout2.setText(ss1);
                    workout2.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day2.equals("Lying Tricep Ext + Hammer Dumbbell Curl")) {

                    SpannableString ss1 = new SpannableString(day2);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=2XDPNh7a8p8");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=P5sXHLmXmBM");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 19, 39, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout2.setText(ss1);
                    workout2.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day2.equals("Decline Pushup + Dumbbell Floor Press")) {

                    SpannableString ss1 = new SpannableString(day2);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=PXIpw1JD4qw");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=OXDYwsjdW9I");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 17, 37, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout2.setText(ss1);
                    workout2.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day2.equals("Stiff Leg Deadlift + Hip Hinge Abduction")) {

                    SpannableString ss1 = new SpannableString(day2);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=z2p-qoY6rCc");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=LUJZrULHD6s");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 21, 40, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout2.setText(ss1);
                    workout2.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day2.equals("Side Lunge + Dumbbell Squat")) {

                    SpannableString ss1 = new SpannableString(day2);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=1D_tsUSW3ZY");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=JKkNw3jO9S8");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 13, 27, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout2.setText(ss1);
                    workout2.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });

        workout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (day3.equals("Reverse Plank + Old-Fashioned Plank")) {

                    SpannableString ss1 = new SpannableString(day3);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=ZNAxdJ6Bt00");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=0Z7ds7Qivqs");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 16, 35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout3.setText(ss1);
                    workout3.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day3.equals("OH Tricep Ext + Dumbbell Skullcrusher")) {

                    SpannableString ss1 = new SpannableString(day3);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=ZJxUTuVjmqA");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=1BDGIcMTSXc");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 16, 37, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout3.setText(ss1);
                    workout3.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day3.equals("One Leg Pushup + Finger Out Pushup")) {

                    SpannableString ss1 = new SpannableString(day3);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=cM9Fc-Lfv0A");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=1pMwmIKWSa0");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 17, 34, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout3.setText(ss1);
                    workout3.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day3.equals("Frog Pump + Semi Sumo DL Pulse")) {

                    SpannableString ss1 = new SpannableString(day3);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=Ro8Zyg38uSk");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=0O6v9iyHNec");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 12, 30, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout3.setText(ss1);
                    workout3.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day3.equals("One Leg Hip Up + Lunge Squat")) {

                    SpannableString ss1 = new SpannableString(day3);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=CYWmz3Zxr8s");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=cNDt-5H8tnc");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 17, 28, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout3.setText(ss1);
                    workout3.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });

        workout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (day4.equals("High Plank Position + Butterfly Crunch")) {

                    SpannableString ss1 = new SpannableString(day4);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=fSaYfvSpAMI");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=LAPTW62nYrs");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 22, 38, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout4.setText(ss1);
                    workout4.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day4.equals("BO Monkey Curl + Tempo Pronate Tricep KB")) {

                    SpannableString ss1 = new SpannableString(day4);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=gQvdAcH1j9Q");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=wK41ryw7F6o");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 17, 40, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout4.setText(ss1);
                    workout4.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day4.equals("Diamond Pushup + Lying Dumbbell Fly")) {

                    SpannableString ss1 = new SpannableString(day4);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=jaxbEHLC4qU");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/shorts/pgtaomNZJvQ");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 17, 35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout4.setText(ss1);
                    workout4.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day4.equals("Single Leg Hip Thruster + Fire Hydrant")) {

                    SpannableString ss1 = new SpannableString(day4);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=vYHqQmurSUk");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=pm51PILr3qM");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 26, 38, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout4.setText(ss1);
                    workout4.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day4.equals("High Knee Toe Tap + Reverse Lunge")) {

                    SpannableString ss1 = new SpannableString(day4);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=VHtUId9pBB0");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=-cdph8hv0O0");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 20, 33, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout4.setText(ss1);
                    workout4.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });

        workout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (day5.equals("Situp Toe Touch + Clam Situp")) {

                    SpannableString ss1 = new SpannableString(day5);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=ZIAwC1w90VA");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=V_lHogFPocY");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 18, 28, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout5.setText(ss1);
                    workout5.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day5.equals("Tempo Reverse Curl + Dumbbell Clutch Curl")) {

                    SpannableString ss1 = new SpannableString(day5);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=EoYWMB856cA");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/shorts/UtNfwTL1L7U");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 21, 41, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout5.setText(ss1);
                    workout5.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day5.equals("Spiderman Pushup + Dumbbell Pull Over")) {

                    SpannableString ss1 = new SpannableString(day5);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=DYONORexgpY");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=t00WCJfes5w");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 19, 37, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout5.setText(ss1);
                    workout5.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day5.equals("Dumbbell Bridge + Donkey Kicks")) {

                    SpannableString ss1 = new SpannableString(day5);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=o6sXO66Sqj4");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=SJ1Xuz9D-ZQ");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 18, 30, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout5.setText(ss1);
                    workout5.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day5.equals("Pistol Squat + Squat Jump")) {

                    SpannableString ss1 = new SpannableString(day5);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=H-8t44E0UxA");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=Azl5tkCzDcc");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 15, 25, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout5.setText(ss1);
                    workout5.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });
    }

    private void goToUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}