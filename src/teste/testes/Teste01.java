package teste.testes;

import java.util.Random;
/**
 * 
 * @author ysantos
 * Exiba 50 números sorteados de 1 a 100 para o usuário.
 *
 */
public class Teste01 {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		
		for (int i = 0; i < 50; i++) {
			int x = aleatorio.nextInt(99);
			if(x == 70) {
				System.out.println("ACHOU!!!");
				break;
			}
			System.out.println(x + 1 + "\t");
		}
	}
}
