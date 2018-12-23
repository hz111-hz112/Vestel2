package com.example.xxx.vestel_iot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GroceryActivity extends AppCompatActivity {

    private Button peynir;
    private Button ekmek;
    private Button makarna;
    private Button sut;
    private Button yumurta;
    private Button muz;
    private Button biskuvi;
    private Button su;
    private Button yogurt;
    private int peynirSiparis = 0;
    private int ekmekS = 0;
    private int makarnaS = 0;
    private int sutS = 0;
    private int yumurtaS = 0;
    private int muzS = 0;
    private int biskuviS = 0;
    private int suS = 0;
    private int yogurtS = 0;
    private TextView peynirTV;
    private TextView ekmekTV;
    private TextView makarnaTV;
    private TextView sutTV;
    private TextView yumurtaTV;
    private TextView muzTV;
    private TextView biskuviTV;
    private TextView suTV;
    private TextView yogurtTV;

    private Button siparisVer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocery);

        peynirTV = findViewById(R.id.peynirTV);
        peynir = findViewById(R.id.peynir);
        peynir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                peynirSiparis++;
                peynirTV.setText("Peynir: " + peynirSiparis);
            }
        });

        ekmekTV = findViewById(R.id.ekmekTV);
        ekmek = findViewById(R.id.ekmek);
        ekmek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ekmekS++;
                ekmekTV.setText("Ekmek: " + ekmekS);
            }
        });

        makarnaTV = findViewById(R.id.makarnaTV);
        makarna = findViewById(R.id.makarna);
        makarna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makarnaS++;
                makarnaTV.setText("Makarna: " + makarnaS);
            }
        });

        sutTV = findViewById(R.id.sutTV);
        sut = findViewById(R.id.sut);
        sut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sutS++;
                sutTV.setText("Süt: " + sutS);
            }
        });

        yumurtaTV = findViewById(R.id.yumurtaTV);
        yumurta = findViewById(R.id.yumurta);
        yumurta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yumurtaS++;
                yumurtaTV.setText("Yumurta: " + yumurtaS);
            }
        });

        muzTV = findViewById(R.id.muzTV);
        muz = findViewById(R.id.muz);
        muz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                muzS++;
                muzTV.setText("Muz: " + muzS);
            }
        });

        biskuviTV = findViewById(R.id.biskuviTV);
        biskuvi = findViewById(R.id.biskuvi);
        biskuvi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                biskuviS++;
                biskuviTV.setText("Biskuvi: " + biskuviS);
            }
        });

        suTV = findViewById(R.id.suTV);
        su = findViewById(R.id.su);
        su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suS++;
                suTV.setText("Su: " + suS);
            }
        });

        yogurtTV = findViewById(R.id.yogurtTV);
        yogurt = findViewById(R.id.yogurt);
        yogurt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yogurtS++;
                yogurtTV.setText("Yogurt: " + yogurtS);
            }
        });

        siparisVer = findViewById(R.id.siparisVer);



    }

    public void siparis(View view){
        Toast.makeText(this, "Siparişiniz verildi.", Toast.LENGTH_SHORT).show();
    }
}