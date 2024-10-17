import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Mineral nitrogeno = new Mineral("Nitrogeno");
        Mineral fosforo = new Mineral("Fosforo");
        Mineral potasio = new Mineral("Potasio");

        CerealGranoCosechaGruesa maiz = new CerealGranoCosechaGruesa("Maíz", Arrays.asList(nitrogeno, potasio));
        CerealGranoCosechaFina trigo = new CerealGranoCosechaFina("Trigo", Arrays.asList(nitrogeno, fosforo));
        Pastura alfalfa = new Pastura("Alfalfa", Arrays.asList(nitrogeno, potasio));

        Lote lote1 = new Lote("Lote 1", true);
        lote1.agregarMineral(nitrogeno);
        lote1.agregarMineral(potasio);

        Lote lote2 = new Lote("Lote 2", false);
        lote2.agregarMineral(nitrogeno);
        lote2.agregarMineral(fosforo);

        Cooperativa cooperativa = new Cooperativa();
        cooperativa.agregarCereal(maiz);
        cooperativa.agregarCereal(trigo);
        cooperativa.agregarCereal(alfalfa);

        System.out.println("Cereales recomendados para el " + lote1.getNombre() + ": " + cooperativa.recomendarCereales(lote1));
        System.out.println("Cereales recomendados para el " + lote2.getNombre() + ": " + cooperativa.recomendarCereales(lote2));
    }
}
