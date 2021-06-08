package com.boot.contactos.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boot.contactos.model.Contacto;

@Repository
public class AgendaDaoImpl implements AgendaDao {
	
	@Autowired
	AgendaJpa agenda;

	@Override
	public void agregarContacto(Contacto contacto) {
		agenda.save(contacto);

	}

	@Override
	public Contacto obtenerContactoByEmail(String email) {
		
		return agenda.findByEmail(email);
	}

	@Override
	public Contacto obtenerContactoById(int id) {
		
		return agenda.findById(id).orElse(null);
	}

	@Override
	public List<Contacto> obtenerContactos() {
		
		return agenda.findAll();
	}

	@Override
	public void eliminarContactoByEmail(String email) {
		agenda.eliminarContactoByEmail(email);
	}

	@Override
	public void eliminarContactoById(int id) {
		agenda.deleteById(id);

	}

	@Override
	public void actualizarContacto(Contacto contacto) {
		agenda.save(contacto);

	}

}
