package padraofacade;

import java.util.Map;

public interface GeradorArquivo {

	void setProcessador(Compactador compactador);

	void gerarArquivo(String nome, Map<String, Object> propriedade);

}
