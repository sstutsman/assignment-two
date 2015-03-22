package csis290.assignment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    EditText snum1;
    EditText snum2;
    EditText snum3;
    TextView sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        snum1 = (EditText) findViewById(R.id.snum_1);
        snum2 = (EditText) findViewById(R.id.snum_2);
        snum3 = (EditText) findViewById(R.id.snum_3);
        sum = (TextView) findViewById(R.id._sum);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Calculating...", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
                intent.putExtra("key1" , snum1.getText().toString());
                intent.putExtra("key2" , snum2.getText().toString());
                intent.putExtra("key3" , snum3.getText().toString());
                startActivity(intent);

            }
        });
        
    }
}
