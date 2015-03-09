package csis290.assignment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    EditText first;
    EditText second;
    EditText third;
    int sum = 0;
    String SUM = "";
    TextView find;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = (EditText) findViewById(R.id.first);
        second = (EditText) findViewById(R.id.second);
        third = (EditText) findViewById(R.id.third);
        find =(TextView) findViewById(R.id.find);

        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum = Integer.parseInt(first.getText().toString()) + Integer.parseInt(second.getText().toString())
                      + Integer.parseInt(third.getText().toString());
                Intent intent = new Intent(MainActivity.this,SecondaryActivity.class);
                intent.putExtra(SUM,sum);
                startActivity(intent);
            }

        });
        
    }
}
