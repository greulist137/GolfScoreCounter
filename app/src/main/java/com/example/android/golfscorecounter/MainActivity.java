package com.example.android.golfscorecounter;

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

    /**
     * Displays the given score for Team A.
     */
    int currentHole = 0;
    int currentScore = 0;

    public void nextHole(View view){
        if (currentHole < 18) {
            currentHole += 1;
        }
        displayHole(currentHole);
    }

    public void addStroke(View view){
        currentScore += 1;
        displayScore(currentScore);
    }
    public void addPenalty(View view){
        currentScore += 2;
        displayScore(currentScore);
    }

    public void displayHole(int hole) {
        TextView holeView = (TextView) findViewById(R.id.hole_count);
        holeView.setText(String.valueOf(hole));
    }

    public void displayScore(int hole) {
        TextView holeView = (TextView) findViewById(R.id.current_score);
        holeView.setText(String.valueOf(hole));
    }



    public void resetScore(View view){
        currentHole = 0;
        currentScore = 0;
        displayHole(currentHole);
        displayScore(currentScore);



    }

}
