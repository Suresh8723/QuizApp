package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class Game extends AppCompatActivity {

    TextView questionTxt, questionNumTxt;
    Button optionA, optionB, optionC, optionD, btnSubmit;
    private ArrayList<Questions> questionsList;
    Random random;
    int currentScore = 0, questionAttempted =0, currentPos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        questionTxt = findViewById(R.id.questionTxt);
        questionNumTxt = findViewById(R.id.questionAttempted);
        optionA = findViewById(R.id.optionA);
        optionB = findViewById(R.id.optionB);
        optionC = findViewById(R.id.optionC);
        optionD = findViewById(R.id.optionD);
        questionsList = new ArrayList<>();
        random = new Random();
        getQuestions(questionsList);
        currentPos = random.nextInt(questionsList.size());
        setDataToViews(currentPos);
        optionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(questionsList.get(currentPos).getAnswer().trim().equals((optionA.getText().toString().trim()))){
                    currentScore++;
                }

                questionAttempted++;
                currentPos = random.nextInt(questionsList.size());
                setDataToViews(currentPos);
            }

        });

        optionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(questionsList.get(currentPos).getAnswer().trim().equals((optionB.getText().toString().trim()))){
                    currentScore++;
                }

                questionAttempted++;
                currentPos = random.nextInt(questionsList.size());
                setDataToViews(currentPos);
            }
        });

        optionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(questionsList.get(currentPos).getAnswer().trim().equals((optionC.getText().toString().trim()))){
                    currentScore++;
                }

                questionAttempted++;
                currentPos = random.nextInt(questionsList.size());
                setDataToViews(currentPos);
            }
        });

        optionD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(questionsList.get(currentPos).getAnswer().trim().equals((optionD.getText().toString().trim()))){
                    currentScore++;
                }

                questionAttempted++;
                currentPos = random.nextInt(questionsList.size());
                setDataToViews(currentPos);
            }
        });


    }

//    private void score(){
//        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(Game.this);
//        View bottomSheetView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.result, (LinearLayout)findViewById(R.id.idScore));
//        TextView score = bottomSheetView.findViewById(R.id.score);
//        Button btnRestart = bottomSheetView.findViewById(R.id.btnRestart);
//        score.setText("Your score is \n" + currentScore + "/5");
//        btnRestart.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                currentPos = random.nextInt(questionsList.size());
//                setDataToViews(currentPos);
//                currentScore=0;
//                bottomSheetDialog.dismiss();
//            }
//        });
//        bottomSheetDialog.setCancelable(false);
//        bottomSheetDialog.setContentView(bottomSheetView);
//        bottomSheetDialog.show();
//    }

    private void setDataToViews(int currentPos) {
        questionNumTxt.setText("Questions Attempted: " + questionAttempted +"/5");
        if(questionAttempted==6){
            Intent intent = new Intent(Game.this, ScoreActivity.class);
            intent.putExtra("score", currentScore);
            startActivity(intent);
        }else{
            questionTxt.setText(questionsList.get(currentPos).getQuestion());
            optionA.setText(questionsList.get(currentPos).getOptionA());
            optionB.setText(questionsList.get(currentPos).getOptionB());
            optionC.setText(questionsList.get(currentPos).getOptionC());
            optionD.setText(questionsList.get(currentPos).getOptionD());
        }

    }

    private void getQuestions(ArrayList<Questions>questionsList) {
        questionsList.add(new Questions("Canada's birthday is on:?","July 1st"," July 1st", "July 4th", "July 15th", "July 10th"));
        questionsList.add(new Questions("The capital city of Canada is:","Ottawa", "Montreal", "Ottawa", "Toronto", " Vancouver"));
        questionsList.add(new Questions("The largest proivnce in Canada is:","Nunavut","Quebec", "Nunavut", "British Columbia", "\tNorthwest Territories"));
        questionsList.add(new Questions("Canada has _____ provinces.","10", "15", "5", "7", "10"));
        questionsList.add(new Questions("The smallest province in Canada is:","Prince Edward Island", "Nova Scotia", "Prince Edward Island", "Quebec", "British Columbia"));
        questionsList.add(new Questions("The only province in Canada which has a majority of French speakers is:","Quebec", "Quebec", "Ontario", "Montreal", "Nova Scotia"));
        questionsList.add(new Questions("The leader of Canada is known as the:","prime minister", "premier", "emperor", "prime minister", "president"));
        questionsList.add(new Questions("The current prime minister of Canada is:","Justin Trudeau", "Pierre Trudeau", "Wayne Gretzky", "Justin Trudeau", "Donald Trump"));
        questionsList.add(new Questions("Canada is famous for:","Niagara Falls", "Niagara Falls", "Victoria Falls", "Yosemite Falls", "Sahara"));
        questionsList.add(new Questions("The animal which is a symbol of Canada is the:","The beaver", "grizzly bear", "killer whale", "chicken", "The beaver"));
    }
}