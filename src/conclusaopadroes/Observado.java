package conclusaopadroes;
/**
 * Definição de um observador com tipo genérico
 * @author ysantos
 *
 * @param <E>
 */
public interface Observado<E> {

	void notificar(E evento);
}
