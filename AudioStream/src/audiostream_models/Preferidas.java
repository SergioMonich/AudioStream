package audiostream_models;

public class Preferidas {

    public void inclui(Audio audio) {

        if (audio.getClassificacao() > 8) {

            System.out.println(audio.getTitulo() + " é considerado um sucesso entre os usuários!");

        } else {

            System.out.println(audio.getTitulo() + " é uma boa escolha!");

        }

    }

}
