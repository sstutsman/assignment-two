package csis290.assignment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    EditText num1;
    EditText num2;
    EditText num3;
    int sum;
    TextView findSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        num3 = (EditText) findViewById(R.id.num3);

        findSum = (TextView) findViewById(R.id.findSum);

        findSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Finding the sum.", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
                intent.putExtra("num1", num1.getText().toString());
                intent.putExtra("num2", num2.getText().toString());
                intent.putExtra("num3", num3.getText().toString());
                startActivity(intent);

            }
        });

        
    }
}
