package audiostream_models;

public class Musica extends Audio {

    //atributos
    private String album;
    private String cantor;
    private String genero;

    //construtor
    public Musica(String titulo, int totalReproduc, int totalCurtidas, int classificacao) {

        super(titulo, totalReproduc, totalCurtidas, classificacao);
        //TODO Auto-generated constructor stub

    }
    
    //getters e setters
    public String getAlbum() {

        return album;

    }

    public void setAlbum(String album) {

        this.album = album;

    }

    public String getCantor() {

        return cantor;

    }

    public void setCantor(String cantor) {

        this.cantor = cantor;

    }

    public String getGenero() {

        return genero;

    }

    public void setGenero(String genero) {

        this.genero = genero;

    }

    @Override
    public int getClassificacao() {

        if (this.getTotalReproduc() > 250) {

            return 10;

        } else {

            return 7;

        }

    }

}
