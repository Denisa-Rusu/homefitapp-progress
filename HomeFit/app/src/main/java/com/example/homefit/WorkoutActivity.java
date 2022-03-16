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

    TextView begworkout1;
    TextView begworkout2;
    TextView begworkout3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        Intent intent = getIntent();

        begworkout1 = findViewById(R.id.workout1);
        begworkout2 = findViewById(R.id.workout2);
        begworkout3 = findViewById(R.id.workout3);


        String begabday1 = intent.getStringExtra(BeginnerAbPlan.key1);
        begworkout1.setText(begabday1);

        String begabday2 = intent.getStringExtra(BeginnerAbPlan.key2);
        begworkout2.setText(begabday2);

        String begabday3 = intent.getStringExtra(BeginnerAbPlan.key3);
        begworkout3.setText(begabday3);

        String begabday4 = intent.getStringExtra(BeginnerAbPlan.key4);
        TextView begabworkout4 = findViewById(R.id.workout4);
        begabworkout4.setText(begabday4);
        String begabday5 = intent.getStringExtra(BeginnerAbPlan.key5);
        TextView begabworkout5 = findViewById(R.id.workout5);
        begabworkout5.setText(begabday5);
        String begabday6 = intent.getStringExtra(BeginnerAbPlan.key6);
        TextView begabworkout6 = findViewById(R.id.workout6);
        begabworkout6.setText(begabday6);
        String begabday7 = intent.getStringExtra(BeginnerAbPlan.key7);
        TextView begabworkout7 = findViewById(R.id.workout7);
        begabworkout7.setText(begabday7);
        String begabday8 = intent.getStringExtra(BeginnerAbPlan.key8);
        TextView begabworkout8 = findViewById(R.id.workout8);
        begabworkout8.setText(begabday8);
        String begabday9 = intent.getStringExtra(BeginnerAbPlan.key9);
        TextView begabworkout9 = findViewById(R.id.workout9);
        begabworkout9.setText(begabday9);
        String begabday10 = intent.getStringExtra(BeginnerAbPlan.key10);
        TextView begabworkout10 = findViewById(R.id.workout10);
        begabworkout10.setText(begabday10);
        String begabday11 = intent.getStringExtra(BeginnerAbPlan.key11);
        TextView begabworkout11 = findViewById(R.id.workout11);
        begabworkout11.setText(begabday11);
        String begabday12 = intent.getStringExtra(BeginnerAbPlan.key12);
        TextView begabworkout12 = findViewById(R.id.workout12);
        begabworkout12.setText(begabday12);
        String begabday13 = intent.getStringExtra(BeginnerAbPlan.key13);
        TextView begabworkout13 = findViewById(R.id.workout13);
        begabworkout13.setText(begabday13);
        String begabday14 = intent.getStringExtra(BeginnerAbPlan.key14);
        TextView begabworkout14 = findViewById(R.id.workout14);
        begabworkout14.setText(begabday14);
        String begabday15 = intent.getStringExtra(BeginnerAbPlan.key15);
        TextView begabworkout15 = findViewById(R.id.workout15);
        begabworkout15.setText(begabday15);
        String begabday16 = intent.getStringExtra(BeginnerAbPlan.key16);
        TextView begabworkout16 = findViewById(R.id.workout16);
        begabworkout16.setText(begabday16);
        String begabday17 = intent.getStringExtra(BeginnerAbPlan.key17);
        TextView begabworkout17 = findViewById(R.id.workout17);
        begabworkout17.setText(begabday17);
        String begabday18 = intent.getStringExtra(BeginnerAbPlan.key18);
        TextView begabworkout18 = findViewById(R.id.workout18);
        begabworkout18.setText(begabday18);
        String begabday19 = intent.getStringExtra(BeginnerAbPlan.key19);
        TextView begabworkout19 = findViewById(R.id.workout19);
        begabworkout19.setText(begabday19);
        String begabday20 = intent.getStringExtra(BeginnerAbPlan.key20);
        TextView begabworkout20 = findViewById(R.id.workout20);
        begabworkout20.setText(begabday20);
        String begabday21 = intent.getStringExtra(BeginnerAbPlan.key21);
        TextView begabworkout21 = findViewById(R.id.workout21);
        begabworkout21.setText(begabday21);
        String begabday22 = intent.getStringExtra(BeginnerAbPlan.key22);
        TextView begabworkout22 = findViewById(R.id.workout22);
        begabworkout22.setText(begabday22);
        String begabday23 = intent.getStringExtra(BeginnerAbPlan.key23);
        TextView begabworkout23 = findViewById(R.id.workout23);
        begabworkout23.setText(begabday23);
        String begabday24 = intent.getStringExtra(BeginnerAbPlan.key24);
        TextView begabworkout24 = findViewById(R.id.workout24);
        begabworkout24.setText(begabday24);
        String begabday25 = intent.getStringExtra(BeginnerAbPlan.key25);
        TextView begabworkout25 = findViewById(R.id.workout25);
        begabworkout25.setText(begabday25);
        String begabday26 = intent.getStringExtra(BeginnerAbPlan.key26);
        TextView begabworkout26 = findViewById(R.id.workout26);
        begabworkout26.setText(begabday26);
        String begabday27 = intent.getStringExtra(BeginnerAbPlan.key27);
        TextView begabworkout27 = findViewById(R.id.workout27);
        begabworkout27.setText(begabday27);
        String begabday28 = intent.getStringExtra(BeginnerAbPlan.key28);
        TextView begabworkout28 = findViewById(R.id.workout28);
        begabworkout28.setText(begabday28);








        String begarmday1 = intent.getStringExtra(BeginnerArmPlan.key1);
        begworkout1.setText(begarmday1);

        String begarmday2 = intent.getStringExtra(BeginnerArmPlan.key2);
        begworkout2.setText(begarmday2);

        String begarmday3 = intent.getStringExtra(BeginnerArmPlan.key3);
        begworkout3.setText(begarmday3);

       /* String begarmday4 = intent.getStringExtra(BeginnerArmPlan.key4);
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
        workout28.setText(begarmday28);*/



        begworkout1.setOnClickListener(new View.OnClickListener() {


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
                    ss1.setSpan(clickableSpan2, 20, 35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    begworkout1.setText(ss1);
                    begworkout1.setMovementMethod(LinkMovementMethod.getInstance());

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
                    ss1.setSpan(clickableSpan2, 16, 30, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    begworkout1.setText(ss1);
                    begworkout1.setMovementMethod(LinkMovementMethod.getInstance());

                }

            }
        });




        begworkout2.setOnClickListener(new View.OnClickListener() {
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
                    ss1.setSpan(clickableSpan2, 18, 34, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    begworkout2.setText(ss1);
                    begworkout2.setMovementMethod(LinkMovementMethod.getInstance());

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
                    ss1.setSpan(clickableSpan2, 19, 39, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    begworkout2.setText(ss1);
                    begworkout2.setMovementMethod(LinkMovementMethod.getInstance());


                }
            }
        });






        begworkout3.setOnClickListener(new View.OnClickListener() {
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
                    ss1.setSpan(clickableSpan2, 16, 35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    begworkout3.setText(ss1);
                    begworkout3.setMovementMethod(LinkMovementMethod.getInstance());
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
                    ss1.setSpan(clickableSpan2, 16, 37, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    begworkout3.setText(ss1);
                    begworkout3.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });


        begabworkout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (begabworkout4.getText().equals(begabday4)) {
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
                    ss1.setSpan(clickableSpan2, 22, 38, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    begabworkout4.setText(ss1);
                    begabworkout4.setMovementMethod(LinkMovementMethod.getInstance());

                }
            }
        });



        begabworkout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (begabworkout5.getText().equals(begabday5)) {
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
                    ss1.setSpan(clickableSpan2, 18, 28, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    begabworkout5.setText(ss1);
                    begabworkout5.setMovementMethod(LinkMovementMethod.getInstance());

                }
            }
        });



        begabworkout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (begabworkout8.getText().equals(begabday8)) {
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
                    ss1.setSpan(clickableSpan2, 18, 33, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    begabworkout8.setText(ss1);
                    begabworkout8.setMovementMethod(LinkMovementMethod.getInstance());

                }
            }
        });


        begabworkout9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (begabworkout9.getText().equals(begabday9)) {
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
                    ss1.setSpan(clickableSpan2, 19, 35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    begabworkout9.setText(ss1);
                    begabworkout9.setMovementMethod(LinkMovementMethod.getInstance());

                }
            }
        });


        begabworkout10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (begabworkout10.getText().equals(begabday10)) {
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
                    ss1.setSpan(clickableSpan2, 18, 37, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    begabworkout10.setText(ss1);
                    begabworkout10.setMovementMethod(LinkMovementMethod.getInstance());

                }
            }
        });



        begabworkout11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (begabworkout11.getText().equals(begabday11)) {
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

                    begabworkout11.setText(ss1);
                    begabworkout11.setMovementMethod(LinkMovementMethod.getInstance());

                }
            }
        });




        begabworkout12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (begabworkout12.getText().equals(begabday12)) {
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

                    begabworkout12.setText(ss1);
                    begabworkout12.setMovementMethod(LinkMovementMethod.getInstance());

                }
            }
        });



        begabworkout15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (begabworkout15.getText().equals(begabday15)) {
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

                   begabworkout15.setText(ss1);
                   begabworkout15.setMovementMethod(LinkMovementMethod.getInstance());

                }

            }
        });

        begabworkout16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (begabworkout16.getText().equals(begabday16)) {
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

                    begabworkout16.setText(ss1);
                    begabworkout16.setMovementMethod(LinkMovementMethod.getInstance());

                }
            }
        });


        begabworkout17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (begabworkout17.getText().equals(begabday17)) {
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

                    begabworkout17.setText(ss1);
                    begabworkout17.setMovementMethod(LinkMovementMethod.getInstance());

                }
            }
        });


        begabworkout18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (begabworkout18.getText().equals(begabday18)) {
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

                    begabworkout18.setText(ss1);
                    begabworkout18.setMovementMethod(LinkMovementMethod.getInstance());

                }
            }
        });



        begabworkout19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (begabworkout19.getText().equals(begabday19)) {
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

                    begabworkout19.setText(ss1);
                    begabworkout19.setMovementMethod(LinkMovementMethod.getInstance());

                }
            }
        });


        begabworkout22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (begabworkout22.getText().equals(begabday22)) {
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

                    begabworkout22.setText(ss1);
                    begabworkout22.setMovementMethod(LinkMovementMethod.getInstance());

                }
            }
        });


        begabworkout23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (begabworkout23.getText().equals(begabday23)) {
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

                    begabworkout23.setText(ss1);
                    begabworkout23.setMovementMethod(LinkMovementMethod.getInstance());

                }
            }
        });


        begabworkout24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (begabworkout24.getText().equals(begabday24)) {
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

                    begabworkout24.setText(ss1);
                    begabworkout24.setMovementMethod(LinkMovementMethod.getInstance());

                }
            }
        });



        begabworkout25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (begabworkout25.getText().equals(begabday25)) {
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

                    begabworkout25.setText(ss1);
                    begabworkout25.setMovementMethod(LinkMovementMethod.getInstance());

                }
            }
        });




        begabworkout26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (begabworkout26.getText().equals(begabday26)) {
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

                    begabworkout26.setText(ss1);
                    begabworkout26.setMovementMethod(LinkMovementMethod.getInstance());

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