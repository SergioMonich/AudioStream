package audiostream_models;

public class Audio {

    //atributos
    private String titulo;
    private int totalReproduc;
    private int totalCurtidas;
    private int classificacao;
    
    //construtor
    public Audio(String titulo, int totalReproduc, int totalCurtidas, int classificacao) {

        this.titulo = titulo;
        this.totalReproduc = totalReproduc;
        this.totalCurtidas = totalCurtidas;
        this.classificacao = classificacao;

    }

    //getters e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproduc() {
        return totalReproduc;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    //metodos
    public void curte() {

        this.totalCurtidas++;
        
    }

    public void reproduz() {

        this.totalReproduc++;

    }

}
