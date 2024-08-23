package com.Yangus;

import java.util.List;

public class Hotel extends Endroits {
         private String telephone;
         private String email;
         private List<chambre>chambres;


    public Hotel(String description) {
        super(description);
        this.telephone = telephone;
        this.email = email;

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

    public List<chambre> getChambres() {
        return chambres;
    }

    public void setChambres(List<chambre> chambres) {
        this.chambres = chambres;
    }

}
