package br.com.alura.screenmatch.service;

// Criando uma interface para ter um método de obter dados (seja serie, ator, filme)
public interface IConverteDados {

    // <T> T > não sei qual o tipo que será devolvido, eu sei que precisa devolver alguma coisa. Também não sei qual classe irei escolher, mas na hora de chamar o método eu irei apontar
       <T> T obterDados(String json, Class<T> classe);

}
