package com.example.android.cricketscorecard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int score=0;int wickets=0;
    String teamAScore=score+"/"+wickets,teamBscore="0/0";
    public void sixRuns(View view) {
        score=score+6;
        teamAScore=(score)+"/"+wickets;
        displayTeamAScore(teamAScore);
    }
    public void fourRuns(View view) {
        score=score+4;
        teamAScore=(score)+"/"+wickets;
        displayTeamAScore(teamAScore);
    }
    public void wicket(View view) {
        wickets=wickets+1;
        if(wickets>=10){
            teamBscore=teamAScore=(score)+"/"+(wickets);;
            teamAScore="0/0";
            wickets=0;
            score=0;
            displayTeamBScore(teamBscore);
            displayTeamAScore(teamAScore);
        }
        else {
            teamAScore = (score) + "/" + (wickets);
            displayTeamAScore(teamAScore);
        }
    }
    public void run(View view) {
        score=score+1;
        teamAScore=(score)+"/"+(wickets);
        displayTeamAScore(teamAScore);
    }

    public void nextInnings(View view){
        if(teamBscore=="0/0") {
            teamBscore =(score) + "/" + (wickets);
            teamAScore = "0/0";
            wickets = 0;
            score = 0;
            displayTeamBScore(teamBscore);
            displayTeamAScore(teamAScore);
        }
    }
    private void displayTeamAScore(String number) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_A_score);
        quantityTextView.setText("" + number);
    }
    private void displayTeamBScore(String number) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_B_score);
        quantityTextView.setText("" + number);
    }
}
