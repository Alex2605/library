package br.edu.infnet.library.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity

public class Book {

	@Id 
	@GeneratedValue
	private Integer id;
	private String isbn;
	private String date_of_publication;
	
	@ManyToMany
	private Categories categories;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getDate_of_publication() {
		return date_of_publication;
	}

	public void setDate_of_publication(String date_of_publication) {
		this.date_of_publication = date_of_publication;
	}

	public Categories getCategories() {
		return categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

}

