package com.example.a06_task_performance;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iv_11, iv_12, iv_13, iv_21, iv_22, iv_23, iv_31, iv_32, iv_33, iv_41, iv_42, iv_43;

    //array for the images
    Integer[] cardsArray = {101, 102, 103, 104, 201, 202, 203, 204};

    //actual images
    int fb1, gh1, ig1, yt1, fb2, gh2, ig2, yt2;

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

    }


}