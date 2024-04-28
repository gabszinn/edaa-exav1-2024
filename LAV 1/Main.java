import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Leitor leitor = new Leitor();
        List<Paises> paises = leitor.lerPaisesDoArquivo();

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Digite a opção desejada:");
            System.out.println("[1] Ordenar por Ordem Alfabética");
            System.out.println("[2] Ordenar por audiência TV");
            System.out.println("[3] Encerrar");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Ordenador.ordenarPorNome(paises);
                    exibirPaises(paises);
                    break;
                case 2:
                    Ordenador.ordenarPorAudienciaTV(paises);
                    exibirPaises(paises);
                    System.out.println("Após ordenação, o Brasil agora está em 2º lugar!");
                    break;
                case 3:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Repita o menu.");
                    break;

            }
        } while (opcao != 3);
        scanner.close();

    }
    private static void exibirPaises(List<Paises> paises) {
        System.out.println("Lista de países ordenada: ");
        for (Paises pais : paises) {
            System.out.println(pais);
        }
    }
}
