package com.mycompany.totemmuseo.modelo;
// Define o pacote do projeto. Funciona como o "endereço" da classe dentro das pastas do seu projeto Java.

import javax.swing.*;
// Importa todos os componentes visuais básicos do Java Swing (JDialog, JTextPane, JButton, JPanel, JLabel, etc.).

import javax.swing.border.EmptyBorder;
// Importa a classe EmptyBorder, que serve para criar margens invisíveis (espaçamento) ao redor dos componentes.

import java.awt.BorderLayout;
// Importa o gerenciador de layout BorderLayout, que divide a tela em 5 regiões (Norte, Sul, Leste, Oeste e Centro).

import java.awt.Image;
// Importa a classe genérica Image, necessária para usarmos a função de redimensionamento matemático das fotos estáticas.

public class spirit_Opportunity 
{
// Declaração da classe pública Sojourner, que será responsável por montar a tela de informações do robô.

    public void abrirTelaSpiritOpportunity (java.awt.Window parent) 
    {
    // Método que abre a tela. Recebe como parâmetro 'parent' (a janela principal que chamou esta tela).
        
        JDialog novaTela = new JDialog((java.awt.Dialog) parent, true);
        // Cria a janela em si (JDialog). 
        // O parâmetro 'true' significa que ela é "Modal" (bloqueia a tela de trás impedindo cliques fora dela até ser fechada).
        
        novaTela.setUndecorated(true);
        // ADIÇÃO PARA TELA CHEIA: Remove a barra de título (onde ficam o botão X e maximizar) e as bordas. 
        // Isso é o que causa o efeito Totem verdadeiro.
        
        java.awt.Dimension tela = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        // Acessa as ferramentas nativas do sistema (Toolkit) para ler a resolução exata (largura e altura) do monitor atual.

        novaTela.setBounds(0, 0, tela.width, tela.height);
        // Posiciona a janela no canto superior esquerdo absoluto (0, 0) e estica para ocupar 100% da largura e altura da tela.
        
        novaTela.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        // Diz ao Java que, quando esta tela for fechada, ele deve destruir o processo e liberar a memória RAM (DISPOSE).
        
        JTextPane texto = new JTextPane();
        // Cria o painel de texto avançado (JTextPane). Ao contrário do JTextArea simples, ele suporta anexar imagens e GIFs misturados no texto.
        
        texto.setContentType("text/html");
        // Define o tipo de conteúdo como HTML,
        // permitindo que o JTextPane interprete
        // e renderize tags HTML como <b>, <br>,
        // <font>, etc. Deve ser chamado ANTES
        // do setText(), caso contrário as tags
        // aparecerão como texto puro na tela.
        
        texto.setText("""
                        <html>
                        <body style='font-family: Arial; font-size: 16px; margin: 10px;'>

                        <b>Spirit e Opportunity: os rovers gêmeos de Marte</b><br><br>

                        Após o sucesso do rover Sojourner, a NASA quis enviar mais rovers para estudar Marte. Assim, em 2003, enviaram dois rovers ao Planeta Vermelho. Os rovers foram chamados de Spirit e Opportunity. Juntos, fizeram parte da missão Mars Exploration Rover.<br><br>

                        Spirit e Opportunity foram construídos como gêmeos. Ambos carregavam os mesmos instrumentos científicos e tinham aproximadamente o tamanho de um carrinho de golfe.<br><br>

                        Na Terra, onde há água, há vida. Spirit e Opportunity foram enviados a Marte para encontrar mais pistas sobre a história da água naquele planeta e para verificar se o Planeta Vermelho já pôde abrigar vida. Para isso, os cientistas enviaram os dois robôs exploradores para dois locais de pouso diferentes. Os robôs pousaram em lados opostos do planeta.<br><br>

                        Spirit pousou em uma região chamada Cratera Gusev. Os cientistas queriam explorar a cratera porque acreditavam que ela poderia ter abrigado água há muito tempo. A partir de imagens capturadas por satélites, os cientistas concluíram que vários grandes rios pareciam ter desaguado na Cratera Gusev.<br><br>

                        Opportunity pousou no outro lado de Marte, em uma área chamada Meridiani Planum. Essa região era ideal por ser um local plano e seguro para o pouso do rover. Além disso, estudos realizados por um satélite em órbita de Marte indicaram a possível presença de um mineral chamado hematita cinza. Na Terra, a hematita cinza é frequentemente encontrada na presença de água.<br><br>

                        Em sua jornada, o Spirit tirou muitas fotos de Marte com sua câmera. Foram as primeiras fotos coloridas tiradas por um rover em outro planeta. O Spirit também encontrou diversos indícios de água antiga e evidências de atividade geotérmica, ou vulcânica. Explorou locais que podem ter sido fontes termais milhões de anos atrás.<br><br>

                        Para não ficar atrás de sua irmã gêmea, a Opportunity também tirou muitas fotos coloridas da paisagem marciana. Ela também encontrou evidências de água.<br><br>

                        A Opportunity estudou camadas de minerais nas rochas próximas ao seu local de pouso. As evidências coletadas sugeriram que o local de pouso já foi a costa de um mar salgado.<br><br>

                        As rochas estudadas pelos navios Spirit e Opportunity mostraram aos cientistas que, há muito tempo, a água em Marte pode ter sido muito semelhante à água na Terra. Marte já teve lagos e rios na superfície. Assim como a Terra, também teve água no subsolo, além de vapor d'água na atmosfera.

                        </body>
                        </html>
                        """);
                        //texto -> pega o componente visual (label, campo, etc.)
                        //.setText -> chama o método que DEFINE o texto
                        //"Olá!" -> o conteúdo que vai aparecer na tela

        texto.setEditable(false);
        // Trava o painel para modo somente-leitura. Impede que os usuários do Totem acionem o teclado e apaguem o texto da tela.

        texto.setBackground(novaTela.getBackground());
        // Iguala a cor de fundo do painel de texto com a cor geral da janela, removendo o "fundo branco de edição" padrão.

        texto.setBorder(new EmptyBorder(80, 80, 80, 80));
        // Cria um respiro interno (margem vazia) de 80 pixels nas 4 direções, para o texto não ficar colado de forma amadora nas beiradas do monitor.
        
        //  INSERINDO 3 IMAGENS
        
        try {
            texto.getDocument().insertString(texto.getDocument().getLength(), "\n\n\n", null);
            // Insere três quebras de linha ("Enters") logo após o ponto final do texto escrito acima.

            texto.setCaretPosition(texto.getDocument().getLength());
            // Move o cursor invisível do Java para o final absoluto do documento, preparando para colar o GIF.
            

            texto.setCaretPosition(texto.getDocument().getLength());
            // Atualiza a posição do cursor novamente para o final.
            
            // ---------------------------------------------------------------
            // FOTOS ESTÁTICAS - TAMANHO PADRÃO
            // ---------------------------------------------------------------
            int largura = 320;
            int altura = 220;
            // Variáveis que padronizam a largura e altura alvo para todas as 3 fotos estáticas. Mudar aqui muda em todas.
            
            // --- FOTO 1 ---
            ImageIcon imgFoto1 = new ImageIcon(getClass().getResource("/imgSO/jpegpia18393SO.jpg"));
            // Localiza e carrega a primeira imagem da pasta 'img'.

            Image foto1Reduzida = imgFoto1.getImage().getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
            // Pede ao Java para fazer o cálculo pesado de redimensionar a foto para 340x240 pixels. 
            // O 'SCALE_SMOOTH' garante um anti-serrilhamento, mantendo a melhor qualidade visual possível na redução.

            texto.insertIcon(new ImageIcon(foto1Reduzida));
            // Insere a foto já suavizada e redimensionada na linha do texto.
            
            texto.getDocument().insertString(texto.getDocument().getLength(), "  ", null); 
            texto.setCaretPosition(texto.getDocument().getLength());
            // Insere mais um espaço em branco e empurra o cursor para frente, preparando para a foto 2.

            // --- FOTO 2 ---
            ImageIcon imgFoto2 = new ImageIcon(getClass().getResource("/imgSO/mer-bythenumbers-infographic-SO.jpg"));
            Image foto2Reduzida = imgFoto2.getImage().getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
            texto.insertIcon(new ImageIcon(foto2Reduzida));
            // Repete o exato mesmo processo da foto 1 para a foto 2.
            
            texto.getDocument().insertString(texto.getDocument().getLength(), "  ", null);
            texto.setCaretPosition(texto.getDocument().getLength());
            // Insere o último bloco de espaços em branco.

            // --- FOTO 3 ---
            ImageIcon imgFoto4 = new ImageIcon(getClass().getResource("/imgSO/sol016-lander-pan-SO.jpg"));
            Image foto4Reduzida = imgFoto4.getImage().getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
            texto.insertIcon(new ImageIcon(foto4Reduzida));
            // Insere o último bloco de espaços em branco.
            
            // Repete o processo para a terceira foto. Agora temos 3 fotos posicionadas na mesma linha do "documento"!
            
        } catch (Exception e) {
            System.out.println("Aviso: Alguma(s) imagem(ns) não foi encontrada no caminho especificado.");
            // Bloco de captura de erros: Se um dos nomes de imagem estiver errado ou faltar, ele apenas imprime essa frase invisível para o usuário, mas não dá "Crash" no seu programa!
        }
        
            // Volta a rolagem para o topo da tela!
            texto.setCaretPosition(0);

        
        // 3. BARRA DE ROLAGEM E BOTÃO VOLTAR
        
        JScrollPane scroll = new JScrollPane(texto);
        // Cria uma Barra de Rolagem inteligente (necessário caso a resolução do monitor não consiga exibir tudo de uma vez).
        // Ela engloba toda a folha do JTextPane (tanto o texto quanto as fotos lá no fundo).

        scroll.setBorder(null); 
        // Remove a linha feia padrão do JScrollPane, deixando o visual parecendo uma página plana.
        
        scroll.getVerticalScrollBar().setPreferredSize(new java.awt.Dimension(25, 0));
        // Deixa a barra de rolagem vertical mais grossa

        JButton btnVoltar = new JButton("Voltar");
        // Instancia o botão que ficará estático na tela.

        btnVoltar.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 24));
        // Aumenta radicalmente o tamanho da letra do botão para facilitar o toque de dedo caso a tela seja Touch-Screen.

        btnVoltar.addActionListener(e -> novaTela.dispose()); 
        // Evento de gatilho: Função lambda que dita que, ao clicar, a tela deve ser "descartada" (dispose), fazendo o Totem retornar para a tela anterior.
        
        JPanel painelBotao = new JPanel();
        // Cria uma bandeja invisível (Painel) apenas para segurar e alinhar esse botão Voltar.

        painelBotao.setBorder(new EmptyBorder(20, 0, 40, 0)); 
        // Cria uma margem inferior de 40 pixels na bandeja. Isso impede que o botão encoste na base (chão) do monitor do Totem.

        painelBotao.setBackground(novaTela.getBackground());
        // Colore a bandeja para a mesma cor da tela principal (para ela não ficar com um quadrado cinza no fundo).

        painelBotao.add(btnVoltar);
        // Joga o botão dentro dessa bandeja devidamente configurada.
        
        // 4. MONTANDO TUDO NA TELA E EXIBINDO
        
        novaTela.setLayout(new BorderLayout());
        // Aplica o Layout Mestre da tela. O BorderLayout é perfeito porque "ancora" os componentes como se fossem ímãs nas paredes do monitor.
        
        novaTela.add(scroll, BorderLayout.CENTER); 
        // O ímã CENTER tem a característica de roubar todo o espaço livre da tela. Isso faz a barra de rolagem (texto+fotos) ocupar 90% da janela.

        novaTela.add(painelBotao, BorderLayout.SOUTH); 
        // O ímã SOUTH prende a nossa "bandeja do botão" de forma inabalável na parte mais inferior possível da janela.
        
        novaTela.setVisible(true);
        // Instrução final: exibindo a janela totalmente pronta, construída e funcional para o usuário.
    }
}