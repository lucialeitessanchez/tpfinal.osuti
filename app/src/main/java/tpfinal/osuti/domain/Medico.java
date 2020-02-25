package tpfinal.osuti.domain;

import java.util.concurrent.TimeUnit;

public class Medico {
    private String nombre;
    private String especialidad;
    private Integer telefono;
    private String direccion;
    private int horarios_de_atencion;




    public Medico(String nombre, String especialidad, Integer telefono, String direccion, int horarios_de_atencion) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.direccion = direccion;
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

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public int getHorarios_de_atencion() {
        return horarios_de_atencion;
    }

    public void setHorarios_de_atencion(Integer horarios_de_atencion) {
        this.horarios_de_atencion = horarios_de_atencion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
