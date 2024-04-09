package uvg.edu.gt;

class PacienteJC implements Comparable<PacienteJC> {
    private String nombre;
    private String sintoma;
    private char prioridad;

    public PacienteJC(String nombre, String sintoma, char prioridad) {
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSintoma() {
        return sintoma;
    }

    public char getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(PacienteJC otro) {
        return this.prioridad - otro.prioridad;
    }

    @Override
    public String toString() {
        return nombre + ", " + sintoma + ", " + prioridad;
    }
}


