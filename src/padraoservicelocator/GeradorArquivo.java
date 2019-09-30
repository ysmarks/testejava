package padraoservicelocator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

public abstract class GeradorArquivo {

	private PosProcessador processador = new NullProcessador();
	
	public GeradorArquivo() {
		ServiceLoader<PosProcessador> loader = ServiceLoader.load(PosProcessador.class);
		Iterator<PosProcessador> iterator = loader.iterator();
		List<PosProcessador> list = new ArrayList<>();
		
		while(iterator.hasNext()) {
			list.add(iterator.next());
		}
		if(list.size() == 1) {
			processador = list.get(0);
		}else if(list.size() > 1) {
			processador = new PosProcessadorComposto();
		}
	}
}
