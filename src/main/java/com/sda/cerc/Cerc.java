package com.sda.cerc;

public class Cerc {
    private double raza;

    public Cerc(double raza) {
        this.raza = raza;
    }

    public double calculArie(){
        return Math.PI*Math.pow(this.raza,2);
    }
}
