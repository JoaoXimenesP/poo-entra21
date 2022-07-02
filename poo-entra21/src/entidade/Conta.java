package entidade;

public class Conta {

	private String numeroDaAgencia;
	private String numeroDaConta;
	private double saldo;
	
	
	public Conta() {
		super();
	}
	
	
	
	public Conta(String numeroDaAgencia, String numeroDaConta , double saldo ){
		super();
		this.numeroDaAgencia = numeroDaAgencia; 
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
		
	}
	
	public double sacar ( double valorSaque) {
		double valorSaqueEfetivo = 0;
		
		if(this.saldo >= valorSaque) {
			valorSaqueEfetivo = valorSaque;
		}else {
			valorSaqueEfetivo = this.saldo;
		}
		
		this.saldo = this.saldo - valorSaqueEfetivo;
		
	 return valorSaqueEfetivo;		
	}
	
	public void depositar(double valorDeposito) {
		this.saldo += valorDeposito;
	}
	
	public void efetuarRendimento(double percentualRendimento) {
		double indiceRendimento = percentualRendimento /100;
		this.saldo += saldo * indiceRendimento;
	}
	
	
	
	public String getNumeroDaAgencia() {
		return numeroDaAgencia;
	}
	public void setNumeroDaAgencia(String numeroDaAgencia) {
		this.numeroDaAgencia = numeroDaAgencia;
	}
	public String getNumeroDaConta() {
		return numeroDaConta;
	}
	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	public double getSaldo() {
		return saldo;
		
		
	}
	
	
	
}
