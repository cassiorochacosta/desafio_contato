package br.com.htcursos.dao;

import java.util.List;


public interface InterfaceDAO<T> {
	

	public T salvar (T t);
	
	public void excluir(T t) throws DAOException;
	
	public T buscarPorId(int id);
	
	public List<T> buscarTodos ();

	public T buscarLogin(String login);
	
}
