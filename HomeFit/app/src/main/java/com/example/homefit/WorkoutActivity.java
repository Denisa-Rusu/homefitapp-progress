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
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class WorkoutActivity extends AppCompatActivity {

    TextView workout1, workout2, workout3, workout4, workout5;
    TextView workout6, workout7;
    TextView workout8, workout9, workout10, workout11, workout12;
    TextView workout13, workout14;
    TextView workout15, workout16, workout17, workout18, workout19;
    TextView workout20, workout21;
    TextView workout22, workout23, workout24, workout25, workout26;
    TextView workout27, workout28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        Intent intent = getIntent();

        workout1 = findViewById(R.id.workout1);
        workout2 = findViewById(R.id.workout2);
        workout3 = findViewById(R.id.workout3);
        workout4 = findViewById(R.id.workout4);
        workout5 = findViewById(R.id.workout5);
        workout6 = findViewById(R.id.workout6);
        workout7 = findViewById(R.id.workout7);
        workout8 = findViewById(R.id.workout8);
        workout9 = findViewById(R.id.workout9);
        workout10 = findViewById(R.id.workout10);
        workout11 = findViewById(R.id.workout11);
        workout12 = findViewById(R.id.workout12);
        workout13 = findViewById(R.id.workout13);
        workout14 = findViewById(R.id.workout14);
        workout15 = findViewById(R.id.workout15);
        workout16 = findViewById(R.id.workout16);
        workout17 = findViewById(R.id.workout17);
        workout18 = findViewById(R.id.workout18);
        workout19 = findViewById(R.id.workout19);
        workout20 = findViewById(R.id.workout20);
        workout21 = findViewById(R.id.workout21);
        workout22 = findViewById(R.id.workout22);
        workout23 = findViewById(R.id.workout23);
        workout24 = findViewById(R.id.workout24);
        workout25 = findViewById(R.id.workout25);
        workout26 = findViewById(R.id.workout26);
        workout27 = findViewById(R.id.workout27);
        workout28 = findViewById(R.id.workout28);


        /////////////////////////////ABS/////////////////////////////

        String begabday1 = intent.getStringExtra(BeginnerAbPlan.key1);
        workout1.setText(begabday1);
        String begabday2 = intent.getStringExtra(BeginnerAbPlan.key2);
        workout2.setText(begabday2);
        String begabday3 = intent.getStringExtra(BeginnerAbPlan.key3);
        workout3.setText(begabday3);
        String begabday4 = intent.getStringExtra(BeginnerAbPlan.key4);
        workout4.setText(begabday4);
        String begabday5 = intent.getStringExtra(BeginnerAbPlan.key5);
        workout5.setText(begabday5);
        String begabday6 = intent.getStringExtra(BeginnerAbPlan.key6);
        workout6.setText(begabday6);
        String begabday7 = intent.getStringExtra(BeginnerAbPlan.key7);
        workout7.setText(begabday7);
        String begabday8 = intent.getStringExtra(BeginnerAbPlan.key8);
        workout8.setText(begabday8);
        String begabday9 = intent.getStringExtra(BeginnerAbPlan.key9);
        workout9.setText(begabday9);
        String begabday10 = intent.getStringExtra(BeginnerAbPlan.key10);
        workout10.setText(begabday10);
        String begabday11 = intent.getStringExtra(BeginnerAbPlan.key11);
        workout11.setText(begabday11);
        String begabday12 = intent.getStringExtra(BeginnerAbPlan.key12);
        workout12.setText(begabday12);
        String begabday13 = intent.getStringExtra(BeginnerAbPlan.key13);
        workout13.setText(begabday13);
        String begabday14 = intent.getStringExtra(BeginnerAbPlan.key14);
        workout14.setText(begabday14);
        String begabday15 = intent.getStringExtra(BeginnerAbPlan.key15);
        workout15.setText(begabday15);
        String begabday16 = intent.getStringExtra(BeginnerAbPlan.key16);
        workout16.setText(begabday16);
        String begabday17 = intent.getStringExtra(BeginnerAbPlan.key17);
        workout17.setText(begabday17);
        String begabday18 = intent.getStringExtra(BeginnerAbPlan.key18);
        workout18.setText(begabday18);
        String begabday19 = intent.getStringExtra(BeginnerAbPlan.key19);
        workout19.setText(begabday19);
        String begabday20 = intent.getStringExtra(BeginnerAbPlan.key20);
        workout20.setText(begabday20);
        String begabday21 = intent.getStringExtra(BeginnerAbPlan.key21);
        workout21.setText(begabday21);
        String begabday22 = intent.getStringExtra(BeginnerAbPlan.key22);
        workout22.setText(begabday22);
        String begabday23 = intent.getStringExtra(BeginnerAbPlan.key23);
        workout23.setText(begabday23);
        String begabday24 = intent.getStringExtra(BeginnerAbPlan.key24);
        workout24.setText(begabday24);
        String begabday25 = intent.getStringExtra(BeginnerAbPlan.key25);
        workout25.setText(begabday25);
        String begabday26 = intent.getStringExtra(BeginnerAbPlan.key26);
        workout26.setText(begabday26);
        String begabday27 = intent.getStringExtra(BeginnerAbPlan.key27);
        workout27.setText(begabday27);
        String begabday28 = intent.getStringExtra(BeginnerAbPlan.key28);
        workout28.setText(begabday28);


        /////////////////////////////ARMS///////////////////////////////

        String begarmday1 = intent.getStringExtra(BeginnerArmPlan.key1);
        workout1.setText(begarmday1);
        String begarmday2 = intent.getStringExtra(BeginnerArmPlan.key2);
        workout2.setText(begarmday2);
        String begarmday3 = intent.getStringExtra(BeginnerArmPlan.key3);
        workout3.setText(begarmday3);
        String begarmday4 = intent.getStringExtra(BeginnerArmPlan.key4);
        workout4.setText(begarmday4);
        String begarmday5 = intent.getStringExtra(BeginnerArmPlan.key5);
        workout5.setText(begarmday5);
        String begarmday6 = intent.getStringExtra(BeginnerArmPlan.key6);
        workout6.setText(begarmday6);
        String begarmday7 = intent.getStringExtra(BeginnerArmPlan.key7);
        workout7.setText(begarmday7);
        String begarmday8 = intent.getStringExtra(BeginnerArmPlan.key8);
        workout8.setText(begarmday8);
        String begarmday9 = intent.getStringExtra(BeginnerArmPlan.key9);
        workout9.setText(begarmday9);
        String begarmday10 = intent.getStringExtra(BeginnerArmPlan.key10);
        workout10.setText(begarmday10);
        String begarmday11 = intent.getStringExtra(BeginnerArmPlan.key11);
        workout11.setText(begarmday11);
        String begarmday12 = intent.getStringExtra(BeginnerArmPlan.key12);
        workout12.setText(begarmday12);
        String begarmday13 = intent.getStringExtra(BeginnerArmPlan.key13);
        workout13.setText(begarmday13);
        String begarmday14 = intent.getStringExtra(BeginnerArmPlan.key14);
        workout14.setText(begarmday14);
        String begarmday15 = intent.getStringExtra(BeginnerArmPlan.key15);
        workout15.setText(begarmday15);
        String begarmday16 = intent.getStringExtra(BeginnerArmPlan.key16);
        workout16.setText(begarmday16);
        String begarmday17 = intent.getStringExtra(BeginnerArmPlan.key17);
        workout17.setText(begarmday17);
        String begarmday18 = intent.getStringExtra(BeginnerArmPlan.key18);
        workout18.setText(begarmday18);
        String begarmday19 = intent.getStringExtra(BeginnerArmPlan.key19);
        workout19.setText(begarmday19);
        String begarmday20 = intent.getStringExtra(BeginnerArmPlan.key20);
        workout20.setText(begarmday20);
        String begarmday21 = intent.getStringExtra(BeginnerArmPlan.key21);
        workout21.setText(begarmday21);
        String begarmday22 = intent.getStringExtra(BeginnerArmPlan.key22);
        workout22.setText(begarmday22);
        String begarmday23 = intent.getStringExtra(BeginnerArmPlan.key23);
        workout23.setText(begarmday23);
        String begarmday24 = intent.getStringExtra(BeginnerArmPlan.key24);
        workout24.setText(begarmday24);
        String begarmday25 = intent.getStringExtra(BeginnerArmPlan.key25);
        workout25.setText(begarmday25);
        String begarmday26 = intent.getStringExtra(BeginnerArmPlan.key26);
        workout26.setText(begarmday26);
        String begarmday27 = intent.getStringExtra(BeginnerArmPlan.key27);
        workout27.setText(begarmday27);
        String begarmday28 = intent.getStringExtra(BeginnerArmPlan.key28);
        workout28.setText(begarmday28);



        //////////////////////////////CHEST////////////////////////////

        String begchestday1 = intent.getStringExtra(BeginnerChestPlan.key1);
        workout1.setText(begchestday1);
        String begchestday2 = intent.getStringExtra(BeginnerChestPlan.key2);
        workout2.setText(begchestday2);
        String begchestday3 = intent.getStringExtra(BeginnerChestPlan.key3);
        workout3.setText(begchestday3);
        String begchestday4 = intent.getStringExtra(BeginnerChestPlan.key4);
        workout4.setText(begchestday4);
        String begchestday5 = intent.getStringExtra(BeginnerChestPlan.key5);
        workout5.setText(begchestday5);
        String begchestday6 = intent.getStringExtra(BeginnerChestPlan.key6);
        workout6.setText(begchestday6);
        String begchestday7 = intent.getStringExtra(BeginnerChestPlan.key7);
        workout7.setText(begchestday7);
        String begchestday8 = intent.getStringExtra(BeginnerChestPlan.key8);
        workout8.setText(begchestday8);
        String begchestday9 = intent.getStringExtra(BeginnerChestPlan.key9);
        workout9.setText(begchestday9);
        String begchestday10 = intent.getStringExtra(BeginnerChestPlan.key10);
        workout10.setText(begchestday10);
        String begchestday11 = intent.getStringExtra(BeginnerChestPlan.key11);
        workout11.setText(begchestday11);
        String begchestday12 = intent.getStringExtra(BeginnerChestPlan.key12);
        workout12.setText(begchestday12);
        String begchestday13 = intent.getStringExtra(BeginnerChestPlan.key13);
        workout13.setText(begchestday13);
        String begchestday14 = intent.getStringExtra(BeginnerChestPlan.key14);
        workout14.setText(begchestday14);
        String begchestday15 = intent.getStringExtra(BeginnerChestPlan.key15);
        workout15.setText(begchestday15);
        String begchestday16 = intent.getStringExtra(BeginnerChestPlan.key16);
        workout16.setText(begchestday16);
        String begchestday17 = intent.getStringExtra(BeginnerChestPlan.key17);
        workout17.setText(begchestday17);
        String begchestday18 = intent.getStringExtra(BeginnerChestPlan.key18);
        workout18.setText(begchestday18);
        String begchestday19 = intent.getStringExtra(BeginnerChestPlan.key19);
        workout19.setText(begchestday19);
        String begchestday20 = intent.getStringExtra(BeginnerChestPlan.key20);
        workout20.setText(begchestday20);
        String begchestday21 = intent.getStringExtra(BeginnerChestPlan.key21);
        workout21.setText(begchestday21);
        String begchestday22 = intent.getStringExtra(BeginnerChestPlan.key22);
        workout22.setText(begchestday22);
        String begchestday23 = intent.getStringExtra(BeginnerChestPlan.key23);
        workout23.setText(begchestday23);
        String begchestday24 = intent.getStringExtra(BeginnerChestPlan.key24);
        workout24.setText(begchestday24);
        String begchestday25 = intent.getStringExtra(BeginnerChestPlan.key25);
        workout25.setText(begchestday25);
        String begchestday26 = intent.getStringExtra(BeginnerChestPlan.key26);
        workout26.setText(begchestday26);
        String begchestday27 = intent.getStringExtra(BeginnerChestPlan.key27);
        workout27.setText(begchestday27);
        String begchestday28 = intent.getStringExtra(BeginnerChestPlan.key28);
        workout28.setText(begchestday28);


        workout1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if(begabday1.equals("Low Plank Walkout + Starfish Crunch")) {

                    SpannableString ss1 = new SpannableString(begabday1);

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
                    ss1.setSpan(clickableSpan2, 20,35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout1.setText(ss1);
                    workout1.setMovementMethod(LinkMovementMethod.getInstance());

                }

                if(begarmday1.equals("Dumbbell Curl + Diamond Pushup")) {

                    SpannableString ss1 = new SpannableString(begarmday1);

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
                    ss1.setSpan(clickableSpan2, 16,30, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout1.setText(ss1);
                    workout1.setMovementMethod(LinkMovementMethod.getInstance());
                }

            }
        });

        workout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (begabday2.equals("Lying Leg Raise + Hollow Body Hold")) {

                    SpannableString ss1 = new SpannableString(begabday2);

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
                    ss1.setSpan(clickableSpan2, 18,34, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout2.setText(ss1);
                    workout2.setMovementMethod(LinkMovementMethod.getInstance());

                }

                if (begarmday2.equals("Lying Tricep Ext + Hammer Dumbbell Curl")) {

                    SpannableString ss1 = new SpannableString(begarmday2);

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
                    ss1.setSpan(clickableSpan2, 19,39, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout2.setText(ss1);
                    workout2.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });

        workout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (begabday3.equals("Reverse Plank + Old-Fashioned Plank")) {

                    SpannableString ss1 = new SpannableString(begabday3);

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
                    ss1.setSpan(clickableSpan2, 16,35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout3.setText(ss1);
                    workout3.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (begarmday3.equals("OH Tricep Ext + Dumbbell Skullcrusher")) {

                    SpannableString ss1 = new SpannableString(begarmday3);

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
                    ss1.setSpan(clickableSpan2, 16,37, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout3.setText(ss1);
                    workout3.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });


        workout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (begabday4.equals("High Plank Position + Butterfly Crunch")) {

                    SpannableString ss1 = new SpannableString(begabday4);

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
                    ss1.setSpan(clickableSpan2, 22,38, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout4.setText(ss1);
                    workout4.setMovementMethod(LinkMovementMethod.getInstance());
                }
                if (begarmday4.equals("BO Monkey Curl + Tempo Pronate Tricep KB")) {

                    SpannableString ss1 = new SpannableString(begarmday4);

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

                    ss1.setSpan(clickableSpan1, 0, 14 , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 17,40, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout4.setText(ss1);
                    workout4.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });

        workout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (begabday5.equals("Situp Toe Touch + Clam Situp")) {

                    SpannableString ss1 = new SpannableString(begabday5);

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
                    ss1.setSpan(clickableSpan2, 18,28, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout5.setText(ss1);
                    workout5.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (begarmday5.equals("Tempo Reverse Curl + Dumbbell Clutch Curl")) {

                    SpannableString ss1 = new SpannableString(begarmday5);

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

                    ss1.setSpan(clickableSpan1, 0, 18 , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 21,41, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout5.setText(ss1);
                    workout5.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });

        workout8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (begabday8.equals("Lying Leg Raise + Situp Toe Touch")) {

                    SpannableString ss1 = new SpannableString(begabday8);

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
                    ss1.setSpan(clickableSpan2, 18,33, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout8.setText(ss1);
                    workout8.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (begarmday8.equals("Dumbbell Clutch Curl + Diamond Pushup")) {

                    SpannableString ss1 = new SpannableString(begarmday8);

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

                    ss1.setSpan(clickableSpan1, 0, 20 , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 23,37 , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout8.setText(ss1);
                    workout8.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });

        workout9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (begabday9.equals("Hollow Body Hold + Butterfly Crunch")) {

                    SpannableString ss1 = new SpannableString(begabday9);

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
                    ss1.setSpan(clickableSpan2, 19,35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout9.setText(ss1);
                    workout9.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (begarmday9.equals("BO Monkey Curl + Tempo Reverse Curl")) {

                    SpannableString ss1 = new SpannableString(begarmday9);

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

                    ss1.setSpan(clickableSpan1, 0, 14 , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 17,35 , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout9.setText(ss1);
                    workout9.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });

        workout10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (begabday10.equals("Starfish Crunch + High Plank Position")) {

                    SpannableString ss1 = new SpannableString(begabday10);

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
                    ss1.setSpan(clickableSpan2, 18,37, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout10.setText(ss1);
                    workout10.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (begarmday10.equals("OH Tricep Ext + Tempo Pronate Tricep KB")) {

                    SpannableString ss1 = new SpannableString(begarmday10);

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

                    ss1.setSpan(clickableSpan1, 0, 13 , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 16,39 , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout10.setText(ss1);
                    workout10.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });


        workout11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (begabday11.equals("Low Plank Walkout + Reverse Plank")) {

                    SpannableString ss1 = new SpannableString(begabday11);

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

                if (begarmday11.equals("Dumbbell Skullcrusher + Lying Tricep Ext")) {

                    SpannableString ss1 = new SpannableString(begarmday11);

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

                    ss1.setSpan(clickableSpan1, 0,21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 24,40 , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout11.setText(ss1);
                    workout11.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });

        workout12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (begabday12.equals("Clam Situp + Old-Fashioned Plank ")) {

                    SpannableString ss1 = new SpannableString(begabday12);

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

                if (begarmday12.equals("Hammer Dumbbell Curl + BO Monkey Curl")) {

                    SpannableString ss1 = new SpannableString(begarmday12);

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

                    ss1.setSpan(clickableSpan1, 0,20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 23, 37, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout12.setText(ss1);
                    workout12.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });



        workout15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (begabday15.equals("Low Plank Walkout + Starfish Crunch")) {

                    SpannableString ss1 = new SpannableString(begabday15);

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

                if(begarmday15.equals("Dumbbell Curl + Diamond Pushup")) {

                    SpannableString ss1 = new SpannableString(begarmday15);

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
                    ss1.setSpan(clickableSpan2, 16,30, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout15.setText(ss1);
                    workout15.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });

        workout16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (begabday16.equals("Lying Leg Raise + Hollow Body Hold")) {

                    SpannableString ss1 = new SpannableString(begabday16);

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

                if (begarmday16.equals("Lying Tricep Ext + Hammer Dumbbell Curl")) {

                    SpannableString ss1 = new SpannableString(begarmday16);

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
                    ss1.setSpan(clickableSpan2, 19,39, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout16.setText(ss1);
                    workout16.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });


        workout17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (begabday17.equals("Reverse Plank + Old-Fashioned Plank")) {

                    SpannableString ss1 = new SpannableString(begabday17);

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

                if (begarmday17.equals("OH Tricep Ext + Dumbbell Skullcrusher")) {

                    SpannableString ss1 = new SpannableString(begarmday17);

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
                    ss1.setSpan(clickableSpan2, 16,37, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout17.setText(ss1);
                    workout17.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });


        workout18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (begabday18.equals("High Plank Position + Butterfly Crunch")) {

                    SpannableString ss1 = new SpannableString(begabday18);

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

                if (begarmday18.equals("BO Monkey Curl + Tempo Pronate Tricep KB")) {

                    SpannableString ss1 = new SpannableString(begarmday18);

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

                    ss1.setSpan(clickableSpan1, 0, 14 , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 17,40, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout18.setText(ss1);
                    workout18.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });


        workout19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (begabday19.equals("Situp Toe Touch + Clam Situp")) {

                    SpannableString ss1 = new SpannableString(begabday19);

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

                if (begarmday19.equals("Tempo Reverse Curl + Dumbbell Clutch Curl")) {

                    SpannableString ss1 = new SpannableString(begarmday19);

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

                    ss1.setSpan(clickableSpan1, 0, 18 , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 21,41, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout19.setText(ss1);
                    workout19.setMovementMethod(LinkMovementMethod.getInstance());
                }

            }
        });


        workout22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (begabday22.equals("Lying Leg Raise + Situp Toe Touch")) {

                    SpannableString ss1 = new SpannableString(begabday22);

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

                if (begarmday22.equals("Dumbbell Clutch Curl + Diamond Pushup")) {

                    SpannableString ss1 = new SpannableString(begarmday22);

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

                    ss1.setSpan(clickableSpan1, 0,20 , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 23,37 , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout22.setText(ss1);
                    workout22.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });


        workout23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (begabday23.equals("Hollow Body Hold + Butterfly Crunch")) {

                    SpannableString ss1 = new SpannableString(begabday23);

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

                if (begarmday23.equals("BO Monkey Curl + Tempo Reverse Curl")) {

                    SpannableString ss1 = new SpannableString(begarmday23);

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

                    ss1.setSpan(clickableSpan1, 0, 14 , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 17,35 , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout23.setText(ss1);
                    workout23.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });


        workout24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (begabday24.equals("Starfish Crunch + High Plank Position")) {

                    SpannableString ss1 = new SpannableString(begabday24);

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

                if (begarmday24.equals("OH Tricep Ext + Tempo Pronate Tricep KB")) {

                    SpannableString ss1 = new SpannableString(begarmday24);

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

                    ss1.setSpan(clickableSpan1, 0, 13 , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 16,39 , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout24.setText(ss1);
                    workout24.setMovementMethod(LinkMovementMethod.getInstance());
                }

            }
        });

        workout25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (begabday25.equals("Low Plank Walkout + Reverse Plank")) {

                    SpannableString ss1 = new SpannableString(begabday25);

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

                if (begarmday25.equals("Dumbbell Skullcrusher + Lying Tricep Ext")) {

                    SpannableString ss1 = new SpannableString(begarmday25);

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

                    ss1.setSpan(clickableSpan1, 0,21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 24,40 , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout25.setText(ss1);
                    workout25.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });

        workout26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (begabday26.equals("Clam Situp + Old-Fashioned Plank ")) {
                    SpannableString ss1 = new SpannableString(begabday26);

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

                if (begarmday26.equals("Hammer Dumbbell Curl + BO Monkey Curl")) {

                    SpannableString ss1 = new SpannableString(begarmday26);

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

                    ss1.setSpan(clickableSpan1, 0,20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 23, 37, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

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


   /* @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        TextView w1 = findViewById(R.id.workout1);
        CharSequence writtenData = w1.getText().toString();
        outState.putCharSequence("MyWorkout", writtenData);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        CharSequence storedData = savedInstanceState.getCharSequence("DAY01");
        TextView workout1 = findViewById(R.id.workout1);
        workout1.setText(storedData);
    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

           /* case R.id.action_profile:
                Intent intent = new Intent(OneWeekAbPlan.this, ProfileActivity.class);
                startActivity(intent);
                return true;*/
            case R.id.action_progress:
                Intent intent1 = new Intent(WorkoutActivity.this, ProgressActivity.class);
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