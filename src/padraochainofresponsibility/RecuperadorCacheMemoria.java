package padraochainofresponsibility;

import java.util.HashMap;
import java.util.Map;

public class RecuperadorCacheMemoria extends RecuperadorArquivo {

	private Map<String, Arquivo> cache = new HashMap<>();
	
	public RecuperadorCacheMemoria(RecuperadorArquivo proximo) {
		super(proximo);
		
	}

	@Override
	protected Arquivo recuperarArquivo(String arquivo) {
		
		if (cache.containsKey(arquivo)) 
			return cache.get(arquivo);
		
		return null;
	}
	
	public Arquivo chamarProximo(String arquivo) {
		
		Arquivo a = super.chamarProximo(arquivo);
		cache.put(arquivo, a);
		
		return a;
	}

}
