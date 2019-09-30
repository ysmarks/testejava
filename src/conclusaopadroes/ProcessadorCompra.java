package conclusaopadroes;

/**
 * Criando e conectando as interfaces com tipos genéricos
 * @author ysantos
 *
 */
public class ProcessadorCompra implements Observavel<CompraAcao> {

	@Override
	public void adicionaObservador(Observado<? super CompraAcao> o) {
		
		
	}

}
