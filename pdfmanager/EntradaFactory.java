

import java.util.*;
import java.nio.file.*;

public class EntradaFactory {
    public static PdfEntry criarEntrada(int tipo, Scanner scanner) {
        System.out.println("Digite os nomes dos autores (separados por vírgula):");
        String[] autores = scanner.nextLine().split(",");
        List<String> listaAutores = new ArrayList<>();
        for (String autor : autores) listaAutores.add(autor.trim());

        System.out.println("Digite o título:");
        String titulo = scanner.nextLine();

        System.out.println("Digite o subtítulo (ou deixe em branco):");
        String subtitulo = scanner.nextLine();

        System.out.println("Digite o path do PDF:");
        String caminho = scanner.nextLine();

        switch (tipo) {
            case 1: // Livro
                System.out.println("Digite a área de conhecimento:");
                String area = scanner.nextLine();
                System.out.println("Digite o ano de publicação:");
                int ano = Integer.parseInt(scanner.nextLine());
                System.out.println("Digite a editora (opcional):");
                String editora = scanner.nextLine();
                System.out.println("Digite o número de páginas (ou 0 se desconhecido):");
                int paginas = Integer.parseInt(scanner.nextLine());
                return new Livro(listaAutores, titulo, subtitulo, caminho, area, ano, editora, paginas);

            case 2: // Nota de Aula
                System.out.println("Digite o nome da disciplina:");
                String disciplina = scanner.nextLine();
                System.out.println("Digite a instituição (opcional):");
                String instituicaoNota = scanner.nextLine();
                System.out.println("Digite o número de páginas (ou 0 se desconhecido):");
                int paginasNota = Integer.parseInt(scanner.nextLine());
                return new NotaAula(listaAutores, titulo, subtitulo, caminho, disciplina, instituicaoNota, paginasNota);

            case 3: // Slide
                System.out.println("Digite o nome da disciplina:");
                String disciplinaSlide = scanner.nextLine();
                System.out.println("Digite a instituição (opcional):");
                String instituicaoSlide = scanner.nextLine();
                return new Slide(listaAutores, titulo, caminho, disciplinaSlide, instituicaoSlide);

            default:
                System.out.println("Tipo inválido.");
                return null;
        }
    }
}
