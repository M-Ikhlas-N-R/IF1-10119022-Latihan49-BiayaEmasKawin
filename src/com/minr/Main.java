package com.minr;

import java.util.Scanner;
/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : Program menghitung harga emas sesuai berat yang dibeli
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BiayaNikah emas = new BiayaNikah();
        System.out.println("Program Perhitungan harga Emas");
        System.out.print("Masukkan berat (gram) : ");
        emas.setBerat(scan.nextDouble());
        emas.tampilHasil(emas.hitungTotal(emas.getBerat()));
    }
}
