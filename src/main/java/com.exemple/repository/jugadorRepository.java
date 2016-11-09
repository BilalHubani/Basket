package com.exemple.repository;

import com.exemple.domain.jugador;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by dam on 9/11/16.
 */
public interface jugadorRepository {
    List<jugador> findByNombreContaining (String nombre);
    List<jugador> findByKillsGreaterThanEqual (Integer kills);
    List<jugador> findByAssistsBetween (Integer max, Integer min);
    List<jugador> findByRol (String rol);
    List<jugador> findByFechaNacimientoBefore (LocalDate fecha);
    // faltan f y g de entidad jugador
}
