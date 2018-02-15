package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int POINTS_FOR_FREE_THROW = 1;
    final int POINTS_FOR_TWO_POINTER = 2;
    final int POINTS_FOR_THREE_POINTER = 3;
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score of Team A by 1 point.
     */
    public void addOneForTeamA(View view) {
        scoreTeamA = scoreTeamA + POINTS_FOR_FREE_THROW;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score of Team A by 2 points.
     */
    public void addTwoForTeamA(View view) {
        scoreTeamA = scoreTeamA + POINTS_FOR_TWO_POINTER;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score of Team A by 3 points.
     */
    public void addThreeForTeamA(View view) {
        scoreTeamA = scoreTeamA + POINTS_FOR_THREE_POINTER;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score of Team A by 1 point.
     */
    public void addOneForTeamB(View view) {
        scoreTeamB = scoreTeamB + POINTS_FOR_FREE_THROW;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score of Team A by 2 points.
     */
    public void addTwoForTeamB(View view) {
        scoreTeamB = scoreTeamB + POINTS_FOR_TWO_POINTER;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score of Team A by 3 points.
     */
    public void addThreeForTeamB(View view) {
        scoreTeamB = scoreTeamB + POINTS_FOR_THREE_POINTER;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
