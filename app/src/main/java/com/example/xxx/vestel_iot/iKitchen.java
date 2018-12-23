package com.example.xxx.vestel_iot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class iKitchen extends AppCompatActivity {

    GridLayout mainGrid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_kitchen);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        setSingleEvent(mainGrid);


    }


    private void setSingleEvent(GridLayout mainGrid) {

        for (int i = 0; i < mainGrid.getChildCount(); i++) {

            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int a = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (a == 5) {
                        Intent intnt = new Intent(iKitchen.this, CoffeeCategoryActivity.class);
                        startActivity(intnt);
                    } else if (a == 2) {
                        Intent intnt = new Intent(iKitchen.this, OcakGridActivity.class);
                        startActivity(intnt);
                    } else if (a == 3) {
                        Intent intnt = new Intent(iKitchen.this, BuzDolabi.class);
                        startActivity(intnt);
                    } else if (a == 4) {
                        Intent intnt = new Intent(iKitchen.this, MarketMainActivity.class);
                        startActivity(intnt);
                    } else if (a == 0){
                        Intent intnt = new Intent(iKitchen.this,DavlActivity.class);
                        startActivity(intnt);
                    }else if(a==1){
                        Intent intnt = new Intent(iKitchen.this,OvenActivity.class);
                        startActivity(intnt);
                    }


                }
            });

        }
    }


}
