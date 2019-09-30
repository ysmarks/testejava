package padraodoubledispatch.compadrao;

import java.util.List;

public class CarrinhoCompra {

	private List<Produto> produtos;
	
	public void adicionaProduto(Produto p) {
		produtos.add(p);
		p.adicionaPropriedade(this);
	}

	public void adicionaPropriedade(String string, double preco) {
		
		
	}
}
