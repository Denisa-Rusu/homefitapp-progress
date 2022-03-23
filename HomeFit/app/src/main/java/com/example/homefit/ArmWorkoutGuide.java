package com.example.homefit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ArmWorkoutGuide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


                //ex1.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=zdQOmPMGjOY");

                //ex2.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=jaxbEHLC4qU");


                //ex3.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=2XDPNh7a8p8");


               //ex4.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=P5sXHLmXmBM");


                //ex5.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=ZJxUTuVjmqA");


                //ex6.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=1BDGIcMTSXc");


                //ex7.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=gQvdAcH1j9Q");


                //ex8.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=wK41ryw7F6o");


                //ex9.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/watch?v=EoYWMB856cA");


               //ex10.setOnClickListener(new View.OnClickListener() {

                goToUrl("https://www.youtube.com/shorts/UtNfwTL1L7U");


    }

    private void goToUrl(String s) {

        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }


}