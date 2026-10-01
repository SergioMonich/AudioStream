package audiostream_main;

import audiostream_models.Musica;
import audiostream_models.Podcast;
import audiostream_models.Preferidas;

public class Main {

    public static void main(String[] args) {

        //testar a logica de classificacao, execute e veja a saida
        Musica mus1 = new Musica("Forever", 0, 0, 0);
        mus1.setCantor("Kiss");
        
        for (int i = 0; i < 452; i++) {

            mus1.reproduz();

        }

        for (int i = 0; i < 59; i++) {

            mus1.curte();

        }

        Podcast pod1 = new Podcast("Aprendendo Java", 49, 28, 0);
        pod1.setApresentador("Sergio Monich");

        Preferidas pref1 = new Preferidas();
        pref1.inclui(mus1);
        pref1.inclui(pod1);


    }

}
