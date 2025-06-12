package model;

public abstract class PdfEntry {
    protected String[] autores;
    protected String titulo;
    protected String subtitulo;
    protected String pathOriginal;
    protected String pathNaBiblioteca;

    public abstract String getTipo();
    public abstract String getNomeAutorPrincipal();
}
