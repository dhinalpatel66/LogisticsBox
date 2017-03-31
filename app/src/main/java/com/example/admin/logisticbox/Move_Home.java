package com.example.admin.logisticbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Move_Home extends AppCompatActivity {

    private Spinner spinner_amount;
    private Spinner spinner_boxes;
    private Button next_button;
    private Button btn1_cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move__home);

        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

            next_button=(Button)findViewById(R.id.next_btn);
            btn1_cancel=(Button)findViewById(R.id.cancel_btn1);


            spinner_amount=(Spinner)findViewById(R.id.data_spinner_amount);
            ArrayAdapter<CharSequence> adapter5= ArrayAdapter.createFromResource(this,R.array.select_amount, android.R.layout.simple_spinner_item);
            adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner_amount.setAdapter(adapter5);

            spinner_boxes=(Spinner)findViewById(R.id.data_spinner_boxes);
            ArrayAdapter<CharSequence> adapter6= ArrayAdapter.createFromResource(this,R.array.select_boxes, android.R.layout.simple_spinner_item);
            adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner_boxes.setAdapter(adapter6);

            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(Move_Home.this,Home_Order_Activity.class);
                    startActivity(intent);

                }
            });
            btn1_cancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(Move_Home.this,homepage.class);
                    startActivity(intent);

                }
            });

        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
