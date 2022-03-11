package com.example.homefit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        TextView profile = findViewById(R.id.profile);
        profile.setText("My Profile");
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {


            case R.id.action_logout:
                Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(this, "you have logged out.", Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_plan:
                this.finish();


            default:

                return super.onOptionsItemSelected(item);
        }

    }

    }