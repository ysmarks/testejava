package conclusaopadroes;

/**
 * Restringindo os observadores com um tipo gen�rico
 * @author ysantos
 *
 * @param <E>
 */
public interface Observavel<E> {

	void adicionaObservador(Observado<? super E> o);
}
