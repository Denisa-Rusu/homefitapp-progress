package com.example.homefit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LegWorkoutGuide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



                //ex1.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=z2p-qoY6rCc");


                //ex2.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=UcZVX7Sc9YI");


                //ex3.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=1D_tsUSW3ZY");


                //ex4.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=JKkNw3jO9S8");


                //ex5.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=CYWmz3Zxr8s");


                //ex6.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=cNDt-5H8tnc");


                //ex7.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=VHtUId9pBB0");


                //ex8.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=-cdph8hv0O0");


                //ex9.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=H-8t44E0UxA");


                //ex10.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=Azl5tkCzDcc");

    }

    private void goToUrl(String s) {

        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}