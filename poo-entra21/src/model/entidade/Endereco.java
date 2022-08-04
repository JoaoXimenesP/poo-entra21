package model.entidade;

public class Endereco {

	private String cep ;
	private String logradouro ;
	private String numeroDaCasa ;
	private String bairro ;
	private String estado ;
	private String cidade;
	
	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", logradouro=" + logradouro + ", numeroDaCasa=" + numeroDaCasa + ", bairro="
				+ bairro + ", estado=" + estado + ", cidade=" + cidade + "]";
	}
	
	public  Endereco () {
		
	super();
	
	}
	
	
	public Endereco (String cep, String logradouro, String numeroDaCasa, String bairro, String estado, String cidade) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.numeroDaCasa = numeroDaCasa;
		this.bairro = bairro;
		this.estado = estado;
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumeroDaCasa() {
		return numeroDaCasa;
	}
	public void setNumeroDaCasa(String numeroDaCasa) {
		this.numeroDaCasa = numeroDaCasa;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
}
