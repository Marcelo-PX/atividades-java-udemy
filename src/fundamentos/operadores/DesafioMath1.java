package fundamentos.operadores;

public class DesafioMath1 {
	
	public static void main(String[] args) {
		
		System.out.println("Faça um algoritmo para resolver a seguinte equação (por partes):\n");
		System.out.println("([6*(3+2)]^²/3*2-((1-5)*(2-7)/2)^²)^³/10³ \n");
		
		// Parte 1.0
		int a1 = 1;
		int a2 = 5;
		int a3 = a1-a2;
		
		// Parte 1.1
		int b1 = 2;
		int b2 = 7;
		int b3 = b1-b2;
		
		// Parte 1.2
		int ab1 = a3*b3;
		int ab2 = ab1/2;
		double t1 = Math.pow(ab2, 2);
		
		// Parte 2.0
		int c1 = 3;
		int c2 = 2;
		int c3 = c1+c2;
		
		// Parte 2.1
		int d1 = 6;
		int cd1 = d1*c3;
		double cd2 = Math.pow(cd1, 2);
		
		// Parte 2.2
		int e1 = 3;
		int e2 = 2;
		int e3 = e1*e2;
		double t2 = cd2/e3;
		
		// Parte 3.0
		double t3 = t2-t1;
		
		// Parte 3.1
		double x = Math.pow(t3, 3);
		double y = Math.pow(10, 3);
		
		// Parte 3.2
		int z = (int)x/(int)y;	
		System.out.print("RESULTADO: "+z);
		
	}
}
