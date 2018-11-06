
package estructuras.de.datos;
import javax.swing.JOptionPane;

public class EstructuradatosArrays {
  public static void main(String[] args){
      //arrays o arreglos o matrices 
      /*int[] numeros = new int[5];
      numeros[0] = 2;
      numeros[1] = 4;
      numeros[2] = 65;
      numeros[3] = 45;
      numeros[4] = 78;
      //numeros[5]= 534;
      //System.out.println("tamanio del arreglo: "+ numeros.length);
      
      for (int i = 0; i < numeros.length; i++) {
          System.out.println("Posicion " + i + " " + numeros[i]);
      }
      */
      /*
      int[] numero = {4,6,3,5,2,2,5,9,9,88,64,243,564};
      System.out.println("tamanio del array: "+ numero.length);*/
      
      
      int longitud ;
      longitud = Integer.parseInt(JOptionPane.showInputDialog(null, "Tamanio del arreglo"));
      
      char[] letras = new char[longitud];
      letras[0] = 0;
      System.out.println("Tamanio del arreglo char: "+ letras.length);
      
     
  }  
}
