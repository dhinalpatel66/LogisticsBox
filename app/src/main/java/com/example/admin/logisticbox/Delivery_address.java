package com.example.admin.logisticbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Delivery_address extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_address);
        final EditText name=(EditText)findViewById(R.id.delivery_et_name);
        final EditText address=(EditText)findViewById(R.id.delivery_et_address);
        final EditText city=(EditText)findViewById(R.id.delivery_et_city);
        final EditText state=(EditText)findViewById(R.id.delivery_et_state);
        final EditText postcode=(EditText)findViewById(R.id.delivery_et_postcode);
        final EditText mobileno=(EditText)findViewById(R.id.delivery_et_mobilenumber);
        final EditText email=(EditText)findViewById(R.id.delivery_et_emailid);
        Button bt=(Button) findViewById(R.id.delivery_button_next);
        bt.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String Name = name.getText().toString();
                String Address = address.getText().toString();
                String City = city.getText().toString();
                String State = state.getText().toString();
                String Postcode = postcode.getText().toString();
                String Mobileno = mobileno.getText().toString();
                String Email = email.getText().toString();

                if (Name.isEmpty())

                {
                    Toast.makeText(Delivery_address.this, "Name cannot be empty!", Toast.LENGTH_SHORT).show();

                } else if (Address.isEmpty())

                {
                    Toast.makeText(Delivery_address.this, "Address cannot be empty", Toast.LENGTH_SHORT).show();

                }else if (City.isEmpty())

                {
                    Toast.makeText(Delivery_address.this, "City cannot be empty", Toast.LENGTH_SHORT).show();

                }else if (State.isEmpty())

                {
                    Toast.makeText(Delivery_address.this, "State cannot be empty", Toast.LENGTH_SHORT).show();

                }else if (Postcode.isEmpty())

                {
                    Toast.makeText(Delivery_address.this, "Postcode cannot be empty", Toast.LENGTH_SHORT).show();

                }else if (Mobileno.isEmpty())

                {
                    Toast.makeText(Delivery_address.this, "Mobileno. cannot be empty", Toast.LENGTH_SHORT).show();

                }else if (Email.isEmpty())

                {
                    Toast.makeText(Delivery_address.this, "Email cannot be empty", Toast.LENGTH_SHORT).show();

                }else
                {
                    Intent i = new Intent(Delivery_address.this, Cost.class);
                    startActivity(i);
                }
            }
        });

        if (getSupportActionBar()!=null){
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
