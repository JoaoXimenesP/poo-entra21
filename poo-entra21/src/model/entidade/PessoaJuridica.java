package model.entidade;

public class PessoaJuridica extends Pessoa {

	private String cnpj;

	public PessoaJuridica(String nome, String cnpj) {
		super(nome);
		this.cnpj = cnpj;
	}
	
	@Override
	public String getApelido() {
		return this.getNome() + " LTDA";
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public boolean verificarAdimplente() {
		double saldoGeral = 0;
		for(int i=0;  i <this.getContas().size(); i++ ) {
			saldoGeral += this.getContas().get(i).getSaldo();
		}
		setAdimplente(false);
		
		if (saldoGeral > - 500) {
			setAdimplente(true);
		}
		
		return isAdimplente();
	}
}

