package domine;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
    private Alumno unAlumno;
    private List<Materia> materias;

    public Inscripcion(Alumno unAlumno) {
        this.unAlumno = unAlumno;
        this.materias = new ArrayList<Materia>();
    }
    public void agregarMateria(Materia m){
        this.materias.add(m);
    }
    public Boolean aprobada(){
       return this.materias.stream().allMatch(m-> this.unAlumno.cumpleCorrelativa(m));
    }
}
