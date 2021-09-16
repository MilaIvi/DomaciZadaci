package vezba3;

	import java.util.Scanner;
	
	     public class WhileDomaci1 {
	
			public static void main(String[] args) {
				
				Scanner s1 = new Scanner(System.in);
				
				System.out.print("Unesite prvi broj: ");
				int x = s1.nextInt();
				System.out.print("Unesite drugi broj: ");
				
				int y = s1.nextInt();
				if (x > y) {
					int tmp = x;
					x = y;
					y = tmp;
				}
				int brojac = x;
				brojac++;
				int zbirParni = 0;
				int zbirNeparni = 0;
				while (brojac < y) {
					if (brojac % 2 == 0) {
						zbirParni += brojac;
					} else {
						zbirNeparni += brojac;
					}
					brojac++;
				}
				System.out.println("Zbir parnih brojeva je" + zbirParni);
				System.out.println("Zbir neparnih brojeva je " + zbirNeparni);
			}
		} 