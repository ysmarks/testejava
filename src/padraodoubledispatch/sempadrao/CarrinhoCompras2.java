package padraodoubledispatch.sempadrao;

import java.util.List;

/**
 * @author ysantos Exemplo de como implementar produtos atraves de sobrecarga de
 *         metodos
 */
public class CarrinhoCompras2 {

	private List<Produto> produtos;

	/**
	 * @param produtoDigital 
	 * Adicionando um produto digital
	 */
	public void adicionaProduto(ProdutoDigital produtoDigital) {
		produtos.add(produtoDigital);
		adicionaPropriedade("Preco ", produtoDigital.getPreco());
		adicionaPropriedade("Download ", produtoDigital.getTamanho());
	}

	/**
	 * @param produtoFisico
	 * Adiciona um produto fisico
	 */
	public void adicionaProduto(ProdutoFisico produtoFisico) {
		produtos.add(produtoFisico);
		adicionaPropriedade("Preco ", produtoFisico.getPreco());
		adicionaPropriedade("Volume ", produtoFisico.getVolume());
		adicionaPropriedade("Preco ", produtoFisico.getPreco());
	}

	private void adicionaPropriedade(String string, double preco) {

	}
}
