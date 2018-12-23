package com.example.xxx.vestel_iot;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CoffeeCategoryActivity extends ListActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listCoffees = getListView();
        ArrayAdapter<Coffee> listAdapter = new ArrayAdapter<Coffee>(
                this,
                android.R.layout.simple_list_item_1,
                Coffee.coffees);

        listCoffees.setAdapter(listAdapter);
    }

    public void onListItemClick(ListView listView,
                                View itemView,
                                int position,
                                long id) {
        Intent intent =  new Intent(CoffeeCategoryActivity.this, CoffeeActivity.class);
        intent.putExtra(CoffeeActivity.EXTRA_COFFEENO, (int) id);
        startActivity(intent);
    }




}