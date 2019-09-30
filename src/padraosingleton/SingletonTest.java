package padraosingleton;

public class SingletonTest {

	public static void main(String[] args) {
		Configuracao configuracao = Configuracao.getInstancia();
		System.out.println(configuracao);
	}
}
