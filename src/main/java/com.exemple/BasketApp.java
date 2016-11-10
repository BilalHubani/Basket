package com.exemple;

import com.exemple.service.EquipoService;
import com.exemple.service.JugadorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

/**
 * Created by dam on 9/11/16.
 */
@EntityScan(
        basePackageClasses = {BasketApp.class, Jsr310JpaConverters.class }
)
public class BasketApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BasketApp.class, args);

        EquipoService equipoService = context.getBean(EquipoService.class);
        JugadorService jugadorService = context.getBean(JugadorService.class);
        equipoService.testEquipo();
        jugadorService.testJugador();
    }
}
