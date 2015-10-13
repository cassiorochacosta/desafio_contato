package br.com.htcursos.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

// Spring
@Repository
public class CidadeDao implements InterfaceDAO {
	// Dependencia
	@PersistenceContext
	EntityManager em;

	public CidadeDao(EntityManager em) {
		this.em = em;
	}

	@Override
	public Object salvar(Object t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(Object t) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object buscarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object buscarLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
