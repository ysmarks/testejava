package padraodynamicfactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FabricaDinamica {

	private Properties prop;
	
	public FabricaDinamica(String arquivo) throws FileNotFoundException, IOException {
		prop = new Properties();
		prop.load(new FileInputStream(arquivo));
	}
	
	public <E> E criaImplementacao(Class<E> nome) {
		
		String nomeClasse = prop.getProperty(nome.getName());
		
		if(nomeClasse == null) {
			throw new IllegalArgumentException("Interface não configurada");
		}
		
		try {
			Class class1 = Class.forName(nomeClasse);
			if(nome.isAssignableFrom(class1)) {
				return (E) class1.newInstance();
			}else {
				throw new IllegalArgumentException("Classe configurada não implementa a interface");
			}
				
		} 
		catch(ClassNotFoundException e) {
			throw new IllegalArgumentException("Classe configurada não existe",e);
		}
		catch (Exception e) {
			throw new IllegalArgumentException("Não foi possível criar a implementação",e);
			
		} 
	}
}
