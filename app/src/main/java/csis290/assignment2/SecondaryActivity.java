package csis290.assignment2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class SecondaryActivity extends ActionBarActivity {

    TextView lbl_sum_text;
    TextView lbl_sum_int;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        lbl_sum_text = (TextView) findViewById(R.id.lbl_sum_text);
        lbl_sum_int = (TextView) findViewById(R.id.lbl_sum_int);
        lbl_sum_int.setText(getIntent().getStringExtra("key"));

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
