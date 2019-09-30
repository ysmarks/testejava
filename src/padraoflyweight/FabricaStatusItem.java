package padraoflyweight;

import java.util.HashMap;
import java.util.Map;
/**
 * 
 * @author ysantos
 * Exemplo de como implementar o padrão flyweight + padrão singleton
 * para criação de uma unica instancia
 */
public class FabricaStatusItem {

	private static FabricaStatusItem statusItem = new FabricaStatusItem();
	private Map<String, StatusItem> mapa;
	
	public static FabricaStatusItem getInstance() {
		return statusItem;
	}
	
	/**
	 * Construtor privado
	 */
	private FabricaStatusItem() {
		mapa = new HashMap<>();
		mapa.put("CARINHO", StatusItem.criar("CARINHO", false, true));
		mapa.put("FECHADO", StatusItem.criar("FECHADO", false, true));
		mapa.put("PAGO", StatusItem.criar("PAGO", true, true));
		mapa.put("ENVIADO", StatusItem.criar("ENVIADO", true, false));
		mapa.put("Entregue", StatusItem.criar("Entregue", true, false));
	}
	
	public StatusItem get(String nome) {
		if(!mapa.containsKey(nome)) {
			throw new FabricaStatusItemException("Item inexistente " + nome);
		}
		return mapa.get(nome);
	}
}

