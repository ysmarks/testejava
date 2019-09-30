package padraocommand;

public abstract class ComandoCarrinho2 {

	private ComandoCarrinho2 carrinho2;

	public ComandoCarrinho2(ComandoCarrinho2 carrinho2) {
		
		this.carrinho2 = carrinho2;
	}
	
	public void executar() {
		executarComando();
		if (carrinho2 != null) {
			carrinho2.executar();
		}
	}

	protected abstract void executarComando();
	public abstract Object getResultado();
	
	
}
