package fundamentos.exercicios;

import java.util.Scanner;

public class QuadradoCubo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		String a = sc.nextLine().replace(",",".");
		
		double b = Double.parseDouble(a); sc.close();
		
		double c1 = Math.pow(b, 2);
		double c2 = Math.pow(b, 3);
		
		System.out.printf(" %.0f^2 = %.0f %n"
				+" %.0f^3 = %.0f %n", b, c1, b, c2);
		
	}
}
