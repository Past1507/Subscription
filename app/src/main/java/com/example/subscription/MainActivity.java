package com.example.subscription;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText inputUserEdText;
    EditText inputEmailEdText;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputUserEdText= (EditText)findViewById(R.id.inputUserText);
        inputEmailEdText= (EditText)findViewById(R.id.inputEmailText);
        resultText = (TextView)findViewById(R.id.resultText);
    }

    public void clickOnBtnOk (View btnOk) {

        String userName = inputUserEdText.getText().toString();
        String mailTitle = inputEmailEdText.getText().toString();
        resultText.setText(getString(R.string.ClickOnOk)+" "+userName+" "+getString(R.string.ClickOnOk2)+" "+mailTitle);
    }

    public void clickOnBtnClear (View btnOk) {
        inputUserEdText.setText("");
        inputEmailEdText.setText("");
        resultText.setText("");
    }
}