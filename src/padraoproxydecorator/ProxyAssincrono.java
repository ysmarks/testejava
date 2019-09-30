package padraoproxydecorator;

public class ProxyAssincrono implements Transacao {

	private Transacao transacao;
	
	
	public ProxyAssincrono(Transacao t) {
		super();
		this.transacao = t;
	}

	@Override
	public void executar() {
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				transacao.executar();
				
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
	}

}
