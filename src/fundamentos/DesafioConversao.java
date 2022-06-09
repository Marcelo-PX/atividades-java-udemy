package fundamentos;

import java.text.DecimalFormat;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
			
		System.out.println("Insira sua remuneração do último trimestre!\n");
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Valor do primeiro mês: ");
		String mes1 = sc.nextLine().replace(",",".");
		
		System.out.print(" Valor do segundo mês: ");
		String mes2 = sc.nextLine().replace(",",".");
		
		System.out.print(" Valor do terceiro mês: ");
		String mes3 = sc.nextLine().replace(",",".");
		
		System.out.println(); sc.close();
		
		double num1 = Double.parseDouble(mes1);
		double num2 = Double.parseDouble(mes2);
		double num3 = Double.parseDouble(mes3);
		double soma = num1+num2+num3;
		
		DecimalFormat dc = new DecimalFormat("0.00");
		
		System.out.println(" TOTAL DE R$ "+dc.format(soma));
		System.out.println(" MÉDIA TRIMESTRAL R$ "+dc.format(soma/3));
		
	}
}
