package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {

	void insert(Seller obj); //insere o obj no banco de dados//
	void update(Seller obj); //atualiza o obj no banco de dados//
	void deleteById(Integer id); //deleta o id//
	Seller findById(Integer id); //consulta o id//
	List<Seller> findAll();  //retorna todos os departamentos//
}
