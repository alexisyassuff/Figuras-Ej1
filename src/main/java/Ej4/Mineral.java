import java.util.Objects;

public class Mineral {
    private String nombre;

    public Mineral(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mineral)) return false;
        Mineral mineral = (Mineral) o;
        return Objects.equals(nombre, mineral.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
