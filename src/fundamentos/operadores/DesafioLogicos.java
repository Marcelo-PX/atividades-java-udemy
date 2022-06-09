package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		/*	Trabalho de ter�a (V ou F)
		 *  Trabalho de quinta (V ou F)
		 *  
		 *  --> Se ambos os trabalhos V, comprar TV de 58pol.
		 *  --> Se apenas um trabalho V, comprar TV de 42pol.
		 *  --> Em todos os casos V, a fam�lia vai ao shopping
		 *  	tomar sorvete.
		 *  --> Se ambos os trabalhos F, a fam�lia n�o vai ao
		 *  	shopping, n�o toma sorvete e fica triste.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira 'true' para SIM ou 'false' para N�O.\n");
		
		System.out.print(" O trabalho de ter�a est� confirmado? ");
		boolean terca = sc.nextBoolean();
		System.out.print(" O trabalho de quinta est� confirmado? ");
		boolean quinta = sc.nextBoolean();
		
		System.out.println(); sc.close();
		
		if(terca && quinta){
			
			System.out.println(" A fam�lia vai ao Shopping comprar uma TV de 58pol \n"
					+ " e tomar sorvete :D");
		}
		else if(terca ^ quinta){
			
			System.out.println(" A fam�lia vai ao Shopping comprar uma TV de 42pol \n"
					+ " e tomar sorvete :)");
		}
		else {
			
			System.out.println(" A fam�lia ficou triste por n�o ir ao Shopping \n"
					+ " tomar sorvete :(");
		}
		
	}
}
