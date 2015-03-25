package csis290.assignment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView findSum = (TextView) findViewById(R.id.findSum);
        findSum.setOnClickListener(new View.OnClickListener() {
            EditText num1 = (EditText) findViewById(R.id.Text1);
            EditText num2 = (EditText) findViewById(R.id.Text2);
            EditText num3 = (EditText) findViewById(R.id.Text3);
            public void onClick(View v) {
                Double sum = 0.0;
                sum += Double.parseDouble(num1.getText().toString());
                sum += Double.parseDouble(num2.getText().toString());
                sum += Double.parseDouble(num3.getText().toString());
                Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
                String message = sum.toString();
                intent.putExtra("Answer", message);
                startActivity(intent);
            }
        });
    }
}
