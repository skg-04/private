package com.mycompany.totemmuseo.modelo; // Define o pacote da classe

import javax.swing.text.JTextComponent; // Importa suporte a campos de texto (JTextField, JTextArea)
import javax.swing.*;                  // Importa componentes gráficos do Swing
import java.awt.*;                     // Importa ferramentas de layout e cores

public class TecladoVirtual extends JDialog // Define que esta classe é uma janela de diálogo
{

    private final JTextComponent componenteAlvo; // Guarda em qual campo o teclado vai escrever
    private boolean capsLock = false;            // Controle de letras maiúsculas/minúsculas

    // Construtor do teclado
    public TecladoVirtual(Dialog pai, JTextComponent alvo)
    {
        super(pai, "Teclado", ModalityType.MODELESS); // Cria o diálogo vinculado à janela pai, sem travar a tela
        this.componenteAlvo = alvo;                   // Define o alvo da digitação
        setUndecorated(true);                         // Remove as bordas e barra de título padrão
        setResizable(false);                          // Impede o redimensionamento manual

        // Impede que o teclado roube o foco da janela principal (essencial para totens)
        setFocusableWindowState(false);

        initTeclado(); // Chama o método de construção visual
    }

    private void initTeclado()
    {
        // Cria o painel principal com 4 linhas e espaçamento de 5 pixels
        JPanel painelTeclado = new JPanel(new GridLayout(4, 1, 5, 5));
        painelTeclado.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Margem interna
        painelTeclado.setBackground(new Color(30, 30, 30)); // Cor de fundo escura

        // Arrays com as letras de cada linha (padrão QWERTY)
        String[] linha1 =
        {
            "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P"
        };
        String[] linha2 =
        {
            "A", "S", "D", "F", "G", "H", "J", "K", "L"
        };
        String[] linha3 =
        {
            "Z", "X", "C", "V", "B", "N", "M"
        };

        // Adiciona as linhas de botões ao painel
        painelTeclado.add(criarLinha(linha1));
        painelTeclado.add(criarLinha(linha2));
        painelTeclado.add(criarLinha(linha3));
        painelTeclado.add(criarLinhaEspecial()); // Adiciona a linha do Espaço, Enter, etc.

        setContentPane(painelTeclado); // Define o painel como conteúdo da janela
        pack(); // Ajusta o tamanho da janela aos botões

        // Posicionamento na parte inferior da tela
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (tela.width - getWidth()) / 2;     // Centraliza horizontalmente
        int y = tela.height - getHeight() - 20;    // Coloca no rodapé com 20px de margem
        setLocation(x, y); // Define a posição final
    }

    // Cria um painel horizontal com os botões das letras
    private JPanel criarLinha(String[] teclas)
    {
        JPanel linha = new JPanel(new GridLayout(1, teclas.length, 5, 5));
        linha.setOpaque(false); // Fundo transparente
        for (String t : teclas)
        {
            linha.add(criarBotaoTecla(t)); // Adiciona cada tecla individualmente
        }
        return linha;
    }

    // Cria a linha inferior com teclas de função
    private JPanel criarLinhaEspecial()
    {
        JPanel linha = new JPanel(new GridLayout(1, 4, 5, 5));
        linha.setOpaque(false);
        JButton espaco = criarBotaoTecla(" "); // Cria o botão de espaço
        espaco.setPreferredSize(new Dimension(300, 70)); // Define largura maior para o espaço
        linha.add(espaco);
        linha.add(criarBotaoTecla("Apagar"));
        linha.add(criarBotaoTecla("CAPS"));
        linha.add(criarBotaoTecla("ENTER"));
        return linha;
    }

    // Cria e configura cada botão individualmente
    private JButton criarBotaoTecla(String texto)
    {
        JButton btn = new JButton(texto); // Cria o botão com o texto
        btn.setFont(new Font("Arial", Font.BOLD, 22)); // Define a fonte
        btn.setPreferredSize(new Dimension(70, 70));   // Define o tamanho padrão (quadrado)
        btn.setBackground(new Color(60, 60, 60));      // Cor cinza dos botões
        btn.setForeground(Color.WHITE);                // Cor do texto branca
        btn.setFocusPainted(false);                    // Remove o retângulo de foco interno

        // Impede que o botão receba foco, mantendo o cursor no campo de texto
        btn.setFocusable(false);

        // Define a ação ao clicar no botão
        btn.addActionListener((var  
        
            _) -> {
            switch (texto)
            {
                case "Apagar" -> // Lógica de Backspace
                {
                    String txt = componenteAlvo.getText();
                    if (!txt.isEmpty())
                    {
                        componenteAlvo.setText(txt.substring(0, txt.length() - 1));
                    }
                }
                case "ENTER" -> // Lógica de finalizar
                {
                    componenteAlvo.transferFocus(); // Move o foco para fora para evitar reabrir teclado
                    dispose(); // Fecha o teclado
                }
                case "CAPS" -> // Lógica de alternar maiúsculas
                {
                    capsLock = !capsLock;
                    btn.setBackground(capsLock ? new Color(0, 120, 200) : new Color(60, 60, 60)); // Muda cor se ativo
                }
                default -> // Lógica de digitação de letras
                {
                    String tecla = capsLock ? texto.toUpperCase() : texto.toLowerCase();
                    componenteAlvo.setText(componenteAlvo.getText() + tecla); // Adiciona letra ao campo alvo
                }
            }
        });
        return btn;
    }
}
