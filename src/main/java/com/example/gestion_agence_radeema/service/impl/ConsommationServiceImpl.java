package com.example.gestion_agence_radeema.service.impl;

import com.example.gestion_agence_radeema.bean.Consommation;
import com.example.gestion_agence_radeema.dao.ConsommationDao;
import com.example.gestion_agence_radeema.service.facade.ConsommationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsommationServiceImpl implements ConsommationService {
    @Autowired
    private ConsommationDao consommationDao;

    @Override
    public Consommation findByRefcompteur(String Refcompteur) {
        return consommationDao.findByRefcompteur(Refcompteur);
    }

    @Override
    public int deleteByRefcompteur(String Refcompteur) {
        return consommationDao.deleteByRefcompteur(Refcompteur);
    }

    @Override
    public int save(Consommation consommation) {
        if(findByRefcompteur(consommation.getRefcompteur())!=null){
            return -1;
        }
        else{
            consommationDao.save(consommation);
            return 1;
        }
    }

    @Override
    public int upDate(Consommation consommation) {
        if(findByRefcompteur(consommation.getRefcompteur())==null){
            return -1;
        }
        else{
            consommationDao.save(consommation);
            return 1;
        }
    }
}
