package csis290.assignment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    EditText num1;
    EditText num2;
    EditText num3;
    TextView findThatSumTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.EditText1);
        num2 = (EditText) findViewById(R.id.EditText2);
        num3 = (EditText) findViewById(R.id.EditText3);

        findThatSumTextView = (TextView) findViewById(R.id.TextViewfindSum);

        findThatSumTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // replace activity
                Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
                intent.putExtra("num1", Double.parseDouble(num1.getText().toString()));
                intent.putExtra("num2", Double.parseDouble(num2.getText().toString()));
                intent.putExtra("num3", Double.parseDouble(num3.getText().toString()));
                startActivity(intent);
            }
        });
    }
}
