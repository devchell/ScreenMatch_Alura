import br.com.chell.screenmatch.modelos.Titulo;

public class Main {

    public static void main(String[] args) {

        Titulo filme01 = new Titulo();

        filme01.setNome("Meu Malvado Favorito");
        filme01.setAnoLancamento(2010);
        filme01.setDuracaoMinutos(95);
        filme01.setIncluidoPremium(true);
        filme01.setNomeDiretor("João Vitor Rodrigues");

        filme01.avaliaFilme(9);
        filme01.avaliaFilme(7);
        filme01.avaliaFilme(6.75);

        filme01.exibeFichaTecnica();


    }

}
