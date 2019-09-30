package padraocomposite;

public class TrechoComposto implements TrechoAereo {

	private TrechoAereo primeiro;
	private TrechoAereo segundo;
	private double taxaConecxao;
	
	
	public TrechoComposto(TrechoAereo primeiro, TrechoAereo segundo, double taxaConecxao) {
		super();
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.taxaConecxao = taxaConecxao;
		if (primeiro.getDestino() != segundo.getOrigem()) {
			throw new RuntimeException("O destino do primeiro" + "não é igual a origem do segundo");
		}
	}

	@Override
	public String getOrigem() {
		
		return primeiro.getOrigem();
	}

	@Override
	public String getDestino() {
		
		return segundo.getDestino();
	}

	@Override
	public double getPreco() {
		
		return primeiro.getPreco() + segundo.getPreco() + taxaConecxao;
	}

}
