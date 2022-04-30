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
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView register;
    private EditText email;
    private EditText password;
    private Button login_button;

    private FirebaseAuth mAuth;
    //DatabaseReference fireDB;
    //private String Uid;


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
        //Uid = mAuth.getCurrentUser().getUid();

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
            password.setError("Incorrect password");
            return;
        }



        mAuth.signInWithEmailAndPassword(e, p).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if (task.isSuccessful()) {
                    //startActivity(new Intent(MainActivity.this, WorkoutActivity.class));
                    Intent intent = new Intent(MainActivity.this, WorkoutActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Unsuccessful Login, try again", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}