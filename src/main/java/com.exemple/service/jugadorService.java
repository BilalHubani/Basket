package com.exemple.service;

import com.exemple.domain.jugador;
import com.exemple.repository.jugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dam on 9/11/16.
 */
@Service
public class jugadorService {
    @Autowired
    private jugadorRepository jugadorRepository;

    public void testJugador(){
        jugador jugador1 = new jugador();
    }
}
