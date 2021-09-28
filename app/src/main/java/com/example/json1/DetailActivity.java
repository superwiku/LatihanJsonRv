package com.example.json1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView txtNamaBuahnya,txtLatinBuahnya,txtRasaBuahnya;
    Buah buahDapat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        txtNamaBuahnya=(TextView) findViewById(R.id.txt_namabuah);
        txtLatinBuahnya=(TextView) findViewById(R.id.txt_latinbuah);
        txtRasaBuahnya=(TextView) findViewById(R.id.txt_rasabuah);
        Intent dapat= getIntent();
        buahDapat= (Buah) dapat.getSerializableExtra("buahnya");
        txtNamaBuahnya.setText(buahDapat.getNama());
        txtLatinBuahnya.setText(buahDapat.getLatin());
        txtRasaBuahnya.setText(buahDapat.getRasa());

    }
}