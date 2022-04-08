package com.example.gestion_agence_radeema.ws;

import com.example.gestion_agence_radeema.bean.TrancheConsommation;
import com.example.gestion_agence_radeema.service.impl.TrancheConsommationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/trancheconsommation")
public class TrancheConsommationWs {
    @Autowired
    private TrancheConsommationServiceImpl trancheConsommationServiceImpl;

    @GetMapping("/ref/{ref}")
    public TrancheConsommation findByRef(@PathVariable String ref) {
        return trancheConsommationServiceImpl.findByRef(ref);
    }

    @Transactional
    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return trancheConsommationServiceImpl.deleteByRef(ref);
    }
    @GetMapping("/refcompteur/{refcompteur}")
    public List<TrancheConsommation> findByConsommationRefcompteur(@PathVariable String refcompteur) {
        return trancheConsommationServiceImpl.findByConsommationRefcompteur(refcompteur);
    }

    @Transactional
    @DeleteMapping("/refcompteur/{refcompteur}")
    public int deleteByConsommationRefcompteur(@PathVariable String refcompteur) {
        return trancheConsommationServiceImpl.deleteByConsommationRefcompteur(refcompteur);
    }
    @PostMapping("/")
    public int save(@RequestBody TrancheConsommation trancheConsommation) {
        return trancheConsommationServiceImpl.save(trancheConsommation);
    }
}
