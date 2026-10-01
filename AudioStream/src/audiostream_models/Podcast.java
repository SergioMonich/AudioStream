package audiostream_models;

public class Podcast extends Audio {

    //atributos proprios da classe
    private String apresentador;
    private String descricao;

    //construtor
    public Podcast(String titulo, int totalReproduc, int totalCurtidas, int classificacao) {

        super(titulo, totalReproduc, totalCurtidas, classificacao);
        //TODO Auto-generated constructor stub

    }
    
    //getters and setters
    public String getApresentador() {

        return apresentador;

    }

    public void setApresentador(String apresentador) {

        this.apresentador = apresentador;

    }

    public String getDescricao() {

        return descricao;

    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;

    }

    @Override
    public int getClassificacao() {

        if(this.getTotalCurtidas() > 500) {

            return 10;

        } else {

            return 8;

        }

    }

}
