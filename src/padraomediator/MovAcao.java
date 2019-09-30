package padraomediator;

public class MovAcao /*extends ApplicationEvent*/ {

	private String acao;
	private Integer qtd;
	
	public MovAcao(String acao, Integer qtd) {
		super();
		this.acao = acao;
		this.qtd = qtd;
	}
	
	public String getAcao() {
		return acao;
	}
	public void setAcao(String acao) {
		this.acao = acao;
	}
	public Integer getQtd() {
		return qtd;
	}
	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}
	
	
}
