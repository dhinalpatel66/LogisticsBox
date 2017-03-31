package com.example.admin.logisticbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;


public class Shipment_Contents extends AppCompatActivity {



    String ListItemsName[] = new String[]{
            "Document",
            "Product",
            "Furniture",
            "Move Home",
            "Neep expert Help"
    };

    Integer ImageName[] = {
            R.drawable.document,
            R.drawable.product1,
            R.drawable.furniture,
            R.drawable.movehome,
            R.drawable.ic_help_outline_black_24dp,

    };

    ListView listView;
    ListAdapter listAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shipment__contents);

        listView = (ListView) findViewById(R.id.unique_list);

        listAdapter = new ListAdapter(Shipment_Contents.this, ListItemsName, ImageName);
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        Intent intent = new Intent(Shipment_Contents.this, Documents.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(Shipment_Contents.this, Product.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(Shipment_Contents.this, Furniture.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(Shipment_Contents.this, Move_Home.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(Shipment_Contents.this, Help.class);
                        startActivity(intent4);
                        break;

                }





/*
                Toast.makeText(getApplicationContext(), ListItemsName[position], Toast.LENGTH_LONG).show();
*/
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
