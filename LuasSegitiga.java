package com.company;

import java.util.Scanner;

public class LuasSegitiga extends Bentuk{

    Scanner input = new Scanner(System.in);
    double alas, tinggi;
    @Override
    public double Luas() {
        System.out.print("Masukkan alas segitiga : ");
        alas = input.nextInt();
        System.out.print("Masukkan tinggi segitiga : ");
        tinggi = input.nextInt();
        return 0.5 * alas * tinggi;
    }

}
