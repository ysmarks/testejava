package padraoflyweight;

public class StatusItem {

	private final String nome;
	private final  boolean compraConcluida;
	private final boolean podeCancelar;
	
	private StatusItem(String nome, boolean compraConcluida, boolean podeCancelar) {
		this.nome = nome;
		this.compraConcluida = compraConcluida;
		this.podeCancelar = podeCancelar;
	}
	
	static StatusItem criar(String nome, boolean compraConcluida, boolean podeCancelar) {
		return new StatusItem(nome, compraConcluida, podeCancelar);
	} 

	public String getNome() {
		return nome;
	}

	public boolean isCompraConcluida() {
		return compraConcluida;
	}


	public boolean isPodeCancelar() {
		return podeCancelar;
	}

	
	
}
