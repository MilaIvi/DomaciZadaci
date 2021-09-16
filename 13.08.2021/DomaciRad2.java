package vezba3;

import java.util.Scanner;

public class DomaciRad2 {
	
public static void main(String[] args) {
        
         //prvi zadatak
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Unesi broj ");
        
        int broj = s.nextInt();
        
        if(broj < 10) {
            
            // koristila sam ovde brojeve 9, 10, 11
            
            int pomnozenBroj = broj * 100;
            System.out.println("Broj je manji od 10 i pomnozen je sa 100: " + pomnozenBroj);
        }else if(broj > 100) {
            
            // koristila sam ovde brojeve 99, 100 ,101
            
            double podeljenBroj = broj / 10;
            System.out.println("Broj je veci od 100 i podeljen je sa 10: " + podeljenBroj);
        }else {
            
            System.out.println("Broj nije manji od 10 i nije veci od 100");
        }
        
        s.close();
    }

}
	
	





