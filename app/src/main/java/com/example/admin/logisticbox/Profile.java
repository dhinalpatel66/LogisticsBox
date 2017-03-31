package com.example.admin.logisticbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Button bt1=(Button) findViewById(R.id.profile_btn_fname);
        bt1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(Profile.this,Change_firstname.class);
                startActivity(i);

            }
        });

        Button bt2=(Button) findViewById(R.id.profile_btn_lname);
        bt2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(Profile.this,Change_lastname.class);
                startActivity(i);

            }
        });
        Button bt3=(Button) findViewById(R.id.profile_btn_contactnumber);
        bt3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(Profile.this,Change_contact_number.class);
                startActivity(i);

            }
        });
        Button bt4=(Button) findViewById(R.id.profile_btn_emailid);
        bt4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(Profile.this,Change_email.class);
                startActivity(i);

            }
        });
        Button bt5=(Button) findViewById(R.id.profile_btn_changepassword);
        bt5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(Profile.this,Change_password.class);
                startActivity(i);

            }
        });

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
    }

