package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamInterandoTest {

	public static void main(String[] args) {
		
		List<pessoa> pessoas = Arrays.asList(
				new pessoa("teste1", "teste@email.com"),
				new pessoa("teste2", "teste@email.com"),
				new pessoa("teste3", "teste@email.com"),
				new pessoa("teste4", "teste@email.com"));
		pessoas.stream().forEach(p -> System.out.println(p.getNome()));
		Stream<pessoa> filter = pessoas.stream().filter(p -> p.getNome().equals("teste5"));
		filter.forEach(f -> System.out.println(f.getNome()));
	}
}
class pessoa {
	
	String nome;
	String email;
	
	public pessoa(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
