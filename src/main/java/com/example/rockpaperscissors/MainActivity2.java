package com.example.rockpaperscissors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private TextView textView2;
    private TextView textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
    }

    public void chooseRock(View view){
        textView2.clearComposingText();
        textView2.setText("Your Choice: ");
        textView2.append("Rock");


        double computer = Math.random() *3;
        computer = Math.floor(computer);

        if (computer==0){
            textView3.clearComposingText();
            textView3.setText("Computer's Choice: ");
            textView3.append("Rock");
            Toast.makeText(this,"Draw, Try Harder🤔",Toast.LENGTH_LONG).show();
        }

        else if(computer==1){
            textView3.clearComposingText();
            textView3.setText("Computer's Choice: ");
            textView3.append("Paper");
            Toast.makeText(this,"Dukh, Dard, Peeda 🤕",Toast.LENGTH_LONG).show();
        }
        else {
            textView3.clearComposingText();
            textView3.setText("Computer's Choice: ");
            textView3.append("Scissors");
            Toast.makeText(this,"Mission Accomplished, Return Back To Base🤑",Toast.LENGTH_LONG).show();
        }


    }


    public void choosePaper(View view){
        textView2.clearComposingText();
        textView2.setText("Your Choice: ");
        textView2.append("Paper");

        double computer = Math.random() *3;
        computer = Math.floor(computer);

        if (computer==0){
            textView3.clearComposingText();
            textView3.setText("Computer's Choice: ");
            textView3.append("Rock");
            Toast.makeText(this,"Victorious There Soldier, Congratulations🦾",Toast.LENGTH_LONG).show();
        }

        else if(computer==1){
            textView3.clearComposingText();
            textView3.setText("Computer's Choice: ");
            textView3.append("Paper");
            Toast.makeText(this,"Equal Impact 🥶, Try Again",Toast.LENGTH_LONG).show();
        }

        else {
            textView3.clearComposingText();
            textView3.setText("Computer's Choice: ");
            textView3.append("Scissors");
            Toast.makeText(this,"Defeat? What Are You Doing Fam? \n Stand Up And Fight😣",Toast.LENGTH_LONG).show();
        }
    }
    public void chooseScissors(View view){
        textView2.clearComposingText();
        textView2.setText("Your Choice: ");
        textView2.append("Scissors");

        double computer = Math.random() *3;
        computer = Math.floor(computer);

        if (computer==0){
            textView3.clearComposingText();
            textView3.setText("Computer's Choice: ");
            textView3.append("Rock");
            Toast.makeText(this,"Your Food Is Cancelled\n Go To Sleep 😑",Toast.LENGTH_LONG).show();
        }

        else if(computer==1){
            textView3.clearComposingText();
            textView3.setText("Computer's Choice: ");
            textView3.append("Paper");
            Toast.makeText(this,"Well Done Soldier, Proud Of You🥳",Toast.LENGTH_LONG).show();
        }

        else {
            textView3.clearComposingText();
            textView3.setText("Computer's Choice: ");
            textView3.append("Scissors");
            Toast.makeText(this, "Again Soldier,\nDo Not Let Your Guard Down",Toast.LENGTH_LONG).show();
        }

    }
}