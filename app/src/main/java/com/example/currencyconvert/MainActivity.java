package com.example.currencyconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {

        EditText myTextField = (EditText) findViewById(R.id.myTextField);

        int dollars = Integer.parseInt(myTextField.getText().toString());
        double pound = 0.77;

        double res = dollars * pound ;

        goToActivity2(res);

    }

    public void goToActivity2(double s) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}