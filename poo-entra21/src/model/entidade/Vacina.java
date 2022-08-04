package model.entidade;

public class Vacina {
	//Atributos
	private String paisDeOrigem;
	private int estagioDePesquisa;
	
	private String datadeInicioDaPesquisa;
	private String nomePesquisadorResponsavel;
	
	
	public String getPaisDeOrigem() {
		return paisDeOrigem;
	}
	public void setPaisDeOrigem(String paisDeOrigem) {
		this.paisDeOrigem = paisDeOrigem;
	}
	public int getEstagioDePesquisa() {
		return estagioDePesquisa;
	}
	public void setEstagioDePesquisa(int estagioDePesquisa) {
		this.estagioDePesquisa = estagioDePesquisa;
	}
	public String getDatadeInicioDaPesquisa() {
		return datadeInicioDaPesquisa;
	}
	public void setDatadeInicioDaPesquisa(String datadeInicioDaPesquisa) {
		this.datadeInicioDaPesquisa = datadeInicioDaPesquisa;
	}
	public String getNomePesquisadorResponsavel() {
		return nomePesquisadorResponsavel;
	}
	public void setNomePesquisadorResponsavel(String nomePesquisadorResponsavel) {
		this.nomePesquisadorResponsavel = nomePesquisadorResponsavel;
	}
	
	
}	
