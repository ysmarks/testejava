package padraomediator;

import java.util.ArrayList;
import java.util.List;


public class GrupoObservacao implements Observador {

	private List<Observador> obs = new ArrayList<>();
	
	@Override
	public void mudancaQuantidade(String acao, Integer qtd) {
		for (Observador observador : obs) {
			observador.mudancaQuantidade(acao, qtd);
		}
		
	}
	
	public void addObservador(Observador o) {
		obs.add(o);
	}
	
	public void addCarteira(CarteiraAcoes ca) {
		ca.addObservador(this);
	}

}
