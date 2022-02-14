/**
 * 
 * 
 * @author Adrián Egea Hermoso
 */
public class DualGestion {
  public static void main(String[] args) {

    System.out.println("DUAL GESTIÓN");
    System.out.println("============");
        
    Alumno alumno1 = new Alumno();
    Alumno alumno2 = new Alumno();
    Alumno alumno3 = new Alumno();
    Alumno alumno4 = new Alumno();

    Alumno adri = new Alumno("Adrian Egea",1990);



    
    alumno1.saluda();
    alumno3.saluda();
    alumno1.saluda("fuerte");
    alumno3.repetidor();
    alumno3.salidaDelCentro();
    alumno3.dameEdad();
    alumno1.ficha();

    System.out.println("se han saludado " + Persona.getNumeroTotalDeSaludos() + " veces");
  }
}
