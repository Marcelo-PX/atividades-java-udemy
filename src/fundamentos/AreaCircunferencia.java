package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		
		double raio = 5;
		final double PI = 3.14;
				
		double area = PI * raio * raio;
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("�rea = " +area+ " m2");
	}
}
