package com.example.a06_task_performance;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;


import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ImageButton iv_11, iv_12, iv_13, iv_21, iv_22, iv_23, iv_31, iv_32, iv_33, iv_41, iv_42, iv_43;

    FloatingActionButton button;

    //array for the images
    Integer[] cardsArray = {101, 102, 103, 104, 105, 106, 201, 202, 203, 204, 205, 206};

    //actual images
    int image101, image102, image103, image104, image105, image106, image201, image202, image203,
    image204, image205, image206;

    int firstCard, secondCard;

    int clickedFirst, clickedSecond;

    int cardNumber = 1;

    boolean[] isMatched = new boolean[12]; // 12 cards


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_11 = (ImageButton) findViewById(R.id.iv_11);
        iv_12 = (ImageButton) findViewById(R.id.iv_12);
        iv_13 = (ImageButton) findViewById(R.id.iv_13);

        iv_21 = (ImageButton) findViewById(R.id.iv_21);
        iv_22 = (ImageButton) findViewById(R.id.iv_22);
        iv_23 = (ImageButton) findViewById(R.id.iv_23);

        iv_31 = (ImageButton) findViewById(R.id.iv_31);
        iv_32 = (ImageButton) findViewById(R.id.iv_32);
        iv_33 = (ImageButton) findViewById(R.id.iv_33);

        iv_41 = (ImageButton) findViewById(R.id.iv_41);
        iv_42 = (ImageButton) findViewById(R.id.iv_42);
        iv_43 = (ImageButton) findViewById(R.id.iv_43);

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

        button = findViewById(R.id.floatingActionButton);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                reset();
            }
        });

        reset();
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


    private void reset() {
        flipCard(iv_11, R.drawable.wow_light);
        flipCard(iv_12, R.drawable.wow_light);
        flipCard(iv_13, R.drawable.wow_light);
        flipCard(iv_21, R.drawable.wow_light);
        flipCard(iv_22, R.drawable.wow_light);
        flipCard(iv_23, R.drawable.wow_light);
        flipCard(iv_31, R.drawable.wow_light);
        flipCard(iv_32, R.drawable.wow_light);
        flipCard(iv_33, R.drawable.wow_light);
        flipCard(iv_41, R.drawable.wow_light);
        flipCard(iv_42, R.drawable.wow_light);
        flipCard(iv_43, R.drawable.wow_light);

        Collections.shuffle(Arrays.asList(cardsArray));

        // Reset the isMatched array
        Arrays.fill(isMatched, false);

        // Enable all image views
        enableAllImageViews();

        // Reset the cardNumber to 1
        
        cardNumber = 1;
    }

    private void enableAllImageViews() {
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

    private void doStuff(ImageView iv, int card){
        int cardValue = cardsArray[card];

        if (isMatched[card]) {
            // Card already matched, do nothing
            return;
        }


        if (cardValue == 101) {
            iv.setImageResource(image101);
        } else if (cardValue == 102) {
            iv.setImageResource(image102);
        } else if (cardValue == 103) {
            iv.setImageResource(image103);
        } else if (cardValue == 104) {
            iv.setImageResource(image104);
        }
        else if (cardValue == 105) {
            iv.setImageResource(image105);
        }
        else if (cardValue == 106) {
            iv.setImageResource(image106);
        }
        else if (cardValue == 201) {
            iv.setImageResource(image201);
        }
        else if (cardValue == 202) {
            iv.setImageResource(image202);
        }
        else if (cardValue == 203) {
            iv.setImageResource(image203);
        }
        else if (cardValue == 204) {
            iv.setImageResource(image204);
        }
        else if (cardValue == 205) {
            iv.setImageResource(image205);
        }
        else if (cardValue == 206) {
            iv.setImageResource(image206);
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

    private void flipCard(ImageView iv, int img){
        if (!isMatched[Integer.parseInt((String) iv.getTag())]) {
            iv.setImageResource(img);
            iv.setVisibility(View.VISIBLE);
        }

    }


    private void calculate() {
        //correctly guessed images will stay in place and not flip back

        if (firstCard == secondCard) {
            // Cards match
            isMatched[clickedFirst] = true;
            isMatched[clickedSecond] = true;

            // Check if all pairs are matched
            boolean allMatched = true;
            for (boolean matched : isMatched) {
                if (!matched) {
                    allMatched = false;
                    break;
                }
            }

            // Enable the image views for the unmatched cards
            iv_11.setEnabled(!isMatched[0]);
            iv_12.setEnabled(!isMatched[1]);
            iv_13.setEnabled(!isMatched[2]);
            iv_21.setEnabled(!isMatched[3]);
            iv_22.setEnabled(!isMatched[4]);
            iv_23.setEnabled(!isMatched[5]);
            iv_31.setEnabled(!isMatched[6]);
            iv_32.setEnabled(!isMatched[7]);
            iv_33.setEnabled(!isMatched[8]);
            iv_41.setEnabled(!isMatched[9]);
            iv_42.setEnabled(!isMatched[10]);
            iv_43.setEnabled(!isMatched[11]);

            if (allMatched) {
                // All pairs are matched, show a message or perform any other action
                // You can add your code here
            }
        } else {
            // Cards don't match
            flipCard(iv_11, R.drawable.wow_light);
            flipCard(iv_12, R.drawable.wow_light);
            flipCard(iv_13, R.drawable.wow_light);
            flipCard(iv_21, R.drawable.wow_light);
            flipCard(iv_22, R.drawable.wow_light);
            flipCard(iv_23, R.drawable.wow_light);
            flipCard(iv_31, R.drawable.wow_light);
            flipCard(iv_32, R.drawable.wow_light);
            flipCard(iv_33, R.drawable.wow_light);
            flipCard(iv_41, R.drawable.wow_light);
            flipCard(iv_42, R.drawable.wow_light);
            flipCard(iv_43, R.drawable.wow_light);

            // Enable the image views for the unmatched cards
            iv_11.setEnabled(!isMatched[0]);
            iv_12.setEnabled(!isMatched[1]);
            iv_13.setEnabled(!isMatched[2]);
            iv_21.setEnabled(!isMatched[3]);
            iv_22.setEnabled(!isMatched[4]);
            iv_23.setEnabled(!isMatched[5]);
            iv_31.setEnabled(!isMatched[6]);
            iv_32.setEnabled(!isMatched[7]);
            iv_33.setEnabled(!isMatched[8]);
            iv_41.setEnabled(!isMatched[9]);
            iv_42.setEnabled(!isMatched[10]);
            iv_43.setEnabled(!isMatched[11]);
        }
    }
    private void frontOfCardsResources(){
        image101 = R.drawable.fb1;
        image102 = R.drawable.gh1;
        image103 = R.drawable.ig1;
        image104 = R.drawable.yt1;
        image105 = R.drawable.tw1;
        image106 = R.drawable.bl1;

        image201 = R.drawable.fb2;
        image202 = R.drawable.gh2;
        image203 = R.drawable.ig2;
        image204 = R.drawable.yt2;
        image205 = R.drawable.tw2;
        image206 = R.drawable.bl2;
    }

}