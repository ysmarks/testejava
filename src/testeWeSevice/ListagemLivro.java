package testeWeSevice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.soap.SOAPException;
import javax.xml.ws.Endpoint;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService
public class ListagemLivro implements IListagemLivro {

	@WebResult(name = "livro")
	public List<Livro> listarLivros() {

		LivroDAO dao = new LivroDAO();

		return dao.listarLivros();

	}

	// @RequestWrapper(className = "testeWeSevice.jaxws.ListarLivrosPaginacao",
	// localName = "listarLivrosPaginacao")
	// (className = "testeWeSevice.jaxws.ListarLivrosPaginacaoResponse", localName =
	// "livrosPaginados")
	@WebMethod(operationName = "listarLivrosPaginacao")
	@WebResult(name = "listarLivrosPaginacao")
	public List<Livro> listarLivrosPaginacao(Integer numeroDaPagina, Integer TamanhoDaPagina) {
		LivroDAO dao = new LivroDAO();

		return dao.listarLivrosPaginacao(numeroDaPagina, TamanhoDaPagina);
	}

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8790/livros", new ListagemLivro());
		System.out.println("Servidor Rodando...");
	}

	@Override
	public void criarLivro(@WebParam(name = "livro") Livro livro, @WebParam(name = "usuario", header = true) Usuario usuario) throws UsuarioNaoAutorizadoException, SOAPException {

		LivroDAO dao = new LivroDAO();

		if (usuario.getLogin().equals("teste") && usuario.getSenha().equals("teste")) {
			dao.criarLivro(livro);

		} else {
			throw new UsuarioNaoAutorizadoException("Ocorreu um erro");
		}
	}
}
