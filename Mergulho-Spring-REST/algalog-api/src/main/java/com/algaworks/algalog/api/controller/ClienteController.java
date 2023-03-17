package com.algaworks.algalog.api.controller;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> Listar() {
	
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Cadu");
		cliente1.setEmail("cadu@gmail.com");
		cliente1.setTelefone("34 99896-4543");
		
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Carlos");
		cliente2.setEmail("Carlos@gmail.com");
		cliente2.setTelefone("34 99896-4543");
		
		
		return Arrays.asList(cliente1,cliente2) ;
	}

}
