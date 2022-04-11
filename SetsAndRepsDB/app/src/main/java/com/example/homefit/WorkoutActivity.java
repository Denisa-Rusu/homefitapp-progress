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

    public static final String key1 = "DAY01Calories";

    TextView workout1, workout2, workout3, workout4, workout5, workout6, workout7;
    TextView workout8, workout9, workout10, workout11, workout12, workout13, workout14;
    TextView workout15, workout16, workout17, workout18, workout19, workout20, workout21;
    TextView workout22, workout23, workout24, workout25, workout26, workout27, workout28;
    TextView workout1Performance, workout2Performance, workout3Performance, workout4Performance, workout5Performance;
    TextView workout8Performance, workout9Performance, workout10Performance, workout11Performance, workout12Performance;
    TextView workout15Performance, workout16Performance, workout17Performance, workout18Performance, workout19Performance;
    TextView workout22Performance, workout23Performance, workout24Performance, workout25Performance, workout26Performance;

    String begabday1, begabday2, begabday3, begabday4, begabday5, begabday6, begabday7, begabday8, begabday9, begabday10, begabday11,
            begabday12, begabday13, begabday14, begabday15, begabday16, begabday17, begabday18, begabday19, begabday20, begabday21, begabday22,
            begabday23, begabday24, begabday25, begabday26, begabday27, begabday28, begarmday1, begarmday2, begarmday3, begarmday4, begarmday5,
            begarmday6, begarmday7, begarmday8, begarmday9, begarmday10, begarmday11, begarmday12, begarmday13, begarmday14, begarmday15, begarmday16,
            begarmday17, begarmday18, begarmday19, begarmday20, begarmday21, begarmday22, begarmday23, begarmday24, begarmday25, begarmday26,
            begarmday27, begarmday28, begchestday1, begchestday2, begchestday3, begchestday4, begchestday5, begchestday6, begchestday7, begchestday8,
            begchestday9, begchestday10, begchestday11, begchestday12, begchestday13, begchestday14, begchestday15, begchestday16, begchestday17,
            begchestday18, begchestday19, begchestday20, begchestday21, begchestday22, begchestday23, begchestday24, begchestday25, begchestday26,
            begchestday27, begchestday28, beggluteday1, beggluteday2, beggluteday3, beggluteday4, beggluteday5, beggluteday6, beggluteday7,
            beggluteday8, beggluteday9, beggluteday10, beggluteday11, beggluteday12, beggluteday13, beggluteday14, beggluteday15, beggluteday16,
            beggluteday17, beggluteday18, beggluteday19, beggluteday20, beggluteday21, beggluteday22, beggluteday23, beggluteday24, beggluteday25,
            beggluteday26, beggluteday27, beggluteday28, beglegday1, beglegday2, beglegday3, beglegday4, beglegday5, beglegday6, beglegday7, beglegday8,
            beglegday9, beglegday10, beglegday11, beglegday12, beglegday13, beglegday14, beglegday15, beglegday16, beglegday17, beglegday18, beglegday19,
            beglegday20, beglegday21, beglegday22, beglegday23, beglegday24, beglegday25, beglegday26, beglegday27, beglegday28;

    String modabday1, modabday2, modabday3, modabday4, modabday5, modabday6, modabday7, modabday8, modabday9, modabday10, modabday11,
            modabday12, modabday13, modabday14, modabday15, modabday16, modabday17, modabday18, modabday19, modabday20, modabday21, modabday22,
            modabday23, modabday24, modabday25, modabday26, modabday27, modabday28, modarmday1, modarmday2, modarmday3, modarmday4, modarmday5,
            modarmday6, modarmday7, modarmday8, modarmday9, modarmday10, modarmday11, modarmday12, modarmday13, modarmday14, modarmday15, modarmday16,
            modarmday17, modarmday18, modarmday19, modarmday20, modarmday21, modarmday22, modarmday23, modarmday24, modarmday25, modarmday26,
            modarmday27, modarmday28, modchestday1, modchestday2, modchestday3, modchestday4, modchestday5, modchestday6, modchestday7, modchestday8,
            modchestday9, modchestday10, modchestday11, modchestday12, modchestday13, modchestday14, modchestday15, modchestday16, modchestday17,
            modchestday18, modchestday19, modchestday20, modchestday21, modchestday22, modchestday23, modchestday24, modchestday25, modchestday26,
            modchestday27, modchestday28, modgluteday1, modgluteday2, modgluteday3, modgluteday4, modgluteday5, modgluteday6, modgluteday7, modgluteday8,
            modgluteday9, modgluteday10, modgluteday11, modgluteday12, modgluteday13, modgluteday14, modgluteday15, modgluteday16, modgluteday17,
            modgluteday18, modgluteday19, modgluteday20, modgluteday21, modgluteday22, modgluteday23, modgluteday24, modgluteday25, modgluteday26,
            modgluteday27, modgluteday28, modlegday1, modlegday2, modlegday3, modlegday4, modlegday5, modlegday6, modlegday7, modlegday8, modlegday9,
            modlegday10, modlegday11, modlegday12, modlegday13, modlegday14, modlegday15, modlegday16, modlegday17, modlegday18, modlegday19, modlegday20,
            modlegday21, modlegday22, modlegday23, modlegday24, modlegday25, modlegday26, modlegday27, modlegday28;

    String intabday1, intabday2, intabday3, intabday4, intabday5, intabday6, intabday7, intabday8, intabday9, intabday10, intabday11,
            intabday12, intabday13, intabday14, intabday15, intabday16, intabday17, intabday18, intabday19, intabday20, intabday21, intabday22,
            intabday23, intabday24, intabday25, intabday26, intabday27, intabday28, intarmday1, intarmday2, intarmday3, intarmday4, intarmday5,
            intarmday6, intarmday7, intarmday8, intarmday9, intarmday10, intarmday11, intarmday12, intarmday13, intarmday14, intarmday15, intarmday16,
            intarmday17, intarmday18, intarmday19, intarmday20, intarmday21, intarmday22, intarmday23, intarmday24, intarmday25, intarmday26,
            intarmday27, intarmday28, intchestday1, intchestday2, intchestday3, intchestday4, intchestday5, intchestday6, intchestday7, intchestday8,
            intchestday9, intchestday10, intchestday11, intchestday12, intchestday13, intchestday14, intchestday15, intchestday16, intchestday17,
            intchestday18, intchestday19, intchestday20, intchestday21, intchestday22, intchestday23, intchestday24, intchestday25, intchestday26,
            intchestday27, intchestday28, intgluteday1, intgluteday2, intgluteday3, intgluteday4, intgluteday5, intgluteday6, intgluteday7, intgluteday8,
            intgluteday9, intgluteday10, intgluteday11, intgluteday12, intgluteday13, intgluteday14, intgluteday15, intgluteday16, intgluteday17,
            intgluteday18, intgluteday19, intgluteday20, intgluteday21, intgluteday22, intgluteday23, intgluteday24, intgluteday25, intgluteday26,
            intgluteday27, intgluteday28, intlegday1, intlegday2, intlegday3, intlegday4, intlegday5, intlegday6, intlegday7, intlegday8, intlegday9,
            intlegday10, intlegday11, intlegday12, intlegday13, intlegday14, intlegday15, intlegday16, intlegday17, intlegday18, intlegday19,
            intlegday20, intlegday21, intlegday22, intlegday23, intlegday24, intlegday25, intlegday26, intlegday27, intlegday28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

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

        /////////////////////////////ABS/////////////////////////////
        begabday1 = intent.getStringExtra(BeginnerAbPlan.key1);
        workout1.setText(begabday1);
        String begabday1performance = intent.getStringExtra(BeginnerAbPlan.key1performance);
        workout1Performance.setText(begabday1performance);
        begabday2 = intent.getStringExtra(BeginnerAbPlan.key2);
        workout2.setText(begabday2);
        String begabday2performance = intent.getStringExtra(BeginnerAbPlan.key2performance);
        workout2Performance.setText(begabday2performance);
        begabday3 = intent.getStringExtra(BeginnerAbPlan.key3);
        workout3.setText(begabday3);
        String begabday3performance = intent.getStringExtra(BeginnerAbPlan.key3performance);
        workout3Performance.setText(begabday3performance);
        begabday4 = intent.getStringExtra(BeginnerAbPlan.key4);
        workout4.setText(begabday4);
        String begabday4performance = intent.getStringExtra(BeginnerAbPlan.key4performance);
        workout4Performance.setText(begabday4performance);
        begabday5 = intent.getStringExtra(BeginnerAbPlan.key5);
        workout5.setText(begabday5);
        String begabday5performance = intent.getStringExtra(BeginnerAbPlan.key5performance);
        workout5Performance.setText(begabday5performance);
        begabday6 = intent.getStringExtra(BeginnerAbPlan.key6);
        workout6.setText(begabday6);
        begabday7 = intent.getStringExtra(BeginnerAbPlan.key7);
        workout7.setText(begabday7);
        begabday8 = intent.getStringExtra(BeginnerAbPlan.key8);
        workout8.setText(begabday8);
        String begabday8performance = intent.getStringExtra(BeginnerAbPlan.key8performance);
        workout8Performance.setText(begabday8performance);
        begabday9 = intent.getStringExtra(BeginnerAbPlan.key9);
        workout9.setText(begabday9);
        String begabday9performance = intent.getStringExtra(BeginnerAbPlan.key9performance);
        workout9Performance.setText(begabday9performance);
        begabday10 = intent.getStringExtra(BeginnerAbPlan.key10);
        workout10.setText(begabday10);
        String begabday10performance = intent.getStringExtra(BeginnerAbPlan.key10performance);
        workout10Performance.setText(begabday10performance);
        begabday11 = intent.getStringExtra(BeginnerAbPlan.key11);
        workout11.setText(begabday11);
        String begabday11performance = intent.getStringExtra(BeginnerAbPlan.key11performance);
        workout11Performance.setText(begabday11performance);
        begabday12 = intent.getStringExtra(BeginnerAbPlan.key12);
        workout12.setText(begabday12);
        String begabday12performance = intent.getStringExtra(BeginnerAbPlan.key12performance);
        workout12Performance.setText(begabday12performance);
        begabday13 = intent.getStringExtra(BeginnerAbPlan.key13);
        workout13.setText(begabday13);
        begabday14 = intent.getStringExtra(BeginnerAbPlan.key14);
        workout14.setText(begabday14);
        begabday15 = intent.getStringExtra(BeginnerAbPlan.key15);
        workout15.setText(begabday15);
        String begabday15performance = intent.getStringExtra(BeginnerAbPlan.key15performance);
        workout15Performance.setText(begabday15performance);
        begabday16 = intent.getStringExtra(BeginnerAbPlan.key16);
        workout16.setText(begabday16);
        String begabday16performance = intent.getStringExtra(BeginnerAbPlan.key16performance);
        workout16Performance.setText(begabday16performance);
        begabday17 = intent.getStringExtra(BeginnerAbPlan.key17);
        workout17.setText(begabday17);
        String begabday17performance = intent.getStringExtra(BeginnerAbPlan.key17performance);
        workout17Performance.setText(begabday17performance);
        begabday18 = intent.getStringExtra(BeginnerAbPlan.key18);
        workout18.setText(begabday18);
        String begabday18performance = intent.getStringExtra(BeginnerAbPlan.key18performance);
        workout18Performance.setText(begabday18performance);
        begabday19 = intent.getStringExtra(BeginnerAbPlan.key19);
        workout19.setText(begabday19);
        String begabday19performance = intent.getStringExtra(BeginnerAbPlan.key19performance);
        workout19Performance.setText(begabday19performance);
        begabday20 = intent.getStringExtra(BeginnerAbPlan.key20);
        workout20.setText(begabday20);
        begabday21 = intent.getStringExtra(BeginnerAbPlan.key21);
        workout21.setText(begabday21);
        begabday22 = intent.getStringExtra(BeginnerAbPlan.key22);
        workout22.setText(begabday22);
        String begabday22performance = intent.getStringExtra(BeginnerAbPlan.key22performance);
        workout22Performance.setText(begabday22performance);
        begabday23 = intent.getStringExtra(BeginnerAbPlan.key23);
        workout23.setText(begabday23);
        String begabday23performance = intent.getStringExtra(BeginnerAbPlan.key23performance);
        workout23Performance.setText(begabday23performance);
        begabday24 = intent.getStringExtra(BeginnerAbPlan.key24);
        workout24.setText(begabday24);
        String begabday24performance = intent.getStringExtra(BeginnerAbPlan.key24performance);
        workout24Performance.setText(begabday24performance);
        begabday25 = intent.getStringExtra(BeginnerAbPlan.key25);
        workout25.setText(begabday25);
        String begabday25performance = intent.getStringExtra(BeginnerAbPlan.key25performance);
        workout25Performance.setText(begabday25performance);
        begabday26 = intent.getStringExtra(BeginnerAbPlan.key26);
        workout26.setText(begabday26);
        String begabday26performance = intent.getStringExtra(BeginnerAbPlan.key26performance);
        workout26Performance.setText(begabday26performance);
        begabday27 = intent.getStringExtra(BeginnerAbPlan.key27);
        workout27.setText(begabday27);
        begabday28 = intent.getStringExtra(BeginnerAbPlan.key28);
        workout28.setText(begabday28);

        modabday1 = intent.getStringExtra(ModerateAbPlan.key1);
        workout1.setText(modabday1);
        modabday2 = intent.getStringExtra(ModerateAbPlan.key2);
        workout2.setText(modabday2);
        modabday3 = intent.getStringExtra(ModerateAbPlan.key3);
        workout3.setText(modabday3);
        modabday4 = intent.getStringExtra(ModerateAbPlan.key4);
        workout4.setText(modabday4);
        modabday5 = intent.getStringExtra(ModerateAbPlan.key5);
        workout5.setText(modabday5);
        modabday6 = intent.getStringExtra(ModerateAbPlan.key6);
        workout6.setText(modabday6);
        modabday7 = intent.getStringExtra(ModerateAbPlan.key7);
        workout7.setText(modabday7);
        modabday8 = intent.getStringExtra(ModerateAbPlan.key8);
        workout8.setText(modabday8);
        modabday9 = intent.getStringExtra(ModerateAbPlan.key9);
        workout9.setText(modabday9);
        modabday10 = intent.getStringExtra(ModerateAbPlan.key10);
        workout10.setText(modabday10);
        modabday11 = intent.getStringExtra(ModerateAbPlan.key11);
        workout11.setText(modabday11);
        modabday12 = intent.getStringExtra(ModerateAbPlan.key12);
        workout12.setText(modabday12);
        modabday13 = intent.getStringExtra(ModerateAbPlan.key13);
        workout13.setText(modabday13);
        modabday14 = intent.getStringExtra(ModerateAbPlan.key14);
        workout14.setText(modabday14);
        modabday15 = intent.getStringExtra(ModerateAbPlan.key15);
        workout15.setText(modabday15);
        modabday16 = intent.getStringExtra(ModerateAbPlan.key16);
        workout16.setText(modabday16);
        modabday17 = intent.getStringExtra(ModerateAbPlan.key17);
        workout17.setText(modabday17);
        modabday18 = intent.getStringExtra(ModerateAbPlan.key18);
        workout18.setText(modabday18);
        modabday19 = intent.getStringExtra(ModerateAbPlan.key19);
        workout19.setText(modabday19);
        modabday20 = intent.getStringExtra(ModerateAbPlan.key20);
        workout20.setText(modabday20);
        modabday21 = intent.getStringExtra(ModerateAbPlan.key21);
        workout21.setText(modabday21);
        modabday22 = intent.getStringExtra(ModerateAbPlan.key22);
        workout22.setText(modabday22);
        modabday23 = intent.getStringExtra(ModerateAbPlan.key23);
        workout23.setText(modabday23);
        modabday24 = intent.getStringExtra(ModerateAbPlan.key24);
        workout24.setText(modabday24);
        modabday25 = intent.getStringExtra(ModerateAbPlan.key25);
        workout25.setText(modabday25);
        modabday26 = intent.getStringExtra(ModerateAbPlan.key26);
        workout26.setText(modabday26);
        modabday27 = intent.getStringExtra(ModerateAbPlan.key27);
        workout27.setText(modabday27);
        modabday28 = intent.getStringExtra(ModerateAbPlan.key28);
        workout28.setText(modabday28);

        intabday1 = intent.getStringExtra(IntenseAbPlan.key1);
        workout1.setText(intabday1);
        intabday2 = intent.getStringExtra(IntenseAbPlan.key2);
        workout2.setText(intabday2);
        intabday3 = intent.getStringExtra(IntenseAbPlan.key3);
        workout3.setText(intabday3);
        intabday4 = intent.getStringExtra(IntenseAbPlan.key4);
        workout4.setText(intabday4);
        intabday5 = intent.getStringExtra(IntenseAbPlan.key5);
        workout5.setText(intabday5);
        intabday6 = intent.getStringExtra(IntenseAbPlan.key6);
        workout6.setText(intabday6);
        intabday7 = intent.getStringExtra(IntenseAbPlan.key7);
        workout7.setText(intabday7);
        intabday8 = intent.getStringExtra(IntenseAbPlan.key8);
        workout8.setText(intabday8);
        intabday9 = intent.getStringExtra(IntenseAbPlan.key9);
        workout9.setText(intabday9);
        intabday10 = intent.getStringExtra(IntenseAbPlan.key10);
        workout10.setText(intabday10);
        intabday11 = intent.getStringExtra(IntenseAbPlan.key11);
        workout11.setText(intabday11);
        intabday12 = intent.getStringExtra(IntenseAbPlan.key12);
        workout12.setText(intabday12);
        intabday13 = intent.getStringExtra(IntenseAbPlan.key13);
        workout13.setText(intabday13);
        intabday14 = intent.getStringExtra(IntenseAbPlan.key14);
        workout14.setText(intabday14);
        intabday15 = intent.getStringExtra(IntenseAbPlan.key15);
        workout15.setText(intabday15);
        intabday16 = intent.getStringExtra(IntenseAbPlan.key16);
        workout16.setText(intabday16);
        intabday17 = intent.getStringExtra(IntenseAbPlan.key17);
        workout17.setText(intabday17);
        intabday18 = intent.getStringExtra(IntenseAbPlan.key18);
        workout18.setText(intabday18);
        intabday19 = intent.getStringExtra(IntenseAbPlan.key19);
        workout19.setText(intabday19);
        intabday20 = intent.getStringExtra(IntenseAbPlan.key20);
        workout20.setText(intabday20);
        intabday21 = intent.getStringExtra(IntenseAbPlan.key21);
        workout21.setText(intabday21);
        intabday22 = intent.getStringExtra(IntenseAbPlan.key22);
        workout22.setText(intabday22);
        intabday23 = intent.getStringExtra(IntenseAbPlan.key23);
        workout23.setText(intabday23);
        intabday24 = intent.getStringExtra(IntenseAbPlan.key24);
        workout24.setText(intabday24);
        intabday25 = intent.getStringExtra(IntenseAbPlan.key25);
        workout25.setText(intabday25);
        intabday26 = intent.getStringExtra(IntenseAbPlan.key26);
        workout26.setText(intabday26);
        intabday27 = intent.getStringExtra(IntenseAbPlan.key27);
        workout27.setText(intabday27);
        intabday28 = intent.getStringExtra(IntenseAbPlan.key28);
        workout28.setText(intabday28);

        /////////////////////////////ARMS///////////////////////////////
        begarmday1 = intent.getStringExtra(BeginnerArmPlan.key1);
        workout1.setText(begarmday1);
        String begarmday1performance = intent.getStringExtra(BeginnerArmPlan.key1performance);
        workout1Performance.setText(begarmday1performance);
        begarmday2 = intent.getStringExtra(BeginnerArmPlan.key2);
        workout2.setText(begarmday2);
        String begarmday2performance = intent.getStringExtra(BeginnerArmPlan.key2performance);
        workout2Performance.setText(begarmday2performance);
        begarmday3 = intent.getStringExtra(BeginnerArmPlan.key3);
        workout3.setText(begarmday3);
        String begarmday3performance = intent.getStringExtra(BeginnerArmPlan.key3performance);
        workout3Performance.setText(begarmday3performance);
        begarmday4 = intent.getStringExtra(BeginnerArmPlan.key4);
        workout4.setText(begarmday4);
        String begarmday4performance = intent.getStringExtra(BeginnerArmPlan.key4performance);
        workout4Performance.setText(begarmday4performance);
        begarmday5 = intent.getStringExtra(BeginnerArmPlan.key5);
        workout5.setText(begarmday5);
        String begarmday5performance = intent.getStringExtra(BeginnerArmPlan.key5performance);
        workout5Performance.setText(begarmday5performance);
        begarmday6 = intent.getStringExtra(BeginnerArmPlan.key6);
        workout6.setText(begarmday6);
        begarmday7 = intent.getStringExtra(BeginnerArmPlan.key7);
        workout7.setText(begarmday7);
        begarmday8 = intent.getStringExtra(BeginnerArmPlan.key8);
        workout8.setText(begarmday8);
        String begarmday8performance = intent.getStringExtra(BeginnerArmPlan.key8performance);
        workout8Performance.setText(begarmday8performance);
        begarmday9 = intent.getStringExtra(BeginnerArmPlan.key9);
        workout9.setText(begarmday9);
        String begarmday9performance = intent.getStringExtra(BeginnerArmPlan.key9performance);
        workout9Performance.setText(begarmday9performance);
        begarmday10 = intent.getStringExtra(BeginnerArmPlan.key10);
        workout10.setText(begarmday10);
        String begarmday10performance = intent.getStringExtra(BeginnerArmPlan.key10performance);
        workout10Performance.setText(begarmday10performance);
        begarmday11 = intent.getStringExtra(BeginnerArmPlan.key11);
        workout11.setText(begarmday11);
        String begarmday11performance = intent.getStringExtra(BeginnerArmPlan.key11performance);
        workout11Performance.setText(begarmday11performance);
        begarmday12 = intent.getStringExtra(BeginnerArmPlan.key12);
        workout12.setText(begarmday12);
        String begarmday12performance = intent.getStringExtra(BeginnerArmPlan.key12performance);
        workout12Performance.setText(begarmday12performance);
        begarmday13 = intent.getStringExtra(BeginnerArmPlan.key13);
        workout13.setText(begarmday13);
        begarmday14 = intent.getStringExtra(BeginnerArmPlan.key14);
        workout14.setText(begarmday14);
        begarmday15 = intent.getStringExtra(BeginnerArmPlan.key15);
        workout15.setText(begarmday15);
        String begarmday15performance = intent.getStringExtra(BeginnerArmPlan.key15performance);
        workout15Performance.setText(begarmday15performance);
        begarmday16 = intent.getStringExtra(BeginnerArmPlan.key16);
        workout16.setText(begarmday16);
        String begarmday16performance = intent.getStringExtra(BeginnerArmPlan.key16performance);
        workout16Performance.setText(begarmday16performance);
        begarmday17 = intent.getStringExtra(BeginnerArmPlan.key17);
        workout17.setText(begarmday17);
        String begarmday17performance = intent.getStringExtra(BeginnerArmPlan.key17performance);
        workout17Performance.setText(begarmday17performance);
        begarmday18 = intent.getStringExtra(BeginnerArmPlan.key18);
        workout18.setText(begarmday18);
        String begarmday18performance = intent.getStringExtra(BeginnerArmPlan.key18performance);
        workout18Performance.setText(begarmday18performance);
        begarmday19 = intent.getStringExtra(BeginnerArmPlan.key19);
        workout19.setText(begarmday19);
        String begarmday19performance = intent.getStringExtra(BeginnerArmPlan.key19performance);
        workout19Performance.setText(begarmday19performance);
        begarmday20 = intent.getStringExtra(BeginnerArmPlan.key20);
        workout20.setText(begarmday20);
        begarmday21 = intent.getStringExtra(BeginnerArmPlan.key21);
        workout21.setText(begarmday21);
        begarmday22 = intent.getStringExtra(BeginnerArmPlan.key22);
        workout22.setText(begarmday22);
        String begarmday22performance = intent.getStringExtra(BeginnerArmPlan.key22performance);
        workout22Performance.setText(begarmday22performance);
        begarmday23 = intent.getStringExtra(BeginnerArmPlan.key23);
        workout23.setText(begarmday23);
        String begarmday23performance = intent.getStringExtra(BeginnerArmPlan.key23performance);
        workout23Performance.setText(begarmday23performance);
        begarmday24 = intent.getStringExtra(BeginnerArmPlan.key24);
        workout24.setText(begarmday24);
        String begarmday24performance = intent.getStringExtra(BeginnerArmPlan.key24performance);
        workout24Performance.setText(begarmday24performance);
        begarmday25 = intent.getStringExtra(BeginnerArmPlan.key25);
        workout25.setText(begarmday25);
        String begarmday25performance = intent.getStringExtra(BeginnerArmPlan.key25performance);
        workout25Performance.setText(begarmday25performance);
        begarmday26 = intent.getStringExtra(BeginnerArmPlan.key26);
        workout26.setText(begarmday26);
        String begarmday26performance = intent.getStringExtra(BeginnerArmPlan.key26performance);
        workout26Performance.setText(begarmday26performance);
        begarmday27 = intent.getStringExtra(BeginnerArmPlan.key27);
        workout27.setText(begarmday27);
        begarmday28 = intent.getStringExtra(BeginnerArmPlan.key28);
        workout28.setText(begarmday28);

        modarmday1 = intent.getStringExtra(ModerateArmPlan.key1);
        workout1.setText(modarmday1);
        modarmday2 = intent.getStringExtra(ModerateArmPlan.key2);
        workout2.setText(modarmday2);
        modarmday3 = intent.getStringExtra(ModerateArmPlan.key3);
        workout3.setText(modarmday3);
        modarmday4 = intent.getStringExtra(ModerateArmPlan.key4);
        workout4.setText(modarmday4);
        modarmday5 = intent.getStringExtra(ModerateArmPlan.key5);
        workout5.setText(modarmday5);
        modarmday6 = intent.getStringExtra(ModerateArmPlan.key6);
        workout6.setText(modarmday6);
        modarmday7 = intent.getStringExtra(ModerateArmPlan.key7);
        workout7.setText(modarmday7);
        modarmday8 = intent.getStringExtra(ModerateArmPlan.key8);
        workout8.setText(modarmday8);
        modarmday9 = intent.getStringExtra(ModerateArmPlan.key9);
        workout9.setText(modarmday9);
        modarmday10 = intent.getStringExtra(ModerateArmPlan.key10);
        workout10.setText(modarmday10);
        modarmday11 = intent.getStringExtra(ModerateArmPlan.key11);
        workout11.setText(modarmday11);
        modarmday12 = intent.getStringExtra(ModerateArmPlan.key12);
        workout12.setText(modarmday12);
        modarmday13 = intent.getStringExtra(ModerateArmPlan.key13);
        workout13.setText(modarmday13);
        modarmday14 = intent.getStringExtra(ModerateArmPlan.key14);
        workout14.setText(modarmday14);
        modarmday15 = intent.getStringExtra(ModerateArmPlan.key15);
        workout15.setText(modarmday15);
        modarmday16 = intent.getStringExtra(ModerateArmPlan.key16);
        workout16.setText(modarmday16);
        modarmday17 = intent.getStringExtra(ModerateArmPlan.key17);
        workout17.setText(modarmday17);
        modarmday18 = intent.getStringExtra(ModerateArmPlan.key18);
        workout18.setText(modarmday18);
        modarmday19 = intent.getStringExtra(ModerateArmPlan.key19);
        workout19.setText(modarmday19);
        modarmday20 = intent.getStringExtra(ModerateArmPlan.key20);
        workout20.setText(modarmday20);
        modarmday21 = intent.getStringExtra(ModerateArmPlan.key21);
        workout21.setText(modarmday21);
        modarmday22 = intent.getStringExtra(ModerateArmPlan.key22);
        workout22.setText(modarmday22);
        modarmday23 = intent.getStringExtra(ModerateArmPlan.key23);
        workout23.setText(modarmday23);
        modarmday24 = intent.getStringExtra(ModerateArmPlan.key24);
        workout24.setText(modarmday24);
        modarmday25 = intent.getStringExtra(ModerateArmPlan.key25);
        workout25.setText(modarmday25);
        modarmday26 = intent.getStringExtra(ModerateArmPlan.key26);
        workout26.setText(modarmday26);
        modarmday27 = intent.getStringExtra(ModerateArmPlan.key27);
        workout27.setText(modarmday27);
        modarmday28 = intent.getStringExtra(ModerateArmPlan.key28);
        workout28.setText(modarmday28);

        intarmday1 = intent.getStringExtra(IntenseArmPlan.key1);
        workout1.setText(intarmday1);
        intarmday2 = intent.getStringExtra(IntenseArmPlan.key2);
        workout2.setText(intarmday2);
        intarmday3 = intent.getStringExtra(IntenseArmPlan.key3);
        workout3.setText(intarmday3);
        intarmday4 = intent.getStringExtra(IntenseArmPlan.key4);
        workout4.setText(intarmday4);
        intarmday5 = intent.getStringExtra(IntenseArmPlan.key5);
        workout5.setText(intarmday5);
        intarmday6 = intent.getStringExtra(IntenseArmPlan.key6);
        workout6.setText(intarmday6);
        intarmday7 = intent.getStringExtra(IntenseArmPlan.key7);
        workout7.setText(intarmday7);
        intarmday8 = intent.getStringExtra(IntenseArmPlan.key8);
        workout8.setText(intarmday8);
        intarmday9 = intent.getStringExtra(IntenseArmPlan.key9);
        workout9.setText(intarmday9);
        intarmday10 = intent.getStringExtra(IntenseArmPlan.key10);
        workout10.setText(intarmday10);
        intarmday11 = intent.getStringExtra(IntenseArmPlan.key11);
        workout11.setText(intarmday11);
        intarmday12 = intent.getStringExtra(IntenseArmPlan.key12);
        workout12.setText(intarmday12);
        intarmday13 = intent.getStringExtra(IntenseArmPlan.key13);
        workout13.setText(intarmday13);
        intarmday14 = intent.getStringExtra(IntenseArmPlan.key14);
        workout14.setText(intarmday14);
        intarmday15 = intent.getStringExtra(IntenseArmPlan.key15);
        workout15.setText(intarmday15);
        intarmday16 = intent.getStringExtra(IntenseArmPlan.key16);
        workout16.setText(intarmday16);
        intarmday17 = intent.getStringExtra(IntenseArmPlan.key17);
        workout17.setText(intarmday17);
        intarmday18 = intent.getStringExtra(IntenseArmPlan.key18);
        workout18.setText(intarmday18);
        intarmday19 = intent.getStringExtra(IntenseArmPlan.key19);
        workout19.setText(intarmday19);
        intarmday20 = intent.getStringExtra(IntenseArmPlan.key20);
        workout20.setText(intarmday20);
        intarmday21 = intent.getStringExtra(IntenseArmPlan.key21);
        workout21.setText(intarmday21);
        intarmday22 = intent.getStringExtra(IntenseArmPlan.key22);
        workout22.setText(intarmday22);
        intarmday23 = intent.getStringExtra(IntenseArmPlan.key23);
        workout23.setText(intarmday23);
        intarmday24 = intent.getStringExtra(IntenseArmPlan.key24);
        workout24.setText(intarmday24);
        intarmday25 = intent.getStringExtra(IntenseArmPlan.key25);
        workout25.setText(intarmday25);
        intarmday26 = intent.getStringExtra(IntenseArmPlan.key26);
        workout26.setText(intarmday26);
        intarmday27 = intent.getStringExtra(IntenseArmPlan.key27);
        workout27.setText(intarmday27);
        intarmday28 = intent.getStringExtra(IntenseArmPlan.key28);
        workout28.setText(intarmday28);

        //////////////////////////////CHEST////////////////////////////
        begchestday1 = intent.getStringExtra(BeginnerChestPlan.key1);
        workout1.setText(begchestday1);
        String begchestday1performance = intent.getStringExtra(BeginnerChestPlan.key1performance);
        workout1Performance.setText(begchestday1performance);
        begchestday2 = intent.getStringExtra(BeginnerChestPlan.key2);
        workout2.setText(begchestday2);
        String begchestday2performance = intent.getStringExtra(BeginnerChestPlan.key2performance);
        workout2Performance.setText(begchestday2performance);
        begchestday3 = intent.getStringExtra(BeginnerChestPlan.key3);
        workout3.setText(begchestday3);
        String begchestday3performance = intent.getStringExtra(BeginnerChestPlan.key3performance);
        workout3Performance.setText(begchestday3performance);
        begchestday4 = intent.getStringExtra(BeginnerChestPlan.key4);
        workout4.setText(begchestday4);
        String begchestday4performance = intent.getStringExtra(BeginnerChestPlan.key4performance);
        workout4Performance.setText(begchestday4performance);
        begchestday5 = intent.getStringExtra(BeginnerChestPlan.key5);
        workout5.setText(begchestday5);
        String begchestday5performance = intent.getStringExtra(BeginnerChestPlan.key5performance);
        workout5Performance.setText(begchestday5performance);
        begchestday6 = intent.getStringExtra(BeginnerChestPlan.key6);
        workout6.setText(begchestday6);
        begchestday7 = intent.getStringExtra(BeginnerChestPlan.key7);
        workout7.setText(begchestday7);
        begchestday8 = intent.getStringExtra(BeginnerChestPlan.key8);
        workout8.setText(begchestday8);
        String begchestday8performance = intent.getStringExtra(BeginnerChestPlan.key8performance);
        workout8Performance.setText(begchestday8performance);
        begchestday9 = intent.getStringExtra(BeginnerChestPlan.key9);
        workout9.setText(begchestday9);
        String begchestday9performance = intent.getStringExtra(BeginnerChestPlan.key9performance);
        workout9Performance.setText(begchestday9performance);
        begchestday10 = intent.getStringExtra(BeginnerChestPlan.key10);
        workout10.setText(begchestday10);
        String begchestday10performance = intent.getStringExtra(BeginnerChestPlan.key10performance);
        workout10Performance.setText(begchestday10performance);
        begchestday11 = intent.getStringExtra(BeginnerChestPlan.key11);
        workout11.setText(begchestday11);
        String begchestday11performance = intent.getStringExtra(BeginnerChestPlan.key11performance);
        workout11Performance.setText(begchestday11performance);
        begchestday12 = intent.getStringExtra(BeginnerChestPlan.key12);
        workout12.setText(begchestday12);
        String begchestday12performance = intent.getStringExtra(BeginnerChestPlan.key12performance);
        workout12Performance.setText(begchestday12performance);
        begchestday13 = intent.getStringExtra(BeginnerChestPlan.key13);
        workout13.setText(begchestday13);
        begchestday14 = intent.getStringExtra(BeginnerChestPlan.key14);
        workout14.setText(begchestday14);
        begchestday15 = intent.getStringExtra(BeginnerChestPlan.key15);
        workout15.setText(begchestday15);
        String begchestday15performance = intent.getStringExtra(BeginnerChestPlan.key15performance);
        workout15Performance.setText(begchestday15performance);
        begchestday16 = intent.getStringExtra(BeginnerChestPlan.key16);
        workout16.setText(begchestday16);
        String begchestday16performance = intent.getStringExtra(BeginnerChestPlan.key16performance);
        workout16Performance.setText(begchestday16performance);
        begchestday17 = intent.getStringExtra(BeginnerChestPlan.key17);
        workout17.setText(begchestday17);
        String begchestday17performance = intent.getStringExtra(BeginnerChestPlan.key17performance);
        workout17Performance.setText(begchestday17performance);
        begchestday18 = intent.getStringExtra(BeginnerChestPlan.key18);
        workout18.setText(begchestday18);
        String begchestday18performance = intent.getStringExtra(BeginnerChestPlan.key18performance);
        workout18Performance.setText(begchestday18performance);
        begchestday19 = intent.getStringExtra(BeginnerChestPlan.key19);
        workout19.setText(begchestday19);
        String begchestday19performance = intent.getStringExtra(BeginnerChestPlan.key19performance);
        workout19Performance.setText(begchestday19performance);
        begchestday20 = intent.getStringExtra(BeginnerChestPlan.key20);
        workout20.setText(begchestday20);
        begchestday21 = intent.getStringExtra(BeginnerChestPlan.key21);
        workout21.setText(begchestday21);
        begchestday22 = intent.getStringExtra(BeginnerChestPlan.key22);
        workout22.setText(begchestday22);
        String begchestday22performance = intent.getStringExtra(BeginnerChestPlan.key22performance);
        workout22Performance.setText(begchestday22performance);
        begchestday23 = intent.getStringExtra(BeginnerChestPlan.key23);
        workout23.setText(begchestday23);
        String begchestday23performance = intent.getStringExtra(BeginnerChestPlan.key23performance);
        workout23Performance.setText(begchestday23performance);
        begchestday24 = intent.getStringExtra(BeginnerChestPlan.key24);
        workout24.setText(begchestday24);
        String begchestday24performance = intent.getStringExtra(BeginnerChestPlan.key24performance);
        workout24Performance.setText(begchestday24performance);
        begchestday25 = intent.getStringExtra(BeginnerChestPlan.key25);
        workout25.setText(begchestday25);
        String begchestday25performance = intent.getStringExtra(BeginnerChestPlan.key25performance);
        workout25Performance.setText(begchestday25performance);
        begchestday26 = intent.getStringExtra(BeginnerChestPlan.key26);
        workout26.setText(begchestday26);
        String begchestday26performance = intent.getStringExtra(BeginnerChestPlan.key26performance);
        workout26Performance.setText(begchestday26performance);
        begchestday27 = intent.getStringExtra(BeginnerChestPlan.key27);
        workout27.setText(begchestday27);
        begchestday28 = intent.getStringExtra(BeginnerChestPlan.key28);
        workout28.setText(begchestday28);

        modchestday1 = intent.getStringExtra(ModerateChestPlan.key1);
        workout1.setText(modchestday1);
        modchestday2 = intent.getStringExtra(ModerateChestPlan.key2);
        workout2.setText(modchestday2);
        modchestday3 = intent.getStringExtra(ModerateChestPlan.key3);
        workout3.setText(modchestday3);
        modchestday4 = intent.getStringExtra(ModerateChestPlan.key4);
        workout4.setText(modchestday4);
        modchestday5 = intent.getStringExtra(ModerateChestPlan.key5);
        workout5.setText(modchestday5);
        modchestday6 = intent.getStringExtra(ModerateChestPlan.key6);
        workout6.setText(modchestday6);
        modchestday7 = intent.getStringExtra(ModerateChestPlan.key7);
        workout7.setText(modchestday7);
        modchestday8 = intent.getStringExtra(ModerateChestPlan.key8);
        workout8.setText(modchestday8);
        modchestday9 = intent.getStringExtra(ModerateChestPlan.key9);
        workout9.setText(modchestday9);
        modchestday10 = intent.getStringExtra(ModerateChestPlan.key10);
        workout10.setText(modchestday10);
        modchestday11 = intent.getStringExtra(ModerateChestPlan.key11);
        workout11.setText(modchestday11);
        modchestday12 = intent.getStringExtra(ModerateChestPlan.key12);
        workout12.setText(modchestday12);
        modchestday13 = intent.getStringExtra(ModerateChestPlan.key13);
        workout13.setText(modchestday13);
        modchestday14 = intent.getStringExtra(ModerateChestPlan.key14);
        workout14.setText(modchestday14);
        modchestday15 = intent.getStringExtra(ModerateChestPlan.key15);
        workout15.setText(modchestday15);
        modchestday16 = intent.getStringExtra(ModerateChestPlan.key16);
        workout16.setText(modchestday16);
        modchestday17 = intent.getStringExtra(ModerateChestPlan.key17);
        workout17.setText(modchestday17);
        modchestday18 = intent.getStringExtra(ModerateChestPlan.key18);
        workout18.setText(modchestday18);
        modchestday19 = intent.getStringExtra(ModerateChestPlan.key19);
        workout19.setText(modchestday19);
        modchestday20 = intent.getStringExtra(ModerateChestPlan.key20);
        workout20.setText(modchestday20);
        modchestday21 = intent.getStringExtra(ModerateChestPlan.key21);
        workout21.setText(modchestday21);
        modchestday22 = intent.getStringExtra(ModerateChestPlan.key22);
        workout22.setText(modchestday22);
        modchestday23 = intent.getStringExtra(ModerateChestPlan.key23);
        workout23.setText(modchestday23);
        modchestday24 = intent.getStringExtra(ModerateChestPlan.key24);
        workout24.setText(modchestday24);
        modchestday25 = intent.getStringExtra(ModerateChestPlan.key25);
        workout25.setText(modchestday25);
        modchestday26 = intent.getStringExtra(ModerateChestPlan.key26);
        workout26.setText(modchestday26);
        modchestday27 = intent.getStringExtra(ModerateChestPlan.key27);
        workout27.setText(modchestday27);
        modchestday28 = intent.getStringExtra(ModerateChestPlan.key28);
        workout28.setText(modchestday28);

        intchestday1 = intent.getStringExtra(IntenseChestPlan.key1);
        workout1.setText(intchestday1);
        intchestday2 = intent.getStringExtra(IntenseChestPlan.key2);
        workout2.setText(intchestday2);
        intchestday3 = intent.getStringExtra(IntenseChestPlan.key3);
        workout3.setText(intchestday3);
        intchestday4 = intent.getStringExtra(IntenseChestPlan.key4);
        workout4.setText(intchestday4);
        intchestday5 = intent.getStringExtra(IntenseChestPlan.key5);
        workout5.setText(intchestday5);
        intchestday6 = intent.getStringExtra(IntenseChestPlan.key6);
        workout6.setText(intchestday6);
        intchestday7 = intent.getStringExtra(IntenseChestPlan.key7);
        workout7.setText(intchestday7);
        intchestday8 = intent.getStringExtra(IntenseChestPlan.key8);
        workout8.setText(intchestday8);
        intchestday9 = intent.getStringExtra(IntenseChestPlan.key9);
        workout9.setText(intchestday9);
        intchestday10 = intent.getStringExtra(IntenseChestPlan.key10);
        workout10.setText(intchestday10);
        intchestday11 = intent.getStringExtra(IntenseChestPlan.key11);
        workout11.setText(intchestday11);
        intchestday12 = intent.getStringExtra(IntenseChestPlan.key12);
        workout12.setText(intchestday12);
        intchestday13 = intent.getStringExtra(IntenseChestPlan.key13);
        workout13.setText(intchestday13);
        intchestday14 = intent.getStringExtra(IntenseChestPlan.key14);
        workout14.setText(intchestday14);
        intchestday15 = intent.getStringExtra(IntenseChestPlan.key15);
        workout15.setText(intchestday15);
        intchestday16 = intent.getStringExtra(IntenseChestPlan.key16);
        workout16.setText(intchestday16);
        intchestday17 = intent.getStringExtra(IntenseChestPlan.key17);
        workout17.setText(intchestday17);
        intchestday18 = intent.getStringExtra(IntenseChestPlan.key18);
        workout18.setText(intchestday18);
        intchestday19 = intent.getStringExtra(IntenseChestPlan.key19);
        workout19.setText(intchestday19);
        intchestday20 = intent.getStringExtra(IntenseChestPlan.key20);
        workout20.setText(intchestday20);
        intchestday21 = intent.getStringExtra(IntenseChestPlan.key21);
        workout21.setText(intchestday21);
        intchestday22 = intent.getStringExtra(IntenseChestPlan.key22);
        workout22.setText(intchestday22);
        intchestday23 = intent.getStringExtra(IntenseChestPlan.key23);
        workout23.setText(intchestday23);
        intchestday24 = intent.getStringExtra(IntenseChestPlan.key24);
        workout24.setText(intchestday24);
        intchestday25 = intent.getStringExtra(IntenseChestPlan.key25);
        workout25.setText(intchestday25);
        intchestday26 = intent.getStringExtra(IntenseChestPlan.key26);
        workout26.setText(intchestday26);
        intchestday27 = intent.getStringExtra(IntenseChestPlan.key27);
        workout27.setText(intchestday27);
        intchestday28 = intent.getStringExtra(IntenseChestPlan.key28);
        workout28.setText(intchestday28);

        ////////////////////////////////GLUTES/////////////////////////////
        beggluteday1 = intent.getStringExtra(BeginnerGlutePlan.key1);
        workout1.setText(beggluteday1);
        String beggluteday1performance = intent.getStringExtra(BeginnerGlutePlan.key1performance);
        workout1Performance.setText(beggluteday1performance);
        beggluteday2 = intent.getStringExtra(BeginnerGlutePlan.key2);
        workout2.setText(beggluteday2);
        String beggluteday2performance = intent.getStringExtra(BeginnerGlutePlan.key2performance);
        workout2Performance.setText(beggluteday2performance);
        beggluteday3 = intent.getStringExtra(BeginnerGlutePlan.key3);
        workout3.setText(beggluteday3);
        String beggluteday3performance = intent.getStringExtra(BeginnerGlutePlan.key3performance);
        workout3Performance.setText(beggluteday3performance);
        beggluteday4 = intent.getStringExtra(BeginnerGlutePlan.key4);
        workout4.setText(beggluteday4);
        String beggluteday4performance = intent.getStringExtra(BeginnerGlutePlan.key4performance);
        workout4Performance.setText(beggluteday4performance);
        beggluteday5 = intent.getStringExtra(BeginnerGlutePlan.key5);
        workout5.setText(beggluteday5);
        String beggluteday5performance = intent.getStringExtra(BeginnerGlutePlan.key5performance);
        workout5Performance.setText(beggluteday5performance);
        beggluteday6 = intent.getStringExtra(BeginnerGlutePlan.key6);
        workout6.setText(beggluteday6);
        beggluteday7 = intent.getStringExtra(BeginnerGlutePlan.key7);
        workout7.setText(beggluteday7);
        beggluteday8 = intent.getStringExtra(BeginnerGlutePlan.key8);
        workout8.setText(beggluteday8);
        String beggluteday8performance = intent.getStringExtra(BeginnerGlutePlan.key8performance);
        workout8Performance.setText(beggluteday8performance);
        beggluteday9 = intent.getStringExtra(BeginnerGlutePlan.key9);
        workout9.setText(beggluteday9);
        String beggluteday9performance = intent.getStringExtra(BeginnerGlutePlan.key9performance);
        workout9Performance.setText(beggluteday9performance);
        beggluteday10 = intent.getStringExtra(BeginnerGlutePlan.key10);
        workout10.setText(beggluteday10);
        String beggluteday10performance = intent.getStringExtra(BeginnerGlutePlan.key10performance);
        workout10Performance.setText(beggluteday10performance);
        beggluteday11 = intent.getStringExtra(BeginnerGlutePlan.key11);
        workout11.setText(beggluteday11);
        String beggluteday11performance = intent.getStringExtra(BeginnerGlutePlan.key11performance);
        workout11Performance.setText(beggluteday11performance);
        beggluteday12 = intent.getStringExtra(BeginnerGlutePlan.key12);
        workout12.setText(beggluteday12);
        String beggluteday12performance = intent.getStringExtra(BeginnerGlutePlan.key12performance);
        workout12Performance.setText(beggluteday12performance);
        beggluteday13 = intent.getStringExtra(BeginnerGlutePlan.key13);
        workout13.setText(beggluteday13);
        beggluteday14 = intent.getStringExtra(BeginnerGlutePlan.key14);
        workout14.setText(beggluteday14);
        beggluteday15 = intent.getStringExtra(BeginnerGlutePlan.key15);
        workout15.setText(beggluteday15);
        String beggluteday15performance = intent.getStringExtra(BeginnerGlutePlan.key15performance);
        workout15Performance.setText(beggluteday15performance);
        beggluteday16 = intent.getStringExtra(BeginnerGlutePlan.key16);
        workout16.setText(beggluteday16);
        String beggluteday16performance = intent.getStringExtra(BeginnerGlutePlan.key16performance);
        workout16Performance.setText(beggluteday16performance);
        beggluteday17 = intent.getStringExtra(BeginnerGlutePlan.key17);
        workout17.setText(beggluteday17);
        String beggluteday17performance = intent.getStringExtra(BeginnerGlutePlan.key17performance);
        workout17Performance.setText(beggluteday17performance);
        beggluteday18 = intent.getStringExtra(BeginnerGlutePlan.key18);
        workout18.setText(beggluteday18);
        String beggluteday18performance = intent.getStringExtra(BeginnerGlutePlan.key18performance);
        workout18Performance.setText(beggluteday18performance);
        beggluteday19 = intent.getStringExtra(BeginnerGlutePlan.key19);
        workout19.setText(beggluteday19);
        String beggluteday19performance = intent.getStringExtra(BeginnerGlutePlan.key19performance);
        workout19Performance.setText(beggluteday19performance);
        beggluteday20 = intent.getStringExtra(BeginnerGlutePlan.key20);
        workout20.setText(beggluteday20);
        beggluteday21 = intent.getStringExtra(BeginnerGlutePlan.key21);
        workout21.setText(beggluteday21);
        beggluteday22 = intent.getStringExtra(BeginnerGlutePlan.key22);
        workout22.setText(beggluteday22);
        String beggluteday22performance = intent.getStringExtra(BeginnerGlutePlan.key22performance);
        workout22Performance.setText(beggluteday22performance);
        beggluteday23 = intent.getStringExtra(BeginnerGlutePlan.key23);
        workout23.setText(beggluteday23);
        String beggluteday23performance = intent.getStringExtra(BeginnerGlutePlan.key23performance);
        workout23Performance.setText(beggluteday23performance);
        beggluteday24 = intent.getStringExtra(BeginnerGlutePlan.key24);
        workout24.setText(beggluteday24);
        String beggluteday24performance = intent.getStringExtra(BeginnerGlutePlan.key24performance);
        workout24Performance.setText(beggluteday24performance);
        beggluteday25 = intent.getStringExtra(BeginnerGlutePlan.key25);
        workout25.setText(beggluteday25);
        String beggluteday25performance = intent.getStringExtra(BeginnerGlutePlan.key25performance);
        workout25Performance.setText(beggluteday25performance);
        beggluteday26 = intent.getStringExtra(BeginnerGlutePlan.key26);
        workout26.setText(beggluteday26);
        String beggluteday26performance = intent.getStringExtra(BeginnerGlutePlan.key26performance);
        workout26Performance.setText(beggluteday26performance);
        beggluteday27 = intent.getStringExtra(BeginnerGlutePlan.key27);
        workout27.setText(beggluteday27);
        beggluteday28 = intent.getStringExtra(BeginnerGlutePlan.key28);
        workout28.setText(beggluteday28);

        modgluteday1 = intent.getStringExtra(ModerateGlutePlan.key1);
        workout1.setText(modgluteday1);
        modgluteday2 = intent.getStringExtra(ModerateGlutePlan.key2);
        workout2.setText(modgluteday2);
        modgluteday3 = intent.getStringExtra(ModerateGlutePlan.key3);
        workout3.setText(modgluteday3);
        modgluteday4 = intent.getStringExtra(ModerateGlutePlan.key4);
        workout4.setText(modgluteday4);
        modgluteday5 = intent.getStringExtra(ModerateGlutePlan.key5);
        workout5.setText(modgluteday5);
        modgluteday6 = intent.getStringExtra(ModerateGlutePlan.key6);
        workout6.setText(modgluteday6);
        modgluteday7 = intent.getStringExtra(ModerateGlutePlan.key7);
        workout7.setText(modgluteday7);
        modgluteday8 = intent.getStringExtra(ModerateGlutePlan.key8);
        workout8.setText(modgluteday8);
        modgluteday9 = intent.getStringExtra(ModerateGlutePlan.key9);
        workout9.setText(modgluteday9);
        modgluteday10 = intent.getStringExtra(ModerateGlutePlan.key10);
        workout10.setText(modgluteday10);
        modgluteday11 = intent.getStringExtra(ModerateGlutePlan.key11);
        workout11.setText(modgluteday11);
        modgluteday12 = intent.getStringExtra(ModerateGlutePlan.key12);
        workout12.setText(modgluteday12);
        modgluteday13 = intent.getStringExtra(ModerateGlutePlan.key13);
        workout13.setText(modgluteday13);
        modgluteday14 = intent.getStringExtra(ModerateGlutePlan.key14);
        workout14.setText(modgluteday14);
        modgluteday15 = intent.getStringExtra(ModerateGlutePlan.key15);
        workout15.setText(modgluteday15);
        modgluteday16 = intent.getStringExtra(ModerateGlutePlan.key16);
        workout16.setText(modgluteday16);
        modgluteday17 = intent.getStringExtra(ModerateGlutePlan.key17);
        workout17.setText(modgluteday17);
        modgluteday18 = intent.getStringExtra(ModerateGlutePlan.key18);
        workout18.setText(modgluteday18);
        modgluteday19 = intent.getStringExtra(ModerateGlutePlan.key19);
        workout19.setText(modgluteday19);
        modgluteday20 = intent.getStringExtra(ModerateGlutePlan.key20);
        workout20.setText(modgluteday20);
        modgluteday21 = intent.getStringExtra(ModerateGlutePlan.key21);
        workout21.setText(modgluteday21);
        modgluteday22 = intent.getStringExtra(ModerateGlutePlan.key22);
        workout22.setText(modgluteday22);
        modgluteday23 = intent.getStringExtra(ModerateGlutePlan.key23);
        workout23.setText(modgluteday23);
        modgluteday24 = intent.getStringExtra(ModerateGlutePlan.key24);
        workout24.setText(modgluteday24);
        modgluteday25 = intent.getStringExtra(ModerateGlutePlan.key25);
        workout25.setText(modgluteday25);
        modgluteday26 = intent.getStringExtra(ModerateGlutePlan.key26);
        workout26.setText(modgluteday26);
        modgluteday27 = intent.getStringExtra(ModerateGlutePlan.key27);
        workout27.setText(modgluteday27);
        modgluteday28 = intent.getStringExtra(ModerateGlutePlan.key28);
        workout28.setText(modgluteday28);

        intgluteday1 = intent.getStringExtra(IntenseGlutePlan.key1);
        workout1.setText(intgluteday1);
        intgluteday2 = intent.getStringExtra(IntenseGlutePlan.key2);
        workout2.setText(intgluteday2);
        intgluteday3 = intent.getStringExtra(IntenseGlutePlan.key3);
        workout3.setText(intgluteday3);
        intgluteday4 = intent.getStringExtra(IntenseGlutePlan.key4);
        workout4.setText(intgluteday4);
        intgluteday5 = intent.getStringExtra(IntenseGlutePlan.key5);
        workout5.setText(intgluteday5);
        intgluteday6 = intent.getStringExtra(IntenseGlutePlan.key6);
        workout6.setText(intgluteday6);
        intgluteday7 = intent.getStringExtra(IntenseGlutePlan.key7);
        workout7.setText(intgluteday7);
        intgluteday8 = intent.getStringExtra(IntenseGlutePlan.key8);
        workout8.setText(intgluteday8);
        intgluteday9 = intent.getStringExtra(IntenseGlutePlan.key9);
        workout9.setText(intgluteday9);
        intgluteday10 = intent.getStringExtra(IntenseGlutePlan.key10);
        workout10.setText(intgluteday10);
        intgluteday11 = intent.getStringExtra(IntenseGlutePlan.key11);
        workout11.setText(intgluteday11);
        intgluteday12 = intent.getStringExtra(IntenseGlutePlan.key12);
        workout12.setText(intgluteday12);
        intgluteday13 = intent.getStringExtra(IntenseGlutePlan.key13);
        workout13.setText(intgluteday13);
        intgluteday14 = intent.getStringExtra(IntenseGlutePlan.key14);
        workout14.setText(intgluteday14);
        intgluteday15 = intent.getStringExtra(IntenseGlutePlan.key15);
        workout15.setText(intgluteday15);
        intgluteday16 = intent.getStringExtra(IntenseGlutePlan.key16);
        workout16.setText(intgluteday16);
        intgluteday17 = intent.getStringExtra(IntenseGlutePlan.key17);
        workout17.setText(intgluteday17);
        intgluteday18 = intent.getStringExtra(IntenseGlutePlan.key18);
        workout18.setText(intgluteday18);
        intgluteday19 = intent.getStringExtra(IntenseGlutePlan.key19);
        workout19.setText(intgluteday19);
        intgluteday20 = intent.getStringExtra(IntenseGlutePlan.key20);
        workout20.setText(intgluteday20);
        intgluteday21 = intent.getStringExtra(IntenseGlutePlan.key21);
        workout21.setText(intgluteday21);
        intgluteday22 = intent.getStringExtra(IntenseGlutePlan.key22);
        workout22.setText(intgluteday22);
        intgluteday23 = intent.getStringExtra(IntenseGlutePlan.key23);
        workout23.setText(intgluteday23);
        intgluteday24 = intent.getStringExtra(IntenseGlutePlan.key24);
        workout24.setText(intgluteday24);
        intgluteday25 = intent.getStringExtra(IntenseGlutePlan.key25);
        workout25.setText(intgluteday25);
        intgluteday26 = intent.getStringExtra(IntenseGlutePlan.key26);
        workout26.setText(intgluteday26);
        intgluteday27 = intent.getStringExtra(IntenseGlutePlan.key27);
        workout27.setText(intgluteday27);
        intgluteday28 = intent.getStringExtra(IntenseGlutePlan.key28);
        workout28.setText(intgluteday28);

        ////////////////////////////////LEGS///////////////////////////
        beglegday1 = intent.getStringExtra(BeginnerLegPlan.key1);
        workout1.setText(beglegday1);
        String beglegday1performance = intent.getStringExtra(BeginnerLegPlan.key1performance);
        workout1Performance.setText(beglegday1performance);
        beglegday2 = intent.getStringExtra(BeginnerLegPlan.key2);
        workout2.setText(beglegday2);
        String beglegday2performance = intent.getStringExtra(BeginnerLegPlan.key2performance);
        workout2Performance.setText(beglegday2performance);
        beglegday3 = intent.getStringExtra(BeginnerLegPlan.key3);
        workout3.setText(beglegday3);
        String beglegday3performance = intent.getStringExtra(BeginnerLegPlan.key3performance);
        workout3Performance.setText(beglegday3performance);
        beglegday4 = intent.getStringExtra(BeginnerLegPlan.key4);
        workout4.setText(beglegday4);
        String beglegday4performance = intent.getStringExtra(BeginnerLegPlan.key4performance);
        workout4Performance.setText(beglegday4performance);
        beglegday5 = intent.getStringExtra(BeginnerLegPlan.key5);
        workout5.setText(beglegday5);
        String beglegday5performance = intent.getStringExtra(BeginnerLegPlan.key5performance);
        workout5Performance.setText(beglegday5performance);
        beglegday6 = intent.getStringExtra(BeginnerLegPlan.key6);
        workout6.setText(beglegday6);
        beglegday7 = intent.getStringExtra(BeginnerLegPlan.key7);
        workout7.setText(beglegday7);
        beglegday8 = intent.getStringExtra(BeginnerLegPlan.key8);
        workout8.setText(beglegday8);
        String beglegday8performance = intent.getStringExtra(BeginnerLegPlan.key8performance);
        workout8Performance.setText(beglegday8performance);
        beglegday9 = intent.getStringExtra(BeginnerLegPlan.key9);
        workout9.setText(beglegday9);
        String beglegday9performance = intent.getStringExtra(BeginnerLegPlan.key9performance);
        workout9Performance.setText(beglegday9performance);
        beglegday10 = intent.getStringExtra(BeginnerLegPlan.key10);
        workout10.setText(beglegday10);
        String beglegday10performance = intent.getStringExtra(BeginnerLegPlan.key10performance);
        workout10Performance.setText(beglegday10performance);
        beglegday11 = intent.getStringExtra(BeginnerLegPlan.key11);
        workout11.setText(beglegday11);
        String beglegday11performance = intent.getStringExtra(BeginnerLegPlan.key11performance);
        workout11Performance.setText(beglegday11performance);
        beglegday12 = intent.getStringExtra(BeginnerLegPlan.key12);
        workout12.setText(beglegday12);
        String beglegday12performance = intent.getStringExtra(BeginnerLegPlan.key12performance);
        workout12Performance.setText(beglegday12performance);
        beglegday13 = intent.getStringExtra(BeginnerLegPlan.key13);
        workout13.setText(beglegday13);
        beglegday14 = intent.getStringExtra(BeginnerLegPlan.key14);
        workout14.setText(beglegday14);
        beglegday15 = intent.getStringExtra(BeginnerLegPlan.key15);
        workout15.setText(beglegday15);
        String beglegday15performance = intent.getStringExtra(BeginnerLegPlan.key15performance);
        workout15Performance.setText(beglegday15performance);
        beglegday16 = intent.getStringExtra(BeginnerLegPlan.key16);
        workout16.setText(beglegday16);
        String beglegday16performance = intent.getStringExtra(BeginnerLegPlan.key16performance);
        workout16Performance.setText(beglegday16performance);
        beglegday17 = intent.getStringExtra(BeginnerLegPlan.key17);
        workout17.setText(beglegday17);
        String beglegday17performance = intent.getStringExtra(BeginnerLegPlan.key17performance);
        workout17Performance.setText(beglegday17performance);
        beglegday18 = intent.getStringExtra(BeginnerLegPlan.key18);
        workout18.setText(beglegday18);
        String beglegday18performance = intent.getStringExtra(BeginnerLegPlan.key18performance);
        workout18Performance.setText(beglegday18performance);
        beglegday19 = intent.getStringExtra(BeginnerLegPlan.key19);
        workout19.setText(beglegday19);
        String beglegday19performance = intent.getStringExtra(BeginnerLegPlan.key19performance);
        workout19Performance.setText(beglegday19performance);
        beglegday20 = intent.getStringExtra(BeginnerLegPlan.key20);
        workout20.setText(beglegday20);
        beglegday21 = intent.getStringExtra(BeginnerLegPlan.key21);
        workout21.setText(beglegday21);
        beglegday22 = intent.getStringExtra(BeginnerLegPlan.key22);
        workout22.setText(beglegday22);
        String beglegday22performance = intent.getStringExtra(BeginnerLegPlan.key22performance);
        workout22Performance.setText(beglegday22performance);
        beglegday23 = intent.getStringExtra(BeginnerLegPlan.key23);
        workout23.setText(beglegday23);
        String beglegday23performance = intent.getStringExtra(BeginnerLegPlan.key23performance);
        workout23Performance.setText(beglegday23performance);
        beglegday24 = intent.getStringExtra(BeginnerLegPlan.key24);
        workout24.setText(beglegday24);
        String beglegday24performance = intent.getStringExtra(BeginnerLegPlan.key24performance);
        workout24Performance.setText(beglegday24performance);
        beglegday25 = intent.getStringExtra(BeginnerLegPlan.key25);
        workout25.setText(beglegday25);
        String beglegday25performance = intent.getStringExtra(BeginnerLegPlan.key25performance);
        workout25Performance.setText(beglegday25performance);
        beglegday26 = intent.getStringExtra(BeginnerLegPlan.key26);
        workout26.setText(beglegday26);
        String beglegday26performance = intent.getStringExtra(BeginnerLegPlan.key26performance);
        workout26Performance.setText(beglegday26performance);
        beglegday27 = intent.getStringExtra(BeginnerLegPlan.key27);
        workout27.setText(beglegday27);
        beglegday28 = intent.getStringExtra(BeginnerLegPlan.key28);
        workout28.setText(beglegday28);

        modlegday1 = intent.getStringExtra(ModerateLegPlan.key1);
        workout1.setText(modlegday1);
        modlegday2 = intent.getStringExtra(ModerateLegPlan.key2);
        workout2.setText(modlegday2);
        modlegday3 = intent.getStringExtra(ModerateLegPlan.key3);
        workout3.setText(modlegday3);
        modlegday4 = intent.getStringExtra(ModerateLegPlan.key4);
        workout4.setText(modlegday4);
        modlegday5 = intent.getStringExtra(ModerateLegPlan.key5);
        workout5.setText(modlegday5);
        modlegday6 = intent.getStringExtra(ModerateLegPlan.key6);
        workout6.setText(modlegday6);
        modlegday7 = intent.getStringExtra(ModerateLegPlan.key7);
        workout7.setText(modlegday7);
        modlegday8 = intent.getStringExtra(ModerateLegPlan.key8);
        workout8.setText(modlegday8);
        modlegday9 = intent.getStringExtra(ModerateLegPlan.key9);
        workout9.setText(modlegday9);
        modlegday10 = intent.getStringExtra(ModerateLegPlan.key10);
        workout10.setText(modlegday10);
        modlegday11 = intent.getStringExtra(ModerateLegPlan.key11);
        workout11.setText(modlegday11);
        modlegday12 = intent.getStringExtra(ModerateLegPlan.key12);
        workout12.setText(modlegday12);
        modlegday13 = intent.getStringExtra(ModerateLegPlan.key13);
        workout13.setText(modlegday13);
        modlegday14 = intent.getStringExtra(ModerateLegPlan.key14);
        workout14.setText(modlegday14);
        modlegday15 = intent.getStringExtra(ModerateLegPlan.key15);
        workout15.setText(modlegday15);
        modlegday16 = intent.getStringExtra(ModerateLegPlan.key16);
        workout16.setText(modlegday16);
        modlegday17 = intent.getStringExtra(ModerateLegPlan.key17);
        workout17.setText(modlegday17);
        modlegday18 = intent.getStringExtra(ModerateLegPlan.key18);
        workout18.setText(modlegday18);
        modlegday19 = intent.getStringExtra(ModerateLegPlan.key19);
        workout19.setText(modlegday19);
        modlegday20 = intent.getStringExtra(ModerateLegPlan.key20);
        workout20.setText(modlegday20);
        modlegday21 = intent.getStringExtra(ModerateLegPlan.key21);
        workout21.setText(modlegday21);
        modlegday22 = intent.getStringExtra(ModerateLegPlan.key22);
        workout22.setText(modlegday22);
        modlegday23 = intent.getStringExtra(ModerateLegPlan.key23);
        workout23.setText(modlegday23);
        modlegday24 = intent.getStringExtra(ModerateLegPlan.key24);
        workout24.setText(modlegday24);
        modlegday25 = intent.getStringExtra(ModerateLegPlan.key25);
        workout25.setText(modlegday25);
        modlegday26 = intent.getStringExtra(ModerateLegPlan.key26);
        workout26.setText(modlegday26);
        modlegday27 = intent.getStringExtra(ModerateLegPlan.key27);
        workout27.setText(modlegday27);
        modlegday28 = intent.getStringExtra(ModerateLegPlan.key28);
        workout28.setText(modlegday28);

        intlegday1 = intent.getStringExtra(IntenseLegPlan.key1);
        workout1.setText(intlegday1);
        intlegday2 = intent.getStringExtra(IntenseLegPlan.key2);
        workout2.setText(intlegday2);
        intlegday3 = intent.getStringExtra(IntenseLegPlan.key3);
        workout3.setText(intlegday3);
        intlegday4 = intent.getStringExtra(IntenseLegPlan.key4);
        workout4.setText(intlegday4);
        intlegday5 = intent.getStringExtra(IntenseLegPlan.key5);
        workout5.setText(intlegday5);
        intlegday6 = intent.getStringExtra(IntenseLegPlan.key6);
        workout6.setText(intlegday6);
        intlegday7 = intent.getStringExtra(IntenseLegPlan.key7);
        workout7.setText(intlegday7);
        intlegday8 = intent.getStringExtra(IntenseLegPlan.key8);
        workout8.setText(intlegday8);
        intlegday9 = intent.getStringExtra(IntenseLegPlan.key9);
        workout9.setText(intlegday9);
        intlegday10 = intent.getStringExtra(IntenseLegPlan.key10);
        workout10.setText(intlegday10);
        intlegday11 = intent.getStringExtra(IntenseLegPlan.key11);
        workout11.setText(intlegday11);
        intlegday12 = intent.getStringExtra(IntenseLegPlan.key12);
        workout12.setText(intlegday12);
        intlegday13 = intent.getStringExtra(IntenseLegPlan.key13);
        workout13.setText(intlegday13);
        intlegday14 = intent.getStringExtra(IntenseLegPlan.key14);
        workout14.setText(intlegday14);
        intlegday15 = intent.getStringExtra(IntenseLegPlan.key15);
        workout15.setText(intlegday15);
        intlegday16 = intent.getStringExtra(IntenseLegPlan.key16);
        workout16.setText(intlegday16);
        intlegday17 = intent.getStringExtra(IntenseLegPlan.key17);
        workout17.setText(intlegday17);
        intlegday18 = intent.getStringExtra(IntenseLegPlan.key18);
        workout18.setText(intlegday18);
        intlegday19 = intent.getStringExtra(IntenseLegPlan.key19);
        workout19.setText(intlegday19);
        intlegday20 = intent.getStringExtra(IntenseLegPlan.key20);
        workout20.setText(intlegday20);
        intlegday21 = intent.getStringExtra(IntenseLegPlan.key21);
        workout21.setText(intlegday21);
        intlegday22 = intent.getStringExtra(IntenseLegPlan.key22);
        workout22.setText(intlegday22);
        intlegday23 = intent.getStringExtra(IntenseLegPlan.key23);
        workout23.setText(intlegday23);
        intlegday24 = intent.getStringExtra(IntenseLegPlan.key24);
        workout24.setText(intlegday24);
        intlegday25 = intent.getStringExtra(IntenseLegPlan.key25);
        workout25.setText(intlegday25);
        intlegday26 = intent.getStringExtra(IntenseLegPlan.key26);
        workout26.setText(intlegday26);
        intlegday27 = intent.getStringExtra(IntenseLegPlan.key27);
        workout27.setText(intlegday27);
        intlegday28 = intent.getStringExtra(IntenseLegPlan.key28);
        workout28.setText(intlegday28);

        String day1 = intent.getStringExtra(MainActivity.key1);
        workout1.setText(day1);


        workout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (begabday1.equals("Low Plank Walkout + Starfish Crunch")) {

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

                    workout1.setText(ss1);
                    workout1.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (modabday1.equals("Low Plank Walkout + Starfish Crunch")) {

                    SpannableString ss1 = new SpannableString(modabday1);

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

                if (intabday1.equals("Low Plank Walkout + Starfish Crunch")) {

                    SpannableString ss1 = new SpannableString(intabday1);

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

                if (begarmday1.equals("Dumbbell Curl + Diamond Pushup")) {

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

                    workout1.setText(ss1);
                    workout1.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (modarmday1.equals("Dumbbell Curl + Diamond Pushup")) {

                    SpannableString ss1 = new SpannableString(modarmday1);

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

                if (intarmday1.equals("Dumbbell Curl + Diamond Pushup")) {

                    SpannableString ss1 = new SpannableString(intarmday1);

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

                if (begchestday1.equals("Hand Release Pushup + Spin Press")) {

                    SpannableString ss1 = new SpannableString(begchestday1);

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

                if (modchestday1.equals("Hand Release Pushup + Spin Press")) {

                    SpannableString ss1 = new SpannableString(modchestday1);

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

                if (intchestday1.equals("Hand Release Pushup + Spin Press")) {

                    SpannableString ss1 = new SpannableString(intchestday1);

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

                if (beggluteday1.equals("Reverse Lunge + Single Leg Bridge")) {

                    SpannableString ss1 = new SpannableString(beggluteday1);

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

                if (modgluteday1.equals("Reverse Lunge + Single Leg Bridge")) {

                    SpannableString ss1 = new SpannableString(modgluteday1);

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

                if (intgluteday1.equals("Reverse Lunge + Single Leg Bridge")) {

                    SpannableString ss1 = new SpannableString(intgluteday1);

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

                if (beglegday1.equals("Stiff Leg Deadlift + Split Squat")) {

                    SpannableString ss1 = new SpannableString(beglegday1);

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

                if (modlegday1.equals("Stiff Leg Deadlift + Split Squat")) {

                    SpannableString ss1 = new SpannableString(modlegday1);

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

                if (intlegday1.equals("Stiff Leg Deadlift + Split Squat")) {

                    SpannableString ss1 = new SpannableString(intlegday1);

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

                    workout2.setText(ss1);
                    workout2.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (modabday2.equals("Lying Leg Raise + Hollow Body Hold")) {

                    SpannableString ss1 = new SpannableString(modabday2);

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

                if (intabday2.equals("Lying Leg Raise + Hollow Body Hold")) {

                    SpannableString ss1 = new SpannableString(intabday2);

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

                    workout2.setText(ss1);
                    workout2.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (modarmday2.equals("Lying Tricep Ext + Hammer Dumbbell Curl")) {

                    SpannableString ss1 = new SpannableString(modarmday2);

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

                if (intarmday2.equals("Lying Tricep Ext + Hammer Dumbbell Curl")) {

                    SpannableString ss1 = new SpannableString(intarmday2);

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

                if (begchestday2.equals("Decline Pushup + Dumbbell Floor Press")) {

                    SpannableString ss1 = new SpannableString(begchestday2);

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

                if (modchestday2.equals("Decline Pushup + Dumbbell Floor Press")) {

                    SpannableString ss1 = new SpannableString(modchestday2);

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

                if (intchestday2.equals("Decline Pushup + Dumbbell Floor Press")) {

                    SpannableString ss1 = new SpannableString(intchestday2);

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

                if (beggluteday2.equals("Stiff Leg Deadlift + Hip Hinge Abduction")) {

                    SpannableString ss1 = new SpannableString(beggluteday2);

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

                if (modgluteday2.equals("Stiff Leg Deadlift + Hip Hinge Abduction")) {

                    SpannableString ss1 = new SpannableString(modgluteday2);

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

                if (intgluteday2.equals("Stiff Leg Deadlift + Hip Hinge Abduction")) {

                    SpannableString ss1 = new SpannableString(intgluteday2);

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

                if (beglegday2.equals("Side Lunge + Dumbbell Squat")) {

                    SpannableString ss1 = new SpannableString(beglegday2);

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

                if (modlegday2.equals("Side Lunge + Dumbbell Squat")) {

                    SpannableString ss1 = new SpannableString(modlegday2);

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

                if (intlegday2.equals("Side Lunge + Dumbbell Squat")) {

                    SpannableString ss1 = new SpannableString(intlegday2);

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

                    workout3.setText(ss1);
                    workout3.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (modabday3.equals("Reverse Plank + Old-Fashioned Plank")) {

                    SpannableString ss1 = new SpannableString(modabday3);

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

                if (intabday3.equals("Reverse Plank + Old-Fashioned Plank")) {

                    SpannableString ss1 = new SpannableString(intabday3);

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

                    workout3.setText(ss1);
                    workout3.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (modarmday3.equals("OH Tricep Ext + Dumbbell Skullcrusher")) {

                    SpannableString ss1 = new SpannableString(modarmday3);

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

                if (intarmday3.equals("OH Tricep Ext + Dumbbell Skullcrusher")) {

                    SpannableString ss1 = new SpannableString(intarmday3);

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

                if (begchestday3.equals("One Leg Pushup + Finger Out Pushup")) {

                    SpannableString ss1 = new SpannableString(begchestday3);

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

                if (modchestday3.equals("One Leg Pushup + Finger Out Pushup")) {

                    SpannableString ss1 = new SpannableString(modchestday3);

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

                if (intchestday3.equals("One Leg Pushup + Finger Out Pushup")) {

                    SpannableString ss1 = new SpannableString(intchestday3);

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

                if (beggluteday3.equals("Frog Pump + Semi Sumo DL Pulse")) {

                    SpannableString ss1 = new SpannableString(beggluteday3);

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

                if (modgluteday3.equals("Frog Pump + Semi Sumo DL Pulse")) {

                    SpannableString ss1 = new SpannableString(modgluteday3);

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

                if (intgluteday3.equals("Frog Pump + Semi Sumo DL Pulse")) {

                    SpannableString ss1 = new SpannableString(intgluteday3);

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

                if (beglegday3.equals("One Leg Hip Up + Lunge Squat")) {

                    SpannableString ss1 = new SpannableString(beglegday3);

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

                if (modlegday3.equals("One Leg Hip Up + Lunge Squat")) {

                    SpannableString ss1 = new SpannableString(modlegday3);

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

                if (intlegday3.equals("One Leg Hip Up + Lunge Squat")) {

                    SpannableString ss1 = new SpannableString(intlegday3);

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
                    ss1.setSpan(clickableSpan2, 22, 38, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout4.setText(ss1);
                    workout4.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (modabday4.equals("High Plank Position + Butterfly Crunch")) {

                    SpannableString ss1 = new SpannableString(modabday4);

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

                if (intabday4.equals("High Plank Position + Butterfly Crunch")) {

                    SpannableString ss1 = new SpannableString(intabday4);

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

                    ss1.setSpan(clickableSpan1, 0, 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 17, 40, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout4.setText(ss1);
                    workout4.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (modarmday4.equals("BO Monkey Curl + Tempo Pronate Tricep KB")) {

                    SpannableString ss1 = new SpannableString(modarmday4);

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

                if (intarmday4.equals("BO Monkey Curl + Tempo Pronate Tricep KB")) {

                    SpannableString ss1 = new SpannableString(intarmday4);

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

                if (begchestday4.equals("Diamond Pushup + Lying Dumbbell Fly")) {

                    SpannableString ss1 = new SpannableString(begchestday4);

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

                if (modchestday4.equals("Diamond Pushup + Lying Dumbbell Fly")) {

                    SpannableString ss1 = new SpannableString(modchestday4);

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

                if (intchestday4.equals("Diamond Pushup + Lying Dumbbell Fly")) {

                    SpannableString ss1 = new SpannableString(intchestday4);

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

                if (beggluteday4.equals("Single Leg Hip Thruster + Fire Hydrant")) {

                    SpannableString ss1 = new SpannableString(beggluteday4);

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

                if (modgluteday4.equals("Single Leg Hip Thruster + Fire Hydrant")) {

                    SpannableString ss1 = new SpannableString(modgluteday4);

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

                if (intgluteday4.equals("Single Leg Hip Thruster + Fire Hydrant")) {

                    SpannableString ss1 = new SpannableString(intgluteday4);

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

                if (beglegday4.equals("High Knee Toe Tap + Reverse Lunge")) {

                    SpannableString ss1 = new SpannableString(beglegday4);

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

                if (modlegday4.equals("High Knee Toe Tap + Reverse Lunge")) {

                    SpannableString ss1 = new SpannableString(modlegday4);

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

                if (intlegday4.equals("High Knee Toe Tap + Reverse Lunge")) {

                    SpannableString ss1 = new SpannableString(intlegday4);

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
                    ss1.setSpan(clickableSpan2, 18, 28, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout5.setText(ss1);
                    workout5.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (modabday5.equals("Situp Toe Touch + Clam Situp")) {

                    SpannableString ss1 = new SpannableString(modabday5);

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

                if (intabday5.equals("Situp Toe Touch + Clam Situp")) {

                    SpannableString ss1 = new SpannableString(intabday5);

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

                    ss1.setSpan(clickableSpan1, 0, 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 21, 41, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout5.setText(ss1);
                    workout5.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (modarmday5.equals("Tempo Reverse Curl + Dumbbell Clutch Curl")) {

                    SpannableString ss1 = new SpannableString(modarmday5);

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

                if (intarmday5.equals("Tempo Reverse Curl + Dumbbell Clutch Curl")) {

                    SpannableString ss1 = new SpannableString(intarmday5);

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

                if (begchestday5.equals("Spiderman Pushup + Dumbbell Pull Over")) {

                    SpannableString ss1 = new SpannableString(begchestday5);

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

                if (modchestday5.equals("Spiderman Pushup + Dumbbell Pull Over")) {

                    SpannableString ss1 = new SpannableString(modchestday5);

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

                if (intchestday5.equals("Spiderman Pushup + Dumbbell Pull Over")) {

                    SpannableString ss1 = new SpannableString(intchestday5);

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

                if (beggluteday5.equals("Dumbbell Bridge + Donkey Kicks")) {

                    SpannableString ss1 = new SpannableString(beggluteday5);

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

                if (modgluteday5.equals("Dumbbell Bridge + Donkey Kicks")) {

                    SpannableString ss1 = new SpannableString(modgluteday5);

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

                if (intgluteday5.equals("Dumbbell Bridge + Donkey Kicks")) {

                    SpannableString ss1 = new SpannableString(intgluteday5);

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

                if (beglegday5.equals("Pistol Squat + Squat Jump")) {

                    SpannableString ss1 = new SpannableString(beglegday5);

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

                if (modlegday5.equals("Pistol Squat + Squat Jump")) {

                    SpannableString ss1 = new SpannableString(modlegday5);

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

                if (intlegday5.equals("Pistol Squat + Squat Jump")) {

                    SpannableString ss1 = new SpannableString(intlegday5);

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
                    ss1.setSpan(clickableSpan2, 18, 33, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout8.setText(ss1);
                    workout8.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (modabday8.equals("Lying Leg Raise + Situp Toe Touch")) {

                    SpannableString ss1 = new SpannableString(modabday8);

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

                if (intabday8.equals("Lying Leg Raise + Situp Toe Touch")) {

                    SpannableString ss1 = new SpannableString(intabday8);

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

                    ss1.setSpan(clickableSpan1, 0, 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 23, 37, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout8.setText(ss1);
                    workout8.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (modarmday8.equals("Dumbbell Clutch Curl + Diamond Pushup")) {

                    SpannableString ss1 = new SpannableString(modarmday8);

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

                if (intarmday8.equals("Dumbbell Clutch Curl + Diamond Pushup")) {

                    SpannableString ss1 = new SpannableString(intarmday8);

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

                if (begchestday8.equals("Dumbbell Pull Over + Diamond Pushup")) {

                    SpannableString ss1 = new SpannableString(begchestday8);

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

                if (modchestday8.equals("Dumbbell Pull Over + Diamond Pushup")) {

                    SpannableString ss1 = new SpannableString(modchestday8);

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

                if (intchestday8.equals("Dumbbell Pull Over + Diamond Pushup")) {

                    SpannableString ss1 = new SpannableString(intchestday8);

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

                if (beggluteday8.equals("Donkey Kicks + Single Leg Hip Thruster")) {

                    SpannableString ss1 = new SpannableString(beggluteday8);

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

                if (modgluteday8.equals("Donkey Kicks + Single Leg Hip Thruster")) {

                    SpannableString ss1 = new SpannableString(modgluteday8);

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

                if (intgluteday8.equals("Donkey Kicks + Single Leg Hip Thruster")) {

                    SpannableString ss1 = new SpannableString(intgluteday8);

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

                if (beglegday8.equals("Squat Jump + High Knee Toe Tap")) {

                    SpannableString ss1 = new SpannableString(beglegday8);

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

                if (modlegday8.equals("Squat Jump + High Knee Toe Tap")) {

                    SpannableString ss1 = new SpannableString(modlegday8);

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

                if (intlegday8.equals("Squat Jump + High Knee Toe Tap")) {

                    SpannableString ss1 = new SpannableString(intlegday8);

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
                    ss1.setSpan(clickableSpan2, 19, 35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout9.setText(ss1);
                    workout9.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (modabday9.equals("Hollow Body Hold + Butterfly Crunch")) {

                    SpannableString ss1 = new SpannableString(modabday9);

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

                if (intabday9.equals("Hollow Body Hold + Butterfly Crunch")) {

                    SpannableString ss1 = new SpannableString(intabday9);

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

                    ss1.setSpan(clickableSpan1, 0, 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 17, 35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout9.setText(ss1);
                    workout9.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (modarmday9.equals("BO Monkey Curl + Tempo Reverse Curl")) {

                    SpannableString ss1 = new SpannableString(modarmday9);

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

                if (intarmday9.equals("BO Monkey Curl + Tempo Reverse Curl")) {

                    SpannableString ss1 = new SpannableString(intarmday9);

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

                if (begchestday9.equals("Spin Press + Hand Release Pushup")) {

                    SpannableString ss1 = new SpannableString(begchestday9);

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

                if (modchestday9.equals("Spin Press + Hand Release Pushup")) {

                    SpannableString ss1 = new SpannableString(modchestday9);

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

                if (intchestday9.equals("Spin Press + Hand Release Pushup")) {

                    SpannableString ss1 = new SpannableString(intchestday9);

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

                if (beggluteday9.equals("Reverse Lunge + Stiff Leg Deadlift")) {

                    SpannableString ss1 = new SpannableString(beggluteday9);

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

                if (modgluteday9.equals("Reverse Lunge + Stiff Leg Deadlift")) {

                    SpannableString ss1 = new SpannableString(modgluteday9);

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

                if (intgluteday9.equals("Reverse Lunge + Stiff Leg Deadlift")) {

                    SpannableString ss1 = new SpannableString(intgluteday9);

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

                if (beglegday9.equals("Pistol Squat + Lunge Squat")) {

                    SpannableString ss1 = new SpannableString(beglegday9);

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

                if (modlegday9.equals("Pistol Squat + Lunge Squat")) {

                    SpannableString ss1 = new SpannableString(modlegday9);

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

                if (intlegday9.equals("Pistol Squat + Lunge Squat")) {

                    SpannableString ss1 = new SpannableString(intlegday9);

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
                    ss1.setSpan(clickableSpan2, 18, 37, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout10.setText(ss1);
                    workout10.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (modabday10.equals("Starfish Crunch + High Plank Position")) {

                    SpannableString ss1 = new SpannableString(modabday10);

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

                if (intabday10.equals("Starfish Crunch + High Plank Position")) {

                    SpannableString ss1 = new SpannableString(intabday10);

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

                    ss1.setSpan(clickableSpan1, 0, 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 16, 39, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout10.setText(ss1);
                    workout10.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (modarmday10.equals("OH Tricep Ext + Tempo Pronate Tricep KB")) {

                    SpannableString ss1 = new SpannableString(modarmday10);

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

                if (intarmday10.equals("OH Tricep Ext + Tempo Pronate Tricep KB")) {

                    SpannableString ss1 = new SpannableString(intarmday10);

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

                if (begchestday10.equals("Dumbbell Floor Press + Decline Pushup")) {

                    SpannableString ss1 = new SpannableString(begchestday10);

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

                if (modchestday10.equals("Dumbbell Floor Press + Decline Pushup")) {

                    SpannableString ss1 = new SpannableString(modchestday10);

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

                if (intchestday10.equals("Dumbbell Floor Press + Decline Pushup")) {

                    SpannableString ss1 = new SpannableString(intchestday10);

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

                if (beggluteday10.equals("Semi Sumo DL Pulse + Fire Hydrant")) {

                    SpannableString ss1 = new SpannableString(beggluteday10);

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

                if (modgluteday10.equals("Semi Sumo DL Pulse + Fire Hydrant")) {

                    SpannableString ss1 = new SpannableString(modgluteday10);

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

                if (intgluteday10.equals("Semi Sumo DL Pulse + Fire Hydrant")) {

                    SpannableString ss1 = new SpannableString(intgluteday10);

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

                if (beglegday10.equals("One Leg Hip Up + Reverse Lunge")) {

                    SpannableString ss1 = new SpannableString(beglegday10);

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

                if (modlegday10.equals("One Leg Hip Up + Reverse Lunge")) {

                    SpannableString ss1 = new SpannableString(modlegday10);

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

                if (intlegday10.equals("One Leg Hip Up + Reverse Lunge")) {

                    SpannableString ss1 = new SpannableString(intlegday10);

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

                if (modabday11.equals("Low Plank Walkout + Reverse Plank")) {

                    SpannableString ss1 = new SpannableString(modabday11);

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

                if (intabday11.equals("Low Plank Walkout + Reverse Plank")) {

                    SpannableString ss1 = new SpannableString(intabday11);

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

                    ss1.setSpan(clickableSpan1, 0, 21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 24, 40, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout11.setText(ss1);
                    workout11.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (modarmday11.equals("Dumbbell Skullcrusher + Lying Tricep Ext")) {

                    SpannableString ss1 = new SpannableString(modarmday11);

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

                if (intarmday11.equals("Dumbbell Skullcrusher + Lying Tricep Ext")) {

                    SpannableString ss1 = new SpannableString(intarmday11);

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

                if (begchestday11.equals("Dumbbell Floor Press + One Leg Pushup")) {

                    SpannableString ss1 = new SpannableString(begchestday11);

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

                if (modchestday11.equals("Dumbbell Floor Press + One Leg Pushup")) {

                    SpannableString ss1 = new SpannableString(modchestday11);

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

                if (intchestday11.equals("Dumbbell Floor Press + One Leg Pushup")) {

                    SpannableString ss1 = new SpannableString(intchestday11);

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

                if (beggluteday11.equals("Hip Hinge Abduction + Single Leg Bridge")) {

                    SpannableString ss1 = new SpannableString(beggluteday11);

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

                if (modgluteday11.equals("Hip Hinge Abduction + Single Leg Bridge")) {

                    SpannableString ss1 = new SpannableString(modgluteday11);

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

                if (intgluteday11.equals("Hip Hinge Abduction + Single Leg Bridge")) {

                    SpannableString ss1 = new SpannableString(intgluteday11);

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

                if (beglegday11.equals("Dumbbell Squat + Side Lunge")) {

                    SpannableString ss1 = new SpannableString(beglegday11);

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

                if (modlegday11.equals("Dumbbell Squat + Side Lunge")) {

                    SpannableString ss1 = new SpannableString(modlegday11);

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

                if (intlegday11.equals("Dumbbell Squat + Side Lunge")) {

                    SpannableString ss1 = new SpannableString(intlegday11);

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

                if (modabday12.equals("Clam Situp + Old-Fashioned Plank ")) {

                    SpannableString ss1 = new SpannableString(modabday12);

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

                if (intabday12.equals("Clam Situp + Old-Fashioned Plank ")) {

                    SpannableString ss1 = new SpannableString(intabday12);

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

                    ss1.setSpan(clickableSpan1, 0, 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 23, 37, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout12.setText(ss1);
                    workout12.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (modarmday12.equals("Hammer Dumbbell Curl + BO Monkey Curl")) {

                    SpannableString ss1 = new SpannableString(modarmday12);

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

                if (intarmday12.equals("Hammer Dumbbell Curl + BO Monkey Curl")) {

                    SpannableString ss1 = new SpannableString(intarmday12);

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

                if (begchestday12.equals("Finger Out Pushup + Lying Dumbbell Fly")) {

                    SpannableString ss1 = new SpannableString(begchestday12);

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

                if (modchestday12.equals("Finger Out Pushup + Lying Dumbbell Fly")) {

                    SpannableString ss1 = new SpannableString(modchestday12);

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

                if (intchestday12.equals("Finger Out Pushup + Lying Dumbbell Fly")) {

                    SpannableString ss1 = new SpannableString(intchestday12);

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

                if (beggluteday12.equals("Dumbbell Bridge + Frog Pump")) {

                    SpannableString ss1 = new SpannableString(beggluteday12);

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

                if (modgluteday12.equals("Dumbbell Bridge + Frog Pump")) {

                    SpannableString ss1 = new SpannableString(modgluteday12);

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

                if (intgluteday12.equals("Dumbbell Bridge + Frog Pump")) {

                    SpannableString ss1 = new SpannableString(intgluteday12);

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

                if (beglegday12.equals("Split Squat + Stiff Leg Deadlift")) {

                    SpannableString ss1 = new SpannableString(beglegday12);

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

                if (modlegday12.equals("Split Squat + Stiff Leg Deadlift")) {

                    SpannableString ss1 = new SpannableString(modlegday12);

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

                if (intlegday12.equals("Split Squat + Stiff Leg Deadlift")) {

                    SpannableString ss1 = new SpannableString(intlegday12);

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

                if (modabday15.equals("Low Plank Walkout + Starfish Crunch")) {

                    SpannableString ss1 = new SpannableString(modabday15);

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

                if (intabday15.equals("Low Plank Walkout + Starfish Crunch")) {

                    SpannableString ss1 = new SpannableString(intabday15);

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

                if (begarmday15.equals("Dumbbell Curl + Diamond Pushup")) {

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
                    ss1.setSpan(clickableSpan2, 16, 30, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout15.setText(ss1);
                    workout15.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (modarmday15.equals("Dumbbell Curl + Diamond Pushup")) {

                    SpannableString ss1 = new SpannableString(modarmday15);

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

                if (intarmday15.equals("Dumbbell Curl + Diamond Pushup")) {

                    SpannableString ss1 = new SpannableString(intarmday15);

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

                if (begchestday15.equals("Hand Release Pushup + Spin Press")) {

                    SpannableString ss1 = new SpannableString(begchestday15);

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

                if (modchestday15.equals("Hand Release Pushup + Spin Press")) {

                    SpannableString ss1 = new SpannableString(modchestday15);

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

                if (intchestday15.equals("Hand Release Pushup + Spin Press")) {

                    SpannableString ss1 = new SpannableString(intchestday15);

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

                if (beggluteday15.equals("Reverse Lunge + Single Leg Bridge")) {

                    SpannableString ss1 = new SpannableString(beggluteday15);

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

                if (modgluteday15.equals("Reverse Lunge + Single Leg Bridge")) {

                    SpannableString ss1 = new SpannableString(modgluteday15);

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

                if (intgluteday15.equals("Reverse Lunge + Single Leg Bridge")) {

                    SpannableString ss1 = new SpannableString(intgluteday15);

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

                if (beglegday15.equals("Stiff Leg Deadlift + Split Squat")) {

                    SpannableString ss1 = new SpannableString(beglegday15);

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

                if (modlegday15.equals("Stiff Leg Deadlift + Split Squat")) {

                    SpannableString ss1 = new SpannableString(modlegday15);

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

                if (intlegday15.equals("Stiff Leg Deadlift + Split Squat")) {

                    SpannableString ss1 = new SpannableString(intlegday15);

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

                if (modabday16.equals("Lying Leg Raise + Hollow Body Hold")) {

                    SpannableString ss1 = new SpannableString(modabday16);

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

                if (intabday16.equals("Lying Leg Raise + Hollow Body Hold")) {

                    SpannableString ss1 = new SpannableString(intabday16);

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
                    ss1.setSpan(clickableSpan2, 19, 39, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout16.setText(ss1);
                    workout16.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (modarmday16.equals("Lying Tricep Ext + Hammer Dumbbell Curl")) {

                    SpannableString ss1 = new SpannableString(modarmday16);

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

                if (intarmday16.equals("Lying Tricep Ext + Hammer Dumbbell Curl")) {

                    SpannableString ss1 = new SpannableString(intarmday16);

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

                if (begchestday16.equals("Decline Pushup + Dumbbell Floor Press")) {

                    SpannableString ss1 = new SpannableString(begchestday16);

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

                if (modchestday16.equals("Decline Pushup + Dumbbell Floor Press")) {

                    SpannableString ss1 = new SpannableString(modchestday16);

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

                if (intchestday16.equals("Decline Pushup + Dumbbell Floor Press")) {

                    SpannableString ss1 = new SpannableString(intchestday16);

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

                if (beggluteday16.equals("Stiff Leg Deadlift + Hip Hinge Abduction")) {

                    SpannableString ss1 = new SpannableString(beggluteday16);

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

                if (modgluteday16.equals("Stiff Leg Deadlift + Hip Hinge Abduction")) {

                    SpannableString ss1 = new SpannableString(modgluteday16);

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

                if (intgluteday16.equals("Stiff Leg Deadlift + Hip Hinge Abduction")) {

                    SpannableString ss1 = new SpannableString(intgluteday16);

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

                if (beglegday16.equals("Side Lunge + Dumbbell Squat")) {

                    SpannableString ss1 = new SpannableString(beglegday16);

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

                if (modlegday16.equals("Side Lunge + Dumbbell Squat")) {

                    SpannableString ss1 = new SpannableString(modlegday16);

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

                if (intlegday16.equals("Side Lunge + Dumbbell Squat")) {

                    SpannableString ss1 = new SpannableString(intlegday16);

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

                if (modabday17.equals("Reverse Plank + Old-Fashioned Plank")) {

                    SpannableString ss1 = new SpannableString(modabday17);

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

                if (intabday17.equals("Reverse Plank + Old-Fashioned Plank")) {

                    SpannableString ss1 = new SpannableString(intabday17);

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
                    ss1.setSpan(clickableSpan2, 16, 37, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout17.setText(ss1);
                    workout17.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (modarmday17.equals("OH Tricep Ext + Dumbbell Skullcrusher")) {

                    SpannableString ss1 = new SpannableString(modarmday17);

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

                if (intarmday17.equals("OH Tricep Ext + Dumbbell Skullcrusher")) {

                    SpannableString ss1 = new SpannableString(intarmday17);

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

                if (begchestday17.equals("One Leg Pushup + Finger Out Pushup")) {

                    SpannableString ss1 = new SpannableString(begchestday17);

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

                if (modchestday17.equals("One Leg Pushup + Finger Out Pushup")) {

                    SpannableString ss1 = new SpannableString(modchestday17);

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

                if (intchestday17.equals("One Leg Pushup + Finger Out Pushup")) {

                    SpannableString ss1 = new SpannableString(intchestday17);

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

                if (beggluteday17.equals("Frog Pump + Semi Sumo DL Pulse")) {

                    SpannableString ss1 = new SpannableString(beggluteday17);

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

                if (modgluteday17.equals("Frog Pump + Semi Sumo DL Pulse")) {

                    SpannableString ss1 = new SpannableString(modgluteday17);

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

                if (intgluteday17.equals("Frog Pump + Semi Sumo DL Pulse")) {

                    SpannableString ss1 = new SpannableString(intgluteday17);

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


                if (beglegday17.equals("One Leg Hip Up + Lunge Squat")) {

                    SpannableString ss1 = new SpannableString(beglegday17);

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

                if (modlegday17.equals("One Leg Hip Up + Lunge Squat")) {

                    SpannableString ss1 = new SpannableString(modlegday17);

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

                if (intlegday17.equals("One Leg Hip Up + Lunge Squat")) {

                    SpannableString ss1 = new SpannableString(intlegday17);

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

                if (modabday18.equals("High Plank Position + Butterfly Crunch")) {

                    SpannableString ss1 = new SpannableString(modabday18);

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

                if (intabday18.equals("High Plank Position + Butterfly Crunch")) {

                    SpannableString ss1 = new SpannableString(intabday18);

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

                    ss1.setSpan(clickableSpan1, 0, 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 17, 40, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout18.setText(ss1);
                    workout18.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (modarmday18.equals("BO Monkey Curl + Tempo Pronate Tricep KB")) {

                    SpannableString ss1 = new SpannableString(modarmday18);

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

                if (intarmday18.equals("BO Monkey Curl + Tempo Pronate Tricep KB")) {

                    SpannableString ss1 = new SpannableString(intarmday18);

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

                if (begchestday18.equals("Diamond Pushup + Lying Dumbbell Fly")) {

                    SpannableString ss1 = new SpannableString(begchestday18);

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

                if (modchestday18.equals("Diamond Pushup + Lying Dumbbell Fly")) {

                    SpannableString ss1 = new SpannableString(modchestday18);

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

                if (intchestday18.equals("Diamond Pushup + Lying Dumbbell Fly")) {

                    SpannableString ss1 = new SpannableString(intchestday18);

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

                if (beggluteday18.equals("Single Leg Hip Thruster + Fire Hydrant")) {

                    SpannableString ss1 = new SpannableString(beggluteday18);

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

                if (modgluteday18.equals("Single Leg Hip Thruster + Fire Hydrant")) {

                    SpannableString ss1 = new SpannableString(modgluteday18);

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

                if (intgluteday18.equals("Single Leg Hip Thruster + Fire Hydrant")) {

                    SpannableString ss1 = new SpannableString(intgluteday18);

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

                if (beglegday18.equals("High Knee Toe Tap + Reverse Lunge")) {

                    SpannableString ss1 = new SpannableString(beglegday18);

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

                if (modlegday18.equals("High Knee Toe Tap + Reverse Lunge")) {

                    SpannableString ss1 = new SpannableString(modlegday18);

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

                if (intlegday18.equals("High Knee Toe Tap + Reverse Lunge")) {

                    SpannableString ss1 = new SpannableString(intlegday18);

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

                if (modabday19.equals("Situp Toe Touch + Clam Situp")) {

                    SpannableString ss1 = new SpannableString(modabday19);

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

                if (intabday19.equals("Situp Toe Touch + Clam Situp")) {

                    SpannableString ss1 = new SpannableString(intabday19);

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

                    ss1.setSpan(clickableSpan1, 0, 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 21, 41, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout19.setText(ss1);
                    workout19.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (modarmday19.equals("Tempo Reverse Curl + Dumbbell Clutch Curl")) {

                    SpannableString ss1 = new SpannableString(modarmday19);

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

                if (intarmday19.equals("Tempo Reverse Curl + Dumbbell Clutch Curl")) {

                    SpannableString ss1 = new SpannableString(intarmday19);

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

                if (begchestday19.equals("Spiderman Pushup + Dumbbell Pull Over")) {

                    SpannableString ss1 = new SpannableString(begchestday19);

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

                if (modchestday19.equals("Spiderman Pushup + Dumbbell Pull Over")) {

                    SpannableString ss1 = new SpannableString(modchestday19);

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

                if (intchestday19.equals("Spiderman Pushup + Dumbbell Pull Over")) {

                    SpannableString ss1 = new SpannableString(intchestday19);

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

                if (beggluteday19.equals("Dumbbell Bridge + Donkey Kicks")) {

                    SpannableString ss1 = new SpannableString(beggluteday19);

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

                if (modgluteday19.equals("Dumbbell Bridge + Donkey Kicks")) {

                    SpannableString ss1 = new SpannableString(modgluteday19);

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

                if (intgluteday19.equals("Dumbbell Bridge + Donkey Kicks")) {

                    SpannableString ss1 = new SpannableString(intgluteday19);

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

                if (beglegday19.equals("Pistol Squat + Squat Jump")) {

                    SpannableString ss1 = new SpannableString(beglegday19);

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

                if (modlegday19.equals("Pistol Squat + Squat Jump")) {

                    SpannableString ss1 = new SpannableString(modlegday19);

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

                if (intlegday19.equals("Pistol Squat + Squat Jump")) {

                    SpannableString ss1 = new SpannableString(intlegday19);

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

                if (modabday22.equals("Lying Leg Raise + Situp Toe Touch")) {

                    SpannableString ss1 = new SpannableString(modabday22);

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

                if (intabday22.equals("Lying Leg Raise + Situp Toe Touch")) {

                    SpannableString ss1 = new SpannableString(intabday22);

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

                    ss1.setSpan(clickableSpan1, 0, 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 23, 37, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout22.setText(ss1);
                    workout22.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (modarmday22.equals("Dumbbell Clutch Curl + Diamond Pushup")) {

                    SpannableString ss1 = new SpannableString(modarmday22);

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

                if (intarmday22.equals("Dumbbell Clutch Curl + Diamond Pushup")) {

                    SpannableString ss1 = new SpannableString(intarmday22);

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

                if (begchestday22.equals("Dumbbell Pull Over + Diamond Pushup")) {

                    SpannableString ss1 = new SpannableString(begchestday22);

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

                if (modchestday22.equals("Dumbbell Pull Over + Diamond Pushup")) {

                    SpannableString ss1 = new SpannableString(modchestday22);

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

                if (intchestday22.equals("Dumbbell Pull Over + Diamond Pushup")) {

                    SpannableString ss1 = new SpannableString(intchestday22);

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

                if (beggluteday22.equals("Donkey Kicks + Single Leg Hip Thruster")) {

                    SpannableString ss1 = new SpannableString(beggluteday22);

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

                if (modgluteday22.equals("Donkey Kicks + Single Leg Hip Thruster")) {

                    SpannableString ss1 = new SpannableString(modgluteday22);

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

                if (intgluteday22.equals("Donkey Kicks + Single Leg Hip Thruster")) {

                    SpannableString ss1 = new SpannableString(intgluteday22);

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

                if (beglegday22.equals("Squat Jump + High Knee Toe Tap")) {

                    SpannableString ss1 = new SpannableString(beglegday22);

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

                if (modlegday22.equals("Squat Jump + High Knee Toe Tap")) {

                    SpannableString ss1 = new SpannableString(modlegday22);

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

                if (intlegday22.equals("Squat Jump + High Knee Toe Tap")) {

                    SpannableString ss1 = new SpannableString(intlegday22);

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

                if (modabday23.equals("Hollow Body Hold + Butterfly Crunch")) {

                    SpannableString ss1 = new SpannableString(modabday23);

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

                if (intabday23.equals("Hollow Body Hold + Butterfly Crunch")) {

                    SpannableString ss1 = new SpannableString(intabday23);

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

                    ss1.setSpan(clickableSpan1, 0, 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 17, 35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout23.setText(ss1);
                    workout23.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (modarmday23.equals("BO Monkey Curl + Tempo Reverse Curl")) {

                    SpannableString ss1 = new SpannableString(modarmday23);

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

                if (intarmday23.equals("BO Monkey Curl + Tempo Reverse Curl")) {

                    SpannableString ss1 = new SpannableString(intarmday23);

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

                if (begchestday23.equals("Spin Press + Hand Release Pushup")) {

                    SpannableString ss1 = new SpannableString(begchestday23);

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

                if (modchestday23.equals("Spin Press + Hand Release Pushup")) {

                    SpannableString ss1 = new SpannableString(modchestday23);

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

                if (intchestday23.equals("Spin Press + Hand Release Pushup")) {

                    SpannableString ss1 = new SpannableString(intchestday23);

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

                if (beggluteday23.equals("Reverse Lunge + Stiff Leg Deadlift")) {

                    SpannableString ss1 = new SpannableString(beggluteday23);

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

                if (modgluteday23.equals("Reverse Lunge + Stiff Leg Deadlift")) {

                    SpannableString ss1 = new SpannableString(modgluteday23);

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

                if (intgluteday23.equals("Reverse Lunge + Stiff Leg Deadlift")) {

                    SpannableString ss1 = new SpannableString(intgluteday23);

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

                if (beglegday23.equals("Pistol Squat + Lunge Squat")) {

                    SpannableString ss1 = new SpannableString(beglegday23);

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

                if (modlegday23.equals("Pistol Squat + Lunge Squat")) {

                    SpannableString ss1 = new SpannableString(modlegday23);

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

                if (intlegday23.equals("Pistol Squat + Lunge Squat")) {

                    SpannableString ss1 = new SpannableString(intlegday23);

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

                if (modabday24.equals("Starfish Crunch + High Plank Position")) {

                    SpannableString ss1 = new SpannableString(modabday24);

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

                if (intabday24.equals("Starfish Crunch + High Plank Position")) {

                    SpannableString ss1 = new SpannableString(intabday24);

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

                    ss1.setSpan(clickableSpan1, 0, 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 16, 39, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout24.setText(ss1);
                    workout24.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (modarmday24.equals("OH Tricep Ext + Tempo Pronate Tricep KB")) {

                    SpannableString ss1 = new SpannableString(modarmday24);

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

                if (intarmday24.equals("OH Tricep Ext + Tempo Pronate Tricep KB")) {

                    SpannableString ss1 = new SpannableString(intarmday24);

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

                if (begchestday24.equals("Dumbbell Floor Press + Decline Pushup")) {

                    SpannableString ss1 = new SpannableString(begchestday24);

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

                if (modchestday24.equals("Dumbbell Floor Press + Decline Pushup")) {

                    SpannableString ss1 = new SpannableString(modchestday24);

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

                if (intchestday24.equals("Dumbbell Floor Press + Decline Pushup")) {

                    SpannableString ss1 = new SpannableString(intchestday24);

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

                if (beggluteday24.equals("Semi Sumo DL Pulse + Fire Hydrant")) {

                    SpannableString ss1 = new SpannableString(beggluteday24);

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

                if (modgluteday24.equals("Semi Sumo DL Pulse + Fire Hydrant")) {

                    SpannableString ss1 = new SpannableString(modgluteday24);

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

                if (intgluteday24.equals("Semi Sumo DL Pulse + Fire Hydrant")) {

                    SpannableString ss1 = new SpannableString(intgluteday24);

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

                if (beglegday24.equals("One Leg Hip Up + Reverse Lunge")) {

                    SpannableString ss1 = new SpannableString(beglegday24);

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

                if (modlegday24.equals("One Leg Hip Up + Reverse Lunge")) {

                    SpannableString ss1 = new SpannableString(modlegday24);

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

                if (intlegday24.equals("One Leg Hip Up + Reverse Lunge")) {

                    SpannableString ss1 = new SpannableString(intlegday24);

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

                if (modabday25.equals("Low Plank Walkout + Reverse Plank")) {

                    SpannableString ss1 = new SpannableString(modabday25);

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

                if (intabday25.equals("Low Plank Walkout + Reverse Plank")) {

                    SpannableString ss1 = new SpannableString(intabday25);

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

                    ss1.setSpan(clickableSpan1, 0, 21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 24, 40, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout25.setText(ss1);
                    workout25.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (modarmday25.equals("Dumbbell Skullcrusher + Lying Tricep Ext")) {

                    SpannableString ss1 = new SpannableString(modarmday25);

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

                if (intarmday25.equals("Dumbbell Skullcrusher + Lying Tricep Ext")) {

                    SpannableString ss1 = new SpannableString(intarmday25);

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

                if (begchestday25.equals("Dumbbell Floor Press + One Leg Pushup")) {

                    SpannableString ss1 = new SpannableString(begchestday25);

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

                if (modchestday25.equals("Dumbbell Floor Press + One Leg Pushup")) {

                    SpannableString ss1 = new SpannableString(modchestday25);

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

                if (intchestday25.equals("Dumbbell Floor Press + One Leg Pushup")) {

                    SpannableString ss1 = new SpannableString(intchestday25);

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

                if (beggluteday25.equals("Hip Hinge Abduction + Single Leg Bridge")) {

                    SpannableString ss1 = new SpannableString(beggluteday25);

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

                if (modgluteday25.equals("Hip Hinge Abduction + Single Leg Bridge")) {

                    SpannableString ss1 = new SpannableString(modgluteday25);

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

                if (intgluteday25.equals("Hip Hinge Abduction + Single Leg Bridge")) {

                    SpannableString ss1 = new SpannableString(intgluteday25);

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

                if (beglegday25.equals("Dumbbell Squat + Side Lunge")) {

                    SpannableString ss1 = new SpannableString(beglegday25);

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

                if (modlegday25.equals("Dumbbell Squat + Side Lunge")) {

                    SpannableString ss1 = new SpannableString(modlegday25);

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

                if (intlegday25.equals("Dumbbell Squat + Side Lunge")) {

                    SpannableString ss1 = new SpannableString(intlegday25);

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

                if (modabday26.equals("Clam Situp + Old-Fashioned Plank ")) {

                    SpannableString ss1 = new SpannableString(modabday26);

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

                if (intabday26.equals("Clam Situp + Old-Fashioned Plank ")) {

                    SpannableString ss1 = new SpannableString(intabday26);

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

                    ss1.setSpan(clickableSpan1, 0, 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    ss1.setSpan(clickableSpan2, 23, 37, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    workout26.setText(ss1);
                    workout26.setMovementMethod(LinkMovementMethod.getInstance());
                }

                if (modarmday26.equals("Hammer Dumbbell Curl + BO Monkey Curl")) {

                    SpannableString ss1 = new SpannableString(modarmday26);

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

                if (intarmday26.equals("Hammer Dumbbell Curl + BO Monkey Curl")) {

                    SpannableString ss1 = new SpannableString(intarmday26);

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

                if (begchestday26.equals("Finger Out Pushup + Lying Dumbbell Fly")) {

                    SpannableString ss1 = new SpannableString(begchestday26);

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

                if (modchestday26.equals("Finger Out Pushup + Lying Dumbbell Fly")) {

                    SpannableString ss1 = new SpannableString(modchestday26);

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

                if (intchestday26.equals("Finger Out Pushup + Lying Dumbbell Fly")) {

                    SpannableString ss1 = new SpannableString(intchestday26);

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

                if (beggluteday26.equals("Dumbbell Bridge + Frog Pump")) {

                    SpannableString ss1 = new SpannableString(beggluteday26);

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

                if (modgluteday26.equals("Dumbbell Bridge + Frog Pump")) {

                    SpannableString ss1 = new SpannableString(modgluteday26);

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

                if (intgluteday26.equals("Dumbbell Bridge + Frog Pump")) {

                    SpannableString ss1 = new SpannableString(intgluteday26);

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

                if (beglegday26.equals("Split Squat + Stiff Leg Deadlift")) {

                    SpannableString ss1 = new SpannableString(beglegday26);

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

                if (modlegday26.equals("Split Squat + Stiff Leg Deadlift")) {

                    SpannableString ss1 = new SpannableString(modlegday26);

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

                if (intlegday26.equals("Split Squat + Stiff Leg Deadlift")) {

                    SpannableString ss1 = new SpannableString(intlegday26);

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

       /* Intent intent = new Intent(WorkoutActivity.this, ProgressActivity.class);
        intent.putExtra(key1, day1cals);
        startActivity(intent);
        return;*/
    }


    public void seeProgress(View view) {
    Intent intent = new Intent(WorkoutActivity.this, ProgressActivity.class);
    //intent.putExtra(key1, day1cals);
    startActivity(intent);
        return;
    }

    private void goToUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

    /*@Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putString(BeginnerArmPlan.key1, workout1.getText().toString());
        super.onSaveInstanceState(outState);
    }*/


    /*if (savedInstanceState != null) {
            begarmday1 = savedInstanceState.getString(BeginnerArmPlan.key1);
            workout1.setText(begarmday1);
        }*/

    /*@Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putString(BeginnerArmPlan.key1, workout1.getText().toString());
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        workout1.setText(savedInstanceState.getString(BeginnerArmPlan.key1));
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