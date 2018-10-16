package estructurascontrol;
import javax.swing.*;
public class EstructurasControl {

    public static void main(String[] args) {
       /* for(int i = 0; i<100; i+=7){
            JOptionPane.showMessageDialog(null, i);
        }*/
       //multiplicacion de los primeros 10 impares
       /*int producto = 1;
       for (int i=1; i<20; i+=2) {
            producto=producto*i;
        }
        System.out.println("La multiplicación de los 10 primeros impares: " + producto);*/
       /*int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero a calcular factorial asta 12"));
       int factorial=1;
       for(int i = num; i>0; i--){
           factorial = factorial * i;
       }
       JOptionPane.showMessageDialog(null, "El factorial de: "+ num+ "es: "+ factorial);*/
       
       //Pedir 10 sueldos. Mostrar su suma y si hay mayores de 1000.
       /*int sueldo;
       int totalSueldo=0;
       for(int i=1; i<=3; i++){
           sueldo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el sueldo No."+i));
           totalSueldo +=sueldo;
           if(sueldo > 1000){
               sueldo++;
           }
           JOptionPane.showMessageDialog(null, "Hay sueldo mayores a 1000 de: " + sueldo);
       }
       JOptionPane.showMessageDialog(null, "La suma de los sueldos es: " + totalSueldo);   */
       /*
       int i = 0;
       int valorA = 10;
       while(i<valorA){
           System.out.println("incremento: " + i);
           i++;
       }*/
       
       //Pedir números hasta que se introduzca uno negativo, y calcu
       int i=0;
       int num= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
       while(num > 0){
           i++;
           num= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese otro numero"));     
       }
    }
    
}
