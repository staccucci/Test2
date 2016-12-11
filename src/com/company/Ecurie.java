package com.company;

/**
 * Created by sylvain on 2016-11-29.
 * @author Sylvain Taccucci
 * @version 1.0
 *
 * Cette classe permet de gérer les écuries de moto GP
 *
 */
public class Ecurie {
    private String nom;
    private String manufacturier;
    private strnng pilote;


    public void Ecurie(String nom, String manufacturier) {
        this.nom = nom;
        this.manufacturier = manufacturier;

    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getManufacturier() {
        return manufacturier;
    }

    public void setManufacturier(String manufacturier) {
        this.manufacturier = manufacturier;
    }

    
    private int obtenirPosition(int annee) {

    }

}
