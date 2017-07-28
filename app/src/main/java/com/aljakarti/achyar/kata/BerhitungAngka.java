package com.aljakarti.achyar.kata;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class BerhitungAngka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berhitung_angka);
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

        final Button soal1 = (Button)findViewById(R.id.soal1);
        soal1.getBackground().setColorFilter(0xFFE49C0D, PorterDuff.Mode.MULTIPLY);
        soal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent soal1 = new Intent(getApplication(),Soal1.class);
                startActivity(soal1);
            }
        });

        Button soal2 = (Button)findViewById(R.id.soal2);
        soal2.getBackground().setColorFilter(0xFFE49C0D, PorterDuff.Mode.MULTIPLY);

        Button soal3 = (Button)findViewById(R.id.soal3);
        soal3.getBackground().setColorFilter(0xFFE49C0D, PorterDuff.Mode.MULTIPLY);

        Button soal4 = (Button)findViewById(R.id.soal4);
        soal4.getBackground().setColorFilter(0xFFE49C0D, PorterDuff.Mode.MULTIPLY);

        Button soal5 = (Button)findViewById(R.id.soal5);
        soal5.getBackground().setColorFilter(0xFFE49C0D, PorterDuff.Mode.MULTIPLY);

        Button soal6 = (Button)findViewById(R.id.soal6);
        soal6.getBackground().setColorFilter(0xFFE49C0D, PorterDuff.Mode.MULTIPLY);




    }
}
