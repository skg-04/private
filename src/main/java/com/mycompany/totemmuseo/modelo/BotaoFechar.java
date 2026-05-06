package com.mycompany.totemmuseo.modelo;
// Define o pacote da classe.
// Funciona como a pasta lógica do projeto.

import java.awt.Color;
// Importa a classe Color.
// Usada para definir cores.

import java.awt.Font;
// Importa a classe Font.
// Usada para definir fonte e tamanho do texto.

import java.awt.Toolkit;
// Importa Toolkit.
// Permite acessar recursos do sistema,
// como resolução da tela.

import javax.swing.JButton;
// Importa JButton.
// JButton é o botão do Swing.

import javax.swing.JDialog;
// Importa JDialog.
// Representa uma janela do Swing.

import javax.swing.JLayeredPane;
// Importa JLayeredPane.
// Permite colocar componentes em "camadas",
// como se fossem níveis sobrepostos.

public class BotaoFechar
// Cria a classe BotaoFechar.
// Essa classe será responsável por criar
// o botão vermelho X do sistema.
{

    // Variável que guardará a janela recebida.
    private final JDialog janela;

    public BotaoFechar(JDialog janela)
    // Construtor da classe.
    // Recebe uma janela como parâmetro.
    {
        // Guarda a janela recebida.
        this.janela = janela;
    }

    public void adicionar()
    // Método responsável por criar e adicionar
    // o botão na tela.
    {

        // Cria um botão com o texto "X".
        JButton btnSair = new JButton("X");

        // Define a fonte do botão.
        //
        // Arial = nome da fonte
        // BOLD = negrito
        // 30 = tamanho
        btnSair.setFont(new Font("Arial", Font.BOLD, 30));

        // Define fundo vermelho.
        btnSair.setBackground(Color.RED);

        // Define letra branca.
        btnSair.setForeground(Color.WHITE);

        // Remove o foco do botão.
        //
        // Isso evita aquela borda azul
        // quando o botão é clicado.
        btnSair.setFocusable(false);

        // Define borda branca no botão.
        btnSair.setBorder(
                javax.swing.BorderFactory.createLineBorder(
                        Color.WHITE,
                        2
                )
        );
        //
        // Color.WHITE = cor da borda
        // 2 = espessura da borda

        // Pega largura da tela do computador.
        int larguraTela
                = Toolkit.getDefaultToolkit()
                        .getScreenSize().width;

        // Define posição e tamanho do botão.
        //
        // larguraTela - 100
        // coloca botão perto do canto direito.
        //
        // 30 = posição vertical
        //
        // 60 = largura
        // 60 = altura
        btnSair.setBounds(
                larguraTela - 100,
                30,
                60,
                60
        );

        // Evento do botão.
        //
        // Quando clicar:
        // fecha completamente o programa.
        btnSair.addActionListener(e -> System.exit(0));

        // Remove o layout automático do LayeredPane.
        //
        // Isso permite posicionamento manual
        // usando setBounds().
        janela.getLayeredPane().setLayout(null);

        // Adiciona o botão na camada POPUP_LAYER.
        //
        // Isso faz o botão ficar acima
        // de todos os outros componentes.
        janela.getLayeredPane().add(
                btnSair,
                JLayeredPane.POPUP_LAYER
        );
    }
}
