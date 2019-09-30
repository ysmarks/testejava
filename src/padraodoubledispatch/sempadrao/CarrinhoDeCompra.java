package padraodoubledispatch.sempadrao;

import java.util.List;
/**
 * 
 * @author ysantos
 * Exemplo de como criar o carrinho de compra sem padrão utilizando
 * um metodo apenas com varias condicionais para cada produto
 *
 */
public class CarrinhoDeCompra {

	private List<Produto> produtos;
	
	public void adicionaProduto(Produto p) {
		produtos.add(p);
		if(p instanceof ProdutoDigital) {
			ProdutoDigital produtoDigital = (ProdutoDigital) p;
			adicionarPropriedade("Preco ", produtoDigital.getPreco());
			adicionarPropriedade("Download ", produtoDigital.getTamanho());
		}else if(p instanceof ProdutoFisico) {
			ProdutoFisico produtoFisico = (ProdutoFisico) p;
			adicionarPropriedade("Preco ", produtoFisico.getPreco());
			adicionarPropriedade("Volume ", produtoFisico.getVolume());
			adicionarPropriedade("Peso ", produtoFisico.getPeso());
		}else {
			//mais condicionais para outros produtos
		}
	}

	private void adicionarPropriedade(String string, double preco) {
	
		
	}
}
