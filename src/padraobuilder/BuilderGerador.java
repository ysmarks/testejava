package padraobuilder;

public class BuilderGerador {

	private GerandoArquivo instancia;
	
	public BuilderGerador gerandoEmXML() {
		
		instancia = new GerandoXML();
		
		return this;
	}
	
	public BuilderGerador gerandoEmPropriedade() {
		
		instancia = new GerandoPropriedade();
		
		return this;
	}
	
	public BuilderGerador emCriptografia() {
		
		adicionarPrtocessador(new Criptografar());
		
		return this;
	}
	
	public BuilderGerador emCompactacao() {
		
		adicionarPrtocessador(new Compactar());
		
		return this;
	}
	
	private void adicionarPrtocessador(PosProcessador p) {
		PosProcessador atual = instancia.getProcessador();
		
	}
	
	public GerandoArquivo construir() {
		return instancia;
	}
}
