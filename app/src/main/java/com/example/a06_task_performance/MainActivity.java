package com.example.a06_task_performance;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ImageView iv_11, iv_12, iv_13, iv_21, iv_22, iv_23, iv_31, iv_32, iv_33, iv_41, iv_42, iv_43;

    //array for the images
    Integer[] cardsArray = {101, 102, 103, 104, 201, 202, 203, 204, 301, 302, 303, 304};

    //actual images
    int fb1, gh1, ig1, yt1, fb2, gh2, ig2, yt2;

    int firstCard, secondCard;

    int clickedFirst, clickedSecond;

    int cardNumber = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_11 = (ImageView) findViewById(R.id.iv_11);
        iv_12 = (ImageView) findViewById(R.id.iv_12);
        iv_13 = (ImageView) findViewById(R.id.iv_13);

        iv_21 = (ImageView) findViewById(R.id.iv_21);
        iv_22 = (ImageView) findViewById(R.id.iv_22);
        iv_23 = (ImageView) findViewById(R.id.iv_23);

        iv_31 = (ImageView) findViewById(R.id.iv_31);
        iv_32 = (ImageView) findViewById(R.id.iv_32);
        iv_33 = (ImageView) findViewById(R.id.iv_33);

        iv_41 = (ImageView) findViewById(R.id.iv_41);
        iv_42 = (ImageView) findViewById(R.id.iv_42);
        iv_43 = (ImageView) findViewById(R.id.iv_43);

        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");

        iv_21.setTag("3");
        iv_22.setTag("4");
        iv_23.setTag("5");

        iv_31.setTag("6");
        iv_32.setTag("7");
        iv_33.setTag("8");

        iv_41.setTag("9");
        iv_42.setTag("10");
        iv_43.setTag("11");


        //load the card images
        frontOfCardsResources();

        //shuffle the images
        Collections.shuffle(Arrays.asList(cardsArray));

        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_11, theCard);
            }
        });

        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_12, theCard);
            }
        });

        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_13, theCard);
            }
        });

        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_21, theCard);
            }
        });

        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_22, theCard);
            }
        });

        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_23, theCard);
            }
        });


        iv_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_31, theCard);
            }
        });

        iv_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_32, theCard);
            }
        });

        iv_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_33, theCard);
            }
        });


        iv_41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_41, theCard);
            }
        });

        iv_42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_42, theCard);
            }
        });

        iv_43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_43, theCard);
            }
        });

    }


    private void doStuff(ImageView iv, int card){
        if(cardsArray[card] == fb1){
            iv.setImageResource(fb1);
        }
        else if(cardsArray[card] == gh1){
            iv.setImageResource(gh1);
        }
        else if(cardsArray[card] == ig1){
            iv.setImageResource(ig1);
        }
        else if(cardsArray[card] == yt1){
            iv.setImageResource(yt1);
        }
        else if(cardsArray[card] == fb2){
            iv.setImageResource(fb2);
        }
        else if(cardsArray[card] == ig2){
            iv.setImageResource(ig2);
        }
        else if(cardsArray[card] == gh2){
            iv.setImageResource(gh2);
        }
        else if(cardsArray[card] == yt2){
            iv.setImageResource(yt2);
        }

        //check which image is selected and store it to temporary variable
        if(cardNumber == 1){
            firstCard = cardsArray[card];
            if(firstCard > 200){
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickedFirst = card;

            iv.setEnabled(false);
        }

        else if (cardNumber == 2){
            secondCard = cardsArray[card];

            if(secondCard > 200){
                secondCard = secondCard - 100;
            }

            cardNumber = 1;
            clickedSecond = card;

            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);

            iv_21.setEnabled(false);
            iv_22.setEnabled(false);
            iv_23.setEnabled(false);

            iv_31.setEnabled(false);
            iv_32.setEnabled(false);
            iv_33.setEnabled(false);

            iv_41.setEnabled(false);
            iv_42.setEnabled(false);
            iv_43.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //check if the selected image are the same
                    calculate();
                }
            }, 1000);
        }

    }

    private void calculate(){
        if(firstCard == secondCard){
            if(clickedFirst == 0){
                iv_11.setVisibility(View.VISIBLE);
            }
            else if(clickedFirst == 1){
                iv_12.setVisibility(View.VISIBLE);
            }
            else if(clickedFirst == 2){
                iv_13.setVisibility(View.VISIBLE);
            }
            else if(clickedFirst == 3){
                iv_21.setVisibility(View.VISIBLE);
            }
            else if(clickedFirst == 4){
                iv_22.setVisibility(View.VISIBLE);
            }
            else if(clickedFirst == 5){
                iv_23.setVisibility(View.VISIBLE);
            }
            else if(clickedFirst == 6){
                iv_31.setVisibility(View.VISIBLE);
            }
            else if(clickedFirst == 7){
                iv_32.setVisibility(View.VISIBLE);
            }
            else if(clickedFirst == 8){
                iv_33.setVisibility(View.VISIBLE);
            }else if(clickedFirst == 9){
                iv_41.setVisibility(View.VISIBLE);
            }
            else if(clickedFirst == 10){
                iv_42.setVisibility(View.VISIBLE);
            }
            else if(clickedFirst == 11){
                iv_43.setVisibility(View.VISIBLE);
            }

            if(clickedSecond == 0){
                iv_11.setVisibility(View.VISIBLE);
            }
            else if(clickedSecond == 1){
                iv_12.setVisibility(View.VISIBLE);
            }
            else if(clickedSecond == 2){
                iv_13.setVisibility(View.VISIBLE);
            }
            else if(clickedSecond == 3){
                iv_21.setVisibility(View.VISIBLE);
            }
            else if(clickedSecond == 4){
                iv_22.setVisibility(View.VISIBLE);
            }
            else if(clickedSecond == 5){
                iv_23.setVisibility(View.VISIBLE);
            }
            else if(clickedSecond == 6){
                iv_31.setVisibility(View.VISIBLE);
            }
            else if(clickedSecond == 7){
                iv_32.setVisibility(View.VISIBLE);
            }
            else if(clickedSecond == 8){
                iv_33.setVisibility(View.VISIBLE);
            }else if(clickedSecond == 9){
                iv_41.setVisibility(View.VISIBLE);
            }
            else if(clickedSecond == 10){
                iv_42.setVisibility(View.VISIBLE);
            }
            else if(clickedSecond == 11){
                iv_43.setVisibility(View.VISIBLE);
            }

        }
        else{
            iv_11.setImageResource(R.drawable.wow_light);
            iv_12.setImageResource(R.drawable.wow_light);
            iv_13.setImageResource(R.drawable.wow_light);

            iv_21.setImageResource(R.drawable.wow_light);
            iv_22.setImageResource(R.drawable.wow_light);
            iv_23.setImageResource(R.drawable.wow_light);

            iv_31.setImageResource(R.drawable.wow_light);
            iv_32.setImageResource(R.drawable.wow_light);
            iv_33.setImageResource(R.drawable.wow_light);

            iv_41.setImageResource(R.drawable.wow_light);
            iv_42.setImageResource(R.drawable.wow_light);
            iv_43.setImageResource(R.drawable.wow_light);
        }

        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);

        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_23.setEnabled(true);

        iv_31.setEnabled(true);
        iv_32.setEnabled(true);
        iv_33.setEnabled(true);

        iv_41.setEnabled(true);
        iv_42.setEnabled(true);
        iv_43.setEnabled(true);
    }

    private void frontOfCardsResources(){
        fb1 = R.drawable.fb1;
        gh1 = R.drawable.gh1;
        ig1 = R.drawable.ig1;
        yt1 = R.drawable.yt1;

        fb2 = R.drawable.fb2;
        gh2 = R.drawable.gh2;
        ig2 = R.drawable.ig2;
        yt2 = R.drawable.yt2;
    }


}