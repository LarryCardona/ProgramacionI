public class Jugador extends Persona {
    private int numFed;

    // Constructor
    public Jugador(String nombre, String nif, java.time.LocalDate fechaNac, int numFed) {
        super(nombre, nif, fechaNac);
        this.numFed = numFed;
    }

    // Getter y Setter
    public int getNumFed() {
        return numFed;
    }

    public void setNumFed(int numFed) {
        this.numFed = numFed;
    }
}
