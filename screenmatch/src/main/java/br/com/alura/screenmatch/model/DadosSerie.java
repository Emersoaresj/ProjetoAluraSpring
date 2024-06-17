package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//JsonAlias > vai ler "Title" e escrever "titulo" > colocando apelido nos dados para que o Json consiga identificar a chave
//JsonProperty > vai ler "Title" e escrever "Title"
//Classe record apenas para representação dos dados (Não vamos trabalhar aqui)

@JsonIgnoreProperties(ignoreUnknown = true) // Ignore tudo na API que não foi mapeado
public record DadosSerie(
        @JsonAlias("Title") String titulo,
       @JsonAlias("totalSeasons") Integer totalTemporadas,
       @JsonAlias("imdbRating") String avaliacao) {
}