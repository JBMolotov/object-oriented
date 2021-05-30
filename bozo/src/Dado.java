public class Dado {
	
	private int lados;
	private int ladoCima;
	private Random rand;
	
	public static void main(String[] args) {
		Dado d = new Dado();
		d.rolar();
		System.out.println("Lado resultado: \n"+d);
	}
	
	@Override
	public String toString() {
		String r = "";
		switch(ladoCima) {
			case 1: r += "+-----+\n"; 
					r += "|     |\n"; 
					r += "|  *  |\n"; 
					r += "|     |\n"; 
					r += "+-----+\n"; 
					break;
			case 2: r += "+-----+\n"; 
					r += "|    *|\n"; 
					r += "|     |\n"; 
					r += "|*    |\n"; 
					r += "+-----+\n"; 
					break;
			case 3: r += "+-----+\n"; 
					r += "|    *|\n"; 
					r += "|  *  |\n"; 
					r += "|*    |\n"; 
					r += "+-----+\n"; 
					break;
			case 4: r += "+-----+\n"; 
					r += "|*   *|\n"; 
					r += "|     |\n"; 
					r += "|*   *|\n"; 
					r += "+-----+\n"; 
					break;
			case 5: r += "+-----+\n"; 
					r += "|*   *|\n"; 
					r += "|  *  |\n"; 
					r += "|*   *|\n"; 
					r += "+-----+\n"; 
					break;
			case 6: r += "+-----+\n"; 
					r += "|*   *|\n"; 
					r += "|*   *|\n"; 
					r += "|*   *|\n"; 
					r += "+-----+\n"; 
					break;
		}
		return r;
	}
	

	public Dado() {
		lados = 6;
		rand = new Random();
		rolar();
	}
	

	public Dado(int n) {
		if (n <= 1)
			throw new IllegalArgumentException("Lados deve ser maior que 1");
		rand = new Random();
		lados = n;
		rolar();
	}
	
	public int rolar() {
		try {
			ladoCima = rand.getIntRand(1, lados+1);
		} catch(IllegalArgumentException e) {
			System.out.println("Quantidade de lados é inválida");
		}	
		
		return getLado();
	}

	
	public int getLado() {
		return ladoCima;
	}
	
	

}
