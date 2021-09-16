package vezba3;
import java.util.Scanner;

public class DomaciZadatak3 {

	public static void main(String[] args) {
		
	Scanner scanner=new Scanner(System.in);	
	
	int n=scanner.nextInt();
	
	String z="*";
	
	
	
	for (int i=0;i<n;i++) {
	
	z=z+"*";
	
	}

	System.out.println(z);
	
	
	scanner.close();
	
}
	
}