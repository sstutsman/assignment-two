package csis290.assignment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    private EditText etNum1;
    private EditText etNum2;
    private EditText etNum3;

    private TextView tvButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etNum1 = (EditText) findViewById(R.id.et_num1);
        etNum2 = (EditText) findViewById(R.id.et_num2);
        etNum3 = (EditText) findViewById(R.id.et_num3);

        tvButton = (TextView) findViewById(R.id.tv_button);

        tvButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int num1 = Integer.parseInt(etNum1.getText().toString());
                    int num2 = Integer.parseInt(etNum2.getText().toString());
                    int num3 = Integer.parseInt(etNum3.getText().toString());

                    int sum = num1 + num2 + num3;

                    Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
                    intent.putExtra("sum", Integer.toString(sum));

                    startActivity(intent);
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Enter numbers not letters", Toast.LENGTH_LONG).show();
                }//end catch
            }//end inner method onClick
        });//end tvButton.setOnClickListener
        
    }//end method onCreate
}//end class MainActivity
