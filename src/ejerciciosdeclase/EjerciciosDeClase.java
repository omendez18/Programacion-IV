/*
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
 */
//Esto es un  comentario
package ejerciciosdeclase;
import javax.swing.*;

/**
 *
 * @author Olman
 */
public class EjerciciosDeClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println("Hola mundo con println");
        //System.out.println("Hola Mundo");
        /*
        int valor1=25;
        int valor2=15;
        
        if(valor1>valor2){
         System.out.println("Valor1 " + valor1+ " es mayor a valor2 "+" "+ valor2);
        }else{
         System.out.println("Es menor");
        }
        */
        /*
        for(int i=1; i< 20; i+=3){
            System.out.println("Incremento: " + i);
        }
        */
        
        /*
        System.out.println("-----------------------------");
            
        int tabla = 6;
        for(int i=0; i<=10; i++){
            System.out.println(tabla+"X"+i+"="+(tabla*i));
        }*/
        
    int opcion;
    int numAleatorio = (int) (Math.random()*10+1);
    System.out.println("Numero adivinar: "+ numAleatorio);
    opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero adivinar"));

    while(opcion != numAleatorio){
        if(opcion > numAleatorio){
            JOptionPane.showMessageDialog(null,"Es mayor");
        }else{
            JOptionPane.showMessageDialog(null,"Es menor");
        }
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero adivinar"));
    }
    JOptionPane.showMessageDialog(null,"Adivinaste");
    
    }
    
}
