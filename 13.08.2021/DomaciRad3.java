package vezba3;

import java.util.Scanner;

public class DomaciRad3 {

	public static void main(String[] args) {
		
		
		 Scanner scanner = new Scanner(System.in);
		 
         System.out.println("Uneti broj od 1 do 12: ");
         
         int mesec = scanner.nextInt();
         
         switch(mesec) {
         
         case 1:
             System.out.println("Januar");
             break;        
         case 2:
             System.out.println("Februar");
             break;            
         case 3:            
             System.out.println("Mart");
             break;            
         case 4:
             System.out.println("April");
             break;            
         case 5:
             System.out.println("Maj");
             break;        
         case 6:
             System.out.println("Jun");
             break;
         case 7:
             System.out.println("Jul");
             break;
         case 8:
             System.out.println("Avgust");
             break;
         case 9:
             System.out.println("Septembar");
             break;
         case 10:
             System.out.println("Oktobar");
             break;
         case 11:
             System.out.println("Novembar");
             break;
         case 12:
             System.out.println("Decembar");
             break;
         default:
             System.out.println("Potrebno je uneti broj od 1 do 12.");
         
         }  
         scanner.close();
         
         
     }
	
    }	

		
		
		
		
		
		
		

	}

}
