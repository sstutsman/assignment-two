package csis290.assignment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView calcBtn;
        calcBtn = (TextView) findViewById(R.id.calculate_button);
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText e1 = (EditText) findViewById(R.id.num1);
                EditText e2 = (EditText) findViewById(R.id.num2);
                EditText e3 = (EditText) findViewById(R.id.num3);
               // int n1 = 0;
               // int n2 = 0;
               // int n3 = 0;

                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                String s3 = e3.getText().toString();
                if(s1.length() == 0 || s2.length() == 0 || s3.length() == 0) {
                    if (s1.length() == 0)
                        e1.setError("Please Enter a Number");
                    if (s2.length() == 0)
                        e2.setError("Please Enter a Number");
                    if (s3.length() == 0)
                        e3.setError("Please Enter a Number");
                }
                else
                {
                    int n1 = Integer.parseInt(s1);
                    int n2 = Integer.parseInt(s2);
                    int n3 = Integer.parseInt(s3);
                    int sum = (n1 + n2 + n3);
                    int ave = (sum/3);
                    String str_sum = Integer.toString(sum);
                    String str_ave = Integer.toString(ave);

                    Intent intent = new Intent(v.getContext(), SecondaryActivity.class);
                    intent.putExtra("sum", str_sum);
                    intent.putExtra("ave", str_ave);
                    startActivityForResult(intent, 0);
                }
            }

        });
        
    }
}
