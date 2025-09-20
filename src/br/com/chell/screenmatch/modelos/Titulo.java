package br.com.chell.screenmatch.modelos;


public class Titulo {
    private String nome;
    private int anoLancamento;
    private boolean incluidoPremium;
    private double somaDasAvaliacoes;
    private int quantidadeAvaliacao;
    private String nomeDiretor;

    public void avaliaFilme(double nota) {
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

    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }
}
