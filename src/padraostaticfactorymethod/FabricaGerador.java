package padraostaticfactorymethod;

public class FabricaGerador {

	public static final String ZIP = "ZIP";
	public static final String CRYPTO = "CRYPTO";
	
	public static GeradorArquivo criarGeradorXML(String... processadores) {
		GeradorArquivo xml = new GeradorXML();
		xml.setProcessador(criarProcessador(processadores));
		return xml;
	}
	
	public static GeradorArquivo criarGeradorPropriedades(String...processadores) {
		GeradorArquivo xml = new GeradorPropriedade();
		xml.setProcessador(criarProcessador(processadores));
		
		return xml;
	}

	private static PosProcessador criarProcessador(String... processadores) {
	
		if(processadores.length > 1) {
			PosProcessadorComposto pp = new PosProcessadorComposto();
			for (String proc : processadores) {
				pp.add(criarProcessador(proc));
			}
			return pp;
		}else if (processadores[0].equals(ZIP)) {
			return new Compactador();
		}else if(processadores[0].equals(CRYPTO)) {
			return new Cryptografador();
		}
		return null;
		
	}
	
	
	
}
