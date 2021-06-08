package com.boot.contactos.dao;

import java.util.List;

import com.boot.contactos.model.Contacto;

public interface AgendaDao {

	void agregarContacto(Contacto contacto);

	Contacto obtenerContactoByEmail(String email);
	
	Contacto obtenerContactoById(int id);
	
	List<Contacto> obtenerContactos();
	
	void eliminarContactoByEmail(String email);
	
	void eliminarContactoById(int id);
	
	void actualizarContacto(Contacto contacto);

}
