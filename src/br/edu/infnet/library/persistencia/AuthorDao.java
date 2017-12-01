package br.edu.infnet.library.persistencia;

import br.edu.infnet.library.modelo.Author;

public class AuthorDao extends JpaDao<Author> {

	public AuthorDao() {
		super(Author.class);
	}

}
