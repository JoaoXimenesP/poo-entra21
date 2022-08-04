package model.repository;
import model.entidade.*;

public class VacinaRepository {

	//CRUD
	
	//Create
	public  Vacina inserir(Vacina novaVacina) {
		//TODO
		//INSERT INTO VACINA(...) VALUES (...)
		return novaVacina;
	}
	
	//Retrieve
	public Vacina pesquisarPorID(int id) {
		//TODO
		//SELECT * FROM VACINA
		//WHERE ID = 2;
		return null;
		
	}
	
	public ArrayLista<Vacina> pesquisar
	
	
	
	//Update
	public Vacina atualizar(Vacina vacina) {
		//TODO
		//UPDATE VACINA SET ESTAGIO_PESQUISA = 2
		//WHERE ID = 2;
		return vacina;
	}
	
	
	//Delete
	public boolean excluir(int id) {
		//TODO
		/*
		 * DELETE FROM VACINA
		 * WHERE ID = 1
		 * 
		 * */
		return false;
	}
	
	
	
	
	
}
