package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNum {
	
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro n�mero:");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo n�mero:");
		
		//System.out.println(valor1 + valor2);
		
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);
		double soma = num1 + num2;
		
		System.out.println("A soma � "+soma+", e m�dia "+soma/2);
		
	}
}
