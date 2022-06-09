package fundamentos;

public class Wrapper {
	
	public static void main(String[] args) {
		
		/*	Para converter valores primitivos em objeto,
		 * 	trocar a letra inicial min�scula para Mai�scula
		 *  com exce��o do int, exemplo: 
		 *  
		 *  double (primitivo) --> Double (objeto)
		 * 	int (primitivo) ---> Integer (objeto)
		 * 
		 * 	Obs: Valores primitivos s�o imut�veis e 
		 * 	N�O possuem nota��o ponto '.'
		 */
		
		Byte b = 100;  
		Short s = 10_000;
		
		// Integer.parseInt(entrada.next());
		Integer i = 1_000_000_000;
		Long l = 100_000_000_000_000_000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i*2);
		System.out.println(l/5);
		
		Float f = 150.0F;
		System.out.println(f);
		
		Double d = 1500.0;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; //char
		System.out.println(c+"...");
		
	}

}
