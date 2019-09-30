package padraoproxydecorator;

public interface DAO {

	Identificavel recuperar(int id);
	void salvar(Identificavel indetificavel);
	void excluir(int id);
	
}
