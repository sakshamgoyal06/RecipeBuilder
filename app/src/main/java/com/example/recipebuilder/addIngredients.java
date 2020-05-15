package com.example.recipebuilder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class addIngredients extends AppCompatActivity {
    private RecyclerView ingredientList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_ingredients);
        ingredientList = findViewById(R.id.ingredient_list);
        ingredientList.setHasFixedSize(true);
        ingredientList.setLayoutManager(new LinearLayoutManager(this));

    }

}
