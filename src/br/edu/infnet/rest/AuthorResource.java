package br.edu.infnet.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.infnet.library.modelo.Author;

@Path("/Authors")
public class AuthorResource {
	
	public AuthorResource() {
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Author> getAlunos(){
		List<Author> lista = new ArrayList<Author>();
		lista.add(new Author());
		return lista;
	}

}

