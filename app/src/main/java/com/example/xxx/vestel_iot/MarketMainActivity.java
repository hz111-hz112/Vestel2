package com.example.xxx.vestel_iot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MarketMainActivity extends AppCompatActivity {

    private Button mButton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market_main);

        mButton1 = findViewById(R.id.button1);
    }
    public void getShoppingSettingsContent(View view){
        Intent intent = new Intent(MarketMainActivity.this, ShoppingSettingsActivity.class);
        startActivity(intent);
    }
}
