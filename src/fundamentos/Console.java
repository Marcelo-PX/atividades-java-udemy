package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.print("BOM");
		System.out.print(" DIA! \n");
		System.out.println("bom");
		System.out.println(" dia! \n");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n",
				1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f %n", 3999.95);
		System.out.printf("Nome: %s%n", "Marcelo Pacheco");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobre = sc.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n",
				nome, sobre, idade);
		sc.close();
		
	}
}
