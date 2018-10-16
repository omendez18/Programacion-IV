
package estructurascontrol;

import javax.swing.JOptionPane;

public class doWhile {
    public static void main(String[] args){
        //Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
        /*int num, suma = 0;
        do {
           num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
           suma += num;
        } while (num !=0);
        System.out.println("suma: " + suma);*/
        
        // Escribir un programa que solicite la carga de un numero entre 0 y 999, y nos muestre 
        //un mensaje de cuantos dígitos tiene el mismo. Finalizar el programa cuando se cargue el valor 0.
        /*int numero;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
            if (numero >= 100 && numero <=999) {
                JOptionPane.showMessageDialog(null, "El numero tiene 3 digitos");
            }if(numero >=10 && numero <=99){
                JOptionPane.showMessageDialog(null, "El numero tiene 2 digitos");
            }if (numero > 0 && numero <=9) {
                JOptionPane.showMessageDialog(null, "El numero tiene 1 digito");
            }
        } while (numero != 0);*/
        
//Escribir un programa que solicite ingresar n notas de alumnos y nos informe cuántos 
//tienen notas mayores o iguales a 7 y cuántos menores. El programa termina cuanto se ingrese un valor de 0.
        int cont1= 0, cont2 = 0, nota;
        do {
            nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
            if (nota > 7) {
                cont1++;
            }if (nota< 7) {
                cont2++;
            }
        } while (nota != 0);
        JOptionPane.showMessageDialog(null, "Notas mayores a 7: " + cont1);
        JOptionPane.showMessageDialog(null, "Notas menores a 7: " + cont2);
        
    }
}
