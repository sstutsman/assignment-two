package csis290.assignment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    EditText et1Input;
    EditText et2Input;
    EditText et3Input;
    TextView tvReact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1Input = (EditText)findViewById(R.id.num_one);
        et2Input = (EditText)findViewById(R.id.num_two);
        et3Input = (EditText)findViewById(R.id.num_three);
        tvReact = (TextView)findViewById(R.id.sum_button);

        tvReact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Summing Numbers", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
                intent.putExtra("key", et1Input.getText().toString());
                intent.putExtra("key2", et2Input.getText().toString());
                intent.putExtra("key3", et3Input.getText().toString());
                startActivity(intent);
            }
        });


    }
}
