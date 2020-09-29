
package br.com.inventario;

import java.io.IOException;

import br.com.inventario.tela.TelaPrincipal;

/**
 *
 * @author henri
 */
public class App {

    public static void main(String[] args) {
        // TODO code application logic here
        new Thread(){
            @Override
            public void run(){
				new TelaPrincipal().setVisible(true);
            }
        }.start();
    }
}
