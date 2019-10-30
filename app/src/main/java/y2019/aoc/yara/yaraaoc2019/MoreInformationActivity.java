package y2019.aoc.yara.yaraaoc2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MoreInformationActivity extends AppCompatActivity implements View.OnClickListener {
    Button backButton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_information);
        backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == backButton){
            Intent i = new Intent(this , WelcomeActivity.class);
            startActivity(i);
        }
    }
}
