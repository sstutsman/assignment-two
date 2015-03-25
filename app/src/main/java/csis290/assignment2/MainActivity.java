package csis290.assignment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
    private EditText etFirst;
    private EditText etSecond;
    private EditText etThird;

    private TextView tvSolve;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFirst =(EditText)findViewById(R.id.et_first);
        etSecond=(EditText)findViewById(R.id.et_second);
        etThird = (EditText)findViewById(R.id.et_third);
        tvSolve = (TextView)findViewById(R.id.tv_solve);
        tvSolve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int operand1 = Integer.parseInt(etFirst.getText().toString());
                int operand2 = Integer.parseInt(etSecond.getText().toString());
                int operand3 = Integer.parseInt(etThird.getText().toString());

                int sum =( operand1 + operand2 + operand3);
                Intent moveToNewActivityIntent = new Intent(MainActivity.this, SecondaryActivity.class
                );
                moveToNewActivityIntent.putExtra("solution", sum);
                startActivity(moveToNewActivityIntent);

            }
        });

        
    }
}
