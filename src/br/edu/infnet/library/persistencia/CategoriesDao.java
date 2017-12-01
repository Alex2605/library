package br.edu.infnet.library.persistencia;


import br.edu.infnet.library.modelo.Categories;

public class CategoriesDao extends JpaDao<Categories>{

	public CategoriesDao() {
		super(Categories.class);
	}
}
