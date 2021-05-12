
public class Exercicio2 {

	public static void main(String[] args) {
		double a = 0, b = 0, c = 0, delta = 0, x1 = 0, x2 = 0;
		
		System.out.println("Digite a");
		a = numeroValido();
		System.out.println("Digite b");
		b = numeroValido();
		System.out.println("Digite c");
		c = numeroValido();
		
		delta = b*b - (4 * a * c);
		
		if (delta == 0) {
			x1 = (-b) / (2 * a) ; 
			System.out.println("x = " + x1);
			
		} else if (delta > 0 ) {
			x1 = ( (-b) + Math.sqrt(delta) ) / (2 * a) ;
			x2 = ( (-b) - Math.sqrt(delta) ) / (2 * a) ;
			
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		
		} else {
			System.out.println("Equação não possui resultados reais");
		}
		
		
		
	}
	
	public static Double numeroValido()
	{
		double x = 0;
		boolean read = false;
		
		while (!read)
			try {
				read = true;
				x = EntradaTeclado.leDouble();
			} catch (Exception e) {
				System.out.println("Valor não numérico, digite novamente");
				read = false;
			}

		return x;
	}

}
