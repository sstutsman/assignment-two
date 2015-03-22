package csis290.assignment2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    TextView submitButton;
    EditText firstNumber;
    EditText secondNumber;
    EditText thirdNumber;
    int sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitButton = (TextView) findViewById(R.id.textViewButton);
        firstNumber  = (EditText) findViewById(R.id.editTextFirst);
        secondNumber = (EditText) findViewById(R.id.editTextSecond);
        thirdNumber  = (EditText) findViewById(R.id.editTextThird);
        sum = 0;
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    sum = Integer.parseInt(firstNumber.getText().toString()) +
                            Integer.parseInt(secondNumber.getText().toString()) +
                            Integer.parseInt(thirdNumber.getText().toString());
                }catch (NumberFormatException ex){

                    Toast toast = Toast.makeText(getApplicationContext(),"Sorry Numbers Only!", Toast.LENGTH_SHORT);
                    toast.show();


                }

                if(sum != 0) {
                    firstNumber.setText("");
                    secondNumber.setText("");
                    thirdNumber.setText("");
                    Intent goToResult = new Intent(getApplicationContext(), SecondaryActivity.class);
                    goToResult.putExtra("sum", Integer.toString(sum));
                    sum = 0;
                    startActivity(goToResult);

                }
            }
        });
    }
}
