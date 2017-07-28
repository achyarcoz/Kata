package com.aljakarti.achyar.kata;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.aljakarti.achyar.kata.R.drawable.dua;

public class BelajarAngka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar_angka);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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

        final ImageButton nol = (ImageButton)findViewById(R.id.nol);
        nol.setBackgroundResource(R.drawable.nol);
        nol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nol.setBackgroundResource(R.drawable.nol1);
                MediaPlayer mp = MediaPlayer.create(BelajarAngka.this, R.raw.anol);
                mp.start();
                Intent nol = new Intent(getApplication(),Nol.class);
                startActivity(nol);
            }
        });

        final ImageButton satu = (ImageButton)findViewById(R.id.satu);
        satu.setBackgroundResource(R.drawable.satu);
        satu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                satu.setBackgroundResource(R.drawable.satu1);
                MediaPlayer mp = MediaPlayer.create(BelajarAngka.this, R.raw.asatu);
                mp.start();
                Intent satu = new Intent(getApplication(),Satu.class);
                startActivity(satu);
            }
        });

        final ImageButton dua = (ImageButton)findViewById(R.id.dua);
        dua.setBackgroundResource(R.drawable.dua);
        dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dua.setBackgroundResource(R.drawable.dua1);
                MediaPlayer mp = MediaPlayer.create(BelajarAngka.this, R.raw.adua);
                mp.start();
                Intent dua = new Intent(getApplication(),Dua.class);
                startActivity(dua);
            }
        });

        final ImageButton tiga = (ImageButton)findViewById(R.id.tiga);
        tiga.setBackgroundResource(R.drawable.tiga);
        tiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tiga.setBackgroundResource(R.drawable.tiga1);
                MediaPlayer mp = MediaPlayer.create(BelajarAngka.this, R.raw.atiga);
                mp.start();
                Intent tiga = new Intent(getApplication(),Tiga.class);
                startActivity(tiga);
            }
        });

        final ImageButton empat = (ImageButton)findViewById(R.id.empat);
        empat.setBackgroundResource(R.drawable.empat);
        empat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                empat.setBackgroundResource(R.drawable.empat1);
                MediaPlayer mp = MediaPlayer.create(BelajarAngka.this, R.raw.aempat);
                mp.start();
                Intent empat = new Intent(getApplication(),Empat.class);
                startActivity(empat);
            }
        });

        final ImageButton lima = (ImageButton)findViewById(R.id.lima);
        lima.setBackgroundResource(R.drawable.lima);
        lima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lima.setBackgroundResource(R.drawable.lima1);
                MediaPlayer mp = MediaPlayer.create(BelajarAngka.this, R.raw.alima);
                mp.start();
                Intent lima = new Intent(getApplication(),Lima.class);
                startActivity(lima);
            }
        });

        final ImageButton enam = (ImageButton)findViewById(R.id.enam);
        enam.setBackgroundResource(R.drawable.enam);
        enam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enam.setBackgroundResource(R.drawable.enam1);
                MediaPlayer mp = MediaPlayer.create(BelajarAngka.this, R.raw.aenam);
                mp.start();
                Intent enam = new Intent(getApplication(),Enam.class);
                startActivity(enam);
            }
        });

        final ImageButton tujuh = (ImageButton)findViewById(R.id.tujuh);
        tujuh.setBackgroundResource(R.drawable.tujuh);
        tujuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tujuh.setBackgroundResource(R.drawable.tujuh1);
                MediaPlayer mp = MediaPlayer.create(BelajarAngka.this, R.raw.atujuh);
                mp.start();
                Intent tujuh = new Intent(getApplication(),Tujuh.class);
                startActivity(tujuh);
            }
        });

        final ImageButton delapan = (ImageButton)findViewById(R.id.delapan);
        delapan.setBackgroundResource(R.drawable.delapan);
        delapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delapan.setBackgroundResource(R.drawable.delapan1);
                MediaPlayer mp = MediaPlayer.create(BelajarAngka.this, R.raw.adelapan);
                mp.start();
                Intent delapan = new Intent(getApplication(),Delapan.class);
                startActivity(delapan);
            }
        });

        final ImageButton sembilan = (ImageButton)findViewById(R.id.sembilan);
        sembilan.setBackgroundResource(R.drawable.sembilan);
        sembilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sembilan.setBackgroundResource(R.drawable.sembilan1);
                MediaPlayer mp = MediaPlayer.create(BelajarAngka.this, R.raw.asembilan);
                mp.start();
                Intent sembilan = new Intent(getApplication(),Sembilan.class);
                startActivity(sembilan);
            }
        });

        final ImageButton sepuluh = (ImageButton)findViewById(R.id.sepuluh);
        sepuluh.setBackgroundResource(R.drawable.sepuluh);
        sepuluh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sepuluh.setBackgroundResource(R.drawable.sepuluh1);
                MediaPlayer mp = MediaPlayer.create(BelajarAngka.this, R.raw.asepuluh);
                mp.start();
                Intent sepuluh = new Intent(getApplication(),Sepuluh.class);
                startActivity(sepuluh);
            }
        });
    }
}
