package padraocommand;

public class ComandoNaoEncontradoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public ComandoNaoEncontradoException(String mensagem) {
		super(mensagem);
	}

}
