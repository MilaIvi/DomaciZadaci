package Projekat4;

import java.util.Scanner;

           public class MetodaDomaci2 {

			static double myMethod(double a, double b, double c) {
				return a * b * c;
			}
		​
			public static void main(String[] args) {
		​
				Scanner s = new Scanner(System.in);
				System.out.println("Unesi 3 cela broja: ");
				double x = s.nextDouble();
				double y = s.nextDouble();
				double z = s.nextDouble();
		​
				System.out.println("Proizvod brojeva je " + myMethod(x, y, z) + " .");
		​
			}
		​
		}