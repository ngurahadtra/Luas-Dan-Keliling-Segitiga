package com.company;

import java.util.Scanner;

public class KllSegitiga implements Keliling{

    Scanner input = new Scanner(System.in);
    double a, b, c, keliling;
    @Override
    public void Segitiga() {
        System.out.print("Masukkan sisi a : ");
        a = input.nextInt();
        System.out.print("Masukkan sisi b : ");
        b = input.nextInt();
        System.out.print("Masukkan sisi c : ");
        c = input.nextInt();
        keliling = a + b + c;
        System.out.println("Keliling segitiga : " + keliling + " cm");
    }

}
