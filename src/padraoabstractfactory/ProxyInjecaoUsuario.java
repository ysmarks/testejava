package padraoabstractfactory;

import padraodependencyinjection.CienteUsuario;
import padraodependencyinjection.Executor;
import padraodependencyinjection.Usuario;

public class ProxyInjecaoUsuario implements Executor {

	private Executor executor;
	
	private Usuario usuario;

	public ProxyInjecaoUsuario(Executor executor, Usuario usuario) {
		this.executor = executor;
		this.usuario = usuario;
	}
	
	public void executar(Processo p) {
		if(p instanceof CienteUsuario) {
			((CienteUsuario)p).recebeUsuario(usuario);
		}
		executor.executar(p);
	}
	
	
}
