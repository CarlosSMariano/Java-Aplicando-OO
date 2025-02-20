package br.com.minhasmusicas.modelos;

public class Podcast extends Audio{
//    Atributos
    private String host;
    private String descricao;

//    Métodos

    @Override
    public int getClassificacao() {
        if(this.getTotalDeCurtidas() > 800){
            return 10;
        } else {
            return 8;
        }
    }

    //    Getters and Setters
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
