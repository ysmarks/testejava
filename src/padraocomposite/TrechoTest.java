package padraocomposite;

public class TrechoTest {

	public static void main(String[] args) {
		TrechoSimples t1 = new TrechoSimples("São paulo", "Buenos Aires", 500);
		TrechoSimples t2 = new TrechoSimples("Buenos Aires", "Orlando", 800);
		TrechoSimples t3 = new TrechoSimples("Orlando", "Nova York", 300);
		TrechoComposto c1 = new TrechoComposto(t2, t3, 20);
		TrechoComposto c2 = new TrechoComposto(t1, c1, 25);
		System.out.println(c2.getOrigem());
		System.out.println(c2.getDestino());
		System.out.println(c2.getPreco());
	}
}
