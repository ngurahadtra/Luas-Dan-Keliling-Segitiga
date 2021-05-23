package com.company;

import java.util.Scanner;

public class Segitiga {
    public static void main(String[] args) {
        int pilihan;
        Scanner input = new Scanner(System.in);

        System.out.println("Program menghitung Luas dan Keliling Segitiga");
        System.out.println("1. menghitung luas ");
        System.out.println("2. menghitung keliling ");
        System.out.print("Masukkan pilihan : ");
        pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                LuasSegitiga s = new LuasSegitiga();
                System.out.println("Luas Segitiga : " + s.Luas() + " cm^2");
                break;
            case 2:
                KllSegitiga ks = new KllSegitiga();
                ks.Segitiga();
                break;
        }
    }
}
