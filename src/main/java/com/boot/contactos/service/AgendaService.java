package com.boot.contactos.service;

import java.util.List;

import com.boot.contactos.model.Contacto;

public interface AgendaService {

	boolean agregarContacto(Contacto contacto);
	
	List<Contacto> obtenerContactos();
	
	boolean eliminarContactoById(int id);
	
	void actualizarContacto(Contacto contacto);
	
	Contacto obtenerContactoById(int id);
	
}
