package com.KemberlySerrano.SpringDataJpaServer1.DAO;

import org.springframework.data.repository.CrudRepository;

import com.KemberlySerrano.SpringDataJpaServer1.Entidades.Persona;

public interface PersonaDAO extends CrudRepository<Persona, Long> {

}
