package com.boot.contactos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.contactos.model.Contacto;
import com.boot.contactos.service.AgendaService;

@RestController
public class AgendaController {

	@Autowired
	AgendaService service;
	
	@GetMapping(value = "contactos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Contacto> obtenerContactos(){
		return service.obtenerContactos();
	}
	
	@GetMapping(value = "contactos/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Contacto obtenerContactoById(@PathVariable("id") int id ) {
		return service.obtenerContactoById(id);
	}
	
	@PostMapping(value = "contactos", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
	public String agregarContacto(@RequestBody Contacto contacto) {
		return String.valueOf(service.agregarContacto(contacto));
	}
	
	@PutMapping(value = "contactos", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void actualizarContacto(@RequestBody Contacto contacto) {
		service.actualizarContacto(contacto);
	}
	
	@DeleteMapping(value = "contactos/{id}")
	public void eliminarContactoById(@PathVariable("id") int id) {
		service.eliminarContactoById(id);
		
	}
	
	
	
}
