package com.br.com.alura.screenmatch.service;

public interface IConverterDados {
    <T> T obterDados(String json, Class<T> classe);

    /*Como o retorno pode ser de vários dados, diretor, filme, atores
    foi usado uma atribuicao generica <T>.
     */

}
