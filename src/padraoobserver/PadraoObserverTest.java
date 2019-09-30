package padraoobserver;

public class PadraoObserverTest {

	public static void main(String[] args) {
		GraficoBarras barras = new GraficoBarras();
		AcoesLogger acoesLogger = new AcoesLogger();
		CarteiraAcoes acoes = new CarteiraAcoes();
		
		acoes.addObservador(barras);
		acoes.addObservador(acoesLogger);
		
		try {
			Thread.sleep(2000);
			acoes.adicionarAcoes("COMP02", 200);
			Thread.sleep(2000);
			acoes.adicionarAcoes("EMP34", 400);
			Thread.sleep(2000);
			acoes.adicionarAcoes("ACDF89", 300);
			Thread.sleep(5000);
			acoes.adicionarAcoes("EMP34", -200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
