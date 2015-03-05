package csis290.assignment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    EditText one;
    EditText two;
    EditText three;
    TextView makeASum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = (EditText) findViewById(R.id.et_one);
        two = (EditText) findViewById(R.id.et_two);
        three = (EditText) findViewById(R.id.et_three);
        makeASum = (TextView) findViewById(R.id.makeASum);

        makeASum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
                String num1 = one.getText().toString();
                String num2 = two.getText().toString();
                String num3 = three.getText().toString();
                int numb1 = Integer.parseInt(num1);
                int numb2 = Integer.parseInt(num2);
                int numb3 = Integer.parseInt(num3);
                int sum = numb1 + numb2 + numb3;
                String sum2 = Integer.toString(sum);
                intent.putExtra("key", sum2);
                startActivity(intent);
            }
        });


    }
}
