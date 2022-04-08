package com.example.gestion_agence_radeema.service.facade;


import com.example.gestion_agence_radeema.bean.Consommation;

public interface ConsommationService {
    Consommation findByRefcompteur(String Refcompteur);
    int deleteByRefcompteur(String Refcompteur);
    int save(Consommation consommation);
    int upDate(Consommation consommation);
}
