package com.example.homefit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    public static final String key1 = "DAY01";
    public static final String key2 = "DAY02";
    public static final String key3 = "DAY03";
    public static final String key4 = "DAY04";
    public static final String key5 = "DAY05";
    public static final String key6 = "DAY06";
    public static final String key7 = "DAY07";
    public static final String key8 = "DAY08";
    public static final String key9 = "DAY09";
    public static final String key10 = "DAY10";
    public static final String key11 = "DAY11";
    public static final String key12 = "DAY12";
    public static final String key13 = "DAY13";
    public static final String key14 = "DAY14";
    public static final String key15 = "DAY15";
    public static final String key16 = "DAY16";
    public static final String key17 = "DAY17";
    public static final String key18 = "DAY18";
    public static final String key19 = "DAY19";
    public static final String key20 = "DAY20";
    public static final String key21 = "DAY21";
    public static final String key22 = "DAY22";
    public static final String key23 = "DAY23";
    public static final String key24 = "DAY24";
    public static final String key25 = "DAY25";
    public static final String key26 = "DAY26";
    public static final String key27 = "DAY27";
    public static final String key28 = "DAY28";
    public static final String key1performance = "DAY01PERFORMANCE";
    public static final String key2performance = "DAY02PERFORMANCE";
    public static final String key3performance = "DAY03PERFORMANCE";
    public static final String key4performance = "DAY04PERFORMANCE";
    public static final String key5performance = "DAY05PERFORMANCE";
    public static final String key8performance = "DAY08PERFORMANCE";
    public static final String key9performance = "DAY09PERFORMANCE";
    public static final String key10performance = "DAY10PERFORMANCE";
    public static final String key11performance = "DAY11PERFORMANCE";
    public static final String key12performance = "DAY12PERFORMANCE";
    public static final String key15performance = "DAY15PERFORMANCE";
    public static final String key16performance = "DAY16PERFORMANCE";
    public static final String key17performance = "DAY17PERFORMANCE";
    public static final String key18performance = "DAY18PERFORMANCE";
    public static final String key19performance = "DAY19PERFORMANCE";
    public static final String key22performance = "DAY22PERFORMANCE";
    public static final String key23performance = "DAY23PERFORMANCE";
    public static final String key24performance = "DAY24PERFORMANCE";
    public static final String key25performance = "DAY25PERFORMANCE";
    public static final String key26performance = "DAY26PERFORMANCE";

    private TextView register;
    private EditText email;
    private EditText password;
    private Button login_button;

    private FirebaseAuth mAuth;
    DatabaseReference fireDB;
    private String Uid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        register = (TextView) findViewById(R.id.register);
        register.setOnClickListener(this);

        login_button = (Button) findViewById(R.id.login_button);
        login_button.setOnClickListener(this);

        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);

        mAuth = FirebaseAuth.getInstance();
        Uid = mAuth.getCurrentUser().getUid();


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.register:
                startActivity(new Intent(this, RegisterActivity.class));
                break;

            case R.id.login_button:
                login();
                break;
        }
    }

    private void login() {
        String e = email.getText().toString();
        String p = password.getText().toString();

        if (e.isEmpty()) {
            email.setError("Email required");
            return;
        }

        if (p.isEmpty()) {
            password.setError("Password required");
            return;
        }

        if (p.length() < 6) {
            password.setError("Password should contain at least 6 characters");
            return;
        }

        mAuth.signInWithEmailAndPassword(e, p).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if (task.isSuccessful()) {
                    // String userID = FirebaseAuth.getInstance().getCurrentUser().getUid();
                    // intent.putExtra("UserID", userID);

                    FirebaseDatabase.getInstance().getReference("Users").child(Uid).child("Plan")
                    .addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                            for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                                String day01 = snapshot.child("day01").getValue().toString();
                                Intent intent = new Intent(MainActivity.this, WorkoutActivity.class);
                                intent.putExtra(key1, day01);
                                startActivity(intent);
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {

                        }
                    });
                            //String day01 = dataSnapshot.getValue(UserPlan.class).getDay01();




                    // Intent intent = new Intent(MainActivity.this, WorkoutActivity.class);
                    // intent.putExtra("UserID", userID);
                    // startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Unsuccessful Login, try again", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}