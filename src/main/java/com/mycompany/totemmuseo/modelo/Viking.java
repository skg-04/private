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

public class Viking
{
// Declaração da classe pública Sojourner, que será responsável por montar a tela de informações do robô.

    public void abrirTelaViking (java.awt.Window parent) 
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

                        <b>Viking 1</b><br><br>

                        A Viking 1 foi a primeira de duas sondas espaciais complexas projetadas para chegar a Marte e coletar evidências sobre a possibilidade de vida no planeta.<br><br>

                        Cada espaçonave era composta por dois elementos principais: um orbitador (2.339 kg) e um módulo de pouso (978 kg). O projeto do orbitador foi fortemente inspirado nos ônibus espaciais da espaçonave Mariner, ou seja, no corpo principal e na infraestrutura, enquanto o módulo de pouso tinha uma aparência superficialmente semelhante a uma versão muito maior do módulo de pouso lunar Surveyor.<br><br>

                        Antes do lançamento, as baterias da primeira espaçonave descarregaram, o que levou a NASA a substituir a espaçonave original pela segunda, que foi lançada como Viking 1.<br><br>

                        Após três correções de curso (27 de agosto de 1975, 10 de junho de 1976 e 15 de junho de 1976), a espaçonave entrou em órbita ao redor de Marte em 19 de junho de 1976. Os parâmetros orbitais iniciais eram de 1.500 × 50.300 quilômetros (932 × 31.255 milhas).<br><br>

                        No dia seguinte, o orbitador entrou em uma órbita operacional de 1.500 × 32.800 quilômetros (932 × 20.381 milhas).<br><br>

                        No mesmo dia, quando o orbitador começou a transmitir fotos do local de pouso principal na região de Chryse, os cientistas descobriram que a área era mais acidentada do que o esperado. Usando as novas fotos, os cientistas direcionaram o módulo de pouso para um local diferente nas encostas ocidentais de Chryse Planitia (Planície Dourada).<br><br>

                        O módulo de pouso separou-se do orbitador às 08:32 UTC de 20 de julho de 1976 e, após uma complexa sequência de entrada atmosférica durante a qual a sonda coletou amostras de ar, o Viking Lander 1 pousou em segurança a 22,483 graus de latitude norte e 47,94 graus de longitude oeste às 11:53:06 UTC de 20 de julho de 1976.<br><br>

                        Ele pousou a cerca de 28 quilômetros (17 milhas) do alvo planejado.<br><br>

                        Após pousar, a espaçonave começou a tirar fotografias de alta qualidade (em três cores) dos arredores. Além das imagens de alta resolução, o módulo de pouso também capturou um panorama de 300 graus da região, mostrando não apenas partes da própria espaçonave, mas também as suaves planícies onduladas ao redor.<br><br>

                        Os instrumentos registraram temperaturas que variaram de -123 graus Fahrenheit (-86 graus Celsius) antes do amanhecer a -27 graus Fahrenheit (-33 graus Celsius) à tarde. O sismômetro do módulo de pouso, no entanto, estava inoperante.<br><br>

                        Em 28 de julho de 1976, o braço robótico do módulo de pouso recolheu as primeiras amostras de solo e as depositou em um laboratório biológico especial que incluía um cromatógrafo gasoso acoplado a um espectrômetro de massa.<br><br>

                        Os dados cumulativos das quatro amostras coletadas poderiam ter sido interpretados como indicativos da presença de vida (positivo fraco), mas o principal teste para compostos orgânicos, utilizando o experimento de cromatografia gasosa, apresentou resultados negativos.<br><br>

                        Os dados revelaram uma abundância de enxofre, certamente diferente de qualquer material conhecido encontrado na Terra ou na Lua.<br><br>

                        Embora a missão principal das sondas Viking 1 e Viking 2 tenha terminado em novembro de 1976, as atividades continuaram durante a Missão Estendida (novembro de 1976 a maio de 1978) e a Missão de Continuação (maio de 1978 a julho de 1979).<br><br>

                        O orbitador da Viking 1 continuou então uma Missão de Reconhecimento de julho de 1979 a julho de 1980.<br><br>

                        O módulo de pouso continuou a enviar relatórios meteorológicos diários (e, eventualmente, semanais) como parte da Missão de Monitoramento Viking.<br><br>

                        Em janeiro de 1982, foi renomeado Estação Memorial Thomas Mutch em homenagem a Thomas A. Mutch (1931-1980), líder da equipe de imagens da Viking, que faleceu em 6 de outubro de 1980.<br><br>

                        O módulo de pouso operou até 11 de novembro de 1982, quando um comando defeituoso enviado da Terra resultou na interrupção das comunicações. Tentativas posteriores de restabelecer o contato não tiveram sucesso.<br><br>

                        A sonda orbital, após capturar muitas outras imagens de alta resolução do planeta e de suas duas luas, muito superiores às da Mariner 9, foi desligada em 7 de agosto de 1980, depois de ficar sem propelente para o controle de atitude em sua 1.489ª órbita ao redor de Marte.

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
           
            ImageIcon imgFoto2 = new ImageIcon(getClass().getResource("/imgviki/mars_surface_vik1-0000.jpg"));
            Image foto2Reduzida = imgFoto2.getImage().getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
            texto.insertIcon(new ImageIcon(foto2Reduzida));
            // Repete o exato mesmo processo da foto 1 para a foto 2.
            
            texto.getDocument().insertString(texto.getDocument().getLength(), "  ", null);
            texto.setCaretPosition(texto.getDocument().getLength());
            // Insere o último bloco de espaços em branco.

            // --- FOTO 2 ---
            ImageIcon imgFoto3 = new ImageIcon(getClass().getResource("/imgviki/sagan_viking.jpg.jpg"));
            Image foto3Reduzida = imgFoto3.getImage().getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
            texto.insertIcon(new ImageIcon(foto3Reduzida));

            texto.getDocument().insertString(texto.getDocument().getLength(), "  ", null);
            texto.setCaretPosition(texto.getDocument().getLength());

            // --- FOTO 3 ---
            ImageIcon imgFoto4 = new ImageIcon(getClass().getResource("/imgviki/NASM-A19790215000-NASM2016-02690.jpg"));
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