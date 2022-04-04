package com.example.homefit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class InitialLoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText email;
    private EditText password;
    private Button login_button;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial_login);

        login_button = (Button) findViewById(R.id.login_button);
        login_button.setOnClickListener(this);

        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);

        mAuth = FirebaseAuth.getInstance();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

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
                    startActivity(new Intent(InitialLoginActivity.this, WelcomeActivity.class));
                } else {
                    Toast.makeText(InitialLoginActivity.this, "Unsuccessful Login, try again", Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}