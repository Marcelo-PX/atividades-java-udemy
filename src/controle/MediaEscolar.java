package controle;

import java.util.Scanner;

public class MediaEscolar {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("MÉDIA BIMESTRAL \n");
		
		System.out.print("Informe a nota do 1º Bimestre: ");
		String bi1 = sc.nextLine().replace(",",".");
		
		System.out.print("Informe a nota do 2º Bimestre: ");
		String bi2 = sc.nextLine().replace(",",".");
		
		System.out.print("Informe a nota do 3º Bimestre: ");
		String bi3 = sc.nextLine().replace(",",".");
		
		System.out.print("Informe a nota do 4º Bimestre: ");
		String bi4 = sc.nextLine().replace(",",".");
		
		System.out.println(); sc.close();
		
		double b1 = Double.parseDouble(bi1);
		double b2 = Double.parseDouble(bi2);
		double b3 = Double.parseDouble(bi3);
		double b4 = Double.parseDouble(bi4);
		
		double m = (b1+b2+b3+b4)/4;
		
		if(m >= 7){
			System.out.printf("--> MÉDIA FINAL: %.1f %n", m);
			System.out.println("--> APROVADO!");
		}
		else if(m < 7 && m >= 4){
			System.out.printf("--> MÉDIA FINAL: %.1f %n", m);
			System.out.println("--> RECUPERAÇÃO!");
		}
		else{
			System.out.printf("--> MÉDIA FINAL: %.1f %n", m);
			System.out.println("--> REPROVADO!");	
		}
		
	}
}
