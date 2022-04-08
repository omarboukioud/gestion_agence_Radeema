package com.example.gestion_agence_radeema.service.impl;

import com.example.gestion_agence_radeema.bean.Consommation;
import com.example.gestion_agence_radeema.bean.TrancheConsommation;
import com.example.gestion_agence_radeema.dao.TrancheConsommationDao;
import com.example.gestion_agence_radeema.service.facade.ConsommationService;
import com.example.gestion_agence_radeema.service.facade.TrancheConsommationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TrancheConsommationServiceImpl implements TrancheConsommationService {

    @Autowired
    private TrancheConsommationDao tranchConsommationDao;
    @Autowired
    private ConsommationService consommationService;
    @Override
    public TrancheConsommation findByRef(String ref) {
        return tranchConsommationDao.findByRef(ref);
    }

    @Override
    @Transactional
    public int deleteByRef(String ref) {
        return tranchConsommationDao.deleteByRef(ref);
    }

    @Override
    public List<TrancheConsommation> findByConsommationRefcompteur(String refcompteur) {
        return tranchConsommationDao.findByConsommationRefcompteur(refcompteur);
    }

    @Override
    @Transactional
    public int deleteByConsommationRefcompteur(String refcompteur) {
        return tranchConsommationDao.deleteByConsommationRefcompteur(refcompteur);
    }

    @Override
    public int save(TrancheConsommation trancheConsommation) {
        Consommation consommation= consommationService.findByRefcompteur(trancheConsommation.getConsommation().getRefcompteur());
        trancheConsommation.setConsommation(consommation);
        if(findByConsommationRefcompteur(trancheConsommation.getRef())!=null){
            return -1;
        }
        if(consommation==null){
            return -2;
        }
        else{
            tranchConsommationDao.save(trancheConsommation);
            return 1;
        }
    }
}
