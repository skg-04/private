package com.mycompany.totemmuseo.modelo; // Define o pacote onde a classe está localizada


import javax.swing.*; // Importa todos os componentes visuais padrão (Botões, Painéis, Caixas de Texto, etc).

import javax.swing.plaf.basic.BasicComboPopup; // Importa uma classe especial para permitir customizar o menu que "pula" do JComboBox.

import java.awt.*; // Importa ferramentas básicas de design: cores, fontes, layouts e desenhos (Graphics).

import java.awt.event.*; // Importa os "ouvintes" de eventos: detecta cliques de mouse, teclas e fechamento de janelas.

import java.util.ArrayList; // Importa a estrutura de lista dinâmica, usada para criar listas que crescem sozinhas.

import java.util.List; // Importa a interface 'List', que define as regras de como uma lista deve se comportar no Java.


// Declaração da classe que estende JDialog (uma janela de diálogo/pop-up)
public class QuestionarioFeedback extends JDialog
{

    // Atributos privados da classe (variáveis globais da janela)
    private JTextArea txtComentario; // Campo para o usuário escrever sugestões
    private TecladoVirtual teclado;   // Referência para o teclado virtual customizado
    private ButtonGroup grupoNota;    // Agrupador para que apenas um botão de rádio (1 a 5) seja marcado
    private final List<Pergunta> perguntasQuiz = new ArrayList<>(); // Lista que guarda os objetos de perguntas
    private final List<JComboBox<String>> combosRespostas = new ArrayList<>(); // Lista que guarda os menus de seleção de respostas

    // Construtor da classe: executa quando a tela é criada
    public QuestionarioFeedback(Dialog pai)
    {
        // Chama o construtor da classe pai (JDialog) para configurar a janela:
        // 1º Parâmetro (pai): Define que esta janela pertence à tela principal (frmPrincipal).
        // 2º Parâmetro ("Quiz..."): Define o título da janela (útil para identificação interna).
        // 3º Parâmetro (true): Torna a janela MODAL. Isso bloqueia a tela de trás, garante o foco 
        // total nesta janela e resolve o erro de ter que clicar duas vezes.
        super(pai, "Quiz e Feedback - Museu Espacial", true);

        setUndecorated(true); // Remove as bordas, botões de fechar/minimizar e barra de título do Windows
        setResizable(false);  // Impede que o usuário redimensione a janela manualmente
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE); // Garante que a memória seja liberada ao fechar

        carregarDadosDoQuiz(); // Preenche a lista 'perguntasQuiz' com as questões de Marte
        initComponents();      // Monta toda a interface visual (botões, painéis, cores)
        new TelaCheia(this).aplicar(); // Aplica a lógica de ocupar a tela toda do monitor

        // Listener para detectar quando a janela está fechando
        addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                if (teclado != null) // Se o teclado virtual estiver aberto...
                {
                    teclado.dispose(); // ...fecha o teclado junto com a janela principal
                }
            }
        });
    }

    // Método para definir as perguntas, opções e as respostas corretas
    private void carregarDadosDoQuiz()
    {
        // Lista de strings com nomes de robôs para as opções do JComboBox
        String[] robos =
        {
            "Curiosity", "Perseverance", "Opportunity", "Spirit", "Viking 1", "Viking 2", "Sojourner", "Phoenix", "Insight", "Zhurong"
        };

        // Lista de strings para a pergunta de sim ou não
        String[] opcoesAgua =
        {
            "Sim, há bilhões de anos atrás.", "Não, Marte nunca teve um registro que de fato tinha água."
        };

        // Adiciona novos objetos do tipo 'Pergunta' na lista dinâmica
        perguntasQuiz.add(new Pergunta("Qual foi o primeiro lander dos EUA a ir para Marte?", robos, "Viking 1"));
        perguntasQuiz.add(new Pergunta("Segundo as informações que foram vistas aqui, os rovers comprovaram a existência de água em Marte?", opcoesAgua, "Sim, há bilhões de anos atrás."));
        perguntasQuiz.add(new Pergunta("Qual rover pousou em uma região de Marte chamada Cratera Jezero?", robos, "Perseverance"));
        perguntasQuiz.add(new Pergunta("Qual foi o primeiro rover dos EUA a ir para Marte?", robos, "Sojourner"));
        perguntasQuiz.add(new Pergunta("Entre todos esses robôs da lista, qual é o da China?", robos, "Zhurong"));
    }

    // Método principal de construção da interface gráfica
    private void initComponents()
    {
        // Cria o painel raiz com layout BorderLayout (Norte, Sul, Centro, Leste, Oeste)
        JPanel painelPrincipal = new JPanel(new BorderLayout(10, 10));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Cria margens de 20px nas bordas
        painelPrincipal.setBackground(new Color(0, 20, 40)); // Define a cor de fundo Azul Escuro (RGB)

        // Título da tela no topo
        JLabel lblTitulo = new JLabel("TESTE SEUS CONHECIMENTOS", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 42)); // Fonte grande para leitura em totens
        lblTitulo.setForeground(Color.WHITE); // Cor do texto branca
        painelPrincipal.add(lblTitulo, BorderLayout.NORTH); // Adiciona o título na parte de cima

        // Painel que conterá todas as perguntas (GridLayout com 0 linhas significa quantas precisar)
        JPanel painelConteudo = new JPanel(new GridLayout(0, 1, 0, 35));
        painelConteudo.setOpaque(false); // Torna o painel transparente para mostrar o fundo azul

        // --- SEÇÃO: NOTA GERAL (1 A 5) ---
        JPanel pNota = criarPainelPergunta("O quanto você gostou da visita? (1 a 5):");
        grupoNota = new ButtonGroup(); // Instancia o grupo para exclusividade de seleção
        JPanel botoesNota = new JPanel(new FlowLayout(FlowLayout.CENTER, 40, 10)); // Alinhamento centralizado com espaço de 40px

        // Loop para criar os 5 botões de rádio (notas de 1 a 5)
        for (int i = 1; i <= 5; i++)
        {
            JRadioButton rb = new JRadioButton(String.valueOf(i));
            rb.setFont(new Font("Arial", Font.BOLD, 48)); // Números gigantes para touch screen
            rb.setForeground(Color.WHITE);
            rb.setOpaque(false);
            rb.setActionCommand(String.valueOf(i)); // Define o valor interno do botão (ex: "1", "2")

            // Define desenhos customizados para as "bolinhas" (método criarIconeRadio lá embaixo)
            rb.setIcon(criarIconeRadio(false)); // Ícone quando não selecionado
            rb.setSelectedIcon(criarIconeRadio(true)); // Ícone quando selecionado
            rb.setIconTextGap(20); // Espaço entre o círculo e o número

            grupoNota.add(rb); // Adiciona ao grupo lógico
            botoesNota.add(rb); // Adiciona à tela física
        }
        pNota.add(botoesNota);
        painelConteudo.add(pNota);

        // --- SEÇÃO: PERGUNTAS DO QUIZ (DINÂMICO) ---
        for (Pergunta p : perguntasQuiz)
        {
            JPanel painelP = criarPainelPergunta(p.getEnunciado()); // Cria o painel com o título da pergunta
            JComboBox<String> combo = new JComboBox<>(p.getOpcoes()); // Cria a caixa de seleção com as opções
            combo.setFont(new Font("Arial", Font.BOLD, 26));
            combo.setPreferredSize(new Dimension(0, 70)); // Define altura de 70px para ser fácil de clicar com o dedo
            estilizarScrollCombo(combo); // Ajusta a barra de rolagem interna do menu
            combosRespostas.add(combo); // Guarda a referência para conferir a resposta no final
            painelP.add(combo);
            painelConteudo.add(painelP);
        }

        // --- SEÇÃO: COMENTÁRIO LIVRE ---
        JPanel pComentario = criarPainelPergunta("Deixe sua sugestão ou comentário:");
        txtComentario = new JTextArea(3, 40); // Campo de 3 linhas e 40 colunas
        txtComentario.setFont(new Font("Arial", Font.PLAIN, 24));
        txtComentario.setLineWrap(true); // Quebra a linha automaticamente ao chegar no fim do campo
        txtComentario.setWrapStyleWord(true); // Garante que a quebra de linha não corte palavras no meio

        // Adiciona evento de clique no campo de texto
        txtComentario.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                // Se clicar no campo e o teclado não estiver visível, ele aparece
                if (teclado == null || !teclado.isVisible())
                {
                    mostrarTeclado();
                }
            }
        });

        // Coloca o campo de comentário dentro de uma barra de rolagem
        JScrollPane scrollComentario = new JScrollPane(txtComentario);
        scrollComentario.setPreferredSize(new Dimension(800, 120));
        pComentario.add(scrollComentario);
        painelConteudo.add(pComentario);

        // --- SEÇÃO: SCROLL GERAL DO FORMULÁRIO ---
        JScrollPane scrollGeral = new JScrollPane(painelConteudo);
        scrollGeral.setOpaque(false);
        scrollGeral.getViewport().setOpaque(false); // Torna a área de visão do scroll transparente
        scrollGeral.setBorder(null); // Remove bordas padrão do scroll
        scrollGeral.getVerticalScrollBar().setUnitIncrement(25); // Aumenta a velocidade da rolagem
        scrollGeral.getVerticalScrollBar().setPreferredSize(new Dimension(30, 0)); // Barra de rolagem larga (30px) para dedos
        scrollGeral.getVerticalScrollBar().setBackground(new Color(0, 30, 60));

        painelPrincipal.add(scrollGeral, BorderLayout.CENTER); // Adiciona o scroll no centro da tela

        // --- SEÇÃO: BOTÕES DE FINALIZAÇÃO (RODAPÉ) ---
        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER, 40, 20));
        painelBotoes.setOpaque(false);

        JButton btnEnviar = criarBotao("FINALIZAR", new Color(0, 150, 0)); // Botão verde
        btnEnviar.addActionListener(e -> enviarFeedback()); // Executa a lógica de correção ao clicar

        JButton btnCancelar = criarBotao("CANCELAR", new Color(180, 0, 0)); // Botão vermelho
        btnCancelar.addActionListener(e -> dispose()); // Fecha a janela sem salvar nada

        painelBotoes.add(btnEnviar);
        painelBotoes.add(btnCancelar);

        painelPrincipal.add(painelBotoes, BorderLayout.SOUTH); // Adiciona os botões na parte de baixo

        setContentPane(painelPrincipal); // Define o painelPrincipal como o conteúdo oficial da janela
        pack(); // Ajusta o tamanho da janela aos componentes (antes da tela cheia)
        setLocationRelativeTo(null); // Centraliza a janela na tela
    }

    // Método que desenha os ícones customizados (as bolinhas de nota) usando Graphics2D
    private Icon criarIconeRadio(boolean selecionado)
    {
        return new Icon()
        {
            @Override
            public void paintIcon(Component c, Graphics g, int x, int y)
            {
                Graphics2D g2 = (Graphics2D) g.create();
                // Habilita o Anti-aliasing para o círculo não ficar serrilhado (ficar lisinho)
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Desenha o círculo branco externo (a borda da bolinha)
                g2.setColor(Color.WHITE);
                g2.setStroke(new BasicStroke(4)); // Linha grossa de 4px
                g2.drawOval(x + 2, y + 2, 45, 45); // Tamanho da bolinha

                // Se o botão estiver marcado, desenha o preenchimento azul neon
                if (selecionado)
                {
                    g2.setColor(new Color(0, 200, 255)); // Azul Neon
                    g2.fillOval(x + 10, y + 10, 30, 30); // Círculo interno menor
                }
                g2.dispose(); // Libera os recursos de desenho
            }

            @Override
            public int getIconWidth()
            {
                return 55;
            } // Define largura do ícone

            @Override
            public int getIconHeight()
            {
                return 55;
            } // Define altura do ícone
        };
    }

    // Ajusta a barra de rolagem que aparece dentro dos menus JComboBox
    private void estilizarScrollCombo(JComboBox<String> combo)
    {
        Object popup = combo.getAccessibleContext().getAccessibleChild(0);
        if (popup instanceof BasicComboPopup basicComboPopup)
        {
            // Pega o JScrollPane interno do menu suspenso e deixa a barra lateral larga
            JScrollPane scroll = (JScrollPane) basicComboPopup.getComponent(0);
            scroll.getVerticalScrollBar().setPreferredSize(new Dimension(30, 0));
        }
    }

    // Método auxiliar para criar o título de cada pergunta com estilo padronizado
    private JPanel criarPainelPergunta(String titulo)
    {
        JPanel p = new JPanel(new BorderLayout(0, 10));
        p.setOpaque(false);
        JLabel lbl = new JLabel(titulo, SwingConstants.LEFT);
        lbl.setFont(new Font("Arial", Font.BOLD, 28));
        lbl.setForeground(Color.WHITE);
        p.add(lbl, BorderLayout.NORTH);
        return p;
    }

    // Método auxiliar para criar botões grandes e coloridos (FINALIZAR/CANCELAR)
    private JButton criarBotao(String texto, Color cor)
    {
        JButton btn = new JButton(texto);
        btn.setFont(new Font("Arial", Font.BOLD, 26));
        btn.setPreferredSize(new Dimension(320, 90));
        btn.setBackground(cor);
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false); // Remove aquele quadradinho tracejado de foco ao redor do texto
        return btn;
    }

    // Lógica para instanciar e mostrar o teclado virtual na tela
    private void mostrarTeclado()
    {
        if (teclado != null)
        {
            teclado.dispose(); // Fecha o anterior se existir
            teclado = null;
        }
        // Cria o teclado passando 'this' (a janela atual) e o campo de texto onde as letras devem aparecer
        teclado = new TecladoVirtual(this, txtComentario);
        teclado.setVisible(true);
        teclado.toFront(); // Garante que o teclado fique na frente de tudo
    }

    // Lógica final que corrige o quiz e encerra o feedback
    private void enviarFeedback()
    {
        int acertos = 0;
        StringBuilder sb = new StringBuilder(); // Objeto para construir a string de resultado
        sb.append("--- RESULTADO DO QUIZ ---\n\n");

        // Loop para comparar as respostas selecionadas com as corretas
        for (int i = 0; i < perguntasQuiz.size(); i++)
        {
            Pergunta p = perguntasQuiz.get(i);
            String respUser = (String) combosRespostas.get(i).getSelectedItem(); // Resposta do usuário

            if (respUser.equals(p.getRespostaCorreta()))
            {
                acertos++;
                sb.append("Q").append(i + 1).append(": ✅ Correto!\n");
            } else
            {
                sb.append("Q").append(i + 1).append(": ❌ Errado (Correto: ").append(p.getRespostaCorreta()).append(")\n");
            }
        }

        // Adiciona a pontuação final no texto
        sb.append("\nTotal de Acertos: ").append(acertos).append(" / ").append(perguntasQuiz.size());

        // Verifica qual nota foi selecionada no grupo de botões
        String notaFinal = (grupoNota.getSelection() != null) ? grupoNota.getSelection().getActionCommand() : "Não avaliada";
        sb.append("\n\nSua avaliação do Museu: ").append(notaFinal).append(" ⭐");

        // Mensagem de bônus se acertar tudo
        if (acertos == perguntasQuiz.size())
        {
            sb.append("\n\nParabéns! Você é um expert em Marte!");
        }

        // Mostra o resumo final em um JOptionPane (janela de alerta)
        JOptionPane.showMessageDialog(this, sb.toString(), "Resultado e Feedback", JOptionPane.INFORMATION_MESSAGE);

        // Fecha a tela de feedback após o usuário ler o resultado
        this.setVisible(false);
        this.dispose();
    }
}
