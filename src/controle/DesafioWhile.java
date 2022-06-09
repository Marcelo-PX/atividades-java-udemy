package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int aluno = 0;
		double nota = 0;
		double total = 0;
		
		do{
			System.out.print("Informe a nota do aluno: ");
			String n = sc.nextLine().replace(",",".");
			
			nota = Double.parseDouble(n);
			
			if(nota == -1){}
			
			else if(nota > 10 || nota < 0){
				System.out.println("--> NOTA INVÁLIDA! ");
			}
			else{
				aluno++;
				total = nota+total;
			}
			
		}while(nota !=-1);
		
		double media = total/aluno;
		
		System.out.printf("%n--> Alunos avaliados: %d", aluno);
		System.out.printf("%n--> M�dia dos alunos: %.1f", media);
		System.out.printf("%n--> Total avaliado: %.0f", total);
		
		sc.close();
	}
}
