package com.example.homefit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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

public class WeekTwoWorkout extends AppCompatActivity {

    TextView workout8, workout9, workout10, workout11, workout12, workout13, workout14;
    TextView workout8Performance, workout9Performance, workout10Performance, workout11Performance, workout12Performance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week_two_workout);

        Intent intent = getIntent();
        workout8 = findViewById(R.id.workout8);
        workout8Performance = findViewById(R.id.workout8performance);
        workout9 = findViewById(R.id.workout9);
        workout9Performance = findViewById(R.id.workout9performance);
        workout10 = findViewById(R.id.workout10);
        workout10Performance = findViewById(R.id.workout10performance);
        workout11 = findViewById(R.id.workout11);
        workout11Performance = findViewById(R.id.workout11performance);
        workout12 = findViewById(R.id.workout12);
        workout12Performance = findViewById(R.id.workout12performance);
        workout13 = findViewById(R.id.workout13);
        workout14 = findViewById(R.id.workout14);

        String day8 = intent.getStringExtra(WorkoutActivity.key8);
        workout8.setText(day8);
        String day8performance = intent.getStringExtra(WorkoutActivity.key8performance);
        workout8Performance.setText(day8performance);
        String day9 = intent.getStringExtra(WorkoutActivity.key9);
        workout9.setText(day9);
        String day9performance = intent.getStringExtra(WorkoutActivity.key9performance);
        workout9Performance.setText(day9performance);
        String day10 = intent.getStringExtra(WorkoutActivity.key10);
        workout10.setText(day10);
        String day10performance = intent.getStringExtra(WorkoutActivity.key10performance);
        workout10Performance.setText(day10performance);
        String day11 = intent.getStringExtra(WorkoutActivity.key11);
        workout11.setText(day11);
        String day11performance = intent.getStringExtra(WorkoutActivity.key11performance);
        workout11Performance.setText(day11performance);
        String day12 = intent.getStringExtra(WorkoutActivity.key12);
        workout12.setText(day12);
        String day12performance = intent.getStringExtra(WorkoutActivity.key12performance);
        workout12Performance.setText(day12performance);
        String day13 = intent.getStringExtra(WorkoutActivity.key13);
        workout13.setText(day13);
        String day14 = intent.getStringExtra(WorkoutActivity.key14);
        workout14.setText(day14);


        workout8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (day8.equals("Lying Leg Raise + Situp Toe Touch")) {

                    SpannableString ss1 = new SpannableString(day8);

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

                    workout8.setText(ss1);
                    workout8.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day8.equals("Dumbbell Clutch Curl + Diamond Pushup")) {

                    SpannableString ss1 = new SpannableString(day8);

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

                    workout8.setText(ss1);
                    workout8.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day8.equals("Dumbbell Pull Over + Diamond Pushup")) {

                    SpannableString ss1 = new SpannableString(day8);

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

                    workout8.setText(ss1);
                    workout8.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day8.equals("Donkey Kicks + Single Leg Hip Thruster")) {

                    SpannableString ss1 = new SpannableString(day8);

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

                    workout8.setText(ss1);
                    workout8.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day8.equals("Squat Jump + High Knee Toe Tap")) {

                    SpannableString ss1 = new SpannableString(day8);

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

                    workout8.setText(ss1);
                    workout8.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });

        workout9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (day9.equals("Hollow Body Hold + Butterfly Crunch")) {

                    SpannableString ss1 = new SpannableString(day9);

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

                    workout9.setText(ss1);
                    workout9.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day9.equals("BO Monkey Curl + Tempo Reverse Curl")) {

                    SpannableString ss1 = new SpannableString(day9);

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

                    workout9.setText(ss1);
                    workout9.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day9.equals("Spin Press + Hand Release Pushup")) {

                    SpannableString ss1 = new SpannableString(day9);

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

                    workout9.setText(ss1);
                    workout9.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day9.equals("Reverse Lunge + Stiff Leg Deadlift")) {

                    SpannableString ss1 = new SpannableString(day9);

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

                    workout9.setText(ss1);
                    workout9.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day9.equals("Pistol Squat + Lunge Squat")) {

                    SpannableString ss1 = new SpannableString(day9);

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

                    workout9.setText(ss1);
                    workout9.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });

        workout10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (day10.equals("Starfish Crunch + High Plank Position")) {

                    SpannableString ss1 = new SpannableString(day10);

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

                    workout10.setText(ss1);
                    workout10.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day10.equals("OH Tricep Ext + Tempo Pronate Tricep KB")) {

                    SpannableString ss1 = new SpannableString(day10);

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

                    workout10.setText(ss1);
                    workout10.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day10.equals("Dumbbell Floor Press + Decline Pushup")) {

                    SpannableString ss1 = new SpannableString(day10);

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

                    workout10.setText(ss1);
                    workout10.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day10.equals("Semi Sumo DL Pulse + Fire Hydrant")) {

                    SpannableString ss1 = new SpannableString(day10);

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

                    workout10.setText(ss1);
                    workout10.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day10.equals("One Leg Hip Up + Reverse Lunge")) {

                    SpannableString ss1 = new SpannableString(day10);

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

                    workout10.setText(ss1);
                    workout10.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });

        workout11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (day11.equals("Low Plank Walkout + Reverse Plank")) {

                    SpannableString ss1 = new SpannableString(day11);

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

                    workout11.setText(ss1);
                    workout11.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day11.equals("Dumbbell Skullcrusher + Lying Tricep Ext")) {

                    SpannableString ss1 = new SpannableString(day11);

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

                    workout11.setText(ss1);
                    workout11.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day11.equals("Dumbbell Floor Press + One Leg Pushup")) {

                    SpannableString ss1 = new SpannableString(day11);

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

                    workout11.setText(ss1);
                    workout11.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day11.equals("Hip Hinge Abduction + Single Leg Bridge")) {

                    SpannableString ss1 = new SpannableString(day11);

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

                    workout11.setText(ss1);
                    workout11.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day11.equals("Dumbbell Squat + Side Lunge")) {

                    SpannableString ss1 = new SpannableString(day11);

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

                    workout11.setText(ss1);
                    workout11.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });

        workout12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (day12.equals("Clam Situp + Old-Fashioned Plank ")) {

                    SpannableString ss1 = new SpannableString(day12);

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

                    workout12.setText(ss1);
                    workout12.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day12.equals("Hammer Dumbbell Curl + BO Monkey Curl")) {

                    SpannableString ss1 = new SpannableString(day12);

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

                    workout12.setText(ss1);
                    workout12.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day12.equals("Finger Out Pushup + Lying Dumbbell Fly")) {

                    SpannableString ss1 = new SpannableString(day12);

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

                    workout12.setText(ss1);
                    workout12.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day12.equals("Dumbbell Bridge + Frog Pump")) {

                    SpannableString ss1 = new SpannableString(day12);

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

                    workout12.setText(ss1);
                    workout12.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (day12.equals("Split Squat + Stiff Leg Deadlift")) {

                    SpannableString ss1 = new SpannableString(day12);

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

                    workout12.setText(ss1);
                    workout12.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });
    }

    public void trackWorkout(View view) {
        startActivity(new Intent(WeekTwoWorkout.this, TrackWeekTwoWorkout.class));
    }


    private void goToUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}