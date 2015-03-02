package csis290.assignment2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class SecondaryActivity extends ActionBarActivity {

    TextView tvSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        tvSum = (TextView) findViewById(R.id.tv_sum);

        tvSum.setText(getIntent().getStringExtra("sum"));
    }//end method onCreate


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_secondary, menu);
        return true;
    }//end method onCreateOptionsMenu

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }//end if

        return super.onOptionsItemSelected(item);
    }//end method onOptionsItemSelected
}//end class SecondaryActivity
