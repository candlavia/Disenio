package domaine;

import domine.Alumno;
import domine.Inscripcion;
import domine.Materia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InscripcionTest {
    @Test
    public void pepePuedeInscribirseEnDisenio(){
        Alumno pepe = new Alumno("pepe", "2037660");


        Materia pdep = new Materia("pdep");
        Materia syo = new Materia("syo");
        Materia disenio = new Materia("disenio");

        disenio.agregarCorrelativa(pdep);
        disenio.agregarCorrelativa(syo);

        pepe.agregarMateria(pdep);
        pepe.agregarMateria(syo);

        Inscripcion unaInscripcion = new Inscripcion(pepe);
        unaInscripcion.agregarMateria(disenio);


        Assertions.assertTrue(unaInscripcion.aprobada());


    }

    @Test
    public void pepaNoPuedeAnotarseADisenioLeFaltanDosMaterias(){
        Alumno pepa = new Alumno("pepa", "2037770");
        Inscripcion otraInscripcion = new Inscripcion(pepa);

        Materia pdep = new Materia("pdep");
        Materia syo = new Materia("syo");
        Materia disenio = new Materia("disenio");

        disenio.agregarCorrelativa(pdep);
        disenio.agregarCorrelativa(syo);

        otraInscripcion.agregarMateria(disenio);
        Assertions.assertFalse(otraInscripcion.aprobada());
    }


    @Test
    public void pepitoNoPuedeAnotarseADisenioLeFaltaUnaMateria(){
        Alumno pepito = new Alumno("pepito", "2038880");
        Inscripcion otraInscripcion = new Inscripcion(pepito);

        Materia pdep = new Materia("pdep");
        Materia syo = new Materia("syo");
        Materia disenio = new Materia("disenio");

        disenio.agregarCorrelativa(pdep);
        disenio.agregarCorrelativa(syo);

        pepito.agregarMateria(syo);

        otraInscripcion.agregarMateria(disenio);
        Assertions.assertFalse(otraInscripcion.aprobada());
    }
}
