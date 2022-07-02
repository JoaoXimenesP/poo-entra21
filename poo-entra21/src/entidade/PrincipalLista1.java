package entidade;

public class PrincipalLista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double valorParaSacar = 1000;
		
		Conta conta1 = new Conta("123-7" , "12345-6", 300 );
		System.out.println("Saldo da conta: R$" + conta1.getSaldo());
		System.out.println("Solicitado o saque de R$" + valorParaSacar);
		
		double valorSacadoDeFato = conta1.sacar(valorParaSacar);
		System.out.println("Sacado R$" + valorSacadoDeFato);
		System.out.println("Saldo da conta: R$" + conta1.getSaldo());
	}

}
