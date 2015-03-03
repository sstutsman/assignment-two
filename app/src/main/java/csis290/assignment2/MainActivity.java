package csis290.assignment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    TextView findSumButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText numOne = (EditText) findViewById(R.id.ET_firstNum);
        EditText numTwo = (EditText) findViewById(R.id.ET_secondNum);
        EditText numThree = (EditText) findViewById(R.id.ET_thirdNum);
        int sumOfThree;


        findSumButton = (TextView) findViewById(R.id.TV_calculateSum);

        findSumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText numOne = (EditText) findViewById(R.id.ET_firstNum);
                EditText numTwo = (EditText) findViewById(R.id.ET_secondNum);
                EditText numThree = (EditText) findViewById(R.id.ET_thirdNum);
                int n1 = Integer.parseInt(numOne.getText().toString());
                int n2 = Integer.parseInt(numTwo.getText().toString());
                int n3 = Integer.parseInt(numThree.getText().toString());
                int sumOfThree = n1 + n2 + n3;

                    Intent sendIntent = new Intent(MainActivity.this, SecondaryActivity.class);
                    sendIntent.putExtra("sumvalue", sumOfThree);
                    startActivity(sendIntent);
               }
            }
        );//end OnClickListener
    }//End onCreate
}//End Activity

