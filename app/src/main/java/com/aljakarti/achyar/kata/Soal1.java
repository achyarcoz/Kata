package com.aljakarti.achyar.kata;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class Soal1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal1);
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

        ImageButton nol = (ImageButton)findViewById(R.id.nol);
        ImageButton satu = (ImageButton)findViewById(R.id.satu);
        ImageButton dua = (ImageButton)findViewById(R.id.dua);
        ImageButton tiga = (ImageButton)findViewById(R.id.tiga);
        ImageButton empat = (ImageButton)findViewById(R.id.empat);
        ImageButton lima = (ImageButton)findViewById(R.id.lima);
        ImageButton enam = (ImageButton)findViewById(R.id.enam);
        ImageButton tujuh = (ImageButton)findViewById(R.id.tujuh);
        ImageButton delapan = (ImageButton)findViewById(R.id.delapan);
        ImageButton sembilan = (ImageButton)findViewById(R.id.sembilan);
        ImageButton sepuluh = (ImageButton)findViewById(R.id.sepuluh);

    }
}
