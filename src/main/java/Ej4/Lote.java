import java.util.HashSet;
import java.util.Set;

public class Lote {
    private String nombre;
    private boolean especial;
    private Set<Mineral> minerales;
    private boolean pasturaSembrada;

    public Lote(String nombre, boolean especial) {
        this.nombre = nombre;
        this.especial = especial;
        this.minerales = new HashSet<>();
        this.pasturaSembrada = false;
    }

    public void agregarMineral(Mineral mineral) {
        minerales.add(mineral);
    }

    public Set<Mineral> getMinerales() {
        return minerales;
    }

    public boolean haSidoSembradoConPastura() {
        return pasturaSembrada;
    }

    public void sembrarPastura() {
        this.pasturaSembrada = true;
    }

    public boolean isEspecial() {
        return especial;
    }
}
