package listaexercicios1;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]numeros = new int [10];
		
		
		//2 - preencher o array
		
		numeros [0] =  2;	
		numeros [1] = 11;
		numeros [3] = 45;
		numeros [4] = 77;
		numeros [5] = 87;
		numeros [6] = 14;
		numeros [7] = 7 ;
		numeros [8] = 9 ;
		numeros [9] = 4	;
		
		//3 - mostrar na rela (console) os valores pares
		// percorrer todo o array
		// para cada item
		// se ele for par -> mostrar na tela
		int totalPares = 0;
		
		for(int indiceArray = 0; indiceArray < numeros.length; indiceArray++ ) {
			int numeroAtual = numeros[indiceArray];
			int restoDivisaoPor2 = numeroAtual %2;
			
			if(numeroAtual > 0 && restoDivisaoPor2 == 0) {
				totalPares++;
				System.out.println(	"Número par encrontrado: " + numeroAtual);
			}
			
		}
		System.out.println("Total de números pares: " + totalPares);
	}

}
