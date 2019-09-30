package padraoproxydecorator;

import java.io.IOException;

public class TentativasRepedidas implements AcessoRemoto {

	private AcessoRemoto acesso;
	private int maximoTentativas;
	
	
	public TentativasRepedidas(AcessoRemoto acesso, int maximoTentativas) {
		super();
		this.acesso = acesso;
		this.maximoTentativas = maximoTentativas;
	}


	@Override
	public byte[] buscarArquivo(String url) throws IOException {
		int tentativas = 0;
		IOException ultimoErro = null;
		
		while(tentativas < maximoTentativas) {
			try {
				return acesso.buscarArquivo(url);
			} catch(IOException e) {
				tentativas ++;
				ultimoErro = e;
			}
		}
		throw ultimoErro;
	}

}
