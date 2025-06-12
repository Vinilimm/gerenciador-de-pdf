import core.Biblioteca;
import util.Persistencia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = Persistencia.carregarBiblioteca();

        int opcao;
        do {
            System.out.println("\n=== Gerenciador de Biblioteca PDF ===");
            System.out.println("1. Criar nova biblioteca");
            System.out.println("2. Adicionar entrada");
            System.out.println("3. Listar entradas");
            System.out.println("4. Sair");
            System.out.print("Escolha: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    biblioteca = Biblioteca.criarNovaBiblioteca(sc);
                    break;
                case 2:
                    biblioteca.adicionarEntrada(sc);
                    break;
                case 3:
                    biblioteca.listarEntradas();
                    break;
                case 4:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opcao Invalida.");
            }

        } while (opcao != 4);
    }
}
