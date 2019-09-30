package padraocomposicao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

/**
 * 
 * @author ysantos
 * classe que demostra a utilização de composição
 * com o padrão Bridge
 *
 */
public abstract class GeradorArquivo {

	private PosProcessador processador;

	//metodo set
	public void setProcessador(PosProcessador processador) {
		this.processador = processador;
	}
	
	//metodo gerar arquivo
	public void gerarArquivo(String nome, Map<String, Object> prop) throws IOException {
		String conteudo = gerarConteudo(prop);
		byte[] bytes = conteudo.getBytes();
		byte[] bytes2 = processador.processar(bytes);
		
		FileOutputStream outputStream = null;
		try {
		outputStream = new FileOutputStream(nome);
		outputStream.write(bytes2);
		
		}catch(Exception e) {
			
		}finally {
			outputStream.close();
		}
	}
	
	//metodo gerar conteudo
	protected abstract String gerarConteudo(Map<String, Object> prop);
	
}
