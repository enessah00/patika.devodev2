
package hipotenus;

import java.util.Scanner;

public class Hipotenus {

   
    public static void main(String[] args) {
        
        Scanner girdi=new Scanner(System.in);
        
        System.out.print("Üçgenin ilk kenar uzunluğunu giriniz: ");
        double a = girdi.nextDouble();

        System.out.print("Üçgenin ikinci kenar uzunluğunu giriniz: ");
        double b = girdi.nextDouble();

        System.out.print("Üçgenin üçüncü kenar uzunluğunu giriniz: ");
        double c = girdi.nextDouble();

        
        double u = (a + b + c) / 2;

        
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin Alanı: " + alan);
       
    }
    
}
