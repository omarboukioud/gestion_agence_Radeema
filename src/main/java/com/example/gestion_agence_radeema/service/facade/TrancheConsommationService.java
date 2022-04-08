package com.example.gestion_agence_radeema.service.facade;

import com.example.gestion_agence_radeema.bean.TrancheConsommation;

import java.util.List;

public interface TrancheConsommationService {

    TrancheConsommation findByRef(String ref);
    int deleteByRef(String ref);
    List<TrancheConsommation> findByConsommationRefcompteur(String refcompteur);
    int deleteByConsommationRefcompteur(String refcompteur);
    int save(TrancheConsommation trancheConsommation);
}
