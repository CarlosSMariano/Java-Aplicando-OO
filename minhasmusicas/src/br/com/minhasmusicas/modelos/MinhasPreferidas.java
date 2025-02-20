package br.com.minhasmusicas.modelos;

public class MinhasPreferidas {
//    Método
    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo()+" é considerado um sucesso");
        } else {
            System.out.println(audio.getTitulo() + " boa opção para adicionar a lista de espera");
        }
    }
}
