package com.example.xxx.vestel_iot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShoppingSettingsActivity extends AppCompatActivity {

    private Button mButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_settings);

        mButton3 = findViewById(R.id.button3);
    }

    public void getGroceryShopContent(View view){
        Intent intent = new Intent(ShoppingSettingsActivity.this, CustomList.class);
        startActivity(intent);
    }
}
