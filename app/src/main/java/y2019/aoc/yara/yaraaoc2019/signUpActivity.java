package y2019.aoc.yara.yaraaoc2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signUpActivity extends AppCompatActivity implements View.OnClickListener {
    //1. properties defenition
    EditText editTextEmail , editTextPassword ;
    Button buttonSignUp  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        //2. initialize properties
        editTextEmail = findViewById(R.id.editTextEmail) ;
        editTextPassword = findViewById(R.id.editTextPassword) ;
        buttonSignUp = findViewById(R.id.buttonSignUp);
        buttonSignUp.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        if(v == buttonSignUp){
            Intent i = new Intent(this , WelcomeActivity.class);
            startActivity(i);
        }
        return;

    }
}
