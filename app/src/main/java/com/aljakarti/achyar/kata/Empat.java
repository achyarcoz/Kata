package com.aljakarti.achyar.kata;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Empat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setBackgroundResource(android.R.color.holo_orange_dark);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(android.R.drawable.ic_menu_close_clear_cancel);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        final TextView text1 = (TextView)findViewById(R.id.text1);
        final TextView text2 = (TextView)findViewById(R.id.text2);
        final TextView text3 = (TextView)findViewById(R.id.text3);
        final TextView text4 = (TextView)findViewById(R.id.text4);
        final TextView text5 = (TextView)findViewById(R.id.text5);
        final TextView text6 = (TextView)findViewById(R.id.text6);
        final TextView text7 = (TextView)findViewById(R.id.text7);
        final TextView text8 = (TextView)findViewById(R.id.text8);

        ImageView imageAngka = (ImageView)findViewById(R.id.gambarAngka);
        imageAngka.setImageResource(R.drawable.empat);

        final LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT,
                1f);
        params.setMargins(2,0,2,0);

        text1.setText("E");
        text1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
        text1.setBackgroundResource(android.R.color.holo_blue_dark);
        text1.setLayoutParams(params);
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(Empat.this,R.raw.e);
                mp.start();
            }
        });

        text2.setText("M");
        text2.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
        text2.setBackgroundResource(android.R.color.holo_orange_light);
        text2.setLayoutParams(params);
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(Empat.this,R.raw.m);
                mp.start();
            }
        });

        text3.setText("P");
        text3.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
        text3.setBackgroundResource(android.R.color.holo_red_dark);
        text3.setLayoutParams(params);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(Empat.this,R.raw.p);
                mp.start();
            }
        });

        text4.setText("A");
        text4.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
        text4.setBackgroundResource(android.R.color.holo_blue_dark);
        text4.setLayoutParams(params);
        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(Empat.this,R.raw.a);
                mp.start();
            }
        });

        text5.setText("T");
        text5.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
        text5.setBackgroundResource(android.R.color.holo_blue_dark);
        text5.setLayoutParams(params);
        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(Empat.this,R.raw.t);
                mp.start();
            }
        });

        ImageView playNama = (ImageView)findViewById(R.id.playNama);
        playNama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
                setSupportActionBar(toolbar);
                getSupportActionBar().setTitle("EMPAT");

                MediaPlayer mp = MediaPlayer.create(Empat.this,R.raw.aempat);
                mp.start();

                params.setMargins(2,0,2,0);

                text1.setText("E");
                text1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
                text1.setBackgroundResource(android.R.color.holo_blue_dark);
                text1.setLayoutParams(params);
                text1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = MediaPlayer.create(Empat.this,R.raw.e);
                        mp.start();
                    }
                });

                text2.setText("M");
                text2.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
                text2.setBackgroundResource(android.R.color.holo_orange_light);
                text2.setLayoutParams(params);
                text2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = MediaPlayer.create(Empat.this,R.raw.m);
                        mp.start();
                    }
                });

                text3.setText("P");
                text3.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
                text3.setBackgroundResource(android.R.color.holo_red_dark);
                text3.setLayoutParams(params);
                text3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = MediaPlayer.create(Empat.this,R.raw.p);
                        mp.start();
                    }
                });

                text4.setText("A");
                text4.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
                text4.setBackgroundResource(android.R.color.holo_blue_dark);
                text4.setLayoutParams(params);
                text4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = MediaPlayer.create(Empat.this,R.raw.a);
                        mp.start();
                    }
                });

                text5.setVisibility(View.VISIBLE);
                text5.setText("T");
                text5.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
                text5.setBackgroundResource(android.R.color.holo_blue_dark);
                text5.setLayoutParams(params);
                text5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = MediaPlayer.create(Empat.this,R.raw.t);
                        mp.start();
                    }
                });


            }
        });

        ImageView playNamaE = (ImageView)findViewById(R.id.playNamaE);
        playNamaE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
                setSupportActionBar(toolbar);
                getSupportActionBar().setTitle("FOUR");

                MediaPlayer mp = MediaPlayer.create(Empat.this,R.raw.eempat);
                mp.start();

                params.setMargins(2,0,2,0);

                text1.setText("F");
                text1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
                text1.setBackgroundResource(android.R.color.holo_green_dark);
                text1.setLayoutParams(params);
                text1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = MediaPlayer.create(Empat.this,R.raw.ff);
                        mp.start();
                    }
                });

                text2.setText("O");
                text2.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
                text2.setBackgroundResource(android.R.color.holo_orange_light);
                text2.setLayoutParams(params);
                text2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = MediaPlayer.create(Empat.this,R.raw.oo);
                        mp.start();
                    }
                });

                text3.setText("U");
                text3.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
                text3.setBackgroundResource(android.R.color.holo_red_dark);
                text3.setLayoutParams(params);
                text3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = MediaPlayer.create(Empat.this,R.raw.uu);
                        mp.start();
                    }
                });

                text4.setText("R");
                text4.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
                text4.setBackgroundResource(android.R.color.holo_orange_light);
                text4.setLayoutParams(params);
                text4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = MediaPlayer.create(Empat.this, R.raw.rr);
                        mp.start();
                    }
                });

                text5.setVisibility(View.GONE);
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
