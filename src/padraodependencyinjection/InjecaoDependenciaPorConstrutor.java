package padraodependencyinjection;

import java.sql.Connection;

public class InjecaoDependenciaPorConstrutor {

	private Connection connection;

	public InjecaoDependenciaPorConstrutor(Connection connection) {
		this.connection = connection;
	}
	
	
	
}
