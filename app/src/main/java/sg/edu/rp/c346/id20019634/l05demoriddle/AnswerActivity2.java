package sg.edu.rp.c346.id20019634.l05demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {

    TextView tvAnswer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        tvAnswer2 = findViewById(R.id.textView);
//      tvAnswer.setText("In Answer Activity 2");

        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question 2");
        tvAnswer2.setText(questionsSelected + " answer is: Gone");
    }
}