import br.com.chell.screenmatch.calculo.CalculadoraDeTempo;
import br.com.chell.screenmatch.modelos.Filme;
import br.com.chell.screenmatch.modelos.Serie;

public class Main {

    public static void main(String[] args) {

        //Série
        Serie serie01 = new Serie();

        serie01.setNome("Supernatural");
        serie01.setQuantidadeEpisodios(327);
        serie01.setQuantidadeTemporadas(15);
        serie01.setAtiva(false);
        serie01.setAnoLancamento(2005);
        serie01.setIncluidoPremium(false);
        serie01.setNomeDiretor("Eric Kripke");
        serie01.setMinutosPorEpisodio(35);

        serie01.avaliaSerie(10);
        serie01.avaliaSerie(9);
        serie01.avaliaSerie(9.33);
        serie01.avaliaSerie(9.87);

        serie01.exibeFichaSerie();

        System.out.println("\n\n\n");

        //Filme
        Filme filme01 = new Filme();
        filme01.setNome("Meu Malvado Favorito");
        filme01.setAnoLancamento(2010);
        filme01.setDuracaoMinutos(95);
        filme01.setNomeDiretor("Chris Renaud");
        filme01.setIncluidoPremium(true);
        filme01.setPossuiSaga(true);

        filme01.avaliaFilme(7);
        filme01.avaliaFilme(9);
        filme01.avaliaFilme(10);
        filme01.avaliaFilme(8.5);

        filme01.exibeFichaFilme();

        //Calculadora
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();


    }

}
