package vezba3;

	
		import java.util.Scanner;

		public class DoWhileVezba5 {

			public static void main(String[] args) {

		
				Scanner scanner = new Scanner(System.in);
				
				int i = 0;
				int izaberi;
				String glavniGrad;
						
				do{
					System.out.println();
					System.out.println("Izaberite opciju od ponudjenih: ");
					System.out.println();
					
					System.out.println("1. Francuska");
				    System.out.println("2. Italija");
					System.out.println("3. Srbija");
					System.out.println("4. Izlaz");
					
					izaberi = scanner.nextInt();
					
					if(izaberi == 1) {
					System.out.println("Koji je glavni grad Francuske? ");
					 glavniGrad = scanner.next();
					 if(glavniGrad.equals("Pariz")) {
					 System.out.println("Odgovor je tacan.");
					}else{
								System.out.println("Odgovor nije tacan.");		
							}
					}else if(izaberi == 2){
						System.out.println("Koji je glavni grad Italije? ");
						glavniGrad = scanner.next();
							if(glavniGrad.equals("Rim")) {
								System.out.println("Odgovor je tacan.");
							}else{
								System.out.println("Odgovor nije tacan.");	
							}
					}else if(izaberi == 3){
						System.out.println("Koji je glavni grad Srbije? ");
						glavniGrad = scanner.next();
							if(glavniGrad.equals("Beograd")) {
								System.out.println("Odgovor je tacan.");
							}else{
								System.out.println("Odgovor nije tacan.");		
							}
					}
					 
				}
				
				while(izaberi != 4);
				
				System.out.println("Izasli ste iz programa.");

				scanner.close();
				
			}
			
		
		
				
		
		
		
		
	}


