package com.example.xxx.vestel_iot;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class BuzDolabi extends AppCompatActivity {

    FloatingActionButton fab, fab_miktar, fab_oneri, fab_skt, fab_yemek_verisi;
    boolean ackapa = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buz_dolabi);

        fab =  findViewById(R.id.fab);
        fab_miktar = findViewById(R.id.fab_miktar);
        fab_oneri =  findViewById(R.id.fab_oneri);
        fab_yemek_verisi =  findViewById(R.id.fab_yemek_verisi);
        fab_skt =  findViewById(R.id.fab_skt);

        fab_miktar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        fab_oneri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuzDolabi.this,Oneri.class);
                startActivity(intent);
            }
        });

        fab_yemek_verisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(BuzDolabi.this, MarketMainActivity.class);
                    startActivity(intent);
            }
        });

        fab_skt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuzDolabi.this,Skt.class);
                startActivity(intent);
            }
        });




        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ackapa==false){
                    Kapa();
                    ackapa=true;
                }else {

                    Ac();
                    ackapa=false;
                }


            }
        });


    }

    private void Ac(){
        fab_miktar.show();
        fab_oneri.show();
        fab_skt.show();
        fab_yemek_verisi.show();
    }

    private void Kapa(){
        fab_miktar.hide();
        fab_oneri.hide();
        fab_skt.hide();
        fab_yemek_verisi.hide();
    }

}