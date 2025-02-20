package br.com.minhasmusicas.modelos;

public class Musica extends Audio{
//    Atributos
    private String album;
    private String cantor;
    private String genero;

//    Método

    @Override
    public int getClassificacao() {
        if(this.getTotalDeReproducoes() > 900){
            return 10;
        } else {
            return 7;
        }
    }

//    Getters and Setters

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
}
