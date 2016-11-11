package com.exemple.repository;

import com.exemple.domain.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquipoRepository extends JpaRepository<Equipo,Long>{
    List<Equipo> findByLocalidad(String localidad);
}
