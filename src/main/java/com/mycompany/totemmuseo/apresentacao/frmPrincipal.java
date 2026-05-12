package com.mycompany.totemmuseo.apresentacao;
// Define o pacote da classe.
// Funciona como o endereço dela dentro do projeto.
// Isso ajuda o Java a organizar os arquivos em categorias.

import com.mycompany.totemmuseo.modelo.*;
// Importa todas as classes do pacote "modelo".

public class frmPrincipal extends javax.swing.JDialog
// Classe principal da janela do sistema
{

    // Construtor principal da janela
    public frmPrincipal(java.awt.Frame parent, boolean modal)
    {
        // Chama o construtor da classe JDialog
        super(parent, modal);

        // Remove barra padrão do Windows
        this.setUndecorated(true);

        // Cria todos os componentes visuais da tela
        initComponents();

        jPanel1.setPreferredSize(
                new java.awt.Dimension(1450, 1150)
        );
        // Define o tamanho ideal que o painel deve ocupar. 
        // Nota: Em JScrollPanes, isso determina a área total "rolável".

        jScrollPane1.getVerticalScrollBar().setUnitIncrement(25);
        // Ajusta a velocidade da rolagem vertical.
        // O valor 25 define que cada "clique" ou movimento do scroll do mouse 
        // deslocará 25 pixels, tornando a navegação mais rápida e suave.

        // Aumenta a largura da barra de rolagem vertical
        jScrollPane1.getVerticalScrollBar().setPreferredSize(
                new java.awt.Dimension(25, 0));

        // Ativa modo tela cheia
        TelaCheia tela = new TelaCheia(this);
        tela.aplicar();

        // Cria botão personalizado de fechar
        BotaoFechar botao = new BotaoFechar(this);

        // Adiciona botão na tela
        botao.adicionar();

    }

    // Segundo construtor da janela
    public frmPrincipal()
    {
        // Cria janela sem janela pai
        super((java.awt.Frame) null, true);

        // Remove barra padrão
        this.setUndecorated(true);

        // Cria todos os componentes gráficos
        initComponents();

        jPanel1.setPreferredSize(
                new java.awt.Dimension(1450, 1150)
        );
        // Define o tamanho ideal que o painel deve ocupar. 
        // Nota: Em JScrollPanes, isso determina a área total "rolável".

        jScrollPane1.getVerticalScrollBar().setUnitIncrement(25);
        // Ajusta a velocidade da rolagem vertical.
        // O valor 25 define que cada "clique" ou movimento do scroll do mouse 
        // deslocará 25 pixels, tornando a navegação mais rápida e suave.

        // Aumenta a largura da barra de rolagem vertical
        jScrollPane1.getVerticalScrollBar().setPreferredSize(
                new java.awt.Dimension(25, 0));

        // Ativa tela cheia
        TelaCheia tela = new TelaCheia(this);
        tela.aplicar();

        // Cria botão fechar
        BotaoFechar botao = new BotaoFechar(this);

        // Adiciona botão na tela
        botao.adicionar();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lblApresentacao1 = new javax.swing.JLabel();
        lblsojournerFoto1 = new javax.swing.JLabel();
        lblTituloSojourner1 = new javax.swing.JLabel();
        lblSpiritOpportunityFoto1 = new javax.swing.JLabel();
        lblTituloSpiritOpportunity1 = new javax.swing.JLabel();
        lblCuriosityFoto1 = new javax.swing.JLabel();
        lblTituloCuriosity1 = new javax.swing.JLabel();
        lblFotoPerseverance1 = new javax.swing.JLabel();
        lblTituloPerseverance1 = new javax.swing.JLabel();
        lblFotoZhurong1 = new javax.swing.JLabel();
        lblTituloZhurong1 = new javax.swing.JLabel();
        lblTituloViking1 = new javax.swing.JLabel();
        lblFotoViking1 = new javax.swing.JLabel();
        lblFotoInsight = new javax.swing.JLabel();
        lblTituloInsight = new javax.swing.JLabel();
        lblFotoViking2 = new javax.swing.JLabel();
        lblTituloViking2 = new javax.swing.JLabel();
        lblFotoPhoenix = new javax.swing.JLabel();
        lblTituloPhoenix = new javax.swing.JLabel();
        btnFeedback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Totem Museo Espacial");
        setAlwaysOnTop(true);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setOpaque(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setMinimumSize(new java.awt.Dimension(1350, 750));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 950));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblApresentacao1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblApresentacao1.setText("<html>Bem-vindo ao museu espacial. Aqui você irá descobrir um pouco sobre os robôs exploradores criados para uma missão importante de descobrir e analisar o planeta Marte. Abaixo você vai ver as fotos dos robôs e, se clicar nelas, vai conhecer um pouco da história de cada um. Após terminar de conferir as informações dos robôs, por favor, vá para a aba questionários e nos dê uma avaliação de como foi a sua experiência com o nosso totem.");
        jPanel1.add(lblApresentacao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 1370, 140));

        lblsojournerFoto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ASY-SA0723_07-Sojourner-rover.jpg"))); // NOI18N
        lblsojournerFoto1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblsojournerFoto1MouseClicked(evt);
            }
        });
        jPanel1.add(lblsojournerFoto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 318, -1));

        lblTituloSojourner1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTituloSojourner1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloSojourner1.setText("Sojourner");
        jPanel1.add(lblTituloSojourner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 320, 50));

        lblSpiritOpportunityFoto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/spiriteOpportunity.jpg"))); // NOI18N
        lblSpiritOpportunityFoto1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblSpiritOpportunityFoto1MouseClicked(evt);
            }
        });
        jPanel1.add(lblSpiritOpportunityFoto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 340, -1));

        lblTituloSpiritOpportunity1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTituloSpiritOpportunity1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloSpiritOpportunity1.setText("Spirit e Opportunity");
        jPanel1.add(lblTituloSpiritOpportunity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 340, 50));

        lblCuriosityFoto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/_100519152_2.jpg"))); // NOI18N
        lblCuriosityFoto1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblCuriosityFoto1MouseClicked(evt);
            }
        });
        jPanel1.add(lblCuriosityFoto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 260, 321, 250));

        lblTituloCuriosity1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTituloCuriosity1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloCuriosity1.setText("Curiosity");
        jPanel1.add(lblTituloCuriosity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 320, 50));

        lblFotoPerseverance1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/_118653459_watsel_1_face_full.jpg (1).jpg"))); // NOI18N
        lblFotoPerseverance1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblFotoPerseverance1MouseClicked(evt);
            }
        });
        jPanel1.add(lblFotoPerseverance1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 260, 290, -1));

        lblTituloPerseverance1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTituloPerseverance1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloPerseverance1.setText("Perseverance");
        jPanel1.add(lblTituloPerseverance1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 210, 290, 40));

        lblFotoZhurong1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgzhu/zhu.png"))); // NOI18N
        lblFotoZhurong1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblFotoZhurong1MouseClicked(evt);
            }
        });
        jPanel1.add(lblFotoZhurong1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 318, 220));

        lblTituloZhurong1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTituloZhurong1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloZhurong1.setText("Zhurong");
        jPanel1.add(lblTituloZhurong1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 330, 39));

        lblTituloViking1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTituloViking1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloViking1.setText("Viking 1");
        jPanel1.add(lblTituloViking1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 530, 300, 39));

        lblFotoViking1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgviki/image (1).png"))); // NOI18N
        lblFotoViking1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblFotoViking1MouseClicked(evt);
            }
        });
        jPanel1.add(lblFotoViking1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 590, 300, 210));

        lblFotoInsight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgInsight/3.glbimg.com-v1-auth-0ae9f161c1ff459593599b7ffa1a1292-images-escenic-2022-5-19-10-1652965910479.jpg"))); // NOI18N
        lblFotoInsight.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblFotoInsightMouseClicked(evt);
            }
        });
        jPanel1.add(lblFotoInsight, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 580, 340, 220));

        lblTituloInsight.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTituloInsight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloInsight.setText("Insight");
        jPanel1.add(lblTituloInsight, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 530, 340, 40));

        lblFotoViking2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgViking2/Viking_lander_model.jpg"))); // NOI18N
        lblFotoViking2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblFotoViking2MouseClicked(evt);
            }
        });
        jPanel1.add(lblFotoViking2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 580, 290, 220));

        lblTituloViking2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTituloViking2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloViking2.setText("Viking 2");
        jPanel1.add(lblTituloViking2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 530, 300, 40));

        lblFotoPhoenix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPhoenix/missionswebphoenix_bmAo4Ws.jpg"))); // NOI18N
        lblFotoPhoenix.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblFotoPhoenixMouseClicked(evt);
            }
        });
        jPanel1.add(lblFotoPhoenix, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 860, 320, 210));

        lblTituloPhoenix.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTituloPhoenix.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloPhoenix.setText("Phoenix");
        jPanel1.add(lblTituloPhoenix, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 816, 320, 40));

        btnFeedback.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnFeedback.setText("Questionários");
        btnFeedback.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btnFeedbackMouseClicked(evt);
            }
        });
        jPanel1.add(btnFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 150, 40));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1444, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1290, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblsojournerFoto1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblsojournerFoto1MouseClicked
    {//GEN-HEADEREND:event_lblsojournerFoto1MouseClicked
        Sojourner sojourner = new Sojourner();
        sojourner.abrirTelaSojourner(this);
    }//GEN-LAST:event_lblsojournerFoto1MouseClicked

    private void lblSpiritOpportunityFoto1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblSpiritOpportunityFoto1MouseClicked
    {//GEN-HEADEREND:event_lblSpiritOpportunityFoto1MouseClicked
        spirit_Opportunity spiritopportunity = new spirit_Opportunity();
        spiritopportunity.abrirTelaSpiritOpportunity(this);
    }//GEN-LAST:event_lblSpiritOpportunityFoto1MouseClicked

    private void lblCuriosityFoto1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblCuriosityFoto1MouseClicked
    {//GEN-HEADEREND:event_lblCuriosityFoto1MouseClicked
        Curiosity curiosity = new Curiosity();
        curiosity.abrirTelaCuriosity(this);
    }//GEN-LAST:event_lblCuriosityFoto1MouseClicked

    private void lblFotoPerseverance1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblFotoPerseverance1MouseClicked
    {//GEN-HEADEREND:event_lblFotoPerseverance1MouseClicked
        Perseverance perseverance = new Perseverance();
        perseverance.abrirTelaPerseverance(this);
    }//GEN-LAST:event_lblFotoPerseverance1MouseClicked

    private void lblFotoZhurong1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblFotoZhurong1MouseClicked
    {//GEN-HEADEREND:event_lblFotoZhurong1MouseClicked
        Zhurong zhurong = new Zhurong();
        zhurong.abrirTelaZhurong(this);
    }//GEN-LAST:event_lblFotoZhurong1MouseClicked

    private void lblFotoViking1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblFotoViking1MouseClicked
    {//GEN-HEADEREND:event_lblFotoViking1MouseClicked
        Viking viking = new Viking();
        viking.abrirTelaViking(this);
    }//GEN-LAST:event_lblFotoViking1MouseClicked

    private void lblFotoInsightMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblFotoInsightMouseClicked
    {//GEN-HEADEREND:event_lblFotoInsightMouseClicked
        Insight insight = new Insight();
        insight.abrirTelaInsight(this);
    }//GEN-LAST:event_lblFotoInsightMouseClicked

    private void lblFotoViking2MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblFotoViking2MouseClicked
    {//GEN-HEADEREND:event_lblFotoViking2MouseClicked
        Viking2 viking2 = new Viking2();
        viking2.abrirTelaViking2(this);
    }//GEN-LAST:event_lblFotoViking2MouseClicked

    private void lblFotoPhoenixMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblFotoPhoenixMouseClicked
    {//GEN-HEADEREND:event_lblFotoPhoenixMouseClicked
        Phoenix phoenix = new Phoenix();
        phoenix.abrirTelaPhoenix(this);
    }//GEN-LAST:event_lblFotoPhoenixMouseClicked

    private void btnFeedbackMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnFeedbackMouseClicked
    {//GEN-HEADEREND:event_btnFeedbackMouseClicked
        btnFeedback.addActionListener(e ->
        {
            QuestionarioFeedback qf = new QuestionarioFeedback(this);
            qf.setVisible(true);
        });
    }//GEN-LAST:event_btnFeedbackMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFeedback;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApresentacao1;
    private javax.swing.JLabel lblCuriosityFoto1;
    private javax.swing.JLabel lblFotoInsight;
    private javax.swing.JLabel lblFotoPerseverance1;
    private javax.swing.JLabel lblFotoPhoenix;
    private javax.swing.JLabel lblFotoViking1;
    private javax.swing.JLabel lblFotoViking2;
    private javax.swing.JLabel lblFotoZhurong1;
    private javax.swing.JLabel lblSpiritOpportunityFoto1;
    private javax.swing.JLabel lblTituloCuriosity1;
    private javax.swing.JLabel lblTituloInsight;
    private javax.swing.JLabel lblTituloPerseverance1;
    private javax.swing.JLabel lblTituloPhoenix;
    private javax.swing.JLabel lblTituloSojourner1;
    private javax.swing.JLabel lblTituloSpiritOpportunity1;
    private javax.swing.JLabel lblTituloViking1;
    private javax.swing.JLabel lblTituloViking2;
    private javax.swing.JLabel lblTituloZhurong1;
    private javax.swing.JLabel lblsojournerFoto1;
    // End of variables declaration//GEN-END:variables
}
