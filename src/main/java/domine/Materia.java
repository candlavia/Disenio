package domine;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    private List<Materia> correlativas;
    private String nombre;

    public Materia(String nombre) {

        this.nombre = nombre;
        this.correlativas = new ArrayList<Materia>();

    }

    public void agregarCorrelativa(Materia m){
        this.correlativas.add(m);
    }

}
