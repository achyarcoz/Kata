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

public class Dua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setBackgroundResource(android.R.color.holo_green_light);
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
        imageAngka.setImageResource(R.drawable.dua);

        final LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT,
                1f);
        params.setMargins(2,0,2,0);

        text1.setText("D");
        text1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
        text1.setBackgroundResource(android.R.color.holo_red_dark);
        text1.setLayoutParams(params);
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(Dua.this,R.raw.d);
                mp.start();
            }
        });

        text2.setText("U");
        text2.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
        text2.setBackgroundResource(android.R.color.holo_red_dark);
        text2.setLayoutParams(params);
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(Dua.this,R.raw.u);
                mp.start();
            }
        });

        text3.setText("A");
        text3.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
        text3.setBackgroundResource(android.R.color.holo_blue_dark);
        text3.setLayoutParams(params);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(Dua.this,R.raw.a);
                mp.start();
            }
        });


        ImageView playNama = (ImageView)findViewById(R.id.playNama);
        playNama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
                setSupportActionBar(toolbar);
                getSupportActionBar().setTitle("DUA");

                MediaPlayer mp = MediaPlayer.create(Dua.this,R.raw.adua);
                mp.start();

                params.setMargins(2,0,2,0);

                text1.setText("D");
                text1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
                text1.setBackgroundResource(android.R.color.holo_red_dark);
                text1.setLayoutParams(params);
                text1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = MediaPlayer.create(Dua.this,R.raw.d);
                        mp.start();
                    }
                });

                text2.setText("U");
                text2.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
                text2.setBackgroundResource(android.R.color.holo_red_dark);
                text2.setLayoutParams(params);
                text2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = MediaPlayer.create(Dua.this,R.raw.u);
                        mp.start();
                    }
                });

                text3.setText("A");
                text3.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
                text3.setBackgroundResource(android.R.color.holo_blue_dark);
                text3.setLayoutParams(params);
                text3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = MediaPlayer.create(Dua.this,R.raw.a);
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
                getSupportActionBar().setTitle("TWO");

                MediaPlayer mp = MediaPlayer.create(Dua.this,R.raw.edua);
                mp.start();

                params.setMargins(2,0,2,0);

                text1.setText("T");
                text1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
                text1.setBackgroundResource(android.R.color.holo_blue_dark);
                text1.setLayoutParams(params);
                text1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = MediaPlayer.create(Dua.this,R.raw.tt);
                        mp.start();
                    }
                });

                text2.setText("W");
                text2.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
                text2.setBackgroundResource(android.R.color.holo_orange_light);
                text2.setLayoutParams(params);
                text2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = MediaPlayer.create(Dua.this,R.raw.ww);
                        mp.start();
                    }
                });

                text3.setText("O");
                text3.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
                text3.setBackgroundResource(android.R.color.holo_orange_light);
                text3.setLayoutParams(params);
                text3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = MediaPlayer.create(Dua.this,R.raw.oo);
                        mp.start();
                    }
                });
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
