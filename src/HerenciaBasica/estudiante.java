/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaBasica;

/**
 *
 * @author Olman
 */
public class estudiante extends persona{
    private String facultad;
    private String clase;
    private int nota;

    public estudiante(String facultad, String clase, int nota, String nombre, String apellido, int edad, String sexo) {
        super(nombre, apellido, edad, sexo);
        this.facultad = facultad;
        this.clase = clase;
        this.nota = nota;
    }
    
    public void mostrarDatos(){
        System.out.println(" el estudiante: "+ getNombre()+
                "\n con edad: "+ getEdad()+ "pertenece a la facultad: "+ facultad+ " cursa la clase: " + clase);
    }
}
