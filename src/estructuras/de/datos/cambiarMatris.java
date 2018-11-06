
package estructuras.de.datos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class cambiarMatris {
    public static void main(String[] args){
        Scanner valor = new Scanner(System.in); 
        int  matriz[][];
        int filas, columnas, transponer;
        filas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las fila"));
        columnas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las columnas"));
        matriz = new int[filas][columnas];
        
        System.out.println("Digite la matriz");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz[i][j] = valor.nextInt();
            }
        }
        //fin matris
        //Original
        System.out.println("MAtriz original");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
        
        //trasponer
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < i; j++) {
                transponer = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = transponer;
            }
        }
        
        //matriz transpuesta es
        System.out.println("\nMAtriz transpuesta");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
    }
}
