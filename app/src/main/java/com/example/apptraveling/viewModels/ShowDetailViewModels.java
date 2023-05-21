package com.example.apptraveling.viewModels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.apptraveling.models.SkDetailModel;
import com.example.apptraveling.repository.SkDetailRepo;

public class ShowDetailViewModels extends ViewModel {
    private SkDetailRepo skDetailRepo;
     public ShowDetailViewModels(){
            skDetailRepo =new SkDetailRepo();
     }
     public MutableLiveData<SkDetailModel> skDetailModelMutableLiveData(int id){
         return skDetailRepo.getSkDetail(id);
     }
}
