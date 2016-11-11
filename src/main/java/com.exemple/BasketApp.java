package com.exemple;


import com.exemple.service.EquipoService;
import com.exemple.service.JugadorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class BasketApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BasketApp.class, args);

        context.getBean(EquipoService.class).testEquipo();
        context.getBean(JugadorService.class).testJugador();
    }
}
