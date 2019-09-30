package padraocomposicao;

import java.util.List;

public class Preto extends Cor {

	@Override
	void assumir(No no, List<No> no2) {
		no2.add(no);
	}
}
