package com.rrbofficial.androiduipractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class mysql_login extends AppCompatActivity {

    EditText UsernameEt, PasswordEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mysql_login);

        UsernameEt = (EditText) findViewById(R.id.etusername);
        PasswordEt = (EditText) findViewById(R.id.etpassword);


    }

    public void onLogin(View view) {
        String username = UsernameEt.getText().toString();
        String password = PasswordEt.getText().toString();
        String type = "login";

        // Instance of background worker class

        BackgrundWorker backgrundWorker = new BackgrundWorker(this);
        backgrundWorker.execute(type, username, password);

    }

    public void gotoRegisterScreen(View view) {
        startActivity(new Intent(this,mysql_register.class));

    }
}