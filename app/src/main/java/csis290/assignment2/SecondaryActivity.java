package csis290.assignment2;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class SecondaryActivity extends Activity {

    TextView sumOfNumbers;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        int num1 = Integer.parseInt(getIntent().getStringExtra("num1"));
        int num2 = Integer.parseInt(getIntent().getStringExtra("num2"));
        int num3 = Integer.parseInt(getIntent().getStringExtra("num3"));

        int sum = num1 + num2 + num3;
        String strSum = Integer.toString(sum);

        sumOfNumbers = (TextView) findViewById(R.id.sumOfNumbers);
        sumOfNumbers.setText(strSum);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_secondary, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
