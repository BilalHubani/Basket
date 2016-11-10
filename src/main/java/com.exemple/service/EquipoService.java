package com.exemple.service;

import com.exemple.domain.Equipo;
import com.exemple.repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * Created by dam on 9/11/16.
 */
@Service
public class EquipoService {
    @Autowired
    private EquipoRepository equipoRepository;

    public void testEquipo(){
        Equipo equipo1 = new Equipo();
        equipo1.setId(1);
        equipo1.setNombre("Origen");
        equipo1.setFechaCreacion(LocalDate.of(2014, 5, 10));
        equipo1.setLocalidad("Barcelona");
        equipoRepository.save(equipo1);

        Equipo equipo2 = new Equipo();
        equipo2.setId(2);
        equipo2.setNombre("Team Solo Mid");
        equipo2.setFechaCreacion(LocalDate.of(2009, 10, 10));
        equipo2.setLocalidad("New York");
        equipoRepository.save(equipo2);

        Equipo equipo3 = new Equipo();
        equipo3.setId(3);
        equipo3.setNombre("H2K");
        equipo3.setFechaCreacion(LocalDate.of(2005, 2, 2));
        equipo3.setLocalidad("Londres");
        equipoRepository.save(equipo3);

        Equipo equipo4 = new Equipo();
        equipo4.setId(4);
        equipo4.setNombre("Leyendas");
        equipo4.setFechaCreacion(LocalDate.of(2016, 11, 10));
        equipo4.setLocalidad("Bangkok");
        equipoRepository.save(equipo4);
    }
}
