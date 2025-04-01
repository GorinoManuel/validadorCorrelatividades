package domain.inscripciones;

import java.util.*;

public class Alumno {
    private String nombre;
    private String apellido;
    private Set<Materia> materiasAprobadas;

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materiasAprobadas = new HashSet<>();
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Materia> getMateriasAprobadas() {
        return this.materiasAprobadas;
    }

    public void cargarMateriasAprobadas(Materia ... materias) {
        Collections.addAll(this.materiasAprobadas, materias);
    }
}
