package br.edu.infnet.library.modelo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity

public class Categories {
	@Id 
	@GeneratedValue
	private Integer id;
	private String category_name;
}
