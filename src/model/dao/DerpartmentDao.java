package model.dao;

import java.util.List;

import model.entities.Department;

public interface DerpartmentDao {

	void insert(Department obj); //insere o obj no banco de dados//
	void update(Department obj); //atualiza o obj no banco de dados//
	void deleteById(Integer id); //deleta o id//
	Department findId(Integer id); //consulta o id//
	List<Department> findAll();  //retorna todos os departamentos//
	
}
