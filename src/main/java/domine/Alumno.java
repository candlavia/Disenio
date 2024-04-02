package domine;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private String legajo;
    private List<Materia> materiasAprobadas;

    //------------------------- Getter y setter
    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // --------------------------

    public Alumno(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<Materia>();
    }

    public void agregarMateria(Materia m){
        this.materiasAprobadas.add(m);
    }
    public boolean cumpleCorrelativa(Materia m) {
        return (m.getCorrelativas().isEmpty()) ||  (materiasAprobadas.containsAll(m.getCorrelativas()));
    }

}
