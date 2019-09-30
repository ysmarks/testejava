package conclusaopadroes;
/**
 * Defini��o de um observador com tipo gen�rico
 * @author ysantos
 *
 * @param <E>
 */
public interface Observado<E> {

	void notificar(E evento);
}
