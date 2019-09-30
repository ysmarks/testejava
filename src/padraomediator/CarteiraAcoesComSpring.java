package padraomediator;

import java.util.HashMap;
import java.util.Map;

public class CarteiraAcoesComSpring /*implements ApplicationEventPublisherAware*/{

	private Map<String, Object> acoes = new HashMap<>();
	//private ApplicationEventPublisher  publicador;
	
	/*
	 * public void setApplicationEventPublisher(ApplicationEventPublisher ap) {
	 * this.publicador = ap; }
	 */
	public void adicionaAcao(String acao, Integer qtd) {
		if(acoes.containsKey(acao)) {
			//qtd += acoes.get(acao);
		}
		acoes.put(acao, qtd);
		MovAcao movAcao = new MovAcao(acao, qtd);
		//publicador.publishEvent(evento);
	}
}
