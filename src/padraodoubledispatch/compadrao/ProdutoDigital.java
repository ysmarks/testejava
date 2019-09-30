package padraodoubledispatch.compadrao;

public class ProdutoDigital extends Produto {

	private double preco;
	private double tamanho;
	
	

	@Override
	void adicionaPropriedade(CarrinhoCompra carrinhoCompra) {
		
		carrinhoCompra.adicionaPropriedade("Preco", getPreco());
		carrinhoCompra.adicionaPropriedade("Download", getTamanho());
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
}
