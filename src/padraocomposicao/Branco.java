package padraocomposicao;

import java.util.List;

public class Branco extends Cor {

	@Override
	public void busca(No no, List<No> lista) {
		no.setCor(new Cinza(), lista);
	}
}
