package br.com.inventario.item;

import java.util.ArrayList;

public class Item {
	
	private ArrayList<Object> items = new ArrayList<>() ;
	
	public Item() {
	}
	
    public ArrayList<Object> getItems() {
		return items;
	}
	public void setItems(ArrayList<Object> items) {
		this.items = items;
	}
}
