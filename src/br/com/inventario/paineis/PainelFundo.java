
package br.com.inventario.paineis;

import java.awt.Color;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.JPanel;

/**
 *
 * @author henri
 */
public class PainelFundo extends JPanel {
    
    private Color cor;

    public PainelFundo(Color cor){
        this.cor = cor;
        
        GridLayout layout = new GridLayout(1,2);
        layout.setHgap(50);
        setLayout(layout);
        
        add(new Inventario(new Color(29, 43, 83)));
        add(new ConfigurarInventario(new Color(31, 63, 88)));
    }
    
    @Override
    public Color getBackground(){
        return this.cor;
    }
    
    @Override
    public void setBackground(Color cor){
        this.cor = cor;
    }
}
