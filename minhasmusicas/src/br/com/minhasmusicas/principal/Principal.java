package br.com.minhasmusicas.principal;

import br.com.minhasmusicas.modelos.MinhasPreferidas;
import br.com.minhasmusicas.modelos.Musica;
import br.com.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Ainda bem");
        musica.setCantor("Marisa Monte");
        musica.setGenero("Mpb");


        for(int i = 0; i < 1000; i++){
            musica.reproduz();
        }
        for(int i = 0; i < 50; i++){
            musica.curte();
        }

        Podcast pod = new Podcast();
        pod.setTitulo("Neews");
        pod.setHost("Eu");

        for (int i = 0; i < 650; i++){
            pod.reproduz();
        }

        for (int i = 0; i < 350 ; i++) {
            pod.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(musica);
        preferidas.inclui(pod);
    }
}
