package fundamentos.exercicios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class TemperaturaC {
	
	public static void main(String[] args) {
		
		// (32ºF -32) x 5/9 = 0ºC
		final int F1 = 32;
		final double F2 = 5/9.0;
		
		System.out.print("Insira a temperatura em Fahrenheit: ");
		
		Scanner sc = new Scanner(System.in);
		
		double t = sc.nextDouble(); sc.close();		
		double c = (t - F1)* F2;
	
		DecimalFormat dc = new DecimalFormat("0.0");
		
		System.out.println(" A temperatura é de: "+dc.format(c)+"ºC");
		
	}		
}
