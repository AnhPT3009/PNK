package com.example.apptraveling.repository;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.apptraveling.models.EventModels;
import com.example.apptraveling.retrofit.RetrofitInstance;
import com.example.apptraveling.retrofit.TravelAppApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EventRepository {
    private TravelAppApi travelAppApi;
    public EventRepository(){
        travelAppApi = RetrofitInstance.getRetrofit().create(TravelAppApi.class);

    }
    public MutableLiveData<EventModels> getEvent(){
        MutableLiveData<EventModels> data = new MutableLiveData<>();
        travelAppApi.getEnvent().enqueue(new Callback<EventModels>() {
            @Override
            public void onResponse(Call<EventModels> call, Response<EventModels> response) {
                data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<EventModels> call, Throwable t) {
               Log.d("logg",t.getMessage());
               data.setValue(null);
            }
        });
        return data;
    }
}
