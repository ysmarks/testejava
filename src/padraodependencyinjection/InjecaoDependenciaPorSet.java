package padraodependencyinjection;

import java.sql.Connection;

public class InjecaoDependenciaPorSet {

	private Connection connection;

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	
}
