package csis290.assignment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    EditText etInt1;
    EditText etInt2;
    EditText etInt3;
    TextView tvInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etInt1 = (EditText) findViewById(R.id.et_int1);
        etInt2 = (EditText) findViewById(R.id.et_int2);
        etInt3 = (EditText) findViewById(R.id.et_int3);

        tvInput = (TextView) findViewById(R.id.tv_input);



        tvInput.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int num1 = Integer.parseInt(etInt1.getText().toString());
                int num2 = Integer.parseInt(etInt2.getText().toString());
                int num3 = Integer.parseInt(etInt3.getText().toString());
                int sum  = num1+num2+num3;
                Toast.makeText(MainActivity.this, "What is a toast?", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
                intent.putExtra("key", String.valueOf(sum));
                startActivity(intent);
            }
        });
    }
}
