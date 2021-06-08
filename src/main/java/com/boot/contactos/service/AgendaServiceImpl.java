package com.boot.contactos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.contactos.dao.AgendaDao;
import com.boot.contactos.model.Contacto;

@Service
public class AgendaServiceImpl implements AgendaService{
	
	@Autowired
	AgendaDao agendaDao;

	@Override
	public boolean agregarContacto(Contacto contacto) {
		
		if(agendaDao.obtenerContactoById(contacto.getIdContacto())==null) {
			agendaDao.agregarContacto(contacto);
			return true;
		}
		return false;
		
	}

	@Override
	public List<Contacto> obtenerContactos() {
		
		return agendaDao.obtenerContactos();
	}

	@Override
	public boolean eliminarContactoById(int id) {
		if(agendaDao.obtenerContactoById(id) != null) {
			agendaDao.eliminarContactoById(id);
			return true;
		}
		
		return false;
		
	}

	@Override
	public void actualizarContacto(Contacto contacto) {
		if(agendaDao.obtenerContactoById(contacto.getIdContacto())!=null) {
			agendaDao.actualizarContacto(contacto);
		}
		
	}

	@Override
	public Contacto obtenerContactoById(int id) {
		return agendaDao.obtenerContactoById(id);
	}

}
