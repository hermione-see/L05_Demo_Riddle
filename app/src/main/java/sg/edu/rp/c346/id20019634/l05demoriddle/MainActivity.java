package sg.edu.rp.c346.id20019634.l05demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvQn1;
    Button btnRevealQ1, btnRevealQ2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvQn1 = findViewById(R.id.textViewQ1);
        btnRevealQ1 = findViewById(R.id.buttonRevealQ1);
        btnRevealQ2 = findViewById(R.id.buttonRevealQ2);

        btnRevealQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AdditionalActivity.class);
                intent.putExtra("Question 1", "Q1");
                startActivity(intent);

            }
        });

        btnRevealQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AdditionalActivity.class);
                intent.putExtra("Question 2", "Q2");
                startActivity(intent);
            }
        });

//        Intent intent = new Intent (this, MainGame.class);
//        EditText player1 = (EditText) findViewById(R.id.player1);
//        String player1Name= player1.getText().toString();
//        intent.putExtra("player1Name", player1Name);
//        EditText player2 = (EditText) findViewById(R.id.player2);
//        String player2Name= player2.getText().toString();
//        intent2.putExtra("player2Name", player2Name);
//        startActivity(intent);

    }
}