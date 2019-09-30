package padraoTemplateMethod.classe;

import java.util.List;

public interface DAO<E> {

	E recuperaPorId(Object id);
	void salvar(E e);
	void excuir(Object id);
	List<E> listarTodos();
}
