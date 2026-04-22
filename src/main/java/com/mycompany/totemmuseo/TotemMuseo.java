package com.mycompany.totemmuseo;

import com.mycompany.totemmuseo.apresentacao.frmPrincipal;

public class TotemMuseo 
{

    public static void main(String[] args) 
    {
        java.awt.EventQueue.invokeLater(() -> 
        {
            new frmPrincipal().setVisible(true);
        });
    }
}


