package com.example.xxx.vestel_iot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class OvenActivity extends AppCompatActivity {

    private ImageView mOvenImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oven);

        mOvenImageView = (ImageView) findViewById(R.id.ovenImageView);
        mOvenImageView.setImageResource(R.drawable.oven);

    }

    public void calistir(View view){
        Toast.makeText(this,"Çalışmaya Başladı!",Toast.LENGTH_SHORT).show();
    }


}
