package testeWeSevice;

import javax.xml.ws.WebFault;

@WebFault(targetNamespace = "http://servicos.estoque.knight.com/excecoes/", name = "naoAutorizado")
public class UsuarioNaoAutorizadoException extends Exception {

	private static final long serialVersionUID = 1L;

	public UsuarioNaoAutorizadoException() {}
	
	public UsuarioNaoAutorizadoException(String message) {
		super(message);
	}
	
	public UsuarioFaultInfo getFaultInfo() {
		return new UsuarioFaultInfo(getMessage());
	}
	
	
	
}
