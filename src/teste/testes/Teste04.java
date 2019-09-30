package teste.testes;

import java.util.Scanner;

/**
 * 
 * @author ysantos
 *
 *Leia uma relação de pacientes de uma clínica, cada um com o nome, o sexo, o peso,
  a idade e a altura.  Para sinalizar o fim da lista será fornecido “fim” no nome do
  último paciente.
  Exiba um relatório contendo:
  i.    a quantidade de pacientes.
  ii.   a média de idade dos homens.
  iii.  a quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg.
  iv.  a quantidade de pessoas com idade entre 18 e 25.
  v.   o nome do paciente mais velho.
  vi.  o nome da mulher mais baixa.
  vii. – neste item, você cria uma situação interessante constrói o algoritmo
  correspondente.   
 */
public class Teste04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String nome, nomePacienteMaisVelho, nomeMulherMaisbaixa;
		int sexo, idade, qtdPacientes = 0, qtdMulheresAltura = 0, qtdPessoasIdadeDezoiteVinteCinco = 0, fim;
		float peso, altura, mediaIdadeHomens;
		
		System.out.println("Digite o nome: ");
		nome = scanner.next();
		System.out.println("Digite o sexo, 1-masculino, 2-feminino");
		sexo = scanner.nextInt();
		
		while ((sexo < 1) || (sexo > 2)) {
			System.out.println("Opção invalida.");
			System.out.println("Digite o sexo, 1-masculino, 2-feminino");
			sexo = scanner.nextInt();
		}
		System.out.println("Digite o peso (kg): ");
		peso = scanner.nextFloat();
		System.out.println("Digite a altura (m): ");
		altura = scanner.nextFloat();
		System.out.println("Digite a idade: ");
		idade = scanner.nextInt();
	}
}
