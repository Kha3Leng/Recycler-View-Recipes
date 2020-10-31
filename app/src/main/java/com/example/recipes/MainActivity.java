package com.example.recipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Hashtable<String, String> recipes = new Hashtable<>();
    private RecyclerView recyclerView;
    private RecipeAdapter adapter;
    public Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);


        recipes.put(getString(R.string.Tofu), getString(R.string.tofu));
        recipes.put(getString(R.string.Cofu), getString(R.string.cofu));
        recipes.put(getString(R.string.Dofu), getString(R.string.dofu));
        recipes.put(getString(R.string.Eofu), getString(R.string.eofu));

        recyclerView = findViewById(R.id.recyclerView);
        adapter = new RecipeAdapter(this, recipes);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}