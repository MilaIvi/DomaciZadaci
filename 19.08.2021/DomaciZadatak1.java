package vezba3;

import java.util.Scanner;

public class DomaciZadatak1 {

	public static void main(String[] args) {
		
		
		int sum=0;
		int broj=0;
		Scanner scanner= new Scanner(System.in);
		
		
		do {
			
		     broj=scanner.nextInt();
		     sum=sum+broj;
		     System.out.println("Unesi broj");
			
			
		}
		
		while (broj>=0); { 
			
			
		System.out.println("Suma je"+ sum);	
			

	}

		
		scanner.close();
}


}
