package br.edu.infnet.library.persistencia;

public interface Dao<T> {

	void salvar(T entity);

	void atualizar(T entity);

	T getById(Integer id);

}