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

public class WeekFourWorkout extends AppCompatActivity {

    TextView workout22, workout23, workout24, workout25, workout26, workout27, workout28;
    TextView workout22Performance, workout23Performance, workout24Performance, workout25Performance, workout26Performance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week_four_workout);

        Intent intent = getIntent();
        workout22 = findViewById(R.id.workout22);
        workout22Performance = findViewById(R.id.workout22performance);
        workout23 = findViewById(R.id.workout23);
        workout23Performance = findViewById(R.id.workout23performance);
        workout24 = findViewById(R.id.workout24);
        workout24Performance = findViewById(R.id.workout24performance);
        workout25 = findViewById(R.id.workout25);
        workout25Performance = findViewById(R.id.workout25performance);
        workout26 = findViewById(R.id.workout26);
        workout26Performance = findViewById(R.id.workout26performance);
        workout27 = findViewById(R.id.workout27);
        workout28 = findViewById(R.id.workout28);

        String day22 = intent.getStringExtra(WorkoutActivity.key22);
        workout22.setText(day22);
        String day22performance = intent.getStringExtra(WorkoutActivity.key22performance);
        workout22Performance.setText(day22performance);
        String day23 = intent.getStringExtra(WorkoutActivity.key23);
        workout23.setText(day23);
        String day23performance = intent.getStringExtra(WorkoutActivity.key23performance);
        workout23Performance.setText(day23performance);
        String day24 = intent.getStringExtra(WorkoutActivity.key24);
        workout24.setText(day24);
        String day24performance = intent.getStringExtra(WorkoutActivity.key24performance);
        workout24Performance.setText(day24performance);
        String day25 = intent.getStringExtra(WorkoutActivity.key25);
        workout25.setText(day25);
        String day25performance = intent.getStringExtra(WorkoutActivity.key25performance);
        workout25Performance.setText(day25performance);
        String day26 = intent.getStringExtra(WorkoutActivity.key26);
        workout26.setText(day26);
        String day26performance = intent.getStringExtra(WorkoutActivity.key26performance);
        workout26Performance.setText(day26performance);
        String day27 = intent.getStringExtra(WorkoutActivity.key27);
        workout27.setText(day27);
        String day28 = intent.getStringExtra(WorkoutActivity.key28);
        workout28.setText(day28);

        workout22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (day22.equals("Lying Leg Raise + Situp Toe Touch")) {

                    SpannableString ss1 = new SpannableString(day22);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=Wp4BlxcFTkE");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=ZIAwC1w90VA");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 18, 33, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout22.setText(ss1);
                    workout22.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day22.equals("Dumbbell Clutch Curl + Diamond Pushup")) {

                    SpannableString ss1 = new SpannableString(day22);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/shorts/UtNfwTL1L7U");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=jaxbEHLC4qU");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 23, 37, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout22.setText(ss1);
                    workout22.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day22.equals("Dumbbell Pull Over + Diamond Pushup")) {

                    SpannableString ss1 = new SpannableString(day22);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=t00WCJfes5w");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=jaxbEHLC4qU");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 21, 35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout22.setText(ss1);
                    workout22.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day22.equals("Donkey Kicks + Single Leg Hip Thruster")) {

                    SpannableString ss1 = new SpannableString(day22);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=SJ1Xuz9D-ZQ");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=vYHqQmurSUk");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 15, 38, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout22.setText(ss1);
                    workout22.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day22.equals("Squat Jump + High Knee Toe Tap")) {

                    SpannableString ss1 = new SpannableString(day22);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=Azl5tkCzDcc");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=VHtUId9pBB0");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 13, 30, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout22.setText(ss1);
                    workout22.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });

        workout23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (day23.equals("Hollow Body Hold + Butterfly Crunch")) {

                    SpannableString ss1 = new SpannableString(day23);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=63Q9ezNX5Pw");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=LAPTW62nYrs");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 19, 35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout23.setText(ss1);
                    workout23.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day23.equals("BO Monkey Curl + Tempo Reverse Curl")) {

                    SpannableString ss1 = new SpannableString(day23);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=gQvdAcH1j9Q");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=EoYWMB856cA");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 17, 35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout23.setText(ss1);
                    workout23.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day23.equals("Spin Press + Hand Release Pushup")) {

                    SpannableString ss1 = new SpannableString(day23);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=m-CVSGAthfk");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=K915sE0RIYU");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 13, 32, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout23.setText(ss1);
                    workout23.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day23.equals("Reverse Lunge + Stiff Leg Deadlift")) {

                    SpannableString ss1 = new SpannableString(day23);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=tpVhJNQURk4");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=z2p-qoY6rCc");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 16, 34, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout23.setText(ss1);
                    workout23.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day23.equals("Pistol Squat + Lunge Squat")) {

                    SpannableString ss1 = new SpannableString(day23);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=H-8t44E0UxA");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=cNDt-5H8tnc");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 15, 26, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout23.setText(ss1);
                    workout23.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });

        workout24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (day24.equals("Starfish Crunch + High Plank Position")) {

                    SpannableString ss1 = new SpannableString(day24);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=tiPR05uvyWY");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=fSaYfvSpAMI");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 18, 37, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout24.setText(ss1);
                    workout24.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day24.equals("OH Tricep Ext + Tempo Pronate Tricep KB")) {

                    SpannableString ss1 = new SpannableString(day24);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=ZJxUTuVjmqA");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=wK41ryw7F6o");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 16, 39, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout24.setText(ss1);
                    workout24.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day24.equals("Dumbbell Floor Press + Decline Pushup")) {

                    SpannableString ss1 = new SpannableString(day24);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=OXDYwsjdW9I");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=PXIpw1JD4qw");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 23, 37, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout24.setText(ss1);
                    workout24.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day24.equals("Semi Sumo DL Pulse + Fire Hydrant")) {

                    SpannableString ss1 = new SpannableString(day24);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=0O6v9iyHNec");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=pm51PILr3qM");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 21, 33, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout24.setText(ss1);
                    workout24.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day24.equals("One Leg Hip Up + Reverse Lunge")) {

                    SpannableString ss1 = new SpannableString(day24);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=CYWmz3Zxr8s");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=-cdph8hv0O0");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 17, 30, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout24.setText(ss1);
                    workout24.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });

        workout25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (day25.equals("Low Plank Walkout + Reverse Plank")) {

                    SpannableString ss1 = new SpannableString(day25);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=-FW8DNKsAh8");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=ZNAxdJ6Bt00");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 20, 33, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout25.setText(ss1);
                    workout25.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day25.equals("Dumbbell Skullcrusher + Lying Tricep Ext")) {

                    SpannableString ss1 = new SpannableString(day25);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=1BDGIcMTSXc");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=2XDPNh7a8p8");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 24, 40, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout25.setText(ss1);
                    workout25.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day25.equals("Dumbbell Floor Press + One Leg Pushup")) {

                    SpannableString ss1 = new SpannableString(day25);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=OXDYwsjdW9I");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=cM9Fc-Lfv0A");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 23, 37, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout25.setText(ss1);
                    workout25.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day25.equals("Hip Hinge Abduction + Single Leg Bridge")) {

                    SpannableString ss1 = new SpannableString(day25);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=LUJZrULHD6s");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=Vkfc8I7PfFk");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 22, 39, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout25.setText(ss1);
                    workout25.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day25.equals("Dumbbell Squat + Side Lunge")) {

                    SpannableString ss1 = new SpannableString(day25);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=JKkNw3jO9S8");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=1D_tsUSW3ZY");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 17, 27, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout25.setText(ss1);
                    workout25.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });

        workout26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (day26.equals("Clam Situp + Old-Fashioned Plank ")) {

                    SpannableString ss1 = new SpannableString(day26);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=V_lHogFPocY");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=0Z7ds7Qivqs");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 13, 32, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout26.setText(ss1);
                    workout26.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day26.equals("Hammer Dumbbell Curl + BO Monkey Curl")) {

                    SpannableString ss1 = new SpannableString(day26);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=P5sXHLmXmBM");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=gQvdAcH1j9Q");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 23, 37, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout26.setText(ss1);
                    workout26.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day26.equals("Finger Out Pushup + Lying Dumbbell Fly")) {

                    SpannableString ss1 = new SpannableString(day26);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=1pMwmIKWSa0");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/shorts/pgtaomNZJvQ");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 20, 38, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout26.setText(ss1);
                    workout26.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day26.equals("Dumbbell Bridge + Frog Pump")) {

                    SpannableString ss1 = new SpannableString(day26);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=o6sXO66Sqj4");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=Ro8Zyg38uSk");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 18, 27, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout26.setText(ss1);
                    workout26.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day26.equals("Split Squat + Stiff Leg Deadlift")) {

                    SpannableString ss1 = new SpannableString(day26);

                    ClickableSpan clickableSpan1 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=UcZVX7Sc9YI");
                        }
                    };

                    ClickableSpan clickableSpan2 = new ClickableSpan() {
                        @Override
                        public void onClick(@NonNull View widget) {
                            goToUrl("https://www.youtube.com/watch?v=z2p-qoY6rCc");
                        }
                    };

                    ss1.setSpan(clickableSpan1, 0, 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 14, 32, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout26.setText(ss1);
                    workout26.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });
    }

    private void goToUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}