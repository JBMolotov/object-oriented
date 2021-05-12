import java.io.IOException;

public class Exercicio1 {

	public static void main(String[] args) throws IOException {
		double x0 = 0 , x = 0, x_ant = 0;
				
		System.out.println("Entre x");
		x = EntradaTeclado.leDouble();
		System.out.println("Entre x0");
		x0 = EntradaTeclado.leDouble();	
		
		do {
			x_ant = x0;
			x0 = ( x_ant +( x / x_ant )) / 2; 
		} while ((x0 - x_ant) >= 0.00000001);
		
		System.out.println("Raiz = " + x0);
	}

}
