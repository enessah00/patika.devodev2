package com.mycompany.manavkasaprogrami;
import java.util.Scanner;
public class ManavKasaProgrami {

    public static void main(String[] args) {
        
        int armut,elma,domates,muz,patlican;
        double armutkilo = 2.14
                ,elmakilo = 3.67,domateskilo = 1.11,
                muzkilo = 0.95
                ,patlicankilo = 5.00
                , sonuc;
        
        
        
        Scanner scan= new Scanner(System.in);
        System.out.print("Kaç Kilo Armut? : ");
        armut = scan.nextInt();
        System.out.print("Kaç Kilo Elma? : ");
        elma = scan.nextInt();
        System.out.print("Kaç Kilo Domates? : ");
        domates = scan.nextInt();
        System.out.print("Kaç Kilo Muz? : ");
        muz = scan.nextInt();
        System.out.print("Kaç Kilo Patlıcan? : ");
        patlican = scan.nextInt();
        
        sonuc = (armut * armutkilo)+ (elma * elmakilo) + (domates * domateskilo)
                + (muz * muzkilo) + (patlican * patlicankilo);
        
        System.out.print("Toplam Tutar: " + sonuc + " TL");
    }
}
