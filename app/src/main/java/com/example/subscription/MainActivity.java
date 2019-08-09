package com.example.subscription;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    EditText textUser;
    EditText textMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textUser= (EditText)findViewById(R.id.user);
        textMail= (EditText)findViewById(R.id.mail);
    }

    public void clickOnBtnOk (View btnOk) {

        String userName = textUser.getText().toString();

        String mailTitle = textMail.getText().toString();
        Toast.makeText(this, getString(R.string.ClickOnOk)+" "+userName+" "+getString(R.string.ClickOnOk2)+" "+mailTitle, Toast.LENGTH_LONG).show();
    }

    public void clickOnBtnClear (View btnOk) {

        textUser.setText(null);

        textMail.setText(null);
    }
}