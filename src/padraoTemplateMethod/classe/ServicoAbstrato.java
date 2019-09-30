package padraoTemplateMethod.classe;

import java.util.Map;

public abstract class ServicoAbstrato<E> {

	private GeradorArquivo geradorArquivo;

	public ServicoAbstrato(GeradorArquivo geradorArquivo) {
		super();
		this.geradorArquivo = geradorArquivo;
	}
	
	public abstract DAO<E> getDao();
	
	//Serviço geral
	public void gravarEntidadeEmArquivo(Object id, String nomeArquivo) {
		E entidade = getDao().recuperaPorId(id);
		/*
		 * geradorArquivo.gerarArquivos(nomeArquivo, ((Map<String, Object>)entidade).);
		 */
	}
}
