package com.example.homefit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    private Button register_button;
    private EditText first_name, last_name, name, dob, phone_number, email, password;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mAuth = FirebaseAuth.getInstance();

        register_button = (Button) findViewById(R.id.register_button);
        register_button.setOnClickListener(this);

        first_name = (EditText) findViewById(R.id.first_name);
        last_name = (EditText) findViewById(R.id.last_name);
        name = (EditText) findViewById(R.id.username);
        dob = (EditText) findViewById(R.id.dob);
        phone_number = (EditText) findViewById(R.id.phone_number);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.register_button:
                register();
                break;
        }

    }

    private void register() {
        String fn = first_name.getText().toString();
        String ln = last_name.getText().toString();
        String username = name.getText().toString();
        String d = dob.getText().toString();
        String phoneNumber = phone_number.getText().toString();
        String emailAddress = email.getText().toString();
        String p = password.getText().toString();

        if(fn.isEmpty()) {
            first_name.setError("First name required");
            return;
        }

        if(ln.isEmpty()) {
            last_name.setError("Last name required");
            return;
        }

        if(username.isEmpty()) {
            name.setError("Username required");
            return;
        }

        if(d.isEmpty()) {
            dob.setError("Date of Birth required");
            return;
        }

        if(phoneNumber.isEmpty()) {
            phone_number.setError("Phone number required");
            return;
        }

        if(emailAddress.isEmpty()) {
            email.setError("Email required");
            return;
        }

        if(p.isEmpty()) {
            password.setError("Password required");
            return;
        }

        if(p.length() < 6 ) {
            password.setError("Password should contain at least 6 characters");
            return;
        }


        mAuth.createUserWithEmailAndPassword(emailAddress, p).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if(task.isSuccessful()) {
                    User user = new User(fn, ln, username, d, phoneNumber, emailAddress);

                    FirebaseDatabase.getInstance().getReference("Users").child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                            .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {

                            if(task.isSuccessful()) {
                                startActivity(new Intent(RegisterActivity.this, InitialLoginActivity.class));
                                Toast.makeText(RegisterActivity.this,"Successfully Registered", Toast.LENGTH_LONG).show();
                            } else {
                                Toast.makeText(RegisterActivity.this,"Unsuccessful Register, try Again.", Toast.LENGTH_LONG).show();
                            }
                        }
                    });
                } else {
                    Toast.makeText(RegisterActivity.this,"Unsuccessful register, try Again.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}