package com.example.xxx.vestel_iot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CoffeeActivity extends AppCompatActivity {

    public static final String EXTRA_COFFEENO = "coffeeNo";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);

        // Get the drink from the intent
        int coffeeNo = (Integer) getIntent().getExtras().get(EXTRA_COFFEENO);
        Coffee coffee = Coffee.coffees[coffeeNo];

        // Populate the drink image
        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(coffee.getImageResourceId());
        photo.setContentDescription(coffee.getName());

        // Populate the drink name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(coffee.getName());

        // Populate the drink description
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(coffee.getDescription());

    }

    public void makeCoffeeDetailButton(View view){
            String message = "Your coffee will be ready!";
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }

    }

