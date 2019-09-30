package padraosingleton;

public class Configuracao {

	private static Configuracao instancia;
	
	public static Configuracao getInstancia() {
		if(instancia == null)
			instancia = new Configuracao();
		return instancia;
	}
	
	private Configuracao() {}
}
