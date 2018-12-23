package com.example.xxx.vestel_iot;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class DavlActivity extends AppCompatActivity {

    TextView textViewPercent;
    CheckBox checkBox1, checkBox2, checkBox3;
    SeekBar seekBar1, seekBar2, seekBar3;
    int progress;
    Switch aSwitch;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_davl);

        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);

        seekBar1 =findViewById(R.id.seekBar1);
        seekBar2  = findViewById(R.id.seekBar3);
        seekBar3 = findViewById(R.id.seekBar2);
        aSwitch = findViewById(R.id.switch1);






        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox1.isChecked()) {

                    Toast.makeText(DavlActivity.this,"Duman kontrolü modu aktif.Gücünü ayarlayın.",Toast.LENGTH_SHORT).show();
                    seekBar1.setVisibility(View.VISIBLE);
                    seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                        @Override
                        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                        }

                        @Override
                        public void onStartTrackingTouch(SeekBar seekBar) {

                        }

                        @Override
                        public void onStopTrackingTouch(SeekBar seekBar) {

                        }
                    });

                } else {
                    seekBar1.setVisibility(View.INVISIBLE);
                    Toast.makeText(DavlActivity.this,"Duman kontrolü modu aktif değil.",Toast.LENGTH_SHORT).show();
                }
            }
        });


        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox2.isChecked()) {
                        Toast.makeText(DavlActivity.this,"Hava kirliliği modu aktif. Gücünü ayarlayın.",Toast.LENGTH_SHORT).show();
                        seekBar3.setVisibility(View.VISIBLE);
                        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                            @Override
                            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                            }

                            @Override
                            public void onStartTrackingTouch(SeekBar seekBar) {

                            }

                            @Override
                            public void onStopTrackingTouch(SeekBar seekBar) {

                            }
                        });
                } else {

                    seekBar3.setVisibility(View.INVISIBLE);
                    Toast.makeText(DavlActivity.this,"Hava kirliliği modu aktif değil.",Toast.LENGTH_SHORT).show();

                }
            }
        });

        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox3.isChecked()) {
                    Toast.makeText(DavlActivity.this,"Ortam sıcaklık ve nem ölçüsü modu aktif.Gücünü ayarlayın.",Toast.LENGTH_SHORT).show();
                    seekBar2.setVisibility(View.VISIBLE);
                    seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                        @Override
                        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                        }

                        @Override
                        public void onStartTrackingTouch(SeekBar seekBar) {

                        }

                        @Override
                        public void onStopTrackingTouch(SeekBar seekBar) {

                        }
                    });
                } else {
                        seekBar2.setVisibility(View.INVISIBLE);
                        Toast.makeText(DavlActivity.this,"Ortam sıcaklık ve nem ölçüsü modu aktif değil.",Toast.LENGTH_SHORT).show();

                }
            }
        });


    }
}
