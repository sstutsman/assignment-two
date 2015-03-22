package csis290.assignment2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class SecondaryActivity extends ActionBarActivity {
    TextView t_Sum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        double sum = 0;

        t_Sum = (TextView) findViewById(R.id.tSum);
        t_Sum.append(getIntent().getStringExtra("key1"));
        t_Sum.append(" + ");
        t_Sum.append(getIntent().getStringExtra("key2"));
        t_Sum.append(" + ");
        t_Sum.append(getIntent().getStringExtra("key3"));
        t_Sum.append(" = ");
        sum += Double.parseDouble(getIntent().getStringExtra("key1"));
        sum += Double.parseDouble(getIntent().getStringExtra("key2"));
        sum += Double.parseDouble(getIntent().getStringExtra("key3"));
        t_Sum.append(String.valueOf(sum));


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
