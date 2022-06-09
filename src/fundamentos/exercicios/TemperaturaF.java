package fundamentos.exercicios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class TemperaturaF {
	
	public static void main(String[] args) {
		
		// (0ºC x 9/5) +32 = 32ºF
		final int F1 = 32;
		final double F2 = 9/5.0;
				
		System.out.print("Insira a temperatura em Celsius: ");
				
		Scanner sc = new Scanner(System.in);
				
		double t = sc.nextDouble(); sc.close();		
		double c = (t * F2)+ F1;
			
		DecimalFormat dc = new DecimalFormat("0.0");
				
		System.out.println(" A temperatura é de: "+dc.format(c)+"ºF");
		
	}
}
