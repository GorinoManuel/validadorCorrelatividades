package domain.inscripciones;

import java.util.Set;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Materia {
    private String nombre;
    private Set<Materia> correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Materia> getCorrelativas() {
        return correlativas;
    }

    public void cargarCorrelativas(Materia ... materias) {
        Collections.addAll(this.correlativas, materias);
    }
    public boolean cumpleCorrelativas(List<Materia> materiasARevisar) {
        return this.correlativas.containsAll(materiasARevisar);
    }
}
