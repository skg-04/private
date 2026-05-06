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

public class Zhurong
{
// Declaração da classe pública Sojourner, que será responsável por montar a tela de informações do robô.

    public void abrirTelaZhurong (java.awt.Window parent) 
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

                        <b>Zhurong: Características e missão do primeiro veículo explorador de Marte da China</b><br><br>

                        Em 22 de maio de 2021, às 10h40 (horário de Pequim), o rover chinês Zhurong pousou com sucesso na superfície de Marte e iniciou sua exploração. A China é apenas a segunda nação a realizar um pouso suave e uma exploração bem-sucedida do planeta vermelho.<br><br>

                        A sonda marciana consiste em um orbitador e um rover de pouso. A espaçonave inclui um módulo de entrada composto por uma estrutura traseira, plataforma de pouso e base, além do rover.<br><br>

                        Antes do desprendimento, o orbitador, que transporta o rover de pouso, completou a transferência orbital Terra-Marte e uma manobra de redução de órbita. Após um voo de quase 3,5 horas, o rover de pouso e o orbitador entraram na atmosfera marciana, pousando na superfície do planeta após uma desaceleração em múltiplos estágios e expansão por meio de um mecanismo de rampa.<br><br>

                        Logo após se separar da plataforma de pouso, o rover iniciou sua missão.<br><br>

                        <b>Restrições e projeto de comunicação</b><br><br>

                        A janela de comunicação entre Marte e a Terra é limitada. Após o pouso em Marte, o arco visível entre o rover e a Terra ocorre aproximadamente entre M04:30 e M16:00 em cada dia marciano.<br><br>

                        Durante esse período, instruções podem ser enviadas da Terra para a antena omnidirecional de banda X do rover, mas a taxa de transferência pode ser tão baixa quanto 7,8125 bps.<br><br>

                        Para solucionar o problema de comunicação do rover, seu sistema de comunicação é baseado na bem-sucedida missão Chang'e-4. Neste caso, foi empregado um modo de comunicação por retransmissão em loop, bem como uma banda UHF para facilitar a comunicação bidirecional.<br><br>

                        O orbitador opera em uma órbita de retransmissão, a cerca de 10 minutos próximo ao arco de Marte, por volta do meio-dia, e a cerca de 5 horas durante a noite marciana. A comunicação próxima ao arco de Marte pode atingir velocidades de Mbps e é usada para transmitir dados de telemetria em tempo real e com atraso, dados de imagem e detecção, além de registrar instruções de trabalho subsequentes para o rover.<br><br>

                        <b>Restrições de temperatura e projeto</b><br><br>

                        A temperatura na superfície de Marte é inferior a −100 °C. Para resistir a uma temperatura tão gélida, foi adotado um sistema de controle térmico ativo e passivo.<br><br>

                        O rover está equipado com uma janela solar para coletar calor durante o dia, que é então utilizado para elevar a temperatura da cabine à noite. O rover utiliza medidas de controle térmico ativo à noite para garantir que os equipamentos na cabine atinjam a temperatura ambiente necessária.<br><br>

                        Além disso, também foi implementado o isolamento térmico passivo de “aerogel + isolamento de CO₂”. Com recursos limitados de controle térmico ativo, a perda de calor é reduzida pela diminuição da condução de calor, isolamento da radiação térmica e “eliminação” da convecção na cabine, garantindo assim que a cabine permaneça em uma temperatura ideal.<br><br>

                        As câmeras de navegação extraveicular para detecção de obstáculos, as câmeras multiespectrais e outros equipamentos essenciais dos veículos exploradores de Marte utilizam controle térmico ativo para garantir que sua temperatura de armazenamento atenda aos requisitos.<br><br>

                        Diversos outros equipamentos extraveiculares também devem ser capazes de suportar temperaturas extremamente baixas.<br><br>

                        <b>Projeto típico de processo de trabalho</b><br><br>

                        Para economizar energia, o veículo explorador fica principalmente em modo de espera, o que mantém os computadores ligados e os demais equipamentos funcionando intermitentemente.<br><br>

                        De acordo com o arco de visibilidade, o modelo do ciclo de missão é executado no rover, e os equipamentos de medição e controle são ligados e desligados independentemente.<br><br>

                        Durante a tarde marciana, o receptor omnidirecional de banda X é ligado por cerca de 10 horas, adaptando-se ao arco de visibilidade entre o rover e a Terra para manter um canal de uplink básico.<br><br>

                        Ao meio-dia em Marte, o receptor de banda UHF é ligado por cerca de 1 hora para se adaptar ao arco próximo a Marte do rover e do orbitador. Durante a noite marciana, o receptor de banda UHF é ligado por cerca de 5 horas para se adaptar à seção do arco remoto do rover e do orbitador.<br><br>

                        O período principal de operação do rover é definido entre M11:00 e M15:00, quando a temperatura ambiente é mais alta e não há necessidade de aquecimento adicional.<br><br>

                        Todas as manhãs marcianas, instruções de atraso para o rover são enviadas via orbitador. Por volta do meio-dia, o orbitador retransmite as instruções através de um transceptor UHF para o rover executar.<br><br>

                        Durante a noite marciana, o status da telemetria é enviado ao orbitador via UHF antes de ser repassado para a Terra.<br><br>

                        <b>A missão de exploração baseia-se nos seguintes aspectos:</b><br><br>

                        1) Tanto o sistema de navegação quanto a câmera multiespectral detectam os diversos tipos de minerais e rochas na área pesquisada, auxiliando na identificação e mapeamento da morfologia da superfície e da distribuição dos tipos de materiais.<br><br>

                        2) O radar de detecção subterrânea identifica a estrutura do solo na área pesquisada e coleta dados sobre vários tipos de solo, características de intemperismo e deposição, teor de água/gelo, bem como estruturas de estratificação.<br><br>

                        3) O detector de composição da superfície analisa a composição química da superfície marciana, bem como realiza análises minerais e identifica rochas. A análise química baseia-se na análise quantitativa de dados espectrais obtidos por espectroscopia de emissão óptica induzida por laser (LIBS). A análise mineral e a identificação de rochas são realizadas principalmente por meio de espectroscopia de infravermelho de ondas curtas.<br><br>
                        

                        4) O detector de campo magnético detecta o campo magnético na área de estudo. Ele determina o índice do campo magnético, observa a variação do campo magnético espacial marciano e inverte a corrente geradora da ionosfera marciana.<br><br>

                        5) Os instrumentos meteorológicos medem a temperatura, a pressão e a velocidade/direção do vento, bem como o som na superfície de Marte.

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
            ImageIcon imgFoto1 = new ImageIcon(getClass().getResource("/imgzhu/41242_8DD46963661DC911zhu.jpg"));
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
            ImageIcon imgFoto2 = new ImageIcon(getClass().getResource("/imgzhu/image.jpg"));
            Image foto2Reduzida = imgFoto2.getImage().getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
            texto.insertIcon(new ImageIcon(foto2Reduzida));
            // Repete o exato mesmo processo da foto 1 para a foto 2.
            
            texto.getDocument().insertString(texto.getDocument().getLength(), "  ", null);
            texto.setCaretPosition(texto.getDocument().getLength());
            // Insere o último bloco de espaços em branco.

            // --- FOTO 3 ---
            ImageIcon imgFoto3 = new ImageIcon(getClass().getResource("/imgzhu/zhuVovrbZTgbusHQUba2SvZp5-970-80.jpg"));
            Image foto3Reduzida = imgFoto3.getImage().getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
            texto.insertIcon(new ImageIcon(foto3Reduzida));

            texto.getDocument().insertString(texto.getDocument().getLength(), "  ", null);
            texto.setCaretPosition(texto.getDocument().getLength());
            
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