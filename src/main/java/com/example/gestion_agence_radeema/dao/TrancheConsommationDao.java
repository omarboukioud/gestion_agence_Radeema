package com.example.gestion_agence_radeema.dao;


import com.example.gestion_agence_radeema.bean.TrancheConsommation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrancheConsommationDao extends JpaRepository<TrancheConsommation,Long> {
    TrancheConsommation findByRef(String ref);
    int deleteByRef(String ref);
    List<TrancheConsommation> findByConsommationRefcompteur(String refcompteur);
    int deleteByConsommationRefcompteur(String refcompteur);
}
