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

        etFirst = (EditText) findViewById(R.id.et_first);
        etSecond = (EditText) findViewById(R.id.et_second);
        etThird = (EditText) findViewById(R.id.et_third);

        tvSolve = (TextView) findViewById(R.id.tv_solve);

        tvSolve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int operandOne = Integer.parseInt(etFirst.getText().toString());
                int operandTwo = Integer.parseInt(etSecond.getText().toString());
                int operandThree = Integer.parseInt(etThird.getText().toString());

                int sum = (operandOne + operandTwo + operandThree);

                Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
                intent.putExtra("solution", sum);
                startActivity(intent);

            }

        });


    }
}
