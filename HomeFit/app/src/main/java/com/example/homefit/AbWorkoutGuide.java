package com.example.homefit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AbWorkoutGuide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



                //ex1.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=-FW8DNKsAh8");


                //ex2.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=tiPR05uvyWY");


                //ex3.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=Wp4BlxcFTkE");


                //ex4.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=63Q9ezNX5Pw");


                //ex5.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=ZNAxdJ6Bt00");


               //ex6.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=0Z7ds7Qivqs");


               //ex7.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=fSaYfvSpAMI");


               //ex8.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=LAPTW62nYrs");


                //ex9.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=ZIAwC1w90VA");


                //ex10.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=V_lHogFPocY");


    }

    private void goToUrl(String s) {

        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

}
