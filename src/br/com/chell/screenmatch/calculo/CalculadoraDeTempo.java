package br.com.chell.screenmatch.calculo;

import br.com.chell.screenmatch.modelos.Filme;
import br.com.chell.screenmatch.modelos.Serie;

public class CalculadoraDeTempo {
    private int tempoTotalMinutos;

    public int getTempoTotalMinutos() {
        return tempoTotalMinutos;
    }

    public void inclui(Filme f) {
        tempoTotalMinutos += f.pegaDuracaoMinutos();
    }
    public void inclui(Serie s) {
        tempoTotalMinutos += s.pegaDuracaoMinutos();
    }

    public int transformaMinutosHoras() {
        return tempoTotalMinutos/60;
    }

    public int transformaHorasDias() {
        return transformaMinutosHoras()/24;
    }

    public void exibeFichaLista() {
        if (tempoTotalMinutos < 60) {
            System.out.println("");
        }

    }
}
