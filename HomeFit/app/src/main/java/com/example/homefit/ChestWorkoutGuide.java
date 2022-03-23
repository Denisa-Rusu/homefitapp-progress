package com.example.homefit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ChestWorkoutGuide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


                //ex1.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=K915sE0RIYU");


                //ex2.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=m-CVSGAthfk");


                //ex3.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=PXIpw1JD4qw");


                //ex4.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=OXDYwsjdW9I");


                //ex5.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=cM9Fc-Lfv0A");


                //ex6.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=1pMwmIKWSa0");


                //ex7.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=jaxbEHLC4qU");


                //ex8.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/shorts/pgtaomNZJvQ");


                //ex9.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=DYONORexgpY");


                //ex10.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=t00WCJfes5w");


    }

    private void goToUrl(String s) {

        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));

    }
}