package com.exemple.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private int kills;
    private int deaths;
    private int assists;
    private String rol;
    @ManyToMany
    private Equipo pertenencia;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Equipo getPertenencia() {
        return pertenencia;
    }

    public void setPertenencia(Equipo pertenencia) {
        this.pertenencia = pertenencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    public Jugador(){
    }
    public Jugador(String nombre, LocalDate fechaNacimiento, int kills, int deaths, int assists, String rol, Equipo pertenencia) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.kills = kills;
        this.deaths = deaths;
        this.assists = assists;
        this.rol = rol;
        this.pertenencia = pertenencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Jugador jugador = (Jugador) o;

        if (id != jugador.id) return false;
        if (kills != jugador.kills) return false;
        if (deaths != jugador.deaths) return false;
        if (assists != jugador.assists) return false;
        if (!nombre.equals(jugador.nombre)) return false;
        if (!fechaNacimiento.equals(jugador.fechaNacimiento)) return false;
        if (!rol.equals(jugador.rol)) return false;
        return pertenencia.equals(jugador.pertenencia);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + nombre.hashCode();
        result = 31 * result + fechaNacimiento.hashCode();
        result = 31 * result + kills;
        result = 31 * result + deaths;
        result = 31 * result + assists;
        result = 31 * result + rol.hashCode();
        result = 31 * result + pertenencia.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", kills=" + kills +
                ", deaths=" + deaths +
                ", assists=" + assists +
                ", rol='" + rol + '\'' +
                ", pertenencia=" + pertenencia +
                '}';
    }
}
