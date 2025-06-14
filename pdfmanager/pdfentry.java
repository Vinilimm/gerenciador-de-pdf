import java.util.List;

public abstract class PdfEntry {
    private List<String> autores;
    private String titulo;
    private String subtitulo;
    private String caminhoPDF;

    public PdfEntry(List<String> autores, String titulo, String subtitulo, String caminhoPDF) {
        this.autores = autores;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.caminhoPDF = caminhoPDF;
    }

    public List<String> getAutores() {
        return autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public String getCaminhoPDF() {
        return caminhoPDF;
    }

    @Override
    public String toString() {
        return "Autores: " + String.join(", ", autores) +
               ", Título: " + titulo +
               (!subtitulo.isEmpty() ? ", Subtítulo: " + subtitulo : "") +
               ", Arquivo: " + caminhoPDF;
    }
}
