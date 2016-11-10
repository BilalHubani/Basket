package com.exemple.repository;

import com.exemple.domain.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by dam on 9/11/16.
 */
public interface EquipoRepository extends JpaRepository<Equipo,Long>{
    List<Equipo> findByLocalidad(String localidad);
    // faltan b c y d de entidad Equipo
}
