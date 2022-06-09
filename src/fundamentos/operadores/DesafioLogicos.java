package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		/*	Trabalho de terça (V ou F)
		 *  Trabalho de quinta (V ou F)
		 *  
		 *  --> Se ambos os trabalhos V, comprar TV de 58pol.
		 *  --> Se apenas um trabalho V, comprar TV de 42pol.
		 *  --> Em todos os casos V, a família vai ao shopping
		 *  	tomar sorvete.
		 *  --> Se ambos os trabalhos F, a família não vai ao
		 *  	shopping, não toma sorvete e fica triste.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira 'true' para SIM ou 'false' para NÂO.\n");
		
		System.out.print(" O trabalho de terça está confirmado? ");
		boolean terca = sc.nextBoolean();
		System.out.print(" O trabalho de quinta está confirmado? ");
		boolean quinta = sc.nextBoolean();
		
		System.out.println(); sc.close();
		
		if(terca && quinta){
			
			System.out.println(" A família vai ao Shopping comprar uma TV de 58pol \n"
					+ " e tomar sorvete :D");
		}
		else if(terca ^ quinta){
			
			System.out.println(" A família vai ao Shopping comprar uma TV de 42pol \n"
					+ " e tomar sorvete :)");
		}
		else {
			
			System.out.println(" A família ficou triste por não ir ao Shopping \n"
					+ " tomar sorvete :(");
		}
		
	}
}
