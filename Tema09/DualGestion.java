/**
 * 
 * 
 * @author Adrián Egea Hermoso
 */
public class DualGestion {
  public static void main(String[] args) {

    System.out.println("DUAL GESTIÓN");
    System.out.println("============");
        
    Alumno alumno1 = new Alumno(123,"Adrian","Egea");
    Alumno alumno2 = new Alumno();
    Alumno alumno3 = new Alumno(1234,"Juanito","Perez","666999666","SMR",2000,false);
    Alumno alumno4 = new Alumno();


    System.out.println(alumno3.getNombre());
    alumno1.saluda();
    alumno3.saluda();
    alumno1.saluda("fuerte");
    alumno3.repetidor();
    alumno3.salidaDelCentro();
    alumno3.dameEdad();
  }
}
