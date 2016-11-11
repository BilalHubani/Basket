package com.exemple.service;

import com.exemple.domain.Jugador;
import com.exemple.repository.EquipoRepository;
import com.exemple.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class JugadorService {
    @Autowired
    private JugadorRepository jugadorRepository;
    @Autowired
    private EquipoRepository equipoRepository;

    public void testJugador() {

        Jugador jugador1 = new Jugador("Xpeke", LocalDate.of(1990, 1, 1), 25, 0, 30, "mid", equipoRepository.findOne(1L));
        jugadorRepository.save(jugador1);
        Jugador jugador2 = new Jugador("Soaz", LocalDate.of(1991, 2, 2), 2, 15, 15, "top", equipoRepository.findOne(1L));
        jugadorRepository.save(jugador2);
        Jugador jugador3 = new Jugador("Niels", LocalDate.of(1992, 3, 3), 30, 2, 10, "adc", equipoRepository.findOne(1L));
        jugadorRepository.save(jugador3);
        Jugador jugador4 = new Jugador("Mithy", LocalDate.of(1992, 4, 4), 0, 5, 40, "support", equipoRepository.findOne(1L));
        jugadorRepository.save(jugador4);
        Jugador jugador5 = new Jugador("Amazing", LocalDate.of(1989, 1, 1), 0, 0, 0, "jungla", equipoRepository.findOne(1L));
        jugadorRepository.save(jugador5);

        Jugador jugador6 = new Jugador("Hauntzer", LocalDate.of(1990, 6, 6), 13, 5, 15, "top", equipoRepository.findOne(2L));
        jugadorRepository.save(jugador6);
        Jugador jugador7 = new Jugador("Svenskeren", LocalDate.of(1991, 6, 7), 5, 5, 5, "jungla", equipoRepository.findOne(2L));
        jugadorRepository.save(jugador7);
        Jugador jugador8 = new Jugador("Bjergsen", LocalDate.of(1992, 7, 7), 21, 4, 12, "mid", equipoRepository.findOne(2L));
        jugadorRepository.save(jugador8);
        Jugador jugador9 = new Jugador("Doublelift", LocalDate.of(1992, 9, 9), 13, 6, 7, "adc", equipoRepository.findOne(2L));
        jugadorRepository.save(jugador9);
        Jugador jugador10 = new Jugador("Biofrost", LocalDate.of(1989, 2, 3), 0, 3, 20, "support", equipoRepository.findOne(2L));
        jugadorRepository.save(jugador10);

        Jugador jugador11 = new Jugador("Odoamne", LocalDate.of(1990, 1, 3), 3, 3, 3, "top", equipoRepository.findOne(3L));
        jugadorRepository.save(jugador11);
        Jugador jugador12 = new Jugador("Jankos", LocalDate.of(1991, 2, 5), 2, 2, 2, "jungla", equipoRepository.findOne(3L));
        jugadorRepository.save(jugador12);
        Jugador jugador13 = new Jugador("Ryu", LocalDate.of(1992, 3, 6), 6, 6, 6, "mid", equipoRepository.findOne(3L));
        jugadorRepository.save(jugador13);
        Jugador jugador14 = new Jugador("Mithy", LocalDate.of(1992, 4, 4), 0, 5, 40, "adc", equipoRepository.findOne(3L));
        jugadorRepository.save(jugador14);
        Jugador jugador15 = new Jugador("Amazing", LocalDate.of(1989, 1, 1), 0, 0, 0, "support", equipoRepository.findOne(3L));
        jugadorRepository.save(jugador15);

        Jugador jugador16 = new Jugador("Looper", LocalDate.of(1990, 1, 1), 16, 3, 14, "top", equipoRepository.findOne(4L));
        jugadorRepository.save(jugador16);
        Jugador jugador17 = new Jugador("Insec", LocalDate.of(1991, 10, 5), 15, 2, 20, "jungla", equipoRepository.findOne(4L));
        jugadorRepository.save(jugador17);
        Jugador jugador18 = new Jugador("Faker", LocalDate.of(1992, 8, 12), 35, 2, 8, "mid", equipoRepository.findOne(4L));
        jugadorRepository.save(jugador18);
        Jugador jugador19 = new Jugador("Bang", LocalDate.of(1992, 11, 25), 17, 1, 15, "adc", equipoRepository.findOne(4L));
        jugadorRepository.save(jugador19);
        Jugador jugador20 = new Jugador("Madlife", LocalDate.of(1989, 5, 8), 5, 0, 30, "support", equipoRepository.findOne(4L));
        jugadorRepository.save(jugador20);

        System.out.println("Buscar jugadores que tengan 'k' en el nombre: " + jugadorRepository.findByNombreContaining("k"));
        System.out.println("Buscar jugadores que tengan 15 o mas kills: " + jugadorRepository.findByKillsGreaterThanEqual(15));
        System.out.println("Buscar jugadores que tengas entre 10 y 20 asistencias: " + jugadorRepository.findByAssistsBetween(10, 20));
        System.out.println("Buscar jugadores que su rol sea 'mid': " + jugadorRepository.findByRol("mid"));
        System.out.println("Buscar jugadores que hayan nacido antes del 1 del 1 de 1991: " + jugadorRepository.findByFechaNacimientoBefore(LocalDate.of(1991, 1, 1)));
        System.out.println("Agrupar jugadores por rol y devolver la media: ");
        AVGKillsANDDeathsANDAssists(jugadorRepository.AVGKillsANDDeathsANDAssists());
        System.out.println("Agrupar jugadores por rol y devolver la media, max y min: ");
        AVGANDMaxANDMinTOKillsANDDeathsANDAssists(jugadorRepository.AVGANDMaxANDMinTOKillsANDDeathsANDAssists());
        System.out.println("");
        System.out.println("Los equipos de New York son: " + equipoRepository.findByLocalidad("New York"));
        System.out.println("Los miembros del equipo 'Origen' son: " + jugadorRepository.findByPertenenciaNombreIs("Origen"));
        System.out.println("Los miembros del equipo 'Team Solo Mid' de rol 'mid': " + jugadorRepository.findByPertenenciaNombreIsAndRolIs("Team Solo Mid", "mid"));
        System.out.println("El jugador con mas kills del equipo 'Leyendas' es: "+ jugadorRepository.nombreJugador("Leyendas", new PageRequest(0,1)));

    }

        private void AVGKillsANDDeathsANDAssists(List<Object[]> lista) {
            for ( Object[] estadistica: lista)
            {
                System.out.println("Rol: "+estadistica[0]);
                System.out.println("Kills AVG: "+estadistica[1]);
                System.out.println("Deaths AVG: "+estadistica[2]);
                System.out.println("Assists AVG: "+estadistica[3]+System.lineSeparator());
            }
        }
        private void AVGANDMaxANDMinTOKillsANDDeathsANDAssists(List<Object []> lista){
            for (Object[] estadistica: lista){
                System.out.println("Rol: "+estadistica[0]);
                System.out.println("Kills AVG: "+estadistica[1]);
                System.out.println("Deaths AVG: "+estadistica[2]);
                System.out.println("Assists AVG: "+estadistica[3]);
                System.out.println("Kills max: "+estadistica[4]);
                System.out.println("Deaths max: "+estadistica[5]);
                System.out.println("Assists max: "+estadistica[6]);
                System.out.println("Kills min: "+estadistica[7]);
                System.out.println("Deaths min: "+estadistica[8]);
                System.out.println("Assists min: "+estadistica[9]+System.lineSeparator());
            }
        }


    }

