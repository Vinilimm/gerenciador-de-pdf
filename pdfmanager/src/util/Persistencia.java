package util;

import core.Biblioteca;

import java.io.*;

public class Persistencia {
    private static final String CONFIG_PATH = "data/config.txt";

    public static Biblioteca carregarBiblioteca() {
        File file = new File(CONFIG_PATH);
        if (!file.exists()) {
            System.out.println("Nenhuma biblioteca encontrada.");
            return null;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String path = br.readLine();
            String nome = path.substring(path.lastIndexOf("/") + 1);
            return new Biblioteca(nome, path);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void salvarBibliotecaAtual(String path) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(CONFIG_PATH))) {
            bw.write(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
