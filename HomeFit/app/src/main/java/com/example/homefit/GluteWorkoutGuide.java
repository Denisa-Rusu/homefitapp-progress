package com.example.homefit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GluteWorkoutGuide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



                //ex1.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=tpVhJNQURk4");


                //ex2.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=Vkfc8I7PfFk");


                //ex3.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=z2p-qoY6rCc");


                //ex4.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=LUJZrULHD6s");


                //ex5.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=Ro8Zyg38uSk");


                //ex6.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=0O6v9iyHNec");


                //ex7.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=vYHqQmurSUk");


                //ex8.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=pm51PILr3qM");


                //ex9.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=o6sXO66Sqj4");


                //ex10.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=SJ1Xuz9D-ZQ");


    }

    private void goToUrl(String s) {

        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));

    }
}