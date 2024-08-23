package com.Yangus;

public class Endroits {
    protected enum type { hotel ,parc} ;
    protected String description;

    public Endroits(String description) {
        this.description = description;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
