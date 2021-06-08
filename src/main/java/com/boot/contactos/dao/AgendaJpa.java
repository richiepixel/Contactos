package com.boot.contactos.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.boot.contactos.model.Contacto;

public interface AgendaJpa extends JpaRepository<Contacto, Integer>{
	
	Contacto findByEmail(String email);
	
	@Transactional
	@Modifying
	@Query("Delete from Contacto c where c.email=?1")
	void eliminarContactoByEmail(String email);
}
