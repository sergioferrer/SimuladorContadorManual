/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorcontadormanual;

import contadormanual.ContadorManual;
import gui.MainForm;

/**
 *
 * @author Jorge
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MainForm ventana = new MainForm();
        ventana.setVisible(true);
        /*ContadorManual contadorDePasajeros = new ContadorManual(); 
        System.out.println("Número de pasajeros: " + contadorDePasajeros.getConteoActual());
        contadorDePasajeros.contar();
        System.out.println("Click");
        contadorDePasajeros.contar();
        System.out.println("Click");
        contadorDePasajeros.contar();
        System.out.println("Click");
        contadorDePasajeros.contar();
        System.out.println("Click");
        System.out.println("Número de pasajeros: " + contadorDePasajeros.getConteoActual());
        System.out.println("Se reiniciará el conteo de pasajeros...");
        contadorDePasajeros.reiniciarConteo();
        System.out.println("Número de pasajeros: " + contadorDePasajeros.getConteoActual());*/
    }
}
