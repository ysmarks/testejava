package conclusaopadroes;

/**
 * Restringindo os observadores com um tipo genérico
 * @author ysantos
 *
 * @param <E>
 */
public interface Observavel<E> {

	void adicionaObservador(Observado<? super E> o);
}
