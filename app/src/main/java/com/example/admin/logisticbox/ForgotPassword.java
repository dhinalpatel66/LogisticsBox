package com.example.admin.logisticbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ForgotPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        final EditText editText=(EditText) findViewById(R.id.et_password);
        editText.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                editText.setHint(null);

            }
        });
    }
}
