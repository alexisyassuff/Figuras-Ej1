import java.util.List;

public class CerealGranoCosechaGruesa extends Cereal {
    public CerealGranoCosechaGruesa(String nombre, List<Mineral> requerimientos) {
        super(nombre, requerimientos);
    }
}

public class CerealGranoCosechaFina extends Cereal {
    public CerealGranoCosechaFina(String nombre, List<Mineral> requerimientos) {
        super(nombre, requerimientos);
    }
}

public class Pastura extends Cereal {
    public Pastura(String nombre, List<Mineral> requerimientos) {
        super(nombre, requerimientos);
    }

    @Override
    public boolean puedeSembrarseEn(Lote lote) {
        // Verifica si se sembró una pastura previamente
        return super.puedeSembrarseEn(lote) && !lote.haSidoSembradoConPastura();
    }
}
