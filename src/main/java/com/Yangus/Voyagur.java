package com.Yangus;

import java.util.ArrayList;
import java.util.List;

public class Voyagur {
    private String nom;
    private String prenom;
    private String telephone;
    private String email;

    public Voyagur(String nom, String prenom, String telephone, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void AjouterUnAvis (String Endroits,String chambre) {
        List<String> avisList = new ArrayList();

        avisList.add(Endroits);
        avisList.add(chambre);


    }

    public static void main(String[] args) {
        System.out.println();
    }
}
