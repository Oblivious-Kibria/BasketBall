package com.example.sudip.basketball;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView Team_A_ScoreBoard;
    TextView Team_B_ScoreBoard;
    String score_A, score_B;
    int scoreA,scoreB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Team_A_ScoreBoard = (TextView) findViewById(R.id.scoreBoardA);
        Team_B_ScoreBoard = (TextView) findViewById(R.id.scoreBoardB);
        score_A = Team_A_ScoreBoard.getText().toString();
        score_B = Team_B_ScoreBoard.getText().toString();

        scoreA = Integer.parseInt(score_A);
        scoreB = Integer.parseInt(score_B);

    }

    public void Add_Point_2(View view){
        scoreA = scoreA + 2;
        Team_A_ScoreBoard.setText(""+scoreA);
    }
    public void Add_Point_3(View view){
        scoreA = scoreA + 3;
        Team_A_ScoreBoard.setText(""+scoreA);
    }
    public void Add_Point_1(View view){
        scoreA = scoreA + 1;
        Team_A_ScoreBoard.setText(""+scoreA);
    }

    public void Add_Point2(View view){
        scoreB = scoreB + 2;
        Team_B_ScoreBoard.setText(""+scoreB);
    }
    public void Add_Point3(View view){
        scoreB = scoreB + 3;
        Team_B_ScoreBoard.setText(""+scoreB);
    }
    public void Add_Point1(View view){
        scoreB = scoreB + 1;
        Team_B_ScoreBoard.setText(""+scoreB);
    }

    public void Reset(View view){
        Team_A_ScoreBoard.setText("0");
        Team_B_ScoreBoard.setText("0");
    }
}
