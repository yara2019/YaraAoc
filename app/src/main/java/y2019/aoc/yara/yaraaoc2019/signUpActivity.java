package y2019.aoc.yara.yaraaoc2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class signUpActivity extends AppCompatActivity {
    //1. properties defenition
    EditText editTextEmail , editTextPassword ;
    Button signUp ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        //2. initialize properties
        editTextEmail = findViewById(R.id.editTextEmail) ;
        editTextPassword = findViewById(R.id.editTextPassword) ;






    }
}
