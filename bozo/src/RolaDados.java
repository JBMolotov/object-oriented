public class RolaDados {
	private Dado[] dados;
	private int dadosc;

	public RolaDados(int n) {
		if (n < 1)
			throw new IllegalArgumentException("Dados tem que ser positivo e diferente de zero");
		
		dadosc = n;
		dados = new Dado[n];
		
		for (int i = 0; i < dadosc; ++i)
			dados[i] = new Dado();
	}
	
	
	
	public int[] rolar() {
		int[] ret = new int [dadosc];
		
		for (int i = 0; i < dadosc; ++i)
			ret[i] = dados[i].rolar();
		
		return ret;
	}
	
	public int[] rolar(boolean[] quais) {
		int[] ret = new int [dadosc];
		
		for (int i = 0; i < dadosc; ++i)
			if (quais[i])
				ret[i] = dados[i].rolar();
		
		return ret;
	}
	
	public int[] rolar(String str) {
		int [] ret = new int [dadosc];
		if(!str.isEmpty()) {
			String[] sstr = str.split(" ");
			
			for (int i = 0; i < sstr.length; ++i) {
				int pos = Integer.parseInt(sstr[i]);
				if (pos > 0 && pos <= dadosc)
					dados[pos - 1].rolar();
			}
		}
		
			
		for (int i = 0; i < dadosc; ++i)
			ret[i] = dados[i].getLado();
		
		return ret;
	}
	
	public String toString() {
		String ret = "";
		String[][] sstr = new String[dadosc][];
		
		
		for (int i = 0; i < dadosc; ++i)
			sstr[i] = dados[i].toString().split("\\n");
		
		for (int i = 0; i < dadosc; ++i) {
			ret += i + 1;
			ret += "       ";
		}
		
		ret += '\n';

		for (int i = 0; i < sstr.length; ++i) {
			for (int j = 0; j < dadosc; ++j)
				ret += sstr[j][i] + ' ';
			ret += '\n';
		}
		
		ret += '\n';
		return ret;
	}
	
	public static void main(String[] args) {
		RolaDados rd = new RolaDados(5);
		System.out.println(rd);

		rd.rolar();
		System.out.println(rd);
		
		boolean[] b = new boolean[] {false, false, true, false, false};
		rd.rolar(b);
		System.out.println(rd);
		
		rd.rolar("2 5 6");
		System.out.println(rd);
	}
}