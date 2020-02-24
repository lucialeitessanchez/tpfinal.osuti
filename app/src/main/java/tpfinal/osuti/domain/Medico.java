package tpfinal.osuti.domain;

import java.util.concurrent.TimeUnit;

public class Medico {
    private String nombre;
    private String especialidad;
    private Long telefono;
    private String direccion;
    private TimeUnit horarios_de_atencion;

    public Medico() {
    }

    public Medico(String nombre, String especialidad, Long telefono, TimeUnit horarios_de_atencion) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.horarios_de_atencion = horarios_de_atencion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public TimeUnit getHorarios_de_atencion() {
        return horarios_de_atencion;
    }

    public void setHorarios_de_atencion(TimeUnit horarios_de_atencion) {
        this.horarios_de_atencion = horarios_de_atencion;
    }
}
