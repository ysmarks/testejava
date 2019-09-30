package padraocommand;

import java.util.List;

public class TamanhoParaDownload implements ComandoCarrinho, CienteDoProduto{

	private List<Produto> produtos;

	@Override
	public void setListaProdutos(List<Produto> produtos) {
		this.produtos = produtos;
		
	}

	@Override
	public Object executar() {
		double tamanho = 0;
		for (Produto produto : produtos) {
			if(produto.isDigital()) {
				tamanho =+ produto.getTamanhoDownload();
			}
		}
		return null;
	}
}
