package padraocomposicao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No {

	private Set<No> adjacente = new HashSet<>();
	private String nome;
	private Cor cor;
	
	public No(String nome) {
		this.nome = nome;
		cor = new Branco();
	}
	
	public void buscaProfundidade(List<No> lista) {
		cor.busca(this, lista);
	}

	public Set<No> getAdjacente() {
		return adjacente;
	}
	
	public void addAdjacentes(No adj) {
		adjacente.add(adj);
	}
	
	public void setCor(Cor cor, List<No> lista) {
		this.cor = cor;
		cor.assumir(this, lista);
	}
	
	public String toString() {
		return nome;
	}
	
	
}
