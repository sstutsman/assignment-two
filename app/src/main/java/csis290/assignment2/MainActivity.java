package csis290.assignment2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends Activity {

    int number1;
    int number2;
    int number3;

    private EditText num1;
    private EditText num2;
    private EditText num3;
    private TextView findSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1Area);
        num2 = (EditText) findViewById(R.id.num2Area);
        num3 = (EditText) findViewById(R.id.num3Area);

        findSum = (TextView) findViewById(R.id.findSumButton);


        findSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                number1 = Integer.parseInt(num1.getText().toString());
                number2 = Integer.parseInt(num2.getText().toString());
                number3 = Integer.parseInt(num3.getText().toString());

                int sum = number1 + number2 + number3;

                Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
                intent.putExtra("solution", sum);
                startActivity(intent);
            }
    });

    }
}
