package com.example.subscription;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    EditText textUser;
    EditText textMail;

    public void clickOnBtnOk (View btnOk) {
        textUser = (EditText)findViewById(R.id.user);
        String userName = textUser.getText().toString();
        textMail = (EditText)findViewById(R.id.mail);
        String mailTitle = textMail.getText().toString();
        Toast.makeText(this, getString(R.string.ClickOnOk)+" "+userName+" "+getString(R.string.ClickOnOk2)+" "+mailTitle, Toast.LENGTH_LONG).show();
    }

    public void clickOnBtnClear (View btnOk) {
        textUser = (EditText)findViewById(R.id.user);
        textUser.setText(null);
        textMail = (EditText)findViewById(R.id.mail);
        textMail.setText(null);
    }
}