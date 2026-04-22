package com.mycompany.totemmuseo.modelo;
// Define o pacote onde essa classe está localizada

import javax.swing.*;
// Importa todos os componentes do Swing

import javax.swing.JDialog;
// Importa a classe JDialog (janela secundária)

public class spirit_Opportunity
// Declara a classe
{

    public void abrirTelaSpiritOpportunity(java.awt.Window parent)
    // public > pode ser chamado de qualquer classe
    // void > não retorna nada (só executa ação)
    // abrirTelaSojourner > nome do método (abrir a tela do Sojourner)
    // (java.awt.Window parent) > recebe uma janela como parâmetro
    // parent > janela que chamou esse método
    {
        // Método que abre a tela
        // Recebe a janela pai como parâmetro

        JDialog novaTela = new JDialog((java.awt.Dialog) parent, true);
        // Cria uma nova janela (JDialog)
        // parent > define quem é a janela "dona"
        // true > janela modal (bloqueia a anterior)

        novaTela.setTitle("Spirit e Opportunity");
        // Define o título da janela

        java.awt.Dimension tela = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        // Pega o tamanho da tela do computador

        novaTela.setBounds(0, 0, tela.width, tela.height);
        // Define o tamanho e posição da janela:
        // (0,0) = canto superior esquerdo da tela
        // tela.width = largura total da tela
        // tela.height = altura total da tela

        novaTela.setLocationRelativeTo(null);
        // null > não usa nenhuma janela como referência
        // Resultado > a janela abre CENTRALIZADA na tela do computador

        JTextArea texto = new JTextArea("""
                                        Após o sucesso do rover Sojourner, a NASA quis enviar mais rovers para estudar Marte. Assim, em 2003, enviaram dois rovers ao Planeta Vermelho. Os rovers foram chamados de Spirit e Opportunity. Juntos, fizeram parte da missão Mars Exploration Rover.

                                        Spirit e Opportunity foram construídos como gêmeos. Ambos carregavam os mesmos instrumentos científicos e tinham aproximadamente o tamanho de um carrinho de golfe.

                                        Na Terra, onde há água, há vida. Spirit e Opportunity foram enviados a Marte para encontrar mais pistas sobre a história da água naquele planeta e para verificar se o Planeta Vermelho já pôde abrigar vida. Para isso, os cientistas enviaram os dois robôs exploradores para dois locais de pouso diferentes. Os robôs pousaram em lados opostos do planeta.

                                        Spirit pousou em uma região chamada Cratera Gusev. Os cientistas queriam explorar a cratera porque acreditavam que ela poderia ter abrigado água há muito tempo. A partir de imagens capturadas por satélites, os cientistas concluíram que vários grandes rios pareciam ter desaguado na Cratera Gusev.

                                        Opportunity pousou no outro lado de Marte, em uma área chamada Meridiani Planum. Essa região era ideal por ser um local plano e seguro para o pouso do rover. Além disso, estudos realizados por um satélite em órbita de Marte indicaram a possível presença de um mineral chamado hematita cinza. Na Terra, a hematita cinza é frequentemente encontrada na presença de água.

                                        Em sua jornada, o Spirit tirou muitas fotos de Marte com sua câmera. Foram as primeiras fotos coloridas tiradas por um rover em outro planeta. O Spirit também encontrou diversos indícios de água antiga e evidências de atividade geotérmica, ou vulcânica. Explorou locais que podem ter sido fontes termais milhões de anos atrás.

                                        Para não ficar atrás de sua irmã gêmea, a Opportunity também tirou muitas fotos coloridas da paisagem marciana. Ela também encontrou evidências de água.

                                        A Opportunity estudou camadas de minerais nas rochas próximas ao seu local de pouso. As evidências coletadas sugeriram que o local de pouso já foi a costa de um mar salgado.

                                        As rochas estudadas pelos robôs Spirit e Opportunity mostraram aos cientistas que, há muito tempo, a água em Marte pode ter sido muito semelhante à água na Terra. Marte já teve lagos e rios na superfície. Assim como a Terra, também teve água no subsolo, além de vapor d'água na atmosfera.
                                        """.stripIndent() + "\n\n");
        // Cria a área de texto com conteúdo
        // stripIndent remove espaços extras
        // "\n\n" adiciona espaço no final

        texto.setLineWrap(true);
        // Faz o texto quebrar automaticamente quando chega no fim da linha  

        texto.setWrapStyleWord(true);
         // Faz a quebra acontecer por palavra (não corta no meio)

        texto.setEditable(false);
         // Impede o usuário de editar o texto
        
        // Adiciona o texto na tela com scroll
        JScrollPane scroll = new JScrollPane(texto);
        novaTela.add(scroll);


        texto.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 22));
        // Define fonte (Arial, negrito, tamanho 22)


        novaTela.setVisible(true);
        // Exibe a janela
    }
}
