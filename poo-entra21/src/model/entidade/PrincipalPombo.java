package model.entidade;

import java.util.ArrayList;

import  model.entidade.Administrador;
import  model.entidade.Pruu;
import model.entidade.Usuario;

public class PrincipalPombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Pruu> pruusFeed = new ArrayList<Pruu>();
		
		Usuario admin = new Administrador("Joao","Joao@gmail.com","123.456.789.11");
		Usuario ximenes = new Usuario("ximenes", "ximenes@hotmail.com", "258.369.147.12");
		
		Pruu pruuXimenes1 = new Pruu("To de Ferias", ximenes);
		Pruu pruuXimenes2 = new Pruu("To vendo muitas series ", ximenes);
		
		pruusFeed.add(pruuXimenes1);
		pruusFeed.add(pruuXimenes2);
		
		ArrayList<Pruu> pruusXimenes = new ArrayList<Pruu>();
		
		ximenes.setPruus(pruusXimenes);
		pruusXimenes.add(pruuXimenes1);
		pruusXimenes.add(pruuXimenes2);
		
		Usuario maria = new Usuario("Maria", "Maria@gmail.com", "666.777.888.20");
		Pruu pruuMaria1 = new Pruu("to comendo uma pizza agora.", maria);
		Pruu pruuMaria2 = new Pruu("essa serie é muito boa!", maria);
		
		pruusFeed.add(pruuMaria1);
		pruusFeed.add(pruuMaria2);
		
		ArrayList<Pruu> pruusMaria = new ArrayList<Pruu>();
		
		maria.setPruus(pruusMaria);
		pruusMaria.add(pruuMaria1);
		pruusMaria.add(pruuMaria2);
		maria.darLike(pruuXimenes2);
		maria.darLike(pruuXimenes2);
		
		ximenes.darLike(pruuMaria2);
		
		((Administrador) admin).bloquearPruu(pruuXimenes1);
		
		System.out.println("========== LISTA DE PRUUS ===========");
		
		for (int i = 0; i < pruusFeed.size(); i++) {
			System.out.println(pruusFeed.get(i));
			System.out.println("===================================================");
			}
		System.out.println("");
		System.out.println("========= PRUUS / Ximenes =========");
		
		for (int i = 0; i < pruusXimenes.size(); i++) {
			System.out.println(pruusXimenes.get(i));
			System.out.println("==============================================");
			}
		
		System.out.println("");
		System.out.println("======= PRUSS / Maria =========");
		
		for (int i = 0; i < pruusMaria.size(); i++) {
			System.out.println(pruusMaria.get(i));
			System.out.println("===============================================");
			}
	}
}
