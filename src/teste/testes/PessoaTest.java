package teste.testes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import teste.Pessoa;

public class PessoaTest {

	public static void main(String[] args) {
		List<Pessoa> pessoas = Arrays.asList(
				new Pessoa("Kelly", 34), 
				new Pessoa("Ysmarks", 31), 
				new Pessoa("Davi", 0),
				new Pessoa("Maria", 49),
				new Pessoa("Yara", 25));
		Stream<Pessoa> streamPessoa = pessoas.stream();
		Integer somaIdade = streamPessoa.filter(p -> p.getNome().startsWith("Y")).mapToInt(p -> p.getIdade()).sum();
		System.out.println(somaIdade);
	}
	
}
