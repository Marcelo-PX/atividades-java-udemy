package fundamentos.exercicios;

import java.util.Scanner;

public class Imc {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// IMC = Peso / (Altura^²)
		System.out.print("Informe seu peso: ");
		String p = sc.nextLine().replace(",",".");
		
		System.out.print("Informe sua altura: ");
		String a = sc.nextLine().replace(",",".");
		
		double peso = Double.parseDouble(p);
		double altura = Double.parseDouble(a);
		
		double x = Math.pow(altura, 2);
		double imc = peso/x;
		
		System.out.println(); sc.close();
		
		if(imc <= 16.9){
			System.out.printf("--> Seu IMC: %.1f %n", imc);
			System.out.println("--> Muito abaixo do peso.");		
		}
		else if(imc <= 18.4){
			System.out.printf("--> Seu IMC: %.1f %n", imc);
			System.out.println("--> Abaixo do peso.");
		}
		else if(imc <= 24.9){
			System.out.printf("--> Seu IMC: %.1f %n", imc);
			System.out.println("--> Peso normal.");
		}
		else if(imc <= 29.9){
			System.out.printf("--> Seu IMC: %.1f %n", imc);
			System.out.println("--> Acima do peso.");
		}
		else if(imc <= 34.9){
			System.out.printf("--> Seu IMC: %.1f %n", imc);
			System.out.println("--> Obesidade grau I.");
		}
		else if(imc <= 40){
			System.out.printf("--> Seu IMC: %.1f %n", imc);
			System.out.println("--> Obesidade grau II.");
		}
		else{
			System.out.printf("--> Seu IMC: %.1f %n", imc);
			System.out.println("--> Obesidade grau III.");
		}
		
	}
}
