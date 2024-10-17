import java.util.ArrayList;
import java.util.List;

public class Cooperativa {
    private List<Cereal> cereales;

    public Cooperativa() {
        cereales = new ArrayList<>();
    }

    public void agregarCereal(Cereal cereal) {
        cereales.add(cereal);
    }

    public List<Cereal> recomendarCereales(Lote lote) {
        List<Cereal> recomendados = new ArrayList<>();
        for (Cereal cereal : cereales) {
            if (cereal.puedeSembrarseEn(lote)) {
                recomendados.add(cereal);
            }
        }
        return recomendados;
    }
}
