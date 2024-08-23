package com.Yangus;

public class chambre {
    private int numero;
    private String tarifParNuit;

    public chambre(int numero, String tarifParNuit) {
        this.numero = numero;
        this.tarifParNuit = String.valueOf(0);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTarifParNuit() {
        return tarifParNuit;
    }

    public void setTarifParNuit(String tarifParNuit) {
        this.tarifParNuit = tarifParNuit;
    }

}
