package csis290.assignment2;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class SecondaryActivity extends Activity {
    private TextView tvSolution;



        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        tvSolution = (TextView) findViewById(R.id.tv_solution);
        int solution = getIntent().getIntExtra("solution", -1);
        tvSolution.setText("" + solution);
    }



}

