/**
 * 
 * 
 * @author Adrián Egea Hermoso
 */
public abstract class Persona {
  private String dni;
  private String apellidos;
  private String nombre;
  private String telefono;
  private String domicilio;
  private static int numeroTotalDeSaludos;


  public Persona() {
    
  }

  public Persona(String nombre) {
    this.nombre = nombre;
  }



  public String getDni() {
    return dni;
  }

  

  

  public static int getNumeroTotalDeSaludos() {
    return numeroTotalDeSaludos;
  }

  public static void setNumeroTotalDeSaludos(int numeroTotalDeSaludos) {
    Persona.numeroTotalDeSaludos = numeroTotalDeSaludos;
  }

  public String getApellidos() {
    return apellidos;
  }

  

  public String getNombre() {
    return nombre;
  }

  

  public String getTelefono() {
    return telefono;
  }

  

  public String getDomicilio() {
    return domicilio;
  }

  

  public void saluda() {
    System.out.println("Hola soy " + this.nombre);
    Persona.numeroTotalDeSaludos++;

  }

  public void saluda(String intensidad) {

    String cadena = "Hola soy " + this.nombre;

    switch (intensidad) {
      case "fuerte":
        cadena = cadena.toUpperCase();
        break;
      case "debil":
        cadena = cadena.toLowerCase();
        break;
      default:
    }
    System.out.println(cadena);
    Persona.numeroTotalDeSaludos++;

  }
  
}
