package com.tech.gigabyte.loginscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class LoginActivity extends AppCompatActivity {

    //private EditText email;      Defined for validation purpose
    //private EditText password;
    //private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Method for an Activity OnCreate *default
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setContentView(R.layout.relative_layout);        // Passing Layout

      /* Note
        Extra Stuff Trying to make validation part

        email = (EditText) findViewById(R.id.edt);

        password = (EditText) findViewById(R.id.edt1);
        login = (Button) findViewById(R.id.btn);


        View.OnClickListener listener = (view)
                login.setOnClickListener(listener);

       login.setOnClickListener(
                (view) {
                        String enteredemail = email.getText().toString();
        String enteredpassword = password.getText().toString();

        if (enteredemail != null && !enteredemail.equals(""));
        //Valid username
        if (enteredpassword != null && !enteredpassword.equals(""))
                }

        )*/
    }
}
