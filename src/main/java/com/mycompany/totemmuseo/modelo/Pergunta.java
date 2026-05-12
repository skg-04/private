package com.mycompany.totemmuseo.modelo; // Define o pacote onde a classe está localizada

public class Pergunta // Declaração da classe pública chamada Pergunta
{

    // Atributos (variáveis) que guardam as informações da pergunta
    private final String enunciado;        // Variável privada e imutável para o texto da pergunta
    private final String[] opcoes;         // Array privado e imutável para a lista de opções de resposta
    private final String respostaCorreta;  // Variável privada e imutável para a resposta que é considerada certa

    // Método Construtor: usado para criar (instanciar) um novo objeto de Pergunta
    public Pergunta(String enunciado, String[] opcoes, String respostaCorreta)
    {
        this.enunciado = enunciado;             // Atribui o enunciado recebido à variável da classe
        this.opcoes = opcoes;                   // Atribui as opções recebidas à variável da classe
        this.respostaCorreta = respostaCorreta; // Atribui a resposta correta recebida à variável da classe
    }

    // Métodos "Getter": permitem que outras classes leiam os dados, mas sem alterá-los
    public String getEnunciado() // Método para retornar o texto da pergunta
    {
        return enunciado; // Devolve o valor guardado no atributo enunciado
    }

    public String[] getOpcoes() // Método para retornar a lista de opções
    {
        return opcoes; // Devolve o array de strings com as opções
    }

    public String getRespostaCorreta() // Método para retornar a resposta certa
    {
        return respostaCorreta; // Devolve o valor da resposta correta para validação
    }
}
