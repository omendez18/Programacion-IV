
package herenciaBasica2;

public class Estudiante extends Persona{
    protected String facultad;
    protected String asignatura;
    protected int nota;
    
    public Estudiante(int id, String nombre, String apellido, int edad, String facultad, String asignatura, int nota){
    super(id, nombre, apellido, edad);
    this.facultad = facultad;
    this.asignatura = asignatura;
    this.nota = nota;    
    }
    
    public void mostrarDatos(){
        System.out.println(" el estudiante: "+ getNombre()+
                "\n con edad: "+ getEdad()+ "pertenece a la facultad: "+ facultad+ " cursa la clase: " + asignatura);
    }
}
