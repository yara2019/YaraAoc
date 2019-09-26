package y2019.aoc.yara.yaraaoc2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogInActivity extends AppCompatActivity implements View.OnClickListener {

    //1. properties defenition
    EditText editTextEmail , editTextPassword ;
    Button buttonLogIn , buttonSignUp ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        //2. initialize properties
        editTextEmail = findViewById(R.id.editTextEmail) ;
        editTextPassword = findViewById(R.id.editTextPassword) ;

        buttonLogIn = findViewById(R.id.buttonLogIn);
        buttonLogIn.setOnClickListener(this);
        buttonSignUp = findViewById(R.id.buttonSignUp) ;
        buttonSignUp.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v == buttonLogIn){
            if(editTextPassword.getText().toString().equals("") || editTextEmail.getText().toString().equals(""))
            {
                Toast.makeText(this , "Empty Password or Email", Toast.LENGTH_LONG).show();
            }
            else{
                Intent i = new Intent(this , WelcomeActivity.class);
                i.putExtra( "email", editTextEmail.getText().toString());
                i.putExtra("password", editTextPassword.getText().toString());
                startActivity(i);

            }


        }else{
            Intent i = new Intent(this , signUpActivity.class);
            startActivity(i);

        }


    }

}
