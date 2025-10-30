public class Persona {
    private String nombre;
    private String nif;
    private java.time.LocalDate fechaNac;

    // Constructor
    public Persona(String nombre, String nif, java.time.LocalDate fechaNac) {
        this.nombre = nombre;
        this.nif = nif;
        this.fechaNac = fechaNac;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public java.time.LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(java.time.LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }
}
