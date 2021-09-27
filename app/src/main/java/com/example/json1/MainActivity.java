package com.example.json1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvbuah;
    RecyclerView.LayoutManager layoutManager;
    ApiInterface apiInterface;
    List<Buah> daftarBuah;
    DaftarBuahAdapter adapternya;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvbuah=(RecyclerView) findViewById(R.id.rv_buah);
        rvbuah.setLayoutManager(new LinearLayoutManager(this));
        apiInterface=ApiClient.ambilData().create(ApiInterface.class);
        Call<List<Buah>>call=apiInterface.getBuahSaya();
        call.enqueue(new Callback<List<Buah>>() {
            @Override
            public void onResponse(Call<List<Buah>> call, Response<List<Buah>> response) {
                daftarBuah= response.body();
                adapternya=new DaftarBuahAdapter(daftarBuah,MainActivity.this);
                rvbuah.setAdapter(adapternya);
            }

            @Override
            public void onFailure(Call<List<Buah>> call, Throwable t) {

            }
        });


    }
}