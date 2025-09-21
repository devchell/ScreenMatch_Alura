package br.com.chell.screenmatch.modelos;

import java.util.Locale;

public class Filme extends Titulo {

    private boolean possuiSaga;

    public void exibeFichaFilme(){
        System.out.println("Nome do filme: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoLancamento());
        if (possuiSaga) {
            System.out.println("Este filme contém uma Saga.");
        } else {
            System.out.println("Este filme não contém uma Saga.");
        }
        System.out.println("Duração: " + pegaDuracaoMinutos() + " minutos");
        System.out.println("Diretor: " + getNomeDiretor());
        System.out.println("Média das avaliações: " + String.format(Locale.US, "%.2f", obterMediaAvaliacao()));
        System.out.println("Quantidade de avaliação: " + getQuantidadeAvaliacao());
        if (isIncluidoPremium()) {
            System.out.println("Este filme faz parte do plano: Premium");
        } else {
            System.out.println("Este filme faz parte do plano: Gratuito");
        }

    }

}
