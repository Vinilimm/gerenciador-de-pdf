package model;

public class NotaAula extends PdfEntry {
    private String disciplina;
    private String instituicao;
    private int paginas;

    public NotaAula() {}

    @Override
    public String getTipo() {
        return "Nota de Aula";
    }

    @Override
    public String getNomeAutorPrincipal() {
        return autores[0];
    }
}
