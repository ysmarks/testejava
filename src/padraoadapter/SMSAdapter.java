package padraoadapter;

public class SMSAdapter implements SMSSender{

	private EnviadorSMS env;
	
	public SMSAdapter(EnviadorSMS env) {
		super();
		this.env = env;
	}

	@Override
	public boolean sendSMS(SMS sms) {
		
		String origem = sms.getOrigem();
		String destino = sms.getDestino();
		String [] mensagens = quebraMensagem(sms.getTexto());
		
		try {
			env.enviarSMS(origem, destino, mensagens);
			
		} catch (SMSException e) {
		
			return false;
		}
		return true;
	}

	private String[] quebraMensagem(String texto) {
		int size = texto.length();
		int qtd = (size % 160 == 0)? size / 160: size / 160 + 1;
		String [] msgs = new String[qtd];
		for (int i = 0; i < qtd; i++) {
			int min = i * 160;
			int max = (i == qtd - 1)? size: (i + 1) * 160;
			msgs[i] = texto.substring(min, max);
		}
		return msgs;
	}

}
