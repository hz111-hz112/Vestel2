package com.example.xxx.vestel_iot;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class OcakInsideActivity extends AppCompatActivity {

    private Chronometer mChronometer;
    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private SeekBar mSeekBar;
    private boolean isChronometerStart;
    private boolean isShroudingStart;
    private TextView textViewPercent;
    private int a = 0;
    private int b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocak_inside);

        mSeekBar = findViewById(R.id.seekBar);
        textViewPercent = findViewById(R.id.textview1);
        mChronometer = findViewById(R.id.simpleChronometer);
        mButton1 = findViewById(R.id.button1);
        mButton2 = findViewById(R.id.button2);
        mButton3 = findViewById(R.id.button3);


        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textViewPercent.setText("Progress: "+progress + "/" + seekBar.getMax() + "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b==0){
                    Toast.makeText(OcakInsideActivity.this,"Started",Toast.LENGTH_SHORT).show();
                    b++;
                }else if(b==1){
                    Toast.makeText(OcakInsideActivity.this,"Stopped",Toast.LENGTH_SHORT).show();
                    b--;
                }

            }
        });




        isShroudingStart = false;
        mChronometer.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometerChanged) {
                mChronometer = chronometerChanged;
            }
        });
    }
    public void startStopChronometer(View view){

        if(a == 0){
            mChronometer.setCountDown(false);
            mChronometer.start();
            isChronometerStart = true;

            mSeekBar.setVisibility((View.VISIBLE));
            Toast.makeText(OcakInsideActivity.this, "Started",Toast.LENGTH_SHORT).show();
            a=1;

        }else if(a==1){

            mChronometer.setBase(SystemClock.elapsedRealtime());
            mChronometer.stop();
            isChronometerStart = false;

            mSeekBar.setVisibility(View.INVISIBLE);
            Toast.makeText(OcakInsideActivity.this, "Stopped", Toast.LENGTH_SHORT).show();
            a=0;
        }
    }

    public void setCountDownChronometer(View view){
        mChronometer.setCountDown(true);
        long dayInMilli = 60*60*24*1000;
        mChronometer.setBase(SystemClock.elapsedRealtime()+dayInMilli);
        if(isChronometerStart){
            mChronometer.stop();
            isChronometerStart = false;
            mButton1.setText("Start");
        }else{
            mChronometer.setBase(SystemClock.elapsedRealtime());
            mChronometer.start();
            isChronometerStart = true;
            mButton1.setText("Stop");
        }
    }





}
