package com.mycompany.totemmuseo;
// Define o pacote (package) onde esta classe está localizada.

import com.mycompany.totemmuseo.apresentacao.frmPrincipal;
// Importa a classe frmPrincipal para que ela possa ser usada aqui.

public class TotemMuseo 
// Declara a classe pública chamada TotemMuseo.
// Esta é a classe principal da aplicação.
{

    public static void main(String[] args) 
    // Método principal do Java.
    // É o primeiro método executado quando o programa inicia.
    // public  -> pode ser acessado de qualquer lugar
    // static  -> pode ser executado sem criar objeto da classe
    // void    -> não retorna valor
    // main    -> nome obrigatório do método inicial
    // String[] args -> recebe argumentos da linha de comando
    {
        java.awt.EventQueue.invokeLater(() -> 
        // Executa o código na Thread de Eventos do Swing (Event Dispatch Thread).
        // No Swing, toda alteração gráfica deve acontecer nessa thread
        // para evitar erros e travamentos na interface.
        // invokeLater() agenda o código para ser executado corretamente
        // pela fila de eventos da interface gráfica.
        {
            new frmPrincipal().setVisible(true);
            // Cria um objeto da janela frmPrincipal.
            // new frmPrincipal()
            // -> instancia a janela.
            // .setVisible(true)
            // -> torna a janela visível na tela.
        });
    }
}


