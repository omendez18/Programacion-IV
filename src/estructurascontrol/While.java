
package estructurascontrol;

import javax.swing.JOptionPane;


public class While {
    public static void main(String[] args) {
        /*int i=0;
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una opcion"));
        while(opcion != 0){
            if(opcion < 0 ){
                System.out.println("Es negativo");
            }else{
                System.out.println("Es positivo");
            }
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese otra opcion"));
        }*/
        //Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
        int contador=0;
        int resultado=1;
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una numero"));
        while(opcion > 0){
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese otra opcion"));
            resultado += 1;
        }
        System.out.println("Se ingresaron "+ resultado + " numeros");
    }
}
