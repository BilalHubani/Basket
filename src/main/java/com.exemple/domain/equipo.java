package com.exemple.domain;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by dam on 9/11/16.
 */
@Entity
public class equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String localidad;
    private LocalDate fechaCreacion;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        equipo equipo = (equipo) o;

        if (id != equipo.id) return false;
        if (!nombre.equals(equipo.nombre)) return false;
        if (!localidad.equals(equipo.localidad)) return false;
        return fechaCreacion.equals(equipo.fechaCreacion);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + nombre.hashCode();
        result = 31 * result + localidad.hashCode();
        result = 31 * result + fechaCreacion.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "equipo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", localidad='" + localidad + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }
}
