package br.com.minhasmusicas.modelos;

public class Audio {
//    Atributos
    private String titulo;
    private int totalDeCurtidas;
    private int totalDeReproducoes;
    private int classificacao;

//   Getters and Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

//    Métodos
    public void curte () {
        totalDeCurtidas++;
    }

    public void reproduz (){
        totalDeReproducoes ++;
    }
}
