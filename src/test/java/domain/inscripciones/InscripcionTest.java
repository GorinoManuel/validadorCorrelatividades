package domain.inscripciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    @Test
    @DisplayName("Test para verificar que la funcion aprobada funciona correctamente")
    void aprobada() {
        Materia algoritmos = new Materia("Algoritmos");
        Materia am1 = new Materia("Analisis Matematico 1");
        Materia aga = new Materia("Algebra y Geometria Analitica");
        Materia am2 = new Materia("Analisis Matematico 2");

        Alumno persona1 = new Alumno("Alejandro", "Perez");
        Alumno persona2 = new Alumno("Carla", "Mendez");

        Inscripcion inscripcion1 = new Inscripcion(persona1);
        Inscripcion inscripcion2 = new Inscripcion(persona2);

        am2.cargarCorrelativas(am1, aga);
        persona1.cargarMateriasAprobadas(am1, algoritmos);
        persona2.cargarMateriasAprobadas(am1, aga);

        inscripcion1.agregarMaterias(am2);
        inscripcion2.agregarMaterias(am2);

        Assertions.assertFalse(inscripcion1.aprobada());

        Assertions.assertTrue(inscripcion2.aprobada());

    }
}