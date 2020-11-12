package com.minr;

public class BiayaNikah {
    private static final double harga = 570000;
    private double berat;

    public void setBerat(double totalBerat) {
        this.berat = totalBerat;
    }

    public double getBerat() {
        return berat;
    }

    public double hitungTotal(double totalBerat){
        return harga * totalBerat;
    }

    public void tampilHasil(double totalHarga){
        System.out.println("harga emas : "+ harga);
        System.out.println("total harga : "+ totalHarga);
    }
}
