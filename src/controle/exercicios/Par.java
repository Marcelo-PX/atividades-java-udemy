package controle.exercicios;

import java.util.Scanner;

public class Par {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro: ");
		int n = sc.nextInt();
		
		System.out.println(); sc.close();
		
		for(int i=0; i>=0;){
			
			if(n%2==0){
				if(n>=0 && n<=10){
					System.out.printf("O número %d está entre 0 e 10%n", n);
				}
				System.out.printf("O número %d é PAR", n);
			}
			else{
				if(n>=0 && n<=10){
					System.out.printf("O n�mero %d est� entre 0 e 10%n", n);
				}
				System.out.printf("O número %d é ÍMPAR", n);
			}
			break;
		}
	}
}
