public class Bozo {
	
	public static void main(String[] args) throws Exception {
		Placar placar = new Placar();
		RolaDados dados= new RolaDados(5);
		
		int[] dadosSorteados = new int[5];
		int aux;
		String ler = "";
		
		for(int i = 0; i<10; i++) {
			System.out.print("Aperte enter para começar a rodada "+ (i+1));
			
			EntradaTeclado.leString();
			
			dadosSorteados = dados.rolar();
			System.out.println(dados);
			
			System.out.println("Digite quais deseja rolar de novo : ");		
			while(true) {
				try {
					ler = EntradaTeclado.leString();
					dadosSorteados = dados.rolar(ler);
					break;
				} catch (NumberFormatException e) {
					System.out.println("Digite um valor válido: ");
				}
			}
			System.out.println(dados);
			
			System.out.println("Digite quais deseja rolar de novo : ");
			while(true) {
				try {
					ler = EntradaTeclado.leString();
					dadosSorteados = dados.rolar(ler);
					break;
				} catch (NumberFormatException e) {
					System.out.println("Digite um valor válido: ");
				}
			}
			System.out.println(dados);
			
			System.out.print("Placar: "+ placar);
			
			System.out.println("Inseria posição para tomar:");
			
			
			while(true) {
				try {
					aux = EntradaTeclado.leInt();
					placar.add(aux-1, dadosSorteados);
					if(aux>10 || aux<1) 
						throw new IllegalArgumentException("");
					break;
				} catch (IllegalArgumentException e) {
					System.out.println("Insira uma posição válida ou vazia:");
				}
			}
			
			System.out.print("Novo placar:"+ placar);
			
		}
		
		System.out.print("\nPontos: "+ placar.getScore());
	}

}