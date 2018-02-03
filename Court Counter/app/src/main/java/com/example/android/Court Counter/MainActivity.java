package com.example.android.footballscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.footballscorecounter.R;

public class MainActivity extends AppCompatActivity {

    int scoreteamA;
    int scoreteamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreteamA));
    }

    public void plus3teamA(View view) {
      displayForTeamA(scoreteamA=scoreteamA+3);
    }

    public void plus2teamA(View view) {
        displayForTeamA(scoreteamA=scoreteamA+2);
    }

    public void plus1teamA(View view) {
        displayForTeamA(scoreteamA=scoreteamA+1);
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreteamB));
    }

    public void plus3teamB(View view) {
        displayForTeamB(scoreteamB=scoreteamB+3);
    }

    public void plus2teamB(View view) {
        displayForTeamB(scoreteamB=scoreteamB+2);
    }

    public void plus1teamB(View view) {
        displayForTeamB(scoreteamB=scoreteamB+1);
    }


    /**
     * Reset scores to 0 for both teams.
     */
    public void reset(View view) {
        displayForTeamA(scoreteamA=0);
        displayForTeamB(scoreteamB=0);
    }

}
