
package kdvhesapla;

import java.util.Scanner;

public class Kdvhesapla {

    
    public static void main(String[] args) {
       double deger,kdvorani,kdvtutari,sonuc;
       
       Scanner input = new Scanner(System.in);
       System.out.print("Deger Giriniz: ");
       deger = input.nextDouble();
       
       if (deger<=1000.0 && deger>0.0){
           kdvorani= 0.18;
       } else{
           kdvorani= 0.08;
       }
       
       kdvtutari = deger*kdvorani;
       sonuc= deger + kdvtutari;
       
       System.out.println("Kdv Oranı: " + kdvorani);
       System.out.println("Kdv Tutarı: " + kdvtutari);
       System.out.println("Toplam Tutar: " + sonuc);
       
       
    }
    
}
