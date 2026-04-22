package com.mycompany.totemmuseo.modelo;
// Define o pacote onde essa classe está localizada

import javax.swing.*;
// Importa todos os componentes do Swing

import javax.swing.JDialog;
// Importa a classe JDialog (janela secundária)

public class Perseverance
// Declara a classe
{
        
    public void abrirTelaPerseverance(java.awt.Window parent)
    // public > pode ser chamado de qualquer classe
    // void > não retorna nada (só executa ação)
    // abrirTelaSojourner > nome do método (abrir a tela do Sojourner)
    // (java.awt.Window parent) > recebe uma janela como parâmetro
    // parent > janela que chamou esse método (tipo o JFrame principal)
    {
        
        // Método que abre a tela
        // Recebe a janela pai como parâmetro
    
        // Cria uma nova janela (JDialog)
        // parent > define quem é a janela "dona"
        // true > janela modal (bloqueia a anterior)
        JDialog novaTela = new JDialog((java.awt.Dialog) parent, true);
        
        // Define o título da janela
        novaTela.setTitle("Sojourner");
        
        // Pega o tamanho da tela do computador (largura e altura do monitor)
        java.awt.Dimension tela = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        
        // Define o tamanho e posição da janela:
        // (0,0) = canto superior esquerdo da tela
        // tela.width = largura total da tela
        // tela.height = altura total da tela
        novaTela.setBounds(0, 0, tela.width, tela.height);

        // null > não usa nenhuma janela como referência
        // Resultado > a janela abre CENTRALIZADA na tela do computador
        novaTela.setLocationRelativeTo(null);
        
        // Cria uma área de texto (onde vai ficar a descrição)
        JTextArea texto = new JTextArea("""
                                        Os robôs exploradores em Marte coletaram evidências de água e de alguns dos componentes químicos básicos da vida. Os cientistas acreditam que seja possível que a vida tenha existido em Marte há muito tempo. Se havia seres vivos, provavelmente eram organismos minúsculos — algo parecido com bactérias aqui na Terra. Mas será que a vida realmente surgiu em Marte?

                                        A missão Mars 2020 espera responder a essa pergunta. A missão enviou um rover muito semelhante ao Curiosity para explorar as rochas, a terra e o ar em Marte. Assim como o Curiosity, o rover Perseverance tem o tamanho de um pequeno SUV. O novo rover tem um objetivo diferente e instrumentos diferentes. Ele buscará diretamente sinais de vida passada em Marte.

                                        O novo veículo explorador também fará experiências com um recurso natural que poderá ser útil no planejamento de uma missão humana a Marte.

                                        A atmosfera de Marte é composta principalmente de um gás chamado dióxido de carbono. Mas muitos seres vivos (incluindo os humanos) precisam de oxigênio para respirar. Se um ser humano fosse a Marte, precisaria levar muito oxigênio. No entanto, não há muito espaço na espaçonave para transportar oxigênio líquido.

                                        O rover testará um método para obter oxigênio do ar na atmosfera marciana. Isso ajudará a NASA a planejar as melhores estratégias para enviar astronautas humanos para explorar Marte um dia.

                                        O Perseverance pousou em uma região de Marte chamada Cratera Jezero. Essa cratera é interessante para os cientistas porque é uma região muito antiga de Marte e pode ter sido o local de um antigo delta de rio. As rochas dessa região podem nos contar sobre a história do Planeta Vermelho e podem ter preservado vestígios de vida passada em Marte.
                                        """);
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