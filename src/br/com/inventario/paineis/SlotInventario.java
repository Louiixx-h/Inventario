
package br.com.inventario.paineis;

import java.awt.Color;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author henri
 */
public class SlotInventario extends JPanel {
    
    private Color cor;
    private boolean vazio = true;
    
	public SlotInventario() {
		desenharItem();
	}
	
    public SlotInventario(Color cor) {
        this.cor = cor;
    }
    
    public boolean getVazio() {
    	return vazio;
    }
    
	public void setVazio(boolean temItem) {
		this.vazio = temItem;
	}
	
    public void desenharItem() {
    	Random sortear = new Random();
    	int index = sortear.nextInt(9);
    	String[] nomeImg = {"item1.png", "item2.gif", "item3.png", "item4.png", "item5.png", "item6.png", "item7.png", "item8.png", "item9.png"};
    	JLabel label = new JLabel();
    	ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("br/com/inventario/images/"+nomeImg[index]));
    	label.setIcon(icon);
    	add(label);
    	setVazio(false);
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
