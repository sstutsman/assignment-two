package csis290.assignment2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;


public class SecondaryActivity extends ActionBarActivity {

    private TextView resultArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        resultArea = (TextView) findViewById(R.id.sumArea);
        int solution = getIntent().getIntExtra("solution", -1);
        resultArea.setText(" " + solution);

    }
}
