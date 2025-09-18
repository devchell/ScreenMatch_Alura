public class Filme {

    String nome;
    int anoLancamento;
    boolean incluidoPremium;
    double somaDasAvaliacoes;
    int quantidadeAvaliacao;
    int duracaoMinutos;

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração: " + duracaoMinutos + " minutos");
        System.out.println("Média das avaliações: " + obterMediaAvaliacao());
        System.out.println("Quantidade de avaliação: " + quantidadeAvaliacao);
        System.out.println("Incluído no plano Premium: " + incluidoPremium);

    }

    void avaliaFilme(double nota){
        somaDasAvaliacoes += nota;
        quantidadeAvaliacao++;

    }

    double obterMediaAvaliacao(){
        return somaDasAvaliacoes/quantidadeAvaliacao;

    }

}
