package teste.testes;

import java.util.Scanner;

/**
 * 
 * @author ysantos Determine a quantidade de homens e mulheres (separadamente)
 *         que são maiores de idade, baseado numa lista de 10 pessoas.
 */
public class Teste03 {

	public static void main(String[] args) {

		int idade, sexo, contador = 1, contMasc = 0, contFem = 0;
		Scanner scanner = new Scanner(System.in);

		while (contador <= 10) {
			System.out.println("Informe a idade: ");
			idade = scanner.nextInt();
			System.out.println("Informe o sexo: 1-masculino 2-feminino");
			sexo = scanner.nextInt();

			if ((sexo != 1) && (sexo != 2)) {
				System.out.println("Opção Invalida.");
				contador--;
			}
			if ((idade >= 18) && (sexo == 1)) {
				contMasc++;
			} else if ((idade >= 18) && (sexo == 2)) {
				contFem++;
			}
			contador++;
		}
		System.out.println("A quantidade de mulheres maiores de idade é: " + contFem + " mulheres");
		System.out.println("A quantidade de homens maiores de idade é: " + contMasc + " homens");
	}
}
