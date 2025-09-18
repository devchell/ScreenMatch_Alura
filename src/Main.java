public class Main {

    public static void main(String[] args) {

        Filme filme1 = new Filme();
        filme1.nome = "Meu Malvado Favorito";
        filme1.anoLancamento = 2010;
        filme1.duracaoMinutos = 95;
        filme1.incluidoPremium = true;

        filme1.avaliaFilme(8);
        filme1.avaliaFilme(7);
        filme1.avaliaFilme(9);
        filme1.exibeFichaTecnica();

    }

}
