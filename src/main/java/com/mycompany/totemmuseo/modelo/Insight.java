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

public class Insight
{
// Declaração da classe pública Sojourner, que será responsável por montar a tela de informações do robô.

    public void abrirTelaInsight (java.awt.Window parent) 
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
        
        texto.putClientProperty(JEditorPane.HONOR_DISPLAY_PROPERTIES, true);
        
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

                        <b>Nave espacial InSight</b><br><br>

                        O módulo de pouso InSight da NASA foi construído com base no projeto comprovado do módulo de pouso Phoenix da NASA em Marte. O braço robótico do InSight tinha mais de 1,8 metro de comprimento. Ele içava um sismômetro e uma sonda de fluxo de calor da plataforma e os posicionava na superfície. A câmera no braço fornecia imagens coloridas em 3D do local de pouso, do posicionamento dos instrumentos e das atividades em curso. Sensores mediam as condições climáticas e as variações do campo magnético.<br><br>

                        O módulo de pouso utilizou o Braço de Implantação de Instrumentos (IDA) para posicionar os instrumentos no solo. Os instrumentos sensíveis do módulo puderam obter suas melhores medições em contato direto com a superfície marciana. A garra estava na extremidade do braço. A câmera montada no braço ficava entre o cotovelo e o pulso.<br><br>

                        O braço implantou o sismômetro na superfície, de onde ele pôde detectar tremores marcianos em ação. Ele também posicionou na superfície a sonda de fluxo de calor: uma espécie de "toupeira" robótica projetada para perfurar o solo a cerca de 5 metros de profundidade.<br><br>

                        Devido às propriedades inesperadas do solo que encontrou, e apesar das múltiplas tentativas da equipe para superar os desafios, a sonda não conseguiu atingir a profundidade desejada e realizar as medições conforme o planejado.<br><br>

                        O projeto da sonda foi baseado em propriedades do solo observadas em Marte por missões anteriores, mas as propriedades encontradas pela sonda foram muito diferentes. O conhecimento adquirido com esses desafios será aplicado em benefício de futuras missões a Marte.<br><br>

                        O braço robótico incluía uma garra para agarrar cada peça que levantava. Os cinco dedos mecânicos da garra conseguiam fechar-se em torno de uma alça que lembrava uma bola na ponta de uma haste.<br><br>

                        Cada um dos três itens que o braço levantava possuía uma dessas alças. Os três itens são: o Experimento Sísmico para Estruturas Internas, o Pacote de Fluxo de Calor e Propriedades Físicas e o Escudo Térmico e de Vento do sismômetro.

                        </body>
                        </html>
                        """);
                        //texto -> pega o componente visual (label, campo, etc.)
                        //.setText -> chama o método que DEFINE o texto
                        //"Olá!" -> o conteúdo que vai aparecer na tela

        texto.setEditable(false);
        // Trava o painel para modo somente-leitura. Impede que os usuários do Totem acionem o teclado e apaguem o texto da tela.
        
        texto.setDoubleBuffered(true);
        texto.setOpaque(false);

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
            int largura = 300;
            int altura = 200;
            // Variáveis que padronizam a largura e altura alvo para todas as 3 fotos estáticas. Mudar aqui muda em todas.
            
            // --- FOTO 1 ---
           
            ImageIcon imgFoto2 = new ImageIcon(getClass().getResource("/imgInsight/26761_26761_PIA25287-clean-web.jpg"));
            Image foto2Reduzida = imgFoto2.getImage().getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
            texto.insertIcon(new ImageIcon(foto2Reduzida));
            // Repete o exato mesmo processo da foto 1 para a foto 2.
            
            texto.getDocument().insertString(texto.getDocument().getLength(), "  ", null);
            texto.setCaretPosition(texto.getDocument().getLength());
            // Insere o último bloco de espaços em branco.

            // --- FOTO 2 ---
            ImageIcon imgFoto3 = new ImageIcon(getClass().getResource("/imgInsight/3.glbimg.com-v1-auth-0ae9f161c1ff459593599b7ffa1a1292-images-escenic-2022-5-19-10-1652965910479.jpg"));
            Image foto3Reduzida = imgFoto3.getImage().getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
            texto.insertIcon(new ImageIcon(foto3Reduzida));

            texto.getDocument().insertString(texto.getDocument().getLength(), "  ", null);
            texto.setCaretPosition(texto.getDocument().getLength());

            // --- FOTO 3 ---
            ImageIcon imgFoto4 = new ImageIcon(getClass().getResource("/imgInsight/insight-robotic-arm.jpg"));
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