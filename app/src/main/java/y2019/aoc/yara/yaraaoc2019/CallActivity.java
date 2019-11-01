package y2019.aoc.yara.yaraaoc2019;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CallActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonCall , buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        buttonCall = findViewById(R.id.buttonCall);
        buttonCall.setOnClickListener(this);
        buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == buttonCall) {
            Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "0527564565"));
            startActivity(i);

        }
        if(v == buttonBack){
            Intent i = new Intent(this, ListActivity.class);
            startActivity(i);
        }
    }
    }

