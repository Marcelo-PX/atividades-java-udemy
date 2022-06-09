package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Ol� pessoal".charAt(2));
		
		String s = "bOa TaRdE";
		System.out.println(s.concat("!!!").toUpperCase());
		System.out.println(s+"!!!");
		System.out.println(s.startsWith("!!!"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.985;
		
		String maisUmaFrase = "nome: "+nome+"\nSobrenome: "+
				sobrenome+"\nIdade: "+idade+"\nSalario: "+salario
				+"\n\n";
		System.out.println(maisUmaFrase);
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f",
				nome, sobrenome, idade, salario);
		
		String frase = String.format("O senhor %s %s tem %d anos e ganha R$%.2f",
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(5, 10));
		
	}
}
