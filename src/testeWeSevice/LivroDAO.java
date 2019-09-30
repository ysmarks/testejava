package testeWeSevice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LivroDAO {

	public List<Livro> listarLivros() {
		Livro livro1 = new Livro();
		livro1.setNome("ysmarks");
		livro1.setEditora("Familia Abençoada");
		livro1.setAnoDePublicacao("2019");
		livro1.setAutores(Arrays.asList("Kelly", "David", "Rita"));
		livro1.setResumo("Livro bom");
		
		List<Livro> lista = new ArrayList<>();
		lista.add(livro1);
		
		return lista;
	}

	public List<Livro> listarLivrosPaginacao(Integer numeroDaPagina, Integer TamanhoDaPagina) {
		
		Livro livro1 = new Livro();
		livro1.setNome("ysmarks");
		livro1.setEditora("Familia Abençoada");
		livro1.setAnoDePublicacao("2019");
		livro1.setAutores(Arrays.asList("Kelly", "David", "Rita"));
		livro1.setResumo("Livro bom");
		
		List<Livro> lista = new ArrayList<>();
		lista.add(livro1);
		
		
		return lista;
	}

	public void criarLivro(Livro livro) {
		
		
	}

}
