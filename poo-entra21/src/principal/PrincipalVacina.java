package principal;

import java.util.Date;

import model.entidade.Vacina;
import model.repository.VacinaRepository;

public class PrincipalVacina {

	public static void main(String[] args) {
		
		Vacina novaVacina =  new Vacina();
		//novaVacina.setDataInicioPesquisa(new Date());
		//novaVacina.setEstagioPesquisa(1);
		//novaVacina.setNomePesquisadorResponsavel("Pedro Ximenis");
		//novaVacina.setPaisOrigem("Brasil");
		
		//if (novaVacina.getId()> 0);
		
		//System.out.println("Nova vacina salva.");
	
		Vacina vacinaQueTemNoBanco = new Vacina();
//		vacinaQueTemNoBanco.setId(4);
		vacinaQueTemNoBanco.setDataInicioPesquisa(new java.util.Date());
		vacinaQueTemNoBanco.setEstagioPesquisa(3);
		vacinaQueTemNoBanco.setPaisOrigem("EUA");
		vacinaQueTemNoBanco.setNomePesquisadorResponsavel("Andrey costa");
		
		VacinaRepository vacinaRep = new VacinaRepository();
		vacinaRep.inserir(vacinaQueTemNoBanco);
		System.out.println(vacinaQueTemNoBanco);
//		if(.atualizar(vacinaQueTemNoBanco)) {
//			System.out.println("Vacina atualizada.");
//		}
	}

	
}
