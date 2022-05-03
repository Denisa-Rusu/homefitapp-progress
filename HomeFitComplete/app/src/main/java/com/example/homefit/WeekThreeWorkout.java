package com.example.homefit;

import androidx.appcompat.app.AppCompatActivity;

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

public class WeekThreeWorkout extends AppCompatActivity {

    TextView workout15, workout16, workout17, workout18, workout19, workout20, workout21;
    TextView workout15Performance, workout16Performance, workout17Performance, workout18Performance, workout19Performance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week_three_workout);

        Intent intent = getIntent();
        workout15 = findViewById(R.id.workout15);
        workout15Performance = findViewById(R.id.workout15performance);
        workout16 = findViewById(R.id.workout16);
        workout16Performance = findViewById(R.id.workout16performance);
        workout17 = findViewById(R.id.workout17);
        workout17Performance = findViewById(R.id.workout17performance);
        workout18 = findViewById(R.id.workout18);
        workout18Performance = findViewById(R.id.workout18performance);
        workout19 = findViewById(R.id.workout19);
        workout19Performance = findViewById(R.id.workout19performance);
        workout20 = findViewById(R.id.workout20);
        workout21 = findViewById(R.id.workout21);

        String day15 = intent.getStringExtra(WorkoutActivity.key15);
        workout15.setText(day15);
        String day15performance = intent.getStringExtra(WorkoutActivity.key15performance);
        workout15Performance.setText(day15performance);
        String day16 = intent.getStringExtra(WorkoutActivity.key16);
        workout16.setText(day16);
        String day16performance = intent.getStringExtra(WorkoutActivity.key16performance);
        workout16Performance.setText(day16performance);
        String day17 = intent.getStringExtra(WorkoutActivity.key17);
        workout17.setText(day17);
        String day17performance = intent.getStringExtra(WorkoutActivity.key17performance);
        workout17Performance.setText(day17performance);
        String day18 = intent.getStringExtra(WorkoutActivity.key18);
        workout18.setText(day18);
        String day18performance = intent.getStringExtra(WorkoutActivity.key18performance);
        workout18Performance.setText(day18performance);
        String day19 = intent.getStringExtra(WorkoutActivity.key19);
        workout19.setText(day19);
        String day19performance = intent.getStringExtra(WorkoutActivity.key19performance);
        workout19Performance.setText(day19performance);
        String day20 = intent.getStringExtra(WorkoutActivity.key20);
        workout20.setText(day20);
        String day21 = intent.getStringExtra(WorkoutActivity.key21);
        workout21.setText(day21);

        workout15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (day15.equals("Low Plank Walkout + Starfish Crunch")) {

                    SpannableString ss1 = new SpannableString(day15);

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

                    workout15.setText(ss1);
                    workout15.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day15.equals("Dumbbell Curl + Diamond Pushup")) {

                    SpannableString ss1 = new SpannableString(day15);

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

                    workout15.setText(ss1);
                    workout15.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day15.equals("Hand Release Pushup + Spin Press")) {

                    SpannableString ss1 = new SpannableString(day15);

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

                    workout15.setText(ss1);
                    workout15.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day15.equals("Reverse Lunge + Single Leg Bridge")) {

                    SpannableString ss1 = new SpannableString(day15);

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

                    workout15.setText(ss1);
                    workout15.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day15.equals("Stiff Leg Deadlift + Split Squat")) {

                    SpannableString ss1 = new SpannableString(day15);

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

                    workout15.setText(ss1);
                    workout15.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });

        workout16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (day16.equals("Lying Leg Raise + Hollow Body Hold")) {

                    SpannableString ss1 = new SpannableString(day16);

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

                    workout16.setText(ss1);
                    workout16.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day16.equals("Lying Tricep Ext + Hammer Dumbbell Curl")) {

                    SpannableString ss1 = new SpannableString(day16);

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

                    workout16.setText(ss1);
                    workout16.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day16.equals("Decline Pushup + Dumbbell Floor Press")) {

                    SpannableString ss1 = new SpannableString(day16);

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

                    workout16.setText(ss1);
                    workout16.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day16.equals("Stiff Leg Deadlift + Hip Hinge Abduction")) {

                    SpannableString ss1 = new SpannableString(day16);

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

                    workout16.setText(ss1);
                    workout16.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day16.equals("Side Lunge + Dumbbell Squat")) {

                    SpannableString ss1 = new SpannableString(day16);

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

                    workout16.setText(ss1);
                    workout16.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });


        workout17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (day17.equals("Reverse Plank + Old-Fashioned Plank")) {

                    SpannableString ss1 = new SpannableString(day17);

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

                    workout17.setText(ss1);
                    workout17.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day17.equals("OH Tricep Ext + Dumbbell Skullcrusher")) {

                    SpannableString ss1 = new SpannableString(day17);

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

                    workout17.setText(ss1);
                    workout17.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day17.equals("One Leg Pushup + Finger Out Pushup")) {

                    SpannableString ss1 = new SpannableString(day17);

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

                    workout17.setText(ss1);
                    workout17.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day17.equals("Frog Pump + Semi Sumo DL Pulse")) {

                    SpannableString ss1 = new SpannableString(day17);

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

                    workout17.setText(ss1);
                    workout17.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day17.equals("One Leg Hip Up + Lunge Squat")) {

                    SpannableString ss1 = new SpannableString(day17);

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

                    workout17.setText(ss1);
                    workout17.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });

        workout18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (day18.equals("High Plank Position + Butterfly Crunch")) {

                    SpannableString ss1 = new SpannableString(day18);

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

                    workout18.setText(ss1);
                    workout18.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day18.equals("BO Monkey Curl + Tempo Pronate Tricep KB")) {

                    SpannableString ss1 = new SpannableString(day18);

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

                    workout18.setText(ss1);
                    workout18.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day18.equals("Diamond Pushup + Lying Dumbbell Fly")) {

                    SpannableString ss1 = new SpannableString(day18);

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

                    workout18.setText(ss1);
                    workout18.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day18.equals("Single Leg Hip Thruster + Fire Hydrant")) {

                    SpannableString ss1 = new SpannableString(day18);

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

                    workout18.setText(ss1);
                    workout18.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day18.equals("High Knee Toe Tap + Reverse Lunge")) {

                    SpannableString ss1 = new SpannableString(day18);

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

                    workout18.setText(ss1);
                    workout18.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });


        workout19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (day19.equals("Situp Toe Touch + Clam Situp")) {

                    SpannableString ss1 = new SpannableString(day19);

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

                    workout19.setText(ss1);
                    workout19.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day19.equals("Tempo Reverse Curl + Dumbbell Clutch Curl")) {

                    SpannableString ss1 = new SpannableString(day19);

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

                    workout19.setText(ss1);
                    workout19.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day19.equals("Spiderman Pushup + Dumbbell Pull Over")) {

                    SpannableString ss1 = new SpannableString(day19);

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

                    workout19.setText(ss1);
                    workout19.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day19.equals("Dumbbell Bridge + Donkey Kicks")) {

                    SpannableString ss1 = new SpannableString(day19);

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

                    workout19.setText(ss1);
                    workout19.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day19.equals("Pistol Squat + Squat Jump")) {

                    SpannableString ss1 = new SpannableString(day19);

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

                    workout19.setText(ss1);
                    workout19.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });

    }

    public void trackWorkout(View view) {
        startActivity(new Intent(WeekThreeWorkout.this, TrackWeekThreeWorkout.class));
    }

    private void goToUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}