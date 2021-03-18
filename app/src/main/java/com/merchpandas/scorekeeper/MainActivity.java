package com.merchpandas.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView goalTextViewTeamA,goalTextViewTeamB,foulTextViewTeamA,foulTextViewTeamB, cornerKickTextViewTeamA,cornerKickTextViewTeamB;
    private int foulNoTeamA=0;
    private int foulNoTeamB=0;
    private int goalTeamA=0;
    private int goalTeamB=0;
    private int cornerKickTeamA=0;
    private int cornerKickTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goalTextViewTeamA=findViewById(R.id.team_a_goal_text_view);
        goalTextViewTeamB=findViewById(R.id.team_b_goal_text_view);
        foulTextViewTeamA=findViewById(R.id.team_a_foul_text_view);
        foulTextViewTeamB=findViewById(R.id.team_b_foul_text_view);
        cornerKickTextViewTeamA=findViewById(R.id.team_a_corner_Kick_text_view);
        cornerKickTextViewTeamB=findViewById(R.id.team_b_corner_Kick_text_view);
    }
    public void goalIncrementTeamA(View view) {
        goalTeamA+=1;
        displayDetailTeamA();
    }
    public void foulIncrementTeamA(View view) {
        foulNoTeamA+=1;
        displayDetailTeamA();
    }
    public void cornerKickIncrementTeamA(View view) {
        cornerKickTeamA+=1;
        displayDetailTeamA();
    }

    private void displayDetailTeamA(){
        goalTextViewTeamA.setText("GOAL: "+goalTeamA);
        foulTextViewTeamA.setText("FOUL: "+foulNoTeamA);
        cornerKickTextViewTeamA.setText("CORNER KICK: "+cornerKickTeamA);
    }
    public void resetButton(View view) {
        goalTeamA=0;
        foulNoTeamA=0;
        goalTeamB=0;
        foulNoTeamB=0;
        cornerKickTeamB=0;
        cornerKickTeamA=0;
        displayDetailTeamA();
        displayDetailTeamB();
    }
    public void goalIncrementTeamB(View view) {
        goalTeamB+=1;
        displayDetailTeamB();
    }
    public void foulIncrementTeamB(View view) {
        foulNoTeamB+=1;
        displayDetailTeamB();
    }
    public void cornerKickIncrementTeamB(View view) {
        cornerKickTeamB+=1;
        displayDetailTeamB();
    }

    private void displayDetailTeamB() {
        goalTextViewTeamB.setText("GOAL: "+goalTeamB);
        foulTextViewTeamB.setText("FOUL: "+foulNoTeamB);
        cornerKickTextViewTeamB.setText("CORNER KICK: "+cornerKickTeamB);
    }
}
