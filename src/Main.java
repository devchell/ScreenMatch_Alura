import br.com.chell.screenmatch.modelos.Serie;
import br.com.chell.screenmatch.modelos.Titulo;

public class Main {

    public static void main(String[] args) {

        //Série
        Serie serie01 = new Serie();

        serie01.setNome("Supernatural");
        serie01.setQuantidadeEpisodios(327);
        serie01.setQuantidadeTemporadas(15);
        serie01.setAtiva(false);
        serie01.setAnoLancamento(2005);
        serie01.setIncluidoPremium(true);
        serie01.setNomeDiretor("Eric Kripke");
        serie01.setDuracaoMinutos(35);

        serie01.exibeFichaSerie();

    }

}
