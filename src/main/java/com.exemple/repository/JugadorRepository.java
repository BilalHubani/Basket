package com.exemple.repository;

import com.exemple.domain.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by dam on 9/11/16.
 */
public interface JugadorRepository extends JpaRepository{
    List<Jugador> findByNombreContaining (String nombre);
    List<Jugador> findByKillsGreaterThanEqual (Integer kills);
    List<Jugador> findByAssistsBetween (Integer max, Integer min);
    List<Jugador> findByRol (String rol);
    List<Jugador> findByFechaNacimientoBefore (LocalDate fecha);
    // faltan f y g de entidad Jugador
}
