package com.mycompany.totemmuseo.modelo;

import javax.swing.*;
import javax.swing.plaf.basic.BasicComboPopup;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class QuestionarioFeedback extends JDialog
{

    private JTextArea txtComentario;
    private TecladoVirtual teclado;
    private ButtonGroup grupoNota;
    private final List<Pergunta> perguntasQuiz = new ArrayList<>();
    private final List<JComboBox<String>> combosRespostas = new ArrayList<>();

    public QuestionarioFeedback(Dialog pai)
    {
        super(pai, "Quiz e Feedback - Museu Espacial", false);
        setUndecorated(true);
        setResizable(false);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        carregarDadosDoQuiz();
        initComponents();
        new TelaCheia(this).aplicar();

        addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                if (teclado != null)
                {
                    teclado.dispose();
                }
            }
        });
    }

    private void carregarDadosDoQuiz()
    {
        String[] robos =
        {
            "Curiosity", "Perseverance", "Opportunity", "Spirit", "Viking 1", "Viking 2", "Sojourner", "Phoenix", "Insight", "Zhurong"
        };
        String[] opcoesAgua =
        {
            "Sim, há milhões de anos atrás.", "Não, Marte nunca teve um registro que de fato tinha uma."
        };

        perguntasQuiz.add(new Pergunta("Qual foi o primeiro lander dos EUA a ir para Marte?", robos, "Viking 1"));
        perguntasQuiz.add(new Pergunta("Segundo as informações que foram vistas aqui, os rovers comprovaram a existência de água em Marte?", opcoesAgua, "Sim, há milhões de anos atrás."));
        perguntasQuiz.add(new Pergunta("Qual rover pousou em uma região de Marte chamada Cratera Jezero?", robos, "Perseverance"));
        perguntasQuiz.add(new Pergunta("Qual foi o primeiro rover dos EUA a ir para Marte?", robos, "Sojourner"));
        perguntasQuiz.add(new Pergunta("Entre todos esses robôs da lista, qual é o da China?", robos, "Zhurong"));
    }

    private void initComponents()
    {
        JPanel painelPrincipal = new JPanel(new BorderLayout(10, 10));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        painelPrincipal.setBackground(new Color(0, 20, 40));

        JLabel lblTitulo = new JLabel("TESTE SEUS CONHECIMENTOS", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 42));
        lblTitulo.setForeground(Color.WHITE);
        painelPrincipal.add(lblTitulo, BorderLayout.NORTH);

        JPanel painelConteudo = new JPanel(new GridLayout(0, 1, 0, 35));
        painelConteudo.setOpaque(false);

        // === NOTA GERAL COM BOLINHAS GIGANTES ===
        JPanel pNota = criarPainelPergunta("O quanto você gostou da visita? (1 a 5):");
        grupoNota = new ButtonGroup();
        JPanel botoesNota = new JPanel(new FlowLayout(FlowLayout.CENTER, 40, 10)); // Espaçamento maior entre notas

        for (int i = 1; i <= 5; i++)
        {
            JRadioButton rb = new JRadioButton(String.valueOf(i));
            rb.setFont(new Font("Arial", Font.BOLD, 48)); // Números gigantes
            rb.setForeground(Color.WHITE);
            rb.setOpaque(false);
            rb.setActionCommand(String.valueOf(i));

            // Aplica os ícones customizados grandes
            rb.setIcon(criarIconeRadio(false));
            rb.setSelectedIcon(criarIconeRadio(true));
            rb.setIconTextGap(20); // Distância entre bolinha e número

            grupoNota.add(rb);
            botoesNota.add(rb);
        }
        pNota.add(botoesNota);
        painelConteudo.add(pNota);

        // === LOOP DE PERGUNTAS DO QUIZ ===
        for (Pergunta p : perguntasQuiz)
        {
            JPanel painelP = criarPainelPergunta(p.getEnunciado());
            JComboBox<String> combo = new JComboBox<>(p.getOpcoes());
            combo.setFont(new Font("Arial", Font.BOLD, 26));
            combo.setPreferredSize(new Dimension(0, 70));
            estilizarScrollCombo(combo);
            combosRespostas.add(combo);
            painelP.add(combo);
            painelConteudo.add(painelP);
        }

        // === Comentário livre ===
        JPanel pComentario = criarPainelPergunta("Deixe sua sugestão ou comentário:");
        txtComentario = new JTextArea(3, 40);
        txtComentario.setFont(new Font("Arial", Font.PLAIN, 24));
        txtComentario.setLineWrap(true);
        txtComentario.setWrapStyleWord(true);
        txtComentario.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                if (teclado == null || !teclado.isVisible())
                {
                    mostrarTeclado();
                }
            }
        });

        JScrollPane scrollComentario = new JScrollPane(txtComentario);
        scrollComentario.setPreferredSize(new Dimension(800, 120));
        pComentario.add(scrollComentario);
        painelConteudo.add(pComentario);

        JScrollPane scrollGeral = new JScrollPane(painelConteudo);
        scrollGeral.setOpaque(false);
        scrollGeral.getViewport().setOpaque(false);
        scrollGeral.setBorder(null);
        scrollGeral.getVerticalScrollBar().setUnitIncrement(25);
        scrollGeral.getVerticalScrollBar().setPreferredSize(new Dimension(30, 0));
        scrollGeral.getVerticalScrollBar().setBackground(new Color(0, 30, 60));

        painelPrincipal.add(scrollGeral, BorderLayout.CENTER);

        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER, 40, 20));
        painelBotoes.setOpaque(false);

        JButton btnEnviar = criarBotao("FINALIZAR", new Color(0, 150, 0));
        btnEnviar.addActionListener(e -> enviarFeedback());

        JButton btnCancelar = criarBotao("CANCELAR", new Color(180, 0, 0));
        btnCancelar.addActionListener(e -> dispose());

        painelBotoes.add(btnEnviar);
        painelBotoes.add(btnCancelar);

        painelPrincipal.add(painelBotoes, BorderLayout.SOUTH);

        setContentPane(painelPrincipal);
        pack();
        setLocationRelativeTo(null);
    }

    // DESENHO DAS BOLINHAS GIGANTES
    private Icon criarIconeRadio(boolean selecionado)
    {
        return new Icon()
        {
            @Override
            public void paintIcon(Component c, Graphics g, int x, int y)
            {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Círculo externo
                g2.setColor(Color.WHITE);
                g2.setStroke(new BasicStroke(4)); // Borda grossa
                g2.drawOval(x + 2, y + 2, 45, 45); // Tamanho aumentado

                if (selecionado)
                {
                    g2.setColor(new Color(0, 200, 255)); // Azul Neon
                    g2.fillOval(x + 10, y + 10, 30, 30); // Preenchimento maior
                }
                g2.dispose();
            }

            @Override
            public int getIconWidth()
            {
                return 55;
            }

            @Override
            public int getIconHeight()
            {
                return 55;
            }
        };
    }

    private void estilizarScrollCombo(JComboBox<String> combo)
    {
        Object popup = combo.getAccessibleContext().getAccessibleChild(0);
        if (popup instanceof BasicComboPopup)
        {
            JScrollPane scroll = (JScrollPane) ((BasicComboPopup) popup).getComponent(0);
            scroll.getVerticalScrollBar().setPreferredSize(new Dimension(30, 0));
        }
    }

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

    private JButton criarBotao(String texto, Color cor)
    {
        JButton btn = new JButton(texto);
        btn.setFont(new Font("Arial", Font.BOLD, 26));
        btn.setPreferredSize(new Dimension(320, 90));
        btn.setBackground(cor);
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
        return btn;
    }

    private void mostrarTeclado()
    {
        if (teclado != null)
        {
            teclado.dispose();
            teclado = null;
        }
        teclado = new TecladoVirtual(this, txtComentario);
        teclado.setVisible(true);
        teclado.toFront();
    }

    private void enviarFeedback()
    {
        int acertos = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("--- RESULTADO DO QUIZ ---\n\n");

        for (int i = 0; i < perguntasQuiz.size(); i++)
        {
            Pergunta p = perguntasQuiz.get(i);
            String respUser = (String) combosRespostas.get(i).getSelectedItem();
            if (respUser.equals(p.getRespostaCorreta()))
            {
                acertos++;
                sb.append("Q").append(i + 1).append(": ✅ Correto!\n");
            } else
            {
                sb.append("Q").append(i + 1).append(": ❌ Errado (Correto: ").append(p.getRespostaCorreta()).append(")\n");
            }
        }

        sb.append("\nTotal de Acertos: ").append(acertos).append(" / ").append(perguntasQuiz.size());
        String notaFinal = (grupoNota.getSelection() != null) ? grupoNota.getSelection().getActionCommand() : "Não avaliada";
        sb.append("\n\nSua avaliação do Museu: ").append(notaFinal).append(" ⭐");

        if (acertos == perguntasQuiz.size())
        {
            sb.append("\n\nParabéns! Você é um expert em Marte!");
        }

        JOptionPane.showMessageDialog(this, sb.toString(), "Resultado e Feedback", JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);
        this.dispose();
    }
}
