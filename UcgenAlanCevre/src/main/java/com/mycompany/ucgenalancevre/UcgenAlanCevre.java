package com.mycompany.ucgenalancevre;

import java.util.Scanner;

public class UcgenAlanCevre {

    public static void main(String[] args) {
        
        int r,a;
        double pi=3.14;
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Yarı Çap değerini giriniz: ");
        r= scan.nextInt();
        
        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        
        System.out.println("Ucgenin Alanı: " + alan);
        System.out.println("Üçgenin Çevresi: " + cevre);
        
        System.out.print("Merkez Açı değerini giriniz: ");
        a= scan.nextInt();
        
        double dilimalan = (pi * (r*r) * a) / 360;
        
        System.out.println("Üçgen Diliminin Alanı: " + dilimalan);
        
                
    }
}
