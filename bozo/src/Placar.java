import java.util.Arrays;

public class Placar {
	private int[][] dadosPosicao = new int[10][5];
	private int[] score = new int[10];
	
	public Placar() {
		Arrays.fill(score, -2);
	}
	
	public void add(int posicao, int[] dados) throws IllegalArgumentException {
		if (score[posicao] == -2) {
			dadosPosicao[posicao] = dados;
			score[posicao] = -1;
		} else {
			throw new IllegalArgumentException("Posição ocupada");
		}
	}
	
	public int getScore() {
		int res = 0;
		int aux;
		
		for(int i = 0; i < 10; i++) {
			if(score[i] != -2) {
				score[i] = 0;
				if(i<6) {
					res += (i+1) * dadosIguais(i, (i+1));
					score[i] = (i+1) * dadosIguais(i, (i+1));
				} else if(i==6) {
					aux = 0;
					for(int j = 0; j < 6; j++) {
						
						if(dadosIguais(i, j+1) == 5) {
							res += 15;
							score[i] = 15;
						} else if(dadosIguais(i, j+1) == 3){
							aux++;
						} else if(dadosIguais(i, j+1) == 2){
							aux++;
						}

					}
					if(aux == 2) { 
						res+= 15;
						score[i] = 15;
					}
				} else if(i==7) {
					aux = 0;
					for(int j = 0; j < 6; j++) {
						if(dadosIguais(i, j+1) == 1)
							aux++;
					}
					if(aux == 5) {
						res+= 20;
						score[i] = 20;
					}
				} else if(i==8) {
					for(int j = 0; j < 6; j++) {
						if(dadosIguais(i, j+1) == 4) {
							res+= 30;
							score[i] = 30;
						}
							
					}
				} else if(i==9) {
					for(int j = 0; j < 6; j++) {
						if(dadosIguais(i, j+1) == 5) {
							res+= 40;
							score[i] = 40;
						}
							
					}
				}
			}
			
				
		}
		return res;
	}
	
	private int dadosIguais(int posicao, int n) {
		int res = 0;
		for(int i = 0; i < 5; ++i) {
			if(dadosPosicao[posicao][i] == n) {
				res++;
			}
				
		}
		return res;
	}
	
	public String toString() {
		String ret = "\n\n";

		getScore();
		
		ret += (score[0] == -2) ? " (1) " : " "+ score[0] +" ";
		ret += " | ";
		ret += (score[6] == -2) ? " (7) " : " "+ score[6] +" ";
		ret += " | ";
		ret += (score[3] == -2) ? " (4) " : " "+ score[3] +" ";
		ret += "\n";
		ret+= "---------------------\n";
		ret += (score[1] == -2) ? " (2) " : " "+ score[1] +" ";
		ret += " | ";
		ret += (score[7] == -2) ? " (8) " : " "+ score[7] +" ";
		ret += " | ";
		ret += (score[4] == -2) ? " (5) " : " "+ score[4] +" ";
		ret += "\n";
		ret+= "---------------------\n";
		ret += (score[2] == -2) ? " (3) " : " "+ score[2] +" ";
		ret += " | ";
		ret += (score[8] == -2) ? " (9) " : " "+ score[8] +" ";
		ret += " | ";
		ret += (score[5] == -2) ? " (6) " : " "+ score[5] +" ";
		ret += "\n";
		ret+= "---------------------\n";
		ret += (score[9] == -2) ? "      | (10)  |" : "      | "+ score[9] +"  |";
		ret += "\n";
		ret+= "      +-------+ \n\n";
		
		
	
		return ret;
	}
}