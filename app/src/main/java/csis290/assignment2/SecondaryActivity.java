package csis290.assignment2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class SecondaryActivity extends ActionBarActivity {

    TextView sumOfNumbers;
    int num1 = getIntent().getIntExtra("num1",0);
    int num2 = getIntent().getIntExtra("num2",0);
    int num3 = getIntent().getIntExtra("num3",0);




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        int sum = num1 + num2 + num3;
        String sumStr = new String(Integer.toString(sum));

        sumOfNumbers = (TextView) findViewById(R.id.sumOfNumbers);
        sumOfNumbers.setText(sumStr);
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
