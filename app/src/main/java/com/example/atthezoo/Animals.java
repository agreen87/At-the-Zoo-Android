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

public class Animals extends AppCompatActivity {

    ListView listView;
    String continentName;
    String animalName;

    String[] animals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);

        Bundle bundle = getIntent().getExtras();
        continentName = bundle.getString("name");

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(continentName);

        listView = findViewById(R.id.listView);

        if (continentName.equals("Australia")) {
            animals = new String[]{"Emu", "Koala", "Kangaroo", "Ring-Tailed Lemur"};
        }

        if (continentName.equals("Amazon")) {
            animals = new String[]{"Jaguar", "Howler Monkey", "Orinoco Crocodile", "Giant River Otter"};
        }

        if (continentName.equals("Africa")) {
            animals = new String[]{"Black Rhino", "African Elephant", "Giraffe", "Zebra",
                    "Lowland Gorilla", "Chimpanzee", "African Lion"};
        }

        if (continentName.equals("Asia")) {
            animals = new String[]{"Asian Elephant", "Greater One-Horned Rhino", "Sloth Bear",
                    "Sumatran Tiger", "Clouded Leopard"};
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, android.R.id.text1, animals);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (continentName.equals("Australia")) {
                    if (position == 0) {
                        animalName = "Emu";
                        Intent intent = new Intent(Animals.this, AnimalFacts.class);
                        intent.putExtra("name", animalName);
                        startActivity(intent);
                    }

                    if (position == 1) {
                        animalName = "Koala";
                        Intent intent = new Intent(Animals.this, AnimalFacts.class);
                        intent.putExtra("name", animalName);
                        startActivity(intent);
                    }

                    if (position == 2) {
                        animalName = "Kangaroo";
                        Intent intent = new Intent(Animals.this, AnimalFacts.class);
                        intent.putExtra("name", animalName);
                        startActivity(intent);
                    }

                    if (position == 3) {
                        animalName = "Ring-Tailed Lemur";
                        Intent intent = new Intent(Animals.this, AnimalFacts.class);
                        intent.putExtra("name", animalName);
                        startActivity(intent);
                    }
                }

                if (continentName.equals("Amazon")) {
                    if (position == 0) {
                        animalName = "Jaguar";
                        Intent intent = new Intent(Animals.this, AnimalFacts.class);
                        intent.putExtra("name", animalName);
                        startActivity(intent);
                    }

                    if (position == 1) {
                        animalName = "Howler Monkey";
                        Intent intent = new Intent(Animals.this, AnimalFacts.class);
                        intent.putExtra("name", animalName);
                        startActivity(intent);
                    }

                    if (position == 2) {
                        animalName = "Orinoco Crocodile";
                        Intent intent = new Intent(Animals.this, AnimalFacts.class);
                        intent.putExtra("name", animalName);
                        startActivity(intent);
                    }

                    if (position == 3) {
                        animalName = "Giant River Otter";
                        Intent intent = new Intent(Animals.this, AnimalFacts.class);
                        intent.putExtra("name", animalName);
                        startActivity(intent);
                    }
                }

                if (continentName.equals("Africa")) {

                    if (position == 0) {
                        animalName = "Black Rhino";
                        Intent intent = new Intent(Animals.this, AnimalFacts.class);
                        intent.putExtra("name", animalName);
                        startActivity(intent);
                    }

                    if (position == 1) {
                        animalName = "African Elephant";
                        Intent intent = new Intent(Animals.this, AnimalFacts.class);
                        intent.putExtra("name", animalName);
                        startActivity(intent);
                    }

                    if (position == 2) {
                        animalName = "Giraffe";
                        Intent intent = new Intent(Animals.this, AnimalFacts.class);
                        intent.putExtra("name", animalName);
                        startActivity(intent);
                    }

                    if (position == 3) {
                        animalName = "Zebra";
                        Intent intent = new Intent(Animals.this, AnimalFacts.class);
                        intent.putExtra("name", animalName);
                        startActivity(intent);
                    }

                    if (position == 4) {
                        animalName = "Lowland Gorilla";
                        Intent intent = new Intent(Animals.this, AnimalFacts.class);
                        intent.putExtra("name", animalName);
                        startActivity(intent);
                    }

                    if (position == 5) {
                        animalName = "Chimpanzee";
                        Intent intent = new Intent(Animals.this, AnimalFacts.class);
                        intent.putExtra("name", animalName);
                        startActivity(intent);
                    }

                    if (position == 6) {
                        animalName = "African Lion";
                        Intent intent = new Intent(Animals.this, AnimalFacts.class);
                        intent.putExtra("name", animalName);
                        startActivity(intent);
                    }
                }

                if (continentName.equals("Asia")) {

                    if (position == 0) {
                        animalName = "Asian Elephant";
                        Intent intent = new Intent(Animals.this, AnimalFacts.class);
                        intent.putExtra("name", animalName);
                        startActivity(intent);
                    }

                    if (position == 1) {
                        animalName = "Greater One-Horned Rhino";
                        Intent intent = new Intent(Animals.this, AnimalFacts.class);
                        intent.putExtra("name", animalName);
                        startActivity(intent);
                    }

                    if (position == 2) {
                        animalName = "Sloth Bear";
                        Intent intent = new Intent(Animals.this, AnimalFacts.class);
                        intent.putExtra("name", animalName);
                        startActivity(intent);
                    }

                    if (position == 3) {
                        animalName = "Sumatran Tiger";
                        Intent intent = new Intent(Animals.this, AnimalFacts.class);
                        intent.putExtra("name", animalName);
                        startActivity(intent);
                    }

                    if (position == 4) {
                        animalName = "Clouded Leopard";
                        Intent intent = new Intent(Animals.this, AnimalFacts.class);
                        intent.putExtra("name", animalName);
                        startActivity(intent);
                    }
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
