package domain.inscripciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasAInscribirse;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materiasAInscribirse = new ArrayList<>();
    }

    public void agregarMaterias(Materia... materias) {
        Collections.addAll(this.materiasAInscribirse, materias);
    }

    public boolean aprobada() {
        return materiasAInscribirse.stream().allMatch( materia -> materia.cumpleCorrelativas(this.alumno.getMateriasAprobadas()));
    }
}
