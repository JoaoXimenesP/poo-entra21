package listaexercicios1;

import java.util.Iterator;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]numeros = new int [10];
		
		
		
		
		numeros [0] =  2;	
		numeros [1] = 11;
		numeros [3] = 45;
		numeros [4] = 77;
		numeros [5] = 87;
		numeros [6] = 14;
		numeros [7] = 7 ;
		numeros [8] = 9 ;
		numeros [9] = 4	;
		
		int mediaAritmeticaImpares = 0;
		int somaImpares = 0;
		int totalImpares = 0;
		
		for (int indiceArray = 0; indiceArray < numeros.length; indiceArray++) {
			int numeroAtual = numeros[indiceArray];
			int restoDivisaoPor2 = numeroAtual %2;
			
			if(restoDivisaoPor2 ==1) {
				somaImpares = somaImpares + numeroAtual;
				totalImpares++;
				
			}
		}
		mediaAritmeticaImpares = (somaImpares / totalImpares);
		System.out.println("media aritmética dos impares:" + mediaAritmeticaImpares);
	}

}
