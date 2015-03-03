package csis290.assignment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import javax.xml.namespace.NamespaceContext;


public class MainActivity extends Activity {

    EditText num1;
    EditText num2;
    EditText num3;

    TextView text1;

    int numberOne;
    int numberTwo;
    int numberThree;
    int finalNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.edit_text_one);
        num2 = (EditText) findViewById(R.id.edit_text_two);
        num3 = (EditText) findViewById(R.id.edit_text_three);

        text1 = (TextView) findViewById(R.id.text_one);

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOne = Integer.parseInt(num1.getText().toString());
                numberTwo = Integer.parseInt(num1.getText().toString());
                numberThree = Integer.parseInt(num1.getText().toString());

                finalNumber = numberOne + numberTwo + numberThree;

                Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
                intent.putExtra("key", finalNumber);
                startActivity(intent);
            }
        });

    }
}
