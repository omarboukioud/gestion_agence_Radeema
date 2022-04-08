package com.example.gestion_agence_radeema.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
public class Consommation {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String refcompteur;
    private  int mois;
    private  int annee;
    private  double total;
    private  double tatolPaiement;
   @OneToMany(mappedBy = "consommation")
   @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<TrancheConsommation> trancheConsommations;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getRefcompteur() {
    return refcompteur;
  }

  public void setRefcompteur(String refcompteur) {
    this.refcompteur = refcompteur;
  }

  public int getMois() {
    return mois;
  }

  public void setMois(int mois) {
    this.mois = mois;
  }

  public int getAnnee() {
    return annee;
  }

  public void setAnnee(int annee) {
    this.annee = annee;
  }

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }

  public double getTatolPaiement() {
    return tatolPaiement;
  }

  public void setTatolPaiement(double tatolPaiement) {
    this.tatolPaiement = tatolPaiement;
  }

  public List<TrancheConsommation> getTrancheConsommations() {
    return trancheConsommations;
  }

  public void setTrancheConsommations(List<TrancheConsommation> trancheConsommations) {
    this.trancheConsommations = trancheConsommations;
  }
}
