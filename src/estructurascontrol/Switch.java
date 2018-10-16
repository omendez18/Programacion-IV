
package estructurascontrol;
import javax.swing.*;
public class Switch {
    public static void main(String[] args) {
        
        System.out.println("1. Opcion 1");
        System.out.println("2. Opcion 2");
        System.out.println("3.Salir");
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una opcion"));
    
        if (opcion ==3) {
            System.out.println("Eligio salir");
        }else{
        switch(opcion){
        case 1:
            System.out.println("escogio la primera opcion");
            break;
        case 2:
            System.out.println("escogio la opcion 2");
            break;
        default:
            System.out.println("Eliga una opcion correcta");
                break;
        }
        }
            
    }
}
