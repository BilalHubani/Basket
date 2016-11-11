package com.exemple.repository;

import com.exemple.domain.Jugador;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface JugadorRepository extends JpaRepository<Jugador, Long>{
    List<Jugador> findByNombreContaining (String nombre);
    List<Jugador> findByKillsGreaterThanEqual (Integer kills);
    List<Jugador> findByAssistsBetween (Integer max, Integer min);
    List<Jugador> findByRol (String rol);
    List<Jugador> findByFechaNacimientoBefore (LocalDate fecha);
    @Query("SELECT jugador.rol, AVG(jugador.kills), AVG(jugador.deaths), AVG(jugador.assists) FROM Jugador jugador GROUP BY jugador.rol")
    List<Object[]>AVGKillsANDDeathsANDAssists();
    @Query("SELECT jugador.rol, AVG(jugador.kills), MAX(jugador.kills), MIN(jugador.kills), AVG(jugador.deaths), MAX(jugador.deaths), MIN(jugador.deaths), AVG(jugador.assists), MAX(jugador.assists), MIN(jugador.assists) FROM Jugador jugador GROUP BY jugador.rol")
    List<Object[]>AVGANDMaxANDMinTOKillsANDDeathsANDAssists();

    List<Jugador>findByPertenenciaNombreIs(String nombre);
    List<Jugador>findByPertenenciaNombreIsAndRolIs(String nombre, String rol);


    @Query("SELECT jugador FROM Jugador jugador WHERE jugador.pertenencia.nombre = :nombre ORDER BY jugador.kills desc")
    List<Jugador>nombreJugador(@Param("nombre") String nombre, Pageable pageable);
}
