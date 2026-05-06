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

public class Sojourner 
{
// Declaração da classe pública Sojourner, que será responsável por montar a tela de informações do robô.

    public void abrirTelaSojourner(java.awt.Window parent) 
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
        
        texto.setText("<html><body style='font-family: Arial; font-size: 16px; margin: 10px;'>" +
                        "<b>Sojourner: o primeiro veículo explorador da NASA em Marte</b><br><br>" +
                        "Embora fosse um robô básico para os padrões atuais, o rover abriu caminho para os últimos 26 anos de exploração da superfície marciana.<br><br>" +

                        "Ao ouvir a expressão \"rover de Marte\", você provavelmente imagina um dos robôs exploradores modernos, como o Perseverance ou o Curiosity: verdadeiros caminhões gigantes, repletos de câmeras, lasers e motores nucleares, com rodas do tamanho de barris, percorrendo Marte com a urgência de um veículo de transporte de areia Jawa para estudar rochas e poeira. Ou, se você for um pouco mais velho, talvez imagine seus antecessores: os gêmeos menores, movidos a energia solar, Spirit e Opportunity.<br><br>" +

                        "Mas nada disso teria sido construído se não fosse pelo incrível sucesso de um veículo explorador muito menor e muito menos sofisticado chamado Sojourner, que pousou em Marte há 26 anos. Pouco maior que um micro-ondas, ele resistiu a um pouso ousado envolto em airbags — uma mudança drástica e arriscada em relação aos retrofoguetes que as sondas Viking usaram para pousar no Planeta Vermelho duas décadas antes.<br><br>" +

                        "A sonda Sojourner não apenas sobreviveu em Marte; ela prosperou, realizando pesquisas científicas úteis e enviando imagens fascinantes muito além do término previsto de sua missão. A Sojourner abriu caminho para os robôs exploradores de alta tecnologia que atualmente percorrem Marte, da mesma forma que o Wright Flyer abriu as portas para os caças e aviões comerciais que cruzam os céus da Terra hoje.<br><br>" +

                        "<b>A história de Sojourner</b><br><br>" +

                        "Lançada em 4 de dezembro de 1996 a bordo de um foguete Delta II, a Sojourner fazia parte da missão Mars Pathfinder: um programa de baixo orçamento para enviar um módulo de pouso e um pequeno veículo explorador a Marte para verificar se seria possível operar um veículo com rodas por lá.<br><br>" +

                        "E Sojourner era realmente pequena. Pesando apenas 15,6 quilos e medindo apenas 30 centímetros de altura e 65 centímetros de comprimento, cabia facilmente em uma bancada de cozinha. Mas, apesar de seu tamanho diminuto, a pequena Sojourner tinha grandes objetivos.<br><br>" +

                        "O veículo vinha equipado com câmeras frontal e traseira e uma variedade de instrumentos projetados para realizar pesquisas científicas limitadas, porém valiosas. O Espectrômetro de Raios X de Prótons Alfa (APXS) era sua principal ferramenta científica. Ele incluía três espectrômetros diferentes e ajudava os cientistas a analisar as rochas e a poeira encontradas pelo rover. O cabeçote do sensor APXS era montado em um pequeno braço robótico que se estendia e pressionava os sensores contra as rochas ou o solo marciano, como um cachorro que encosta o nariz no chão para sentir melhor os aromas presentes ali.<br><br>" +

                        "Um par de câmeras monocromáticas Kodak KAI-0371 voltadas para a frente funcionavam como os olhos do rover, estudando a topografia local e registrando mapas da superfície em preto e branco. As belíssimas imagens coloridas que o Sojourner enviou de volta — e pelas quais é mais famoso — foram capturadas por um único sensor KAI-037M na parte traseira.<br><br>" +

                        "No entanto, a característica mais marcante do Sojourner era seu topo plano coberto por painéis solares azul-metálicos, que faziam o veículo parecer um besouro gigante; e suas seis pequenas rodas pontiagudas, que davam ao veículo um verdadeiro apelo de Robot Wars.<br><br>" +

                        "Como nada nessa missão havia sido tentado antes, as expectativas de que o Sojourner funcionasse não eram muito altas. Muitos cientistas da missão acreditavam que, mesmo se funcionasse, não duraria muito e o rover pararia de funcionar após percorrer algumas dezenas de metros em cerca de sete dias marcianos (ou sóis) — afinal, essa era a duração planejada da missão. Mas, após pousar em segurança na superfície do Planeta Vermelho em 4 de julho de 1997, o Sojourner superou todas as expectativas, durando mais de 10 vezes o tempo previsto.<br><br>" +

                        "O módulo de pouso da Mars Pathfinder pousou em uma área chamada Ares Vallis — que, aliás, não tem nada a ver com o local de onde Watney retira o rover em Perdido em Marte e não se parece em nada com ele. Ares Vallis é essencialmente o que restou de um enorme canal escavado na superfície de Marte por violentas inundações bilhões de anos atrás.<br><br>" +

                        "Quando as primeiras imagens da Pathfinder chegaram, mostraram uma paisagem marrom-alaranjada repleta de pedregulhos, alguns bastante grandes e quase todos com sinais de desmoronamento, rachaduras e fissuras causadas por enchentes que outrora varreram o vale. Essas imagens causaram sensação, em parte porque a Pathfinder foi uma das primeiras missões espaciais da era da internet. Quando a NASA começou a publicar imagens diariamente, o interesse foi tão grande que a internet, ainda em seus primórdios, ficou sobrecarregada. Pessoas ao redor do mundo visualizaram e baixaram as imagens assim que foram publicadas, dando à missão uma incrível visibilidade pública e demonstrando que havia uma enorme demanda por imagens \"ao vivo\" enviadas de mundos distantes.<br><br>" +

                        "<b>Resultados do Rover</b><br><br>" +

                        "A Sojourner visitou e fotografou inúmeras rochas fascinantes, muitas das quais receberam apelidos peculiares da equipe da missão. Yogi recebeu esse nome por se parecer, de certa forma, com a cabeça de um urso; tinha como vizinhos nomes como Pop Tart e Barnacle Bill. Duas colinas no horizonte foram batizadas de Twin Peaks (Picos Gêmeos), e uma duna de poeira esculpida pelo vento, próxima ao local de pouso, foi batizada de Mermaid Dune (Duna da Sereia).<br><br>" +

                        "Embora os instrumentos científicos da Sojourner tivessem capacidades limitadas em comparação com os modernos laboratórios marcianos, eles ainda revelaram muito sobre o Planeta Vermelho, e os dados coletados ainda são úteis hoje. O rover confirmou as previsões — e esperanças — da equipe da missão de que o local de pouso era coberto por uma rica variedade de rochas, trazidas por antigas inundações. Algumas rochas, como Yogi, eram de origem vulcânica, enquanto outras foram moldadas e esculpidas pelo vento suave, porém implacável, de Marte. Outras ainda devem ter se formado na presença de água líquida. O rover também confirmou que Ares Vallis já foi um canal de inundação e capturou imagens das dunas de poeira entre as rochas ali presentes.<br><br>" +

                        "Apesar da valiosa ciência revelada por muitas das imagens capturadas pela Sojourner, algumas das fotos mais marcantes foram as do próprio rover, tiradas pela Pathfinder. Uma câmera montada em um mastro alto no módulo de pouso capturou muitas imagens fantásticas mostrando o rover passando entre rochas, farejando o solo com seu espectrômetro. Comparadas às imagens de altíssima resolução que estão sendo enviadas pela Perseverance, essas fotos eram pouco mais do que instantâneos tirados por uma câmera descartável. Mas ainda há um charme nelas que as imagens mais modernas não possuem.<br><br>" +

                        "A sonda Sojourner sobreviveu por 83 sóis em Marte e, nesse período, percorreu uma distância de quase 100 metros. Em nenhum momento se afastou muito do módulo de pouso Pathfinder, que servia como estação retransmissora para os sinais enviados e recebidos da Terra. Embora rudimentares em comparação até mesmo com as câmeras de menor qualidade carregadas pelos foguetes Curiosity e Perseverance, as câmeras do Pathfinder ainda eram bastante capazes. Usando suas lentes de close-up, funções de zoom e múltiplos filtros de cor, elas também coletaram uma grande quantidade de dados. O Pathfinder também serviu como uma \"estação meteorológica\" marciana, realizando medições de vento, temperatura e pressão atmosférica na superfície.<br><br>" +

                        "Talvez o mais importante seja que a missão Pathfinder e o módulo de pouso Sojourner provaram que era possível pousar e operar um rover em Marte. Tudo funcionou. Os airbags inflaram e protegeram os dois enquanto quicavam e saltavam pela superfície rochosa marciana. O Sojourner desceu a rampa e dirigiu-se livremente pelo solo, sem estar conectado ao Pathfinder por cabos ou fios elétricos. E tanto o rover quanto o módulo de pouso realizaram pesquisas científicas valiosas, transmitindo imagens e dados para cientistas na Terra — dados que foram analisados minuciosamente por 26 anos.<br><br>" +

                        "<b>Honrando o passado</b><br><br>" +

                        "É difícil precisar o local de repouso final de Sojourner. Embora o rover tenha sido visto pela última vez em imagens da Pathfinder a 13 metros de distância, Sojourner continuou se deslocando depois disso. Em dezembro de 2006, a câmera HiRISE da Mars Reconnaissance Orbiter capturou imagens de alta resolução do local de pouso da Pathfinder. As imagens mostravam o módulo de pouso e seus arredores, bem como um aglomerado de pixels que poderia ser Sojourner — mas também poderia ser um monte de rochas. As imagens também mostravam algo a cerca de 6 metros de distância da Pathfinder, mas não está claro exatamente o que era. Talvez Sojourner tenha chegado ao lado da Pathfinder e permanecido lá como um amigo leal até ver seu último nascer do sol. Infelizmente, talvez nunca saibamos — pelo menos não até que exploradores humanos visitem a área, se é que isso algum dia acontecerá.<br><br>" +

                        "Sojourner caiu praticamente no esquecimento do público em geral, mas deixou uma marca indelével na NASA e em seus funcionários, abrindo caminho para todos os robôs exploradores que vieram depois. Durante a construção do Perseverance, os engenheiros instalaram uma longa placa escura em seu chassi. Nela estavam gravadas as silhuetas dos robôs que exploraram Marte antes dele. Depois do Perseverance, vieram o Curiosity, seguido pelo Spirit e pelo Opportunity. E no início de toda a linhagem, pavimentando o caminho para todos eles, está o Sojourner." +
                        "</body></html>");
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
        
        //  INSERINDO 1 GIF E 3 IMAGENS
        
        try {
            texto.getDocument().insertString(texto.getDocument().getLength(), "\n\n\n", null);
            // Insere três quebras de linha ("Enters") logo após o ponto final do texto escrito acima.

            texto.setCaretPosition(texto.getDocument().getLength());
            // Move o cursor invisível do Java para o final absoluto do documento, preparando para colar o GIF.
            
            // ---------------------------------------------------------------
            // FOTOS ESTÁTICAS - TAMANHO PADRÃO
            // ---------------------------------------------------------------
            int largura = 300;
            int altura = 200;
            // Variáveis que padronizam a largura e altura alvo para todas as 3 fotos estáticas. Mudar aqui muda em todas.
            
            // --- FOTO 1 ---
            ImageIcon imgFoto1 = new ImageIcon(getClass().getResource("/img/sojournerfotocor.jpg"));
            // Localiza e carrega a primeira imagem da pasta 'img'.

            Image foto1Reduzida = imgFoto1.getImage().getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
            // Pede ao Java para fazer o cálculo pesado de redimensionar a foto para 340x240 pixels. 
            // O 'SCALE_SMOOTH' garante um anti-serrilhamento, mantendo a melhor qualidade visual possível na redução.

            texto.insertIcon(new ImageIcon(foto1Reduzida));
            // Insere a foto já suavizada e redimensionada na linha do texto.
            
            texto.getDocument().insertString(texto.getDocument().getLength(), "   ", null); 
            texto.setCaretPosition(texto.getDocument().getLength());
            // Insere mais um espaço em branco e empurra o cursor para frente, preparando para a foto 2.

            // --- FOTO 2 ---
            ImageIcon imgFoto2 = new ImageIcon(getClass().getResource("/img/sojournerfoto.jpg"));
            Image foto2Reduzida = imgFoto2.getImage().getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
            texto.insertIcon(new ImageIcon(foto2Reduzida));
            // Repete o exato mesmo processo da foto 1 para a foto 2.
            
            texto.getDocument().insertString(texto.getDocument().getLength(), "   ", null);
            texto.setCaretPosition(texto.getDocument().getLength());
            // Insere o último bloco de espaços em branco.

            // --- FOTO 3 --- 
            ImageIcon imgFoto3 = new ImageIcon(getClass().getResource("/img/sojourner-rock.en.jpg"));
            Image foto3Reduzida = imgFoto3.getImage().getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
            texto.insertIcon(new ImageIcon(foto3Reduzida));
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