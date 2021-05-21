package sg.edu.rp.c346.id20019634.l05demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AdditionalActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additional);

        tvAnswer = findViewById(R.id.tvAnswer);
//      tvAnswer.setText("In Answer Activity 1");

        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question 1");

        if (questionsSelected != null) {
            tvAnswer.setText(questionsSelected + " answer is: Queue");

        } else {
            questionsSelected = intentReceived.getStringExtra("Question 2");
            tvAnswer.setText(questionsSelected + " answer is: Gone");
        }


    }
}