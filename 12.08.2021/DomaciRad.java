package mypack;

import java.util.Scanner;

public class DomaciRad {

	public static void main(String[] args) {
		
		
		
		
    
		
		String ime="Milica";
		
		System.out.println("Unesite svoje ime: "+ime);
		
  
		  
    
		
		 String prezime="Ivic";
		 
		 System.out.println("Unesite svoje prezime: " + prezime);
		 
		 
   
   
   
         char pol = 'F';
         
         System.out.println("Unesite svoj pol:" + pol );
         
         
         
         
         
         
         Scanner s= new Scanner(System.in);
         
        
         
         System.out.println("Ukupan broj medalja koje je Srbija osvojila na Olimpiskim igrama: ");
         
         double ukupanBrojMedalja= s.nextDouble();
         
         
         
         System.out.println("Ukupan broj zlatnih medalja koje je Srbija osvojila na Olimpiskim igrama: ");
         
         double zlatneMedalje= s.nextDouble();
       
        
         
        
         double procenatZlatnihMedalja = zlatneMedalje/ukupanBrojMedalja *100;
         
         System.out.println("Procenat zlatnih medalja u odnosu na ukupan broj medalja: " + procenatZlatnihMedalja + "%");
         
         
         
        s.close();
		 
		 
		  

	}

}




