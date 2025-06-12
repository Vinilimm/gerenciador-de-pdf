package model;

public class Livro extends PdfEntry {
    private String areaConhecimento;
    private int ano;
    private String editora;
    private int paginas;

    public Livro() {
        // construtor vazio
    }

    @Override
    public String getTipo() {
        return "Livro";
    }

    @Override
    public String getNomeAutorPrincipal() {
        return autores[0];
    }
}
