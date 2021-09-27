package com.example.json1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("8b1ce43d-f6a2-4497-934d-dc77cd0dea6d")
    Call<List<Buah>> getBuahSaya();
}
