package csis290.assignment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    TextView sumButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int sumOfAllThree;
        EditText firstNum = (EditText) findViewById(R.id.ET_first);
        EditText secondNum = (EditText) findViewById(R.id.ET_second);
        EditText thirdNum = (EditText) findViewById(R.id.ET_third);

        sumButton = (TextView) findViewById(R.id.TV_theSum);

        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNum = (EditText) MainActivity.this.findViewById(R.id.ET_first);
                EditText secondNum = (EditText) MainActivity.this.findViewById(R.id.ET_second);
                EditText thirdNum = (EditText) MainActivity.this.findViewById(R.id.ET_third);
                int num1 = Integer.parseInt(firstNum.getText().toString());
                int num2 = Integer.parseInt(secondNum.getText().toString());
                int num3 = Integer.parseInt(thirdNum.getText().toString());

                int sumOfAllThree = num3 + num2 + num1;

                Intent getIntent = new Intent(MainActivity.this, SecondaryActivity.class);
                getIntent.putExtra("theSum", sumOfAllThree);
                MainActivity.this.startActivity(getIntent);
            }
        });
    }

}
