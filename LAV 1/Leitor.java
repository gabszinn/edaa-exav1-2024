import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Leitor {
    public List<Paises> lerPaisesDoArquivo() {
        List<Paises> paises = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("fifa_countries_audience.csv"))) {
            String linha;
            br.readLine();

            while ((linha = br.readLine()) != null) {
                String[] informacao = linha.split(",");
                String paisNome = informacao[0];
                String confederacao = informacao[1];
                double populacao = Double.parseDouble(informacao[2]);
                double televisao = Double.parseDouble(informacao[3]);
                double gpd = Double.parseDouble(informacao[4]);
                Paises pais = new Paises(paisNome, confederacao, populacao, televisao, gpd);
                paises.add(pais);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return paises;
    }
}
