package padraochainofresponsibility;

public abstract class RecuperadorArquivo {

	private RecuperadorArquivo proximo;

	public RecuperadorArquivo(RecuperadorArquivo proximo) {
		super();
		this.proximo = proximo;
	}
	
	public Arquivo recuperar(String arquivo) {
		Arquivo a = recuperarArquivo(arquivo);
		if(a == null || !a.isValido()) {
			return chamarProximo(arquivo);
		}else {
			return a;
		}
	}

	public Arquivo chamarProximo(String arquivo) {
		if(proximo == null) {
			throw new RuntimeException("Não foi possível " + " recuperar o arquivo");
		}
		return proximo.recuperar(arquivo);
	}

	protected abstract Arquivo recuperarArquivo(String arquivo);
}
