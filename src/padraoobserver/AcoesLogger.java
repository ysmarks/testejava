package padraoobserver;

public class AcoesLogger implements Observador {

	@Override
	public void mudancaQuantidade(String acao, Integer qtd) {
		System.out.println("Alterada a quantidade da a��o " + acao + " para " + qtd);
		
	}

}
