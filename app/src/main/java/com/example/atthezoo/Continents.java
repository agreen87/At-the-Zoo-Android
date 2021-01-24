package com.example.atthezoo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Continents extends AppCompatActivity {

    ListView listView;
    String[] continent = new String[]{"Australia", "Amazon", "Africa", "Asia"};;
    String continentName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continents);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        listView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, android.R.id.text1,  continent);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    continentName = "Australia";
                    Intent intent = new Intent(Continents.this, Animals.class);
                    intent.putExtra("name", continentName);
                    startActivity(intent);
                }

                if (position == 1) {
                    continentName = "Amazon";
                    Intent intent = new Intent(Continents.this, Animals.class);
                    intent.putExtra("name", continentName);
                    startActivity(intent);
                }

                if (position == 2) {
                    continentName = "Africa";
                    Intent intent = new Intent(Continents.this, Animals.class);
                    intent.putExtra("name", continentName);
                    startActivity(intent);
                }

                if (position == 3) {
                    continentName = "Asia";
                    Intent intent = new Intent(Continents.this, Animals.class);
                    intent.putExtra("name", continentName);
                    startActivity(intent);
                }

            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {

            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
