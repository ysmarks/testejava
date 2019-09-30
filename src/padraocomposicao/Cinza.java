package padraocomposicao;

import java.util.List;

public class Cinza extends Cor {

	@Override
	public void assumir(No no, List<No> lista) {
		for (No adj : no.getAdjacente()) {
			adj.buscaProfundidade(lista);
			no.setCor(new Preto(), lista);
		}
	}
}
