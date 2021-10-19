/**
* 
*
* @author Adrián Egea Hermoso
*/
public class Tema03Ejercicio11 {
  public static void main(String[] args) {
    
    String linea;

    System.out.println("Programa que convierte Kb a Mb: ");
    
    System.out.print("Por favor, introduce los Kb que desea convertir: ");
    linea = System.console().readLine();
    double kb = Double.parseDouble(linea);
    
    double mb = kb / 1024;
    
    System.out.printf("Tienes %.2f Mb: ", mb);   
  } 
}
