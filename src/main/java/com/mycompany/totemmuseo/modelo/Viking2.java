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

public class Viking2
{
// Declaração da classe pública Sojourner, que será responsável por montar a tela de informações do robô.

    public void abrirTelaViking2 (java.awt.Window parent) 
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

                        <b>Viking 2</b><br><br>

                        A espaçonave completa foi lançada em 9 de setembro de 1975, utilizando um foguete Titan III com um estágio superior Centaur. Após uma viagem de 333 dias até Marte, a porção orbital da sonda começou a transmitir imagens do planeta mesmo antes de sua inserção orbital.<br><br>

                        Essa inserção ocorreu em 7 de agosto de 1976. O periastro era de 33.000 km e o apoastro de 1.500 km, com um período de revolução de 24,6 horas.<br><br>

                        Uma primeira transferência orbital foi realizada rapidamente a um periastro de 1.499 km, um período orbital de 27,3 horas e uma inclinação de 55,2 graus para permitir a observação do local de pouso do módulo de aterrissagem Viking 2.<br><br>

                        As missões Viking foram projetadas para que o orbitador retornasse imagens do local de destino em Marte antes da implantação do módulo de aterrissagem. Essa primeira transferência para uma órbita de inspeção ocorreu em 9 de agosto. A fotografia do local teve início e a zona de pouso final foi validada usando imagens da Viking 2 e também as capturadas pela sonda Viking 1.<br><br>

                        O núcleo da missão Viking 2 era idêntico ao da Viking 1. Ambas as espaçonaves estavam equipadas com a mesma tecnologia. A Viking 2 diferenciava-se da Viking 1 pelo fato de seu sismógrafo funcionar e registrar atividade sísmica. O sismógrafo da Viking 1 nunca chegou a operar.<br><br>

                        Assim como a Viking 1, a Viking 2 fez uma aproximação às luas de Marte, mas concentrou sua missão em Deimos.<br><br>

                        O módulo de pouso e seu escudo térmico se separaram do orbitador em 3 de setembro, às 19h39min59s UTC. No momento da separação, o módulo de pouso tinha uma velocidade orbital de 4 km/s.<br><br>

                        Logo após a separação, os foguetes foram acionados para iniciar a desorbitação. Após algumas horas, a uma altitude de aproximadamente 300 km, o módulo de pouso foi reorientado para a entrada na atmosfera marciana.<br><br>

                        O escudo térmico, com seu revestimento de proteção térmica, desacelerou a espaçonave por atrito com as camadas atmosféricas.<br><br>

                        A sonda Viking VL-2 pousou em 23 de setembro de 1976, às 22:58:20 UT (9:49:05, horário local de Marte), aproximadamente 200 km a oeste da cratera Mie, na planície Utopia, nas coordenadas planetárias 48° 16′ 08″ N 225° 59′ 24″ W / 48,269, -225,99, a cerca de 7.400 km da VL-1, com uma altitude de referência de 4,23 km.<br><br>

                        Vinte e dois quilogramas de combustível permaneceram intactos na espaçonave após o pouso.<br><br>

                        <b>Posição do módulo de pouso Viking 2 em Marte</b><br><br>

                        O local de pouso da Viking 2 fica a 6.725 km do local de pouso da Viking 1, a 5.275 km do sítio de Cydonia Mensae (conhecido como a face de Marte), a 4.705 km do vulcão conhecido como Monte Olimpo, a 8.420 km da Cidade dos Incas, a 6.620 km de Mars 2, a 6.375 km de Mars 3 e a 9.110 km de Mars 6.<br><br>

                        Comparada aos módulos marcianos de missões recentes, a Viking 2 está a 7.215 km da Mars Polar Lander, a 6.860 km da sonda Mars Pathfinder (a Viking 1 está a menos de 1.000 km dessa sonda) e a 6.970 km da Deep Space 2.

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
           
            ImageIcon imgFoto2 = new ImageIcon(getClass().getResource("/imgViking2/First_Color_Image_of_the_Viking_Lander_2_Site.jpg"));
            Image foto2Reduzida = imgFoto2.getImage().getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
            texto.insertIcon(new ImageIcon(foto2Reduzida));
            // Repete o exato mesmo processo da foto 1 para a foto 2.
            
            texto.getDocument().insertString(texto.getDocument().getLength(), "  ", null);
            texto.setCaretPosition(texto.getDocument().getLength());
            // Insere o último bloco de espaços em branco.

            // --- FOTO 2 ---
            ImageIcon imgFoto3 = new ImageIcon(getClass().getResource("/imgViking2/missionswebviking.jpg"));
            Image foto3Reduzida = imgFoto3.getImage().getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
            texto.insertIcon(new ImageIcon(foto3Reduzida));

            texto.getDocument().insertString(texto.getDocument().getLength(), "  ", null);
            texto.setCaretPosition(texto.getDocument().getLength());

            // --- FOTO 3 ---
            ImageIcon imgFoto4 = new ImageIcon(getClass().getResource("/imgViking2/viking2lander1_04d7c52e7f1dc32f89ec7df458e3cf41.jpg"));
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