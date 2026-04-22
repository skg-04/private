package com.mycompany.totemmuseo.modelo;
// Define o pacote onde essa classe está localizada

import javax.swing.*;
// Importa todos os componentes do Swing

import javax.swing.JDialog;
// Importa a classe JDialog (janela secundária)

public class Sojourner
// Declara a classe
{
        
    public void abrirTelaSojourner(java.awt.Window parent)
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
                                       Em 1997, cientistas da NASA fizeram algo incr\u00edvel. Pela primeira vez, eles usaram um pequeno rob\u00f4 com rodas para estudar a superf\u00edcie de Marte . Esse explorador rob\u00f3tico, chamado rover , recebeu o nome de Sojourner. Ele tinha aproximadamente o tamanho de um forno de micro-ondas. No entanto, ele compartilhou muitas informa\u00e7\u00f5es novas e importantes com os cientistas.
                                       
                                       A Sojourner n\u00e3o viajou sozinha para Marte. Ela estava a bordo de uma espa\u00e7onave chamada m\u00f3dulo de pouso. O m\u00f3dulo de pouso tinha o formato de uma pir\u00e2mide e era coberto por airbags. Os airbags ajudavam o m\u00f3dulo de pouso a ter um pouso seguro e com amortecimento. O formato piramidal garantia que o m\u00f3dulo de pouso e o rover pudessem ser virados para a posi\u00e7\u00e3o correta, independentemente de como pousassem. Ap\u00f3s o m\u00f3dulo de pouso tocar o solo marciano, um painel se abriu e a Sojourner saiu para come\u00e7ar a explorar.
                                       
                                       O rover explorou uma \u00e1rea de Marte pr\u00f3xima ao seu local de pouso, chamada Ares Vallis. Os cientistas se interessaram por essa \u00e1rea porque ela parecia ser o local de uma antiga inunda\u00e7\u00e3o. A for\u00e7a das \u00e1guas de uma inunda\u00e7\u00e3o teria empurrado muitas rochas e terra para um \u00fanico lugar. Isso significa que o rover poderia estudar diversos tipos de rochas sem precisar se deslocar muito.
                                       
                                       Os engenheiros tamb\u00e9m gostaram da \u00e1rea porque ela parecia um local plano e seguro para o pouso do Sojourner.
                                       
                                       Enquanto o Sojourner percorria curtas dist\u00e2ncias, usava sua c\u00e2mera para tirar fotos da paisagem marciana. Enviou de volta mais de 550 fotos do Planeta Vermelho. O rover usou instrumentos para estudar a composi\u00e7\u00e3o das rochas e do solo marcianos pr\u00f3ximos. Seu m\u00f3dulo de pouso tamb\u00e9m coletou informa\u00e7\u00f5es sobre os ventos e outros fatores clim\u00e1ticos em Marte.
                                       
                                       De longe, Marte parece frio, seco e rochoso. Mas as fotos e informa\u00e7\u00f5es da Sojourner contaram uma hist\u00f3ria bem diferente. Descobrimos que, h\u00e1 muito tempo, Marte era um lugar mais quente e \u00famido.""");

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