
package br.com.inventario.paineis;

import java.awt.Color;
import java.awt.GridLayout;
import java.io.IOException;
import javax.swing.JPanel;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author henri
 */
public class Inventario extends JPanel {
    
    private Color cor;
    private static int totalSlots = 30;
    private static ArrayList<SlotInventario> slots = new ArrayList<>();
    
    public Inventario() {
    }
    
    public Inventario(Color cor) {
        this.cor = cor; 
        
        GridLayout layout = new GridLayout(6, 2);
        layout.setHgap(10);
        layout.setVgap(10);
        setLayout(layout);
        adicionarSlots();
    }
    
    public void adicionarSlots() {
    	quantidadeSlot(getTotalSlots());
	        for(SlotInventario slot : Inventario.getSlots()){
	        	SlotInventario espaco = slot;
		        add(espaco);
	        }
    }
	
    public static ArrayList<SlotInventario> getSlots() {
		return slots;
	}

	public static void setSlots(ArrayList<SlotInventario> slots) {
		Inventario.slots = slots;
	}

	public static void quantidadeSlot(int quantidadeSlot) {
    	ArrayList<SlotInventario> slots = new ArrayList<>();
        int contador = 0;
        while(contador < quantidadeSlot){
            slots.add(new SlotInventario(new Color(95, 87, 79)));
            contador++;
        }
        Inventario.slots = slots;
    }
    
    public static int getTotalSlots() {
		return totalSlots;
	}
    
	public static void setTotalSlots(int totalSlots) {
		Inventario.totalSlots = totalSlots;
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
