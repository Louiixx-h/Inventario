
package br.com.inventario.paineis;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.util.ArrayList;
import java.util.Map;


/**
 *
 * @author henri
 */
public class ConfigurarInventario extends JPanel {
    
	private Color cor;
    private JButton button = null;
    private int totalItem =30;
    
    public ConfigurarInventario() {
    	
    }
    
	public ConfigurarInventario(Color cor) {
        this.cor = cor;
        
        adicionarItem();
    }
	
    public void adicionarItem() {
    	
    	button = new JButton("Adicionar Item");
        add(button);
        button.addActionListener((ActionListener) new ActionListener() {
        	
            @Override
            public void actionPerformed(ActionEvent e) {
                procurarSlotVazio();
            }
        });
    }
    
    public boolean inventarioCheio() {
    	
    	boolean estaCheio = false;
    	
    	if(Inventario.getSlots().get(29).getVazio() == true) {
    		estaCheio = false;
    	} else {
    		estaCheio = true;
    	}
    	return estaCheio;
    }
    
    public void procurarSlotVazio() {
    	//se inventario não estiver cheio ele pode acrescentar itens
    	if(inventarioCheio() == false) {
    		
    		for(int i = 0; i < Inventario.getSlots().size(); i++) {
    			
    			if(Inventario.getSlots().get(i).getVazio() == true) {
    				
    				Inventario.getSlots().get(i).desenharItem();
    				Inventario.getSlots().get(i).revalidate();
    				System.out.println("acrescentado");
    				break;
    				
    			} else {
    				System.out.println("ja ta ocupado "+ i);
				}
    		}
    		
    		System.out.println("Inventário ainda não lotou...");
    		
    	} else {
    		JOptionPane.showMessageDialog(null, "Inventário lotado!");
    		
    	}
    	
    }
    
    public int getTotalItem() {
		return totalItem;
	}
    
	public void setTotalItem(int totalItem) {
		this.totalItem = totalItem;
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
