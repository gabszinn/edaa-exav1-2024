import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ordenador {
    public static void ordenarPorNome(List<Paises> paises) {
        Collections.sort(paises, Comparator.comparing(Paises::getNome));
    }

    public static void ordenarPorAudienciaTV(List<Paises> paises) {
        Collections.sort(paises, Comparator.comparing(Paises::getAudienciaTV));
    }
}

