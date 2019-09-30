package padraofacade;

import java.util.Map;
/**
 * 
 * @author ysantos
 *	Exemplo de implementação do padrão facade
 */
public class GeradorArquivoFacade {

	/**
	 * 
	 * @param nome
	 * @param propriedade
	 */
	public void gerarXMLCompactado(String nome, Map<String, Object> propriedade) {
		
		GeradorArquivo g = new GeradorXML();
		g.setProcessador(new Compactador());
		g.gerarArquivo(nome, propriedade);
	}
	
	/**
	 * 
	 * @param nome
	 * @param propriedade
	 */
	public void gerarPropriedadesCompactado(String nome, Map<String, Object> propriedade) {
		
		GeradorArquivo g = new GeradorPropriedade();
		g.setProcessador(new Compactador());
		g.gerarArquivo(nome, propriedade);
	}
	
	/**
	 * 
	 * @param nome
	 * @param propriedade
	 */
	public void gerarXMLCriptografado(String nome, Map<String, Object> propriedade) {
		
		GeradorArquivo g = new GeradorXML();
		g.setProcessador(new Criptografador());
		g.gerarArquivo(nome, propriedade);
	}
	
	/**
	 * 
	 * @param nome
	 * @param propriedade
	 */
	public void gerarPropriedadesCriptografado(String nome, Map<String, Object> propriedade) {
		
		GeradorArquivo g = new GeradorPropriedade();
		g.setProcessador(new Criptografador());
		g.gerarArquivo(nome, propriedade);
	}
}
