package br.com.filme.screenmatch.modelos;

import br.com.filme.screenmat.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel{
    //Atributos
    private  String diretor;

    //Metodos Getters and Setters
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    //sobrescrevendo Método / implementando
    @Override
    public int getClassificacao() {
//        cast: converter pra outro tipo de dado:
        return (int) obterMedia() / 2 ;
    }
}
