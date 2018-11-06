
package estructuras.de.datos;
import javax.swing.JOptionPane;

public class EstructurasDeDatos {


    public static void main(String[] args) {
        /*
        int[] numeros = new int[3];
        numeros[0] = 5;
        numeros[1] = 2;
        numeros[2] = 9;
        System.out.println("numero en posicion 0: " + numeros[0]+ numeros.length);
*/
       /* int[] numeros= {2,5,7,8,9};
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Posicion "+ i+ " "+ numeros[i]);
        }*/
       int elementos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese tama;o del arreglo"));
       char[] letras = new char[elementos];
       
        System.out.println("Tama;o del arreglo es: " + letras.length);
       
    }
    
}
