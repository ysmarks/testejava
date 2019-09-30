package padraocommand;

import java.util.LinkedList;
import java.util.Queue;

public class ExecutorComandos {

	private Queue<Comando> feito;
	private Queue<Comando> desfeito;
	
	//Construtor
	public ExecutorComandos() {
		feito = new LinkedList<>();
		desfeito = new LinkedList<>();
	}
	
	/*
	 * Metodo Executa comando
	 */
	public void executarComando(Comando c) {
		c.fazer();
		feito.offer(c);
		desfeito.clear();
	}
	
	/*
	 * Metodo desfazer comando
	 */
	public void desfazer() {
		if(!feito.isEmpty()) {
			Comando c = feito.poll();
			c.desfazer();
			desfeito.offer(c);
			
		}
	}
	
	/*
	 * Metodo refazer comando
	 */
	public void refazer() {
		if(!desfeito.isEmpty()) {
			Comando c = desfeito.poll();
			c.fazer();
			feito.offer(c);
		}
	}
}
