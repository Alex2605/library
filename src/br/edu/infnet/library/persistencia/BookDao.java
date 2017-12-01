package br.edu.infnet.library.persistencia;

import br.edu.infnet.library.modelo.Book;

public class BookDao extends JpaDao<Book>{

	public BookDao() {
		super(Book.class);
}
	
}

