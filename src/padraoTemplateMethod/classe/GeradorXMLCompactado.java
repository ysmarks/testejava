package padraoTemplateMethod.classe;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class GeradorXMLCompactado extends GeradorArquivo {

	protected byte [] processar(byte [] bytes) throws IOException {
		ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();
		ZipOutputStream out = new ZipOutputStream(byteOutput);
		out.putNextEntry(new ZipEntry("internal"));
		out.write(bytes);
		out.closeEntry();
		out.close();
		return byteOutput.toByteArray();
		
	}
	
	@Override
	protected String gerarConteudo(Map<String, Object> propriedades) {
		StringBuilder builder = new StringBuilder();
		builder.append("<properties>");
		for(String prop : propriedades.keySet()) {
			builder.append("<" + prop + ">" + propriedades.get(prop) + "</" + prop + ">");
		}
		builder.append("</properties>");
		return builder.toString();
	}

}
