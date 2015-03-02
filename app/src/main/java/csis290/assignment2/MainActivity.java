package csis290.assignment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    public final static String EXTRA_MESSAGE = "csis290.assignment2.MESSAGE";

    final EditText num1 = (EditText) findViewById(R.id.Text1);
    final EditText num2 = (EditText) findViewById(R.id.Text2);
    final EditText num3 = (EditText) findViewById(R.id.Text3);
    final TextView findSum = (TextView) findViewById(R.id.findSum);

    private Float sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum += Float.parseFloat(num1.getText().toString());
                sum += Float.parseFloat(num2.getText().toString());
                sum += Float.parseFloat(num3.getText().toString());

                Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
                String message = sum.toString();
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            }
        });
    }
}
