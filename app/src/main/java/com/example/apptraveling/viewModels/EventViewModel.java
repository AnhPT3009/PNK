package com.example.apptraveling.viewModels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.apptraveling.models.EventModels;
import com.example.apptraveling.models.skModels;
import com.example.apptraveling.repository.EventRepository;
import com.example.apptraveling.repository.skRepository;

public class EventViewModel extends ViewModel {
    private skRepository p;

    public EventViewModel(){
        p =  new skRepository();
    }

    public MutableLiveData<skModels> skModelsMutableLiveData(int idcate){
        return p.getSk(idcate);
    }
}
