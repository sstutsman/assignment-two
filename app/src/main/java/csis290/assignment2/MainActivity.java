package csis290.assignment2;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaDescription;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    EditText number_one;
    EditText number_two;
    EditText number_three;
    TextView txt_find_sum;

    String num_one_string;
    String num_two_string;
    String num_three_string;

    Integer one = 0;
    Integer two = 0;
    Integer three = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number_one = (EditText) findViewById(R.id.number_one);
        number_two = (EditText) findViewById(R.id.number_two);
        number_three = (EditText) findViewById(R.id.number_three);
        txt_find_sum = (TextView) findViewById(R.id.txt_find_sum);

        txt_find_sum.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                num_one_string = number_one.getText().toString();
                num_two_string = number_two.getText().toString();
                num_three_string = number_three.getText().toString();

                try {
                    one = Integer.parseInt(num_one_string);
                } catch (NumberFormatException e) {
                    one = 0;
                }

                try {
                    two = Integer.parseInt(num_two_string);
                } catch (NumberFormatException e) {
                    two = 0;
                }

                try {
                    three = Integer.parseInt(num_three_string);
                } catch (NumberFormatException e) {
                    three = 0;
                }

                Integer sum = one + two + three;

                Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
                intent.putExtra("key", sum.toString());
                startActivity(intent);
            }
        });
    }
}
