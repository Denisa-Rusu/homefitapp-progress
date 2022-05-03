package com.example.homefit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class FeedbackActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private String Uid;

    ArrayList<UserFeedback> feedbacks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        Intent intent = getIntent();

        mAuth = FirebaseAuth.getInstance();
        Uid = mAuth.getCurrentUser().getUid();
        feedbacks = new ArrayList<UserFeedback>();

    }

    public void submitFeedback(View view) {

        EditText enterfeedback = findViewById(R.id.enterfeedback);

        String feedback = enterfeedback.getText().toString();

        UserFeedback userFeedback = new UserFeedback(feedback);

        DatabaseReference fireDB = FirebaseDatabase.getInstance().getReference("Users").child(Uid).child("Feedback").push();

        fireDB.setValue(userFeedback);
        Intent intent = new Intent(FeedbackActivity.this, ThankYouActivity.class);
        startActivity(intent);

    }
}