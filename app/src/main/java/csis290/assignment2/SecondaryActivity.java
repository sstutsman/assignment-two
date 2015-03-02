package csis290.assignment2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class SecondaryActivity extends Activity {

    TextView tvResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        tvResponse = (TextView) findViewById(R.id.tv_result);
        tvResponse.append(getIntent().getStringExtra("key"));
        tvResponse.append("+");
        tvResponse.append(getIntent().getStringExtra("key2"));
        tvResponse.append("+");
        tvResponse.append(getIntent().getStringExtra("key3"));
        tvResponse.append("=");
        double sum = 0;
        sum += Double.parseDouble(getIntent().getStringExtra("key"));
        sum += Double.parseDouble(getIntent().getStringExtra("key2"));
        sum += Double.parseDouble(getIntent().getStringExtra("key3"));
        tvResponse.append(String.valueOf(sum));
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
