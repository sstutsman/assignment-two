package csis290.assignment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    EditText etFirstInt;
    EditText etSecondInt;
    EditText etThirdInt;

    TextView tvFindSum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstInt = (EditText) findViewById(R.id.et_firstInt);
        etSecondInt = (EditText) findViewById(R.id.et_secondInt);
        etThirdInt = (EditText) findViewById(R.id.et_thirdInt);

        tvFindSum = (TextView) findViewById(R.id.tv_findSum);

        tvFindSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstInt = Integer.parseInt(etFirstInt.getText().toString());
                int secondInt = Integer.parseInt(etSecondInt.getText().toString());
                int thirdInt = Integer.parseInt(etThirdInt.getText().toString());
                int sum = firstInt + secondInt + thirdInt;

                Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
                intent.putExtra("key", Integer.toString(sum));
                startActivity(intent);
            }
        });
    }
}
