package padraoadapter;

public interface EnviadorSMS {

	void enviarSMS(String origem, String destino, String [] mensagens) throws SMSException;
}