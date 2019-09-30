package teste.testes;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author ysantos
 * Crie um jogo para o usu�rio descobrir um n�mero sorteado de 1 a 100.
 * A cada tentativa dele, forne�a uma dica mostrando se o n�mero � maior ou menor.
 * Quando ele descobrir exiba uma mensagem de parab�ns e mostre em quantas tentativas ele conseguiu.
 */
public class Teste02 {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		Scanner scanner = new Scanner(System.in);
		int tentativas = 0, valor = 0;
		
		int x = aleatorio.nextInt(99);
		
		while (valor != x + 1) {
			System.out.println("Tente descobrir o numero. Digite o valor: ");
			valor = scanner.nextInt();
			
			if(valor < x + 1) {
				System.out.println("O valor e maior");
				tentativas ++;
			}else if(valor > x + 1) {
				System.out.println("O valor e menor");
				tentativas ++;
			}else {
				System.out.println("Parab�ns vc acertou");
				tentativas ++;
			}
			System.out.println("Tentativas: " + tentativas);
		}
		
	}
}
