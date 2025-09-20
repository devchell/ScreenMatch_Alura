package br.com.chell.screenmatch.modelos;

public class Serie extends Titulo {
    private int quantidadeEpisodios;
    private int quantidadeTemporadas;
    private double minutosPorEpisodio;
    private boolean ativa;

    public double obterMediaTempoEpisodio(){
        return minutosPorEpisodio * quantidadeEpisodios;
    }

    public double obterMediaTempoTemporadas() {
        return obterMediaTempoEpisodio() * quantidadeTemporadas;
    }

    //Getters
    public int getQuantidadeEpisodios() {
        return quantidadeEpisodios;
    }

    public int getQuantidadeTemporadas() {
        return quantidadeTemporadas;
    }

    public double getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public double retornaMediaEp;
        ;

    //Setters
    public void setQuantidadeEpisodios(int quantidadeEpisodios) {
        this.quantidadeEpisodios = quantidadeEpisodios;
    }

    public void setQuantidadeTemporadas(int quantidadeTemporadas) {
        this.quantidadeTemporadas = quantidadeTemporadas;
    }

    public void setMinutosPorEpisodio(double minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override
    public int getDuracaoMinutos() {
        return (int) (quantidadeTemporadas * quantidadeEpisodios * minutosPorEpisodio);
    }
}
