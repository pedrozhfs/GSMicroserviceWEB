package com.microservice.gs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.gs.model.Ambiente;

public interface AmbienteRepository extends JpaRepository<Ambiente, Long> {

}
