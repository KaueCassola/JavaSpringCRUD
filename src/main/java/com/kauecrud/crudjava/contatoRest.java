package com.kauecrud.crudjava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kauecrud.crudjava.database.reposCrud;
import com.kauecrud.crudjava.entidade.contato;

@RestController
@RequestMapping("/contato")
@CrossOrigin( origins = {"http:localhost:80", "http://localhost"}, 
methods = {RequestMethod.GET, RequestMethod.POST})
public class contatoRest {
	@Autowired
	private reposCrud repositorio;
	
	@GetMapping
	public List<contato> listar(){
		return repositorio.findAll();
		
	}
	@PostMapping
	public void salvar(@RequestBody contato Contato) {
		repositorio.save(Contato);
	}
	@PutMapping
	public void alterar(@RequestBody contato Contato) {
		repositorio.save(Contato);	
	}
	@DeleteMapping
	public void delete(@RequestBody contato Contato) {
		repositorio.delete(Contato);
	}
	
}
