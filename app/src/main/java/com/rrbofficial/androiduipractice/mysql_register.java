package com.rrbofficial.androiduipractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class mysql_register extends AppCompatActivity {
    EditText name, surname, age, username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mysql_register);
        name = (EditText) findViewById(R.id.et_name);
       surname = (EditText) findViewById(R.id.et_surname);
       age = (EditText) findViewById(R.id.et_age);
        username = (EditText) findViewById(R.id.et_username);
        password = (EditText) findViewById(R.id.et_password);

    }

    public void onReg(View view) {
        String str_name = name.getText().toString();
        String str_surname = surname.getText().toString();
        String str_age = age.getText().toString();
        String str_username =username.getText().toString();
        String str_password = password.getText().toString();

        String type = "register";

        // Instance of background worker class

        BackgrundWorker backgrundWorker = new BackgrundWorker(this);
        backgrundWorker.execute(type, str_name, str_surname, str_age, str_username, str_password);
    }
}