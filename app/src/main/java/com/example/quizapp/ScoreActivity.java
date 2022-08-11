package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        TextView textView1, textView2;
        textView1 = findViewById(R.id.textViewScore);
        textView2 = findViewById(R.id.textViewMessage);
        int score = getIntent().getExtras().getInt("score");
        textView1.setText(""+score);

        Button button = findViewById(R.id.retakequizbutton);
        button.setOnClickListener((View.OnClickListener) this);

        switch (score){
            case 0: case 1: case 2:
                textView2.setText("Please try again!");
                break;
            case 3:
                textView2.setText("Good Job");
                break;
            case 4:
                textView2.setText("Excellent Work!");
                break;
            case 5:
                textView2.setText("You are Genius!");
                break;
            default:
                textView2.setText("Something went Wrong");
        }



    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(this,MainActivity.class);
        finishAffinity();
        this.startActivity(i);
        finish();
    }
}
