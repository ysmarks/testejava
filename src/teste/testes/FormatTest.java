package teste.testes;

public class FormatTest {

	public static void main(String[] args) {
		String nome = "teste";
		String formatarString = String.format("bem vindo %s! ", nome);
		
		System.out.println(formatarString);
	}
}
