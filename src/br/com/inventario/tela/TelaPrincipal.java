
package br.com.inventario.tela;

import br.com.inventario.paineis.PainelFundo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.IOException;

import javax.swing.JFrame;

/**
 *
 * @author henri
 */
public class TelaPrincipal extends JFrame {

    public TelaPrincipal(){
        setTitle("INVENTÁRIO");
        setSize(900, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        
        setLayout(new BorderLayout());
        add(BorderLayout.CENTER, new PainelFundo(new Color(136, 106, 56)));
    }
}
