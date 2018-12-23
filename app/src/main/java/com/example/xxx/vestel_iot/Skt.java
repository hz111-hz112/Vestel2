package com.example.xxx.vestel_iot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Skt extends AppCompatActivity {

    ListView liste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skt);

        liste = (ListView)findViewById(R.id.listView);

        final String[] veriler = {"Peynir: 18 gün", "Zeytin: 1 gün", "Domates: 17 gün" , "Salam: Son kullanma tarihi geçmiştir." , "Krem Peynir: 66 gün", "Sucuk: 22 gün" , "Elma: 14 gün", "Portakal: 8 gün"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,android.R.id.text1,veriler);


        liste.setAdapter(adapter);
        liste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Skt.this,"Ürün alınmak için sipariş verildi.",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
