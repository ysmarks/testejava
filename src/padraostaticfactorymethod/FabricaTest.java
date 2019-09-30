package padraostaticfactorymethod;

public class FabricaTest {

	public static void main(String[] args) {
		
		GeradorArquivo arquivo = FabricaGerador.criarGeradorXML(FabricaGerador.ZIP, FabricaGerador.CRYPTO);
		System.out.println(arquivo.getClass());
	}
}
