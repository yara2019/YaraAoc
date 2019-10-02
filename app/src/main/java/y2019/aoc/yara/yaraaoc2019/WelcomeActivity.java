package y2019.aoc.yara.yaraaoc2019;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {

    //componenets
    Button buttonNext;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        buttonNext = findViewById(R.id.buttonNext);
        buttonNext.setOnClickListener(this);


    }


    //presents the selected menu layout
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == R.id.more_info){

        }else if(item.getItemId() == R.id.log_out){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Are You Sure You Want To Exit");
            builder.setCancelable(true);
            builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent k = new Intent(WelcomeActivity.this , LogInActivity.class);
                    startActivity(k);
                }
            });
            builder.setNegativeButton("No" , null);
            AlertDialog dialog = builder.create();
            dialog.show();

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if (v == buttonNext){
            Intent i = new Intent(this , List.class);
            startActivity(i);
        }
    }
}
