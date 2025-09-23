package br.com.chell.screenmatch.main;

import br.com.chell.screenmatch.modelos.Filme;
import br.com.chell.screenmatch.modelos.Serie;
import br.com.chell.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class MainLista {
    public static void main(String[] args) {
        Serie serie01 = new Serie("Supernatural", 2005);
        Filme filme01 = new Filme("Meu Malvado Favorito", 2010);
        var filme02 = new Filme("O Estrangeiro", 2017);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(serie01);
        lista.add(filme01);
        lista.add(filme02);
        for (Titulo item: lista){
            System.out.println(item);
        }
    }
}
