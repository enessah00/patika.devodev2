
package taksimetre;

import java.util.Scanner;

public class Taksimetre {

  
    public static void main(String[] args) {
        
        int km;
        double kmbasi= 2.20,toplam;
        
       
        Scanner scan= new Scanner(System.in);
        System.out.print("Kilometre Giriniz : ");
        km = scan.nextInt();
        
        toplam= 10 + (km*kmbasi);
        toplam =(toplam<20) ? 20 : toplam;
        System.out.print("Ödenecek Tutar: " + toplam);
        
    }
    
}
