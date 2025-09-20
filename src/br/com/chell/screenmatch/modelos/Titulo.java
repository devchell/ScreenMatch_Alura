package br.com.chell.screenmatch.modelos;

import java.util.Locale;

public class Titulo {
    private String nome;
    private int anoLancamento;
    private boolean incluidoPremium;
    private double somaDasAvaliacoes;
    private int quantidadeAvaliacao;
    private int duracaoMinutos;
    private String nomeDiretor;

    public void exibeFichaFilme(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração: " + duracaoMinutos + " minutos");
        System.out.println("Diretor: " + nomeDiretor);
        System.out.println("Média das avaliações: " + String.format(Locale.US, "%.2f", obterMediaAvaliacao()));
        System.out.println("Quantidade de avaliação: " + quantidadeAvaliacao);
        System.out.println("Incluído no plano Premium: " + incluidoPremium);
    }



    public void avaliaFilme(double nota) {
        somaDasAvaliacoes += nota;
        quantidadeAvaliacao++;

    }

    public void avanliaSerie(double nota){
        somaDasAvaliacoes += nota;
        quantidadeAvaliacao++;
    }

    public double obterMediaAvaliacao(){
        return somaDasAvaliacoes/quantidadeAvaliacao;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluidoPremium() {
        return incluidoPremium;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setIncluidoPremium(boolean incluidoPremium) {
        this.incluidoPremium = incluidoPremium;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }
    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }
}
