package y2019.aoc.yara.yaraaoc2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChickenActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonBack , buttonContinue ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken);
        buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == buttonBack){
            Intent i = new Intent(this, ListActivity.class);
            startActivity(i);
        }

    }
}
