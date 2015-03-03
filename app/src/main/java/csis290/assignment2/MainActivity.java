package csis290.assignment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    EditText operand1;
    EditText operand2;
    EditText operand3;
    TextView interaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        interaction = (TextView) findViewById(R.id.Interact);

        operand1 = (EditText) findViewById(R.id.operand1);
        operand2 = (EditText) findViewById(R.id.operand2);
        operand3 = (EditText) findViewById(R.id.operand3);

        interaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
                intent.putExtra( "operand1",  operand1.getText().toString() );
                intent.putExtra( "operand2", operand2.getText().toString() );
                intent.putExtra( "operand3", operand3.getText().toString() );

                startActivity(intent);
            }
        }); //*/
        
    }
}
