package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "bom dia x";
		s = s.replace("x", "senhor");
		s = s.toUpperCase();
		s = s.concat("!");
		
		System.out.println(s);
		
		String x = "marcelo".toUpperCase();
		System.out.println(x);
		
		String y = "bom dia x"
				.replace("x","marcelo") 
				.toUpperCase()
				.concat("!");
		
		System.out.println(y);
		
		// Tipos primitivos não tem operador "."
		
		int a = 3;
		System.out.println(a);
		
	}
}
