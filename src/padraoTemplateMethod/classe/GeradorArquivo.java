package padraoTemplateMethod.classe;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public abstract class GeradorArquivo {

	public final void gerarArquivos(String nome, Map<String, Object> propriedades) throws IOException {
		String conteudo = gerarConteudo(propriedades);
		byte [] bytes = conteudo.getBytes();
		byte [] bytes1 = processar(bytes);
		FileOutputStream file = new FileOutputStream(nome);
		file.write(bytes1);
		file.close();
	}

	private byte[] processar(byte[] bytes) throws IOException {
		return bytes;
	}

	protected abstract String gerarConteudo(Map<String, Object> propriedades);
	
}
