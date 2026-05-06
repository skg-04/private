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

public class Phoenix
{
// Declaração da classe pública Sojourner, que será responsável por montar a tela de informações do robô.

    public void abrirTelaPhoenix (java.awt.Window parent) 
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

                <b>Phoenix</b><br><br>

                A sonda Phoenix entrou na atmosfera marciana a quase 21.000 quilômetros por hora (13.000 milhas por hora) em 25 de maio de 2008 e pousou em segurança na superfície às 23h38min38s UTC no Vale Verde de Vastitas Borealis.<br><br>

                Foi o primeiro pouso bem-sucedido de um módulo de aterrissagem não tripulado em Marte desde a Viking 2, cerca de 32 anos antes.<br><br>

                Durante a descida, a câmera HiRISE da Mars Reconnaissance Orbiter fotografou claramente a Phoenix suspensa pelo paraquedas, sendo esta a primeira vez que uma espaçonave fotografou outra durante um pouso planetário.<br><br>

                A sonda Phoenix, da missão Mars, foi projetada para desvendar os mistérios do Ártico marciano, estudando a história da água e buscando moléculas orgânicas complexas.<br><br>

                Na busca contínua por água em Marte, as regiões polares são um bom local para sondagem, pois ali se encontra gelo de água. A Phoenix pousou mais ao norte do que qualquer missão anterior, em uma latitude equivalente à do norte do Alasca.<br><br>

                Para analisar as amostras de solo coletadas por seu braço robótico, o Phoenix carregava minúsculos fornos e um laboratório portátil.<br><br>

                As amostras selecionadas foram aquecidas para liberar compostos voláteis que foram examinados quanto à sua composição química e outras características.<br><br>

                A câmera estéreo do Phoenix, localizada em seu mastro de 2 metros (6,6 pés), usou dois "olhos" para revelar uma perspectiva de alta resolução da geologia do local de pouso.<br><br>

                Ela também forneceu mapas de alcance para a equipe usar na escolha de onde escavar. A capacidade multiespectral permitiu a identificação de minerais locais.<br><br>

                Para atualizar nossa compreensão dos processos atmosféricos marcianos, a Phoenix também analisou a atmosfera até 20 quilômetros de altitude, obtendo dados sobre a formação, duração e movimento de nuvens, neblina e plumas de poeira.<br><br>

                Ela também carregava sensores de temperatura e pressão.<br><br>

                Além de verificar a existência de gelo de água no subsolo marciano, a sonda Phoenix descobriu vestígios do composto químico perclorato, uma possível fonte de energia para micróbios e um recurso potencialmente valioso para exploradores humanos no futuro.<br><br>

                Durante sua missão de três meses, a sonda Phoenix perfurou uma camada rica em gelo próxima à superfície.<br><br>

                Ela analisou amostras de solo e gelo em busca de evidências sobre se o local já havia sido habitável.<br><br>

                O módulo de pouso aguardou 15 minutos para que a poeira baixasse antes de desdobrar seus painéis solares.<br><br>

                As primeiras imagens mostraram uma superfície plana marcada por seixos e sulcos, mas sem grandes rochas ou colinas, como esperado, dada a sua posição ao norte.<br><br>

                Em quatro dias, a Phoenix transmitiu um panorama completo de 360 graus da fria superfície marciana, implantou o braço robótico de quase 2,5 metros e começou a enviar relatórios meteorológicos regulares.<br><br>

                Em 31 de maio, o braço robótico recolheu terra e começou a coletar amostras de solo marciano em busca de gelo.<br><br>

                Em 19 de junho, os cientistas da missão puderam concluir que os aglomerados de material brilhante na trincheira "DodoGoldilocks", escavada pelo braço robótico, eram provavelmente gelo de água — o material havia vaporizado quatro dias após a coleta.<br><br>

                Em 31 de julho, a NASA anunciou oficialmente a presença de água em Marte, com base em uma amostra coletada pelo módulo de pouso e analisada pelo instrumento TEGA (Thermal and Evolved Gas Analyzer).<br><br>

                William Boynton, da Universidade do Arizona, observou que esses dados se somam aos obtidos pela sonda Mars Odyssey em 2001.<br><br>

                Em 5 de agosto, a equipe da Phoenix anunciou a descoberta de percloratos na superfície de Marte, cujos resultados não confirmaram nem refutaram a possibilidade de vida no planeta.<br><br>

                Esses resultados também levaram os cientistas a reanalisar os dados coletados pelas sondas Viking.<br><br>

                No final de agosto, a sonda Phoenix concluiu sua missão originalmente planejada de 90 dias, que foi estendida até 30 de setembro.<br><br>

                Em 12 de setembro, a pá coletora da sonda entregou uma nova amostra de solo ao seu laboratório de química úmida, que misturou uma solução aquosa da Terra ao solo — parte de um processo para identificar nutrientes solúveis e outros compostos químicos no solo.<br><br>

                Os primeiros resultados sugeriram que o solo era alcalino, composto por sais e outros compostos químicos como perclorato, sódio, magnésio, cloreto e potássio.

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
            
            ImageIcon imgFoto2 = new ImageIcon(getClass().getResource("/imgPhoenix/4rAQRV6anoLzcMfMVbnh8C-650-80.jpg.jpg"));
            Image foto2Reduzida = imgFoto2.getImage().getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
            texto.insertIcon(new ImageIcon(foto2Reduzida));
            // Repete o exato mesmo processo da foto 1 para a foto 2.
            
            texto.getDocument().insertString(texto.getDocument().getLength(), "  ", null);
            texto.setCaretPosition(texto.getDocument().getLength());
            // Insere o último bloco de espaços em branco.

            // --- FOTO 2 ---
            ImageIcon imgFoto3 = new ImageIcon(getClass().getResource("/imgPhoenix/images.jpg"));
            Image foto3Reduzida = imgFoto3.getImage().getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
            texto.insertIcon(new ImageIcon(foto3Reduzida));

            texto.getDocument().insertString(texto.getDocument().getLength(), "  ", null);
            texto.setCaretPosition(texto.getDocument().getLength());

            // --- FOTO 3 ---
            ImageIcon imgFoto4 = new ImageIcon(getClass().getResource("/imgPhoenix/phoenix-icy-trenches.jpg"));
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