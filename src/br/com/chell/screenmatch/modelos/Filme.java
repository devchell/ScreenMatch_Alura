package br.com.chell.screenmatch.modelos;

import java.util.Locale;

public class Filme extends Titulo {

    private boolean possuiSaga;

    public void exibeFichaFilme(){
        System.out.println("Nome do filme: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoLancamento());
        System.out.println("Duração: " + pegaDuracaoMinutos() + " minutos");
        System.out.println("Diretor: " + getNomeDiretor());
        System.out.println("Média das avaliações: " + String.format(Locale.US, "%.2f", obterMediaAvaliacao()));
        System.out.println("Quantidade de avaliação: " + getQuantidadeAvaliacao());
        System.out.println("Incluído no plano Premium: " + isIncluidoPremium());
    }

}
