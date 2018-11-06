
package estructuras.de.datos;

public class arrayBidimensional2 {
    public static void main(String[] args){
        //Array lineal
        int[] numeros = new int[3];
        //Array bidimensional
        int[][] matris = new int[3][3];
        //0=1 2 3
        //1=4 5 6 
        //2=7 8 9
        
        matris[0][0] = 1;
        matris[0][1] = 2;
        matris[0][2] = 3;
        
        matris[1][0] = 4;
        matris[1][1] = 5;
        matris[1][2] = 6;
        
        matris[2][0] = 7;
        matris[2][1] = 8;
        matris[2][2] = 9;
        
        //mostrar matris
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println("a["+i+"]["+j+"]="+matris[i][j]);
            }
        }
        //Fin mostrar datos
    }
}
