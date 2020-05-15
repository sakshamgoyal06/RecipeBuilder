package com.example.recipebuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class addrecipe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addrecipe);
    }

    public void addIngredientsClicked(View view){
        Intent adding = new Intent (addrecipe.this,addIngredients.class);
        startActivity(adding);
    }
    public void addStepsClicked(View view){
        Intent adding = new Intent (addrecipe.this,addSteps.class);
        startActivity(adding);
    }
}
