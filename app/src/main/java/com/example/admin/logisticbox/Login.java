package com.example.admin.logisticbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText emailId=(EditText)findViewById(R.id.login_etbx_username);
        final EditText passWord=(EditText)findViewById(R.id.login_etbx_password);


        TextView textView=(TextView)findViewById(R.id.login_txbx_signup);
        textView.setOnClickListener(new View.OnClickListener() {

                                  public void onClick(View v) {
                                      Intent i = new Intent(Login.this,Signup.class);
                                      startActivity(i);

                                  }
                              });
        TextView textView1=(TextView)findViewById(R.id.login_txbx_fp);
        textView1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(Login.this,ForgotPassword.class);
                startActivity(i);

            }
        });


        final Button btlogin=(Button) findViewById(R.id.login_btn_login);
        btlogin.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String stremail = emailId.getText().toString();
                String strpwd = passWord.getText().toString();
                if (stremail.isEmpty())

                {
                    Toast.makeText(Login.this, "Email cannot be empty!", Toast.LENGTH_SHORT).show();

                } else if (strpwd.isEmpty())

                {
                    Toast.makeText(Login.this, "Password cannot be empty", Toast.LENGTH_SHORT).show();

                } else

                {
                    Toast.makeText(Login.this, "Unauthorized user", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Login.this, homepage.class);
                    startActivity(intent);
                }
            }
        });


    }
}
