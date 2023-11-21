package com.mycompany.boykiloendeks;

import java.util.Scanner;


public class BoyKiloEndeks {

    public static void main(String[] args) {
        
        double boy,kilo,indeks;
        
        Scanner scan= new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu Metre Cinsinden(1,72) Giriniz: ");
        boy= scan.nextDouble();
        System.out.print("Lütfen Kilonuzu Kg Cinsinden Giriniz: ");
        kilo= scan.nextDouble();
        
        indeks = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz: " + indeks);
        
    }
}
