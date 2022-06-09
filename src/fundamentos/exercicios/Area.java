package fundamentos.exercicios;

import java.util.Scanner;

public class Area {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calcule a área de um triângulo");
		
		System.out.print("--> Base: ");
		String b = sc.nextLine().replace(",",".");	
		System.out.print("--> Altura: ");
		String a = sc.nextLine().replace(",",".");
		
		double base = Double.parseDouble(b);
		double altura = Double.parseDouble(a);
		
		sc.close();
		
		double x = (base*altura)/2;
		
		System.out.printf("--> Área = %.2f", x);
		
	}
}
