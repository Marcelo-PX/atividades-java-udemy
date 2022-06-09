package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		/*	Ler num1
		 * 	Ler num2
		 *	+ - * / %
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o n�mero: ");
		double n1 = sc.nextDouble();
		
		System.out.print("Digite o n�mero: ");
		double n2 = sc.nextDouble();
		
		System.out.print("Digite a opera��o: ");
		String op = sc.next();
		
		double x =  "+".equals(op) ? n1+n2 : 0;
			x =  "-".equals(op) ? n1-n2 : x;
			x =  "*".equals(op) ? n1*n2 : x;
			x =  "/".equals(op) ? n1/n2 : x;
			x =  "%".equals(op) ? n1%n2 : x;
		
		System.out.printf("%.2f %s %.2f = %.2f", n1, op, n2, x);
		
		sc.close();
	}
}
