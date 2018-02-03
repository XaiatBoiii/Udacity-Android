package com.example.android.footballscorecounter;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;
import android.media.MediaPlayer;
import android.view.Menu;
import android.view.View.OnClickListener;



public class MainActivity extends AppCompatActivity {

    public int counter;
    Button button;
    TextView textView;
    int sTeamA = 0;
    int sTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText editNameField = (EditText) findViewById(R.id.editTeamA);
                String name = editNameField.getText().toString();

                new CountDownTimer(30000, 1000) {
                    public void onTick(long millisUntilFinished) {
                        textView.setText(String.valueOf(counter));
                        counter++;
                    }

                    public void onFinish() {
                        textView.setText("FINISH!!");
                    }
                }.start();
            }
        });
    }

    public void plusGoalA (View view) {
        sTeamA = sTeamA+1;
        displayScoreA(sTeamA);
    }

    public void plusGoalB(View view) {
        sTeamB = sTeamB+1;
        displayScoreB(sTeamB);
    }
    /**
     * This method is called when the minus button - is clicked.
     */
    public void minusGoalA(View view) {
        Toast.makeText(this, "You can not have NEGATIVE score ", Toast.LENGTH_SHORT).show();
        if (sTeamA == 0){
            return;
        }
        sTeamA = sTeamA - 1;
        displayScoreA(sTeamA);
    }

    public void minusGoalB(View view) {
        Toast.makeText(this, "You can not have NEGATIVE score ", Toast.LENGTH_SHORT).show();
        if (sTeamB == 0){
            return;
        }
        sTeamB = sTeamB - 1;
        displayScoreB(sTeamB);
    }

    private void displayScoreA(int sTeamA) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_a_score);
        quantityTextView.setText("" + sTeamA);
    }

    private void displayScoreB(int sTeamB) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_b_score);
        quantityTextView.setText("" + sTeamB);
    }

    public class BasicScreenActivity extends Activity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Button one = this.findViewById(R.id.plusGoalA);
            final MediaPlayer mp = MediaPlayer.create(this, R.raw.goal);
            one.setOnClickListener(new OnClickListener(){

                public void onClick(View v) {
                    mp.start();
                }
            });
        }
    }
}
