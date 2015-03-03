package csis290.assignment2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class SecondaryActivity extends ActionBarActivity {

    TextView textSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        int sum;

        sum = Integer.parseInt( getIntent().getStringExtra("operand1") );
        sum = sum + Integer.parseInt( getIntent().getStringExtra("operand2") );
        sum = sum + Integer.parseInt( getIntent().getStringExtra("operand3") );

        textSum = (TextView) findViewById(R.id.sum);

        textSum.setText(Integer.toString(sum));

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
