package padraovisitor;

import java.util.List;
/**
 * 
 * @author ysantos
 * Exemplo de como utilizar o padrão visitor gof
 */
public class ComprasCliente implements Relatorio {

	private Cliente cliente;
	private List<Item> items;

	@Override
	public Object gerarRelatorio(FormatoVisitante visitante) {
		visitante.visitarTitulo("Compras de " + cliente.getNome());
		visitante.visitarParagrafo("CPF " + cliente.getCpf());
		visitante.visitarParagrafo("Cliente desde " + cliente.getData());
		visitante.visitarTabela();
		visitante.visitarTabelaCabecalho("Produto", "Data", "Valor");

		for (Item item : items) {
			visitante.visitarTabelaLinha(item.getProduto(), item.getData(), item.getValor());
		}
		visitante.visitarTabelaFim();
		return visitante.getResultado();
	}

}
