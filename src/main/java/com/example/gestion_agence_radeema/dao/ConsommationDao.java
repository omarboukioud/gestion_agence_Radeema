package com.example.gestion_agence_radeema.dao;

import com.example.gestion_agence_radeema.bean.Consommation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsommationDao extends JpaRepository<Consommation,Long> {
    Consommation findByRefcompteur(String Refcompteur);
    int deleteByRefcompteur(String Refcompteur);
}
