package sg.edu.rp.c346.id20014198.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnPassInteger;
    Button btnPassChar;
    TextView tvDouble;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPassInteger = findViewById(R.id.buttonPassInteger);
        btnPassChar = findViewById(R.id.buttonPassChar);
        tvDouble = findViewById(R.id.textViewClick);
        btnPassInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("value",1);
                startActivity(i);
            }
        });

        btnPassChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ThirdActivity.class);
                i.putExtra("value", 'a');
                startActivity(i);
            }
        });

        tvDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, FourthActivity.class);
                i.putExtra("value", 99.99);
                startActivity(i);
            }
        });

    }
}