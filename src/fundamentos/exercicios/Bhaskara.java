package fundamentos.exercicios;

import java.util.Scanner;

public class Bhaskara {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Equacao: ax²= + bx + c = 0\n");
		
		System.out.print("Digite o valor de A: ");
		int a = sc.nextInt();
		System.out.print("Digite o valor de B: ");
		int b = sc.nextInt();
		System.out.print("Digite o valor de C: ");
		int c = sc.nextInt();
		
		int delta = (b*b) - (4*a*c); sc.close();
		
		System.out.printf("\nSua equação é: %dx² + %dx + %d = 0\n", a, b, c);
		
		System.out.println("\n--> O Delta é: " + delta);
		
		double x1 = (-b + Math.sqrt(delta)) / (2*a);

		System.out.printf("--> O X1 da equação é: %.2f", x1);
		
		double x2 = (-b - Math.sqrt(delta)) / (2*a);
		
		System.out.printf("\n--> O X2 da equação é: %.2f", x2);
		
	}
}
