package domain.inscripciones;

import java.util.*;

public class Inscripcion {
    private Alumno alumno;
    private Set<Materia> materiasAInscribirse;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materiasAInscribirse = new HashSet<>();
    }

    public void agregarMaterias(Materia... materias) {
        Collections.addAll(this.materiasAInscribirse, materias);
    }

    public boolean aprobada() {
        return this.materiasAInscribirse.stream().allMatch( materia -> materia.cumpleCorrelativas(this.alumno.getMateriasAprobadas()));
    }
}
