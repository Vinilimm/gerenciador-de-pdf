package model;

public class Slide extends PdfEntry {
    private String disciplina;
    private String instituicao;

    public Slide() {}

    @Override
    public String getTipo() {
        return "Slide";
    }

    @Override
    public String getNomeAutorPrincipal() {
        return autores[0];
    }
}
