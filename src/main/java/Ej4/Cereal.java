import java.util.List;

public abstract class Cereal {
    private String nombre;
    private List<Mineral> requerimientos;

    public Cereal(String nombre, List<Mineral> requerimientos) {
        this.nombre = nombre;
        this.requerimientos = requerimientos;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Mineral> getRequerimientos() {
        return requerimientos;
    }

    public boolean puedeSembrarseEn(Lote lote) {
        // Verifica si todos los minerales requeridos están en el lote
        return lote.getMinerales().containsAll(requerimientos);
    }
}
