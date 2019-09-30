package teste.testes;

public class JsonPropertiesClasse {
	
	private long id;
	private String nome;
	private String cpf;
	private String rg;
	private String telefone;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return "JsonPropertiesClasse [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", telefone="
				+ telefone + "]";
	}
	
	

}
