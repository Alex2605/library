package br.edu.infnet.library.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Author {

	@Id 
	@GeneratedValue
	private Integer id;
	private String author_firstname;
	private String authorsuname;
	
	@OneToMany
	private Book book;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAuthor_firstname() {
		return author_firstname;
	}

	public void setAuthor_firstname(String author_firstname) {
		this.author_firstname = author_firstname;
	}

	public String getAuthorsuname() {
		return authorsuname;
	}

	public void setAuthorsuname(String authorsuname) {
		this.authorsuname = authorsuname;
	}


	

}
