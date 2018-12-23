package com.example.xxx.vestel_iot;

import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class OcakGridActivity extends AppCompatActivity {

    private ImageButton mButton1;
    private ImageButton mButton2;
    private ImageButton mButton3;
    private ImageButton mButton4;
    Button mButton6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocak_grid);

        mButton1 = findViewById(R.id.button1);
        mButton2 = findViewById(R.id.button2);
        mButton3 = findViewById(R.id.button3);
        mButton4 = findViewById(R.id.button4);
        mButton6 = findViewById(R.id.button6);
        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OcakGridActivity.this,"Allowed Auto",Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void getContentButton(View view){
        Intent intent = new Intent(OcakGridActivity.this, OcakInsideActivity.class);
        startActivity(intent);
    }

}
