package com.mycompany.totemmuseo.modelo;
// Define o pacote onde essa classe está localizada

import javax.swing.*;
// Importa todos os componentes do Swing

import javax.swing.JDialog;
// Importa a classe JDialog (janela secundária)

public class curiosity
// Declara a classe
{

    public void abrirTelaCuriosity(java.awt.Window parent)
    {
        //////Código para criar uma janela de informações para o robô Sojourner.//////
    
        // Cria uma nova janela com o título "Sojourner"
        JDialog novaTela = new JDialog((java.awt.Dialog) parent, true);
        novaTela.setTitle("Curiosity");

        // Pega o tamanho da tela do computador (largura e altura do monitor)
        java.awt.Dimension tela = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        // Define o tamanho e posição da janela:
        // (0,0) = canto superior esquerdo da tela
        // tela.width = largura total da tela
        // tela.height = altura total da tela
        novaTela.setBounds(0, 0, tela.width, tela.height);

        novaTela.setLocationRelativeTo(null);
        // Cria uma área de texto (onde vai ficar a descrição)
        JTextArea texto = new JTextArea("""
                                        Na Terra , onde há água, há vida. Sabemos que Marte teve água há muito tempo. Mas será que também possuía outras condições necessárias para a vida?

                                        Para descobrir, a NASA enviou o rover Curiosity a Marte. O Curiosity é o maior robô a pousar em outro planeta. Ele tem aproximadamente o tamanho de um SUV pequeno.

                                        Por ser tão grande, o Curiosity também possui rodas maiores do que os robôs exploradores anteriores . Isso o ajuda a passar por cima de rochas e areia sem ficar atolado. No entanto, mesmo em um longo dia de viagem, ele ainda percorre apenas cerca de 200 metros.

                                        O rover Curiosity pousou na Cratera Gale. Essa cratera é especial porque possui uma montanha alta em seu centro. A montanha tem muitas camadas de rocha. Cada camada é composta por diferentes minerais de diferentes períodos de tempo. Esses minerais podem revelar aos cientistas informações sobre a história da água em Marte.

                                        O rover utiliza diversos instrumentos científicos para estudar as rochas da Cratera Gale. O Curiosity usou sua broca para perfurar uma rocha que antes era lama no fundo de um lago. Um de seus outros instrumentos analisou o pó extraído da rocha. Essa informação ajudou os cientistas a descobrirem que a Cratera Gale continha ingredientes que teriam sido necessários para a sobrevivência da vida antiga.

                                        Os cientistas enviaram o Curiosity a Marte para medir muitas outras coisas também, incluindo a radiação. A radiação é um tipo de energia que pode vir do Sol. Ela se propaga em ondas de alta energia que podem ser prejudiciais aos seres vivos. O Curiosity descobriu que Marte tem níveis de radiação altos e perigosos. A NASA usará os dados de radiação do Curiosity para projetar missões mais seguras para exploradores humanos.

                                        O Curiosity levou 17 câmeras para o Planeta Vermelho — mais do que qualquer outro rover. Ele usa algumas dessas câmeras para tirar fotos de sua jornada. As câmeras também funcionam como os olhos do Curiosity, ajudando-o a detectar e evitar perigos.

                                        Uma das câmeras do Curiosity — localizada na extremidade de seu braço robótico de 2 metros de comprimento — funciona até como uma espécie de "pau de selfie". Ele consegue segurar a câmera a dois metros de distância e tirar uma selfie para enviar de volta à Terra!
                                        """.stripIndent() + "\n\n");
        
        // Faz o texto quebrar automaticamente quando chega no fim da linha                           
        texto.setLineWrap(true);
        // Faz a quebra acontecer por palavra (não corta no meio)
        texto.setWrapStyleWord(true);
        // Impede o usuário de editar o texto
        texto.setEditable(false);

        // posição do texto
        texto.setBounds(100, 100, 1200, 600);

        // adiciona na tela
        novaTela.add(texto);

        // Define a fonte: Arial, negrito, tamanho 18
        texto.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 22));

        // Exibe a janela
        novaTela.setVisible(true);
    }

}
