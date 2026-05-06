package com.mycompany.totemmuseo.modelo;
// Define o pacote da classe.
// Funciona como o endereço dela dentro do projeto.

import java.awt.Dimension;
// Importa a classe Dimension.
// Ela representa largura e altura.

import java.awt.Toolkit;
// Importa Toolkit.
// Toolkit permite acessar recursos do sistema operacional,
// como resolução da tela.

import javax.swing.JDialog;
// Importa a classe JDialog.
// JDialog representa uma janela do Java Swing.

public class TelaCheia
// Cria a classe TelaCheia.
// Essa classe será responsável por transformar
// a janela em tela cheia.
{

    // Variável que guardará a janela recebida.
    private final JDialog janela;

    public TelaCheia(JDialog janela)
    // Construtor da classe.
    // Recebe uma janela como parâmetro.
    {
        // Guarda a janela recebida dentro da variável.
        this.janela = janela;
    }

    public void aplicar()
    // Método responsável por aplicar o modo tela cheia.
    {

        // Cria objeto "tela" contendo:
        // largura e altura do monitor atual.
        Dimension tela
                = Toolkit.getDefaultToolkit().getScreenSize();

        // Define o tamanho da janela igual ao tamanho da tela.
        //
        // Resultado:
        // a janela ocupa o monitor inteiro.
        janela.setSize(tela);

        // Centraliza a janela na tela.
        //
        // Como ela já está ocupando a tela inteira,
        // isso ajuda a garantir posicionamento correto.
        janela.setLocationRelativeTo(null);
    }
}
