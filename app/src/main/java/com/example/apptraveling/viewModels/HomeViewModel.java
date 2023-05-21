package com.example.apptraveling.viewModels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.apptraveling.models.EventModels;
import com.example.apptraveling.models.skModels;
import com.example.apptraveling.repository.EventRepository;
import com.example.apptraveling.repository.skRepository;

public class HomeViewModel extends ViewModel {
    private EventRepository eventRepository;
    private skRepository skRepository;
    public HomeViewModel(){
        eventRepository = new EventRepository();
        skRepository =  new skRepository();
    }
    public MutableLiveData<EventModels> eventModelsMutableLiveData(){
        return eventRepository.getEvent();
    }

    public MutableLiveData<skModels> skModelsMutableLiveData(int idcate){
        return skRepository.getSk(idcate);
    }
}
