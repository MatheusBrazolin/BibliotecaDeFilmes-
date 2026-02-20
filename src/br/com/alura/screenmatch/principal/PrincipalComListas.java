package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    static void main(String[] args) {
        Filme favorito = new Filme("The Matrix", 1999);
        favorito.avalia(8);

        Filme outro = new Filme("John Wick", 2014);
        outro.avalia(9);

        Serie serie = new Serie("La Casa de Papel", 2017);
        serie.avalia(9);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(favorito);
        lista.add(outro);
        lista.add(serie);

        for(Titulo titulo : lista){
            System.out.println(titulo.getNome());
            if (titulo instanceof Filme filme && filme.getAnoDeLancamento() > 2) {
                System.out.println("Classificacao: " + filme.getClassificacao());
            }
        }
    }
}
