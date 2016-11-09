package com.exemple.repository;

import com.exemple.domain.equipo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by dam on 9/11/16.
 */
public interface equipoRepository extends JpaRepository<equipo,Long>{
    List<equipo> findByLocalidad(String localidad);
    // faltan b c y d de entidad equipo
}
