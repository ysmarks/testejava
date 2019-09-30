package testeWeSevice;

import javax.xml.soap.SOAPException;

public interface IListagemLivro {

	 void criarLivro(Livro livro, Usuario usuario)
			throws UsuarioNaoAutorizadoException, SOAPException;
}
