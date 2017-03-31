package com.example.admin.logisticbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Furniture_details extends AppCompatActivity {

    private Spinner spinner_fd_packagingpaper;
    private Spinner spinner_fd_bubblewrap;
    private Spinner spinner_fd_thermocol;
    private Spinner spinner_fd_plasticwrap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_furniture_details);


        spinner_fd_packagingpaper = (Spinner) findViewById(R.id.fd_spinner_pp);
        ArrayAdapter<CharSequence> adapter7 = ArrayAdapter.createFromResource(this, R.array.select_Packaging_Paper, android.R.layout.simple_spinner_item);
        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_fd_packagingpaper.setAdapter(adapter7);

        spinner_fd_bubblewrap = (Spinner) findViewById(R.id.fd_spinner_bw);
        ArrayAdapter<CharSequence> adapter8 = ArrayAdapter.createFromResource(this, R.array.select_Bubble_Wrap, android.R.layout.simple_spinner_item);
        adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_fd_bubblewrap.setAdapter(adapter8);

        spinner_fd_thermocol = (Spinner) findViewById(R.id.fd_spinner_ts);
        ArrayAdapter<CharSequence> adapter9 = ArrayAdapter.createFromResource(this, R.array.select_Thermocol_Sheet, android.R.layout.simple_spinner_item);
        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_fd_thermocol.setAdapter(adapter9);

        spinner_fd_plasticwrap = (Spinner) findViewById(R.id.fd_spinner_pw);
        ArrayAdapter<CharSequence> adapter10 = ArrayAdapter.createFromResource(this, R.array.select_Plastic_Wrap, android.R.layout.simple_spinner_item);
        adapter10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_fd_plasticwrap.setAdapter(adapter10);

        Button bt1=(Button) findViewById(R.id.fd_button_next);
        bt1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(Furniture_details.this,Pick_up_address.class);
                startActivity(i);

            }
        });
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
    }



