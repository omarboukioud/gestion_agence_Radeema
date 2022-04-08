package com.example.gestion_agence_radeema.ws;

import com.example.gestion_agence_radeema.bean.Consommation;
import com.example.gestion_agence_radeema.service.impl.ConsommationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/consommation")
public class ConsommationWs {
    @Autowired
    private ConsommationServiceImpl consommationServiceImpl;

    @GetMapping("/refcompteur/{refcompteur}")
    public Consommation findByRefcompteur(@PathVariable String refcompteur) {
        return consommationServiceImpl.findByRefcompteur(refcompteur);
    }
    @DeleteMapping("/refcompteur/{refcompteur}")
    public int deleteByRefcompteur(@PathVariable String refcompteur) {
        return consommationServiceImpl.deleteByRefcompteur(refcompteur);
    }
    @PostMapping("/")
    public int save(@RequestBody Consommation consommation) {
        return consommationServiceImpl.save(consommation);
    }
    @PostMapping("/update")
    public int upDate(@RequestBody Consommation consommation) {
        return consommationServiceImpl.upDate(consommation);
    }
}
